package org.docksidestage.hangar.dbflute.whitebox.dfprop;

import java.time.LocalDateTime;

import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.exception.QueryAlreadyRegisteredException;
import org.docksidestage.hangar.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.hangar.dbflute.cbean.MemberCB;
import org.docksidestage.hangar.dbflute.cbean.PurchaseCB;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5K (2014/08/06 Wednesday)
 */
public class WxJava8OverridingQueryTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_OverridingQuery_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_Equal("land");
        cb.disableOverridingQuery();
        try {
            cb.query().setMemberName_Equal("sea");
            // ## Assert ##
            fail();
        } catch (QueryAlreadyRegisteredException e) {
            log(e.getMessage());
        }
        try {
            cb.query().setMemberName_Equal("land");
            // ## Assert ##
            fail();
        } catch (QueryAlreadyRegisteredException e) {
            log(e.getMessage());
        }
        cb.enableOverridingQuery(() -> {
            cb.query().setMemberName_Equal("sea");
        });
        // ## Assert ##
        String sql = cb.toDisplaySql();
        assertNotContains(sql, "land");
        assertContains(sql, "sea");
    }

    public void test_OverridingQuery_default() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_Equal("land");
        try {
            cb.query().setMemberName_Equal("sea");
            // ## Assert ##
            fail();
        } catch (QueryAlreadyRegisteredException e) {
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                            SubQuery
    //                                                                            ========
    public void test_OverridingQuery_subquery_enabled() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_Equal("land");
        cb.query().existsPurchase(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB purchaseCB) {
                purchaseCB.query().setPurchaseDatetime_GreaterEqual(LocalDateTime.of(2014, 8, 7, 0, 0));
                purchaseCB.enableOverridingQuery(() -> {
                    purchaseCB.query().setPurchaseDatetime_GreaterEqual(LocalDateTime.of(2014, 8, 8, 0, 0));
                });
            }
        });

        // ## Assert ##
        String sql = cb.toDisplaySql();
        assertNotContains(sql, "2014-08-07");
        assertContains(sql, "2014-08-08");
    }

    public void test_OverridingQuery_subquery_disabled() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.disableOverridingQuery();
        cb.query().setMemberName_Equal("land");
        cb.query().existsPurchase(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                markHere("exists");
                subCB.query().setPurchaseDatetime_GreaterEqual(LocalDateTime.of(2014, 8, 7, 0, 0));
        try {
                    subCB.query().setPurchaseDatetime_GreaterEqual(LocalDateTime.of(2014, 8, 8, 0, 0));
                    fail();
                } catch (QueryAlreadyRegisteredException e) {
                    log(e.getMessage());
                }
            }
        });

        // ## Assert ##
        String sql = cb.toDisplaySql();
        assertNotContains(sql, "2014-08-07");
        assertContains(sql, "2014-08-08"); // because of exception after overriding
        assertMarked("exists");
    }

    public void test_OverridingQuery_subquery_only() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.disableOverridingQuery();
        cb.query().setMemberName_Equal("land");
        cb.query().existsPurchase(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB purchaseCB) {
                purchaseCB.query().setPurchaseDatetime_GreaterEqual(LocalDateTime.of(2014, 8, 7, 0, 0));
                purchaseCB.enableOverridingQuery(() -> {
                    purchaseCB.query().setPurchaseDatetime_GreaterEqual(LocalDateTime.of(2014, 8, 8, 0, 0));
                });
            }
        });
        try {
            cb.query().setMemberName_Equal("sea");
            fail();
        } catch (QueryAlreadyRegisteredException e) {
            log(e.getMessage());
        }

        // ## Assert ##
        String sql = cb.toDisplaySql();
        assertNotContains(sql, "2014-08-07");
        assertContains(sql, "2014-08-08");
        assertNotContains(sql, "land");
        assertContains(sql, "sea"); // because of exception after overriding
    }

    // ===================================================================================
    //                                                                       DBFluteConfig
    //                                                                       =============
    public void test_OverridingQuery_DBFluteConfig_disabled() {
        // ## Arrange ##
        DBFluteConfig config = DBFluteConfig.getInstance();
        config.unlock();
        boolean original = config.isOverridingQueryAllowed();
        config.setOverridingQueryAllowed(false);
        try {
            MemberCB cb = new MemberCB();
            cb.query().setMemberName_Equal("land");
        try {
                cb.query().setMemberName_Equal("sea");
                // ## Assert ##
                fail();
            } catch (QueryAlreadyRegisteredException e) {
                log(e.getMessage());
            }
        } finally {
            config.setOverridingQueryAllowed(original);
        }
    }

    public void test_OverridingQuery_DBFluteConfig_enabled() {
        // ## Arrange ##
        DBFluteConfig config = DBFluteConfig.getInstance();
        config.unlock();
        boolean original = config.isOverridingQueryAllowed();
        config.setOverridingQueryAllowed(true);
        try {
            MemberCB cb = new MemberCB();
            cb.query().setMemberName_Equal("land");
            cb.query().setMemberName_Equal("sea");
            String sql = cb.toDisplaySql();
            assertNotContains(sql, "land");
            assertContains(sql, "sea");
        } finally {
            config.setOverridingQueryAllowed(original);
        }
    }
}
