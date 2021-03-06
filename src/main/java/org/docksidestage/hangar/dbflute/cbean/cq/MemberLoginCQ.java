package org.docksidestage.hangar.dbflute.cbean.cq;


import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.docksidestage.hangar.dbflute.cbean.cq.bs.BsMemberLoginCQ;

/**
 * The condition-query of MEMBER_LOGIN.
 * @author DBFlute(AutoGenerator)
 */
public class MemberLoginCQ extends BsMemberLoginCQ {

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     * 
     * @param childQuery Child query as abstract class. (Nullable: If null, this is base instance.)
     * @param sqlClause SQL clause instance. (NotNull)
     * @param aliasName My alias name. (NotNull)
     * @param nestLevel Nest level.
     */
    public MemberLoginCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }
}
