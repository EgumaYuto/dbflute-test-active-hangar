package org.docksidestage.hangar.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.hangar.dbflute.allcommon.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The DB meta of VENDOR_PRIMARY_KEY_ONLY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorPrimaryKeyOnlyDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorPrimaryKeyOnlyDbm _instance = new VendorPrimaryKeyOnlyDbm();
    private VendorPrimaryKeyOnlyDbm() {}
    public static VendorPrimaryKeyOnlyDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((VendorPrimaryKeyOnly)et).getPrimaryKeyOnlyId(), (et, vl) -> ((VendorPrimaryKeyOnly)et).setPrimaryKeyOnlyId(ctl(vl)), "primaryKeyOnlyId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_PRIMARY_KEY_ONLY";
    protected final String _tableDispName = "VENDOR_PRIMARY_KEY_ONLY";
    protected final String _tablePropertyName = "vendorPrimaryKeyOnly";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.VENDOR_PRIMARY_KEY_ONLY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPrimaryKeyOnlyId = cci("PRIMARY_KEY_ONLY_ID", "PRIMARY_KEY_ONLY_ID", null, null, Long.class, "primaryKeyOnlyId", null, true, false, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);

    /**
     * PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrimaryKeyOnlyId() { return _columnPrimaryKeyOnlyId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPrimaryKeyOnlyId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnPrimaryKeyOnlyId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.hanger.dbflute.exentity.VendorPrimaryKeyOnly"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hanger.dbflute.cbean.VendorPrimaryKeyOnlyCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hanger.dbflute.exbhv.VendorPrimaryKeyOnlyBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorPrimaryKeyOnly> getEntityType() { return VendorPrimaryKeyOnly.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorPrimaryKeyOnly newEntity() { return new VendorPrimaryKeyOnly(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorPrimaryKeyOnly)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorPrimaryKeyOnly)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
