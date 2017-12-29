package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.docksidestage.hangar.simpleflute.AppCDef;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of MEMBER_WITHDRAWAL as TABLE. <br>
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     MEMBER, WITHDRAWAL_REASON
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     member, withdrawalReason
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMemberWithdrawalDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER} */
    @JsonKey
    protected Integer _memberId;

    /** WITHDRAWAL_REASON_CODE: {IX, CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason} */
    @JsonKey
    protected String _withdrawalReasonCode;

    /** WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)} */
    @JsonKey
    protected String _withdrawalReasonInputText;

    /** WITHDRAWAL_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    @JsonKey
    protected java.time.LocalDateTime _withdrawalDatetime;

    /** REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    @JsonKey
    protected java.time.LocalDateTime _registerDatetime;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _registerUser;

    /** UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    @JsonKey
    protected java.time.LocalDateTime _updateDatetime;

    /** UPDATE_USER: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _updateUser;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberWithdrawalDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Set the value of withdrawalReasonCode as the classification of WithdrawalReason. <br>
     * reason for member withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setWithdrawalReasonCodeAsWithdrawalReason(AppCDef.WithdrawalReason cdef) {
        setWithdrawalReasonCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of withdrawalReasonCode as the classification of WithdrawalReason. <br>
     * reason for member withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public AppCDef.WithdrawalReason getWithdrawalReasonCodeAsWithdrawalReason() {
        return AppCDef.WithdrawalReason.codeOf(getWithdrawalReasonCode());
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of withdrawalReasonCode as Sit. <br>
     * SIT: サイトが使いにくいから
     */
    public void setWithdrawalReasonCode_Sit() {
        setWithdrawalReasonCodeAsWithdrawalReason(AppCDef.WithdrawalReason.Sit);
    }

    /**
     * Set the value of withdrawalReasonCode as Prd. <br>
     * PRD: 商品に魅力がないから
     */
    public void setWithdrawalReasonCode_Prd() {
        setWithdrawalReasonCodeAsWithdrawalReason(AppCDef.WithdrawalReason.Prd);
    }

    /**
     * Set the value of withdrawalReasonCode as Frt. <br>
     * FRT: フリテンだから
     */
    public void setWithdrawalReasonCode_Frt() {
        setWithdrawalReasonCodeAsWithdrawalReason(AppCDef.WithdrawalReason.Frt);
    }

    /**
     * Set the value of withdrawalReasonCode as Oth. <br>
     * OTH: その他理由
     */
    public void setWithdrawalReasonCode_Oth() {
        setWithdrawalReasonCodeAsWithdrawalReason(AppCDef.WithdrawalReason.Oth);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of withdrawalReasonCode 'Sit'? <br>
     * SIT: サイトが使いにくいから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWithdrawalReasonCodeSit() {
        AppCDef.WithdrawalReason cdef = getWithdrawalReasonCodeAsWithdrawalReason();
        return cdef != null ? cdef.equals(AppCDef.WithdrawalReason.Sit) : false;
    }

    /**
     * Is the value of withdrawalReasonCode 'Prd'? <br>
     * PRD: 商品に魅力がないから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWithdrawalReasonCodePrd() {
        AppCDef.WithdrawalReason cdef = getWithdrawalReasonCodeAsWithdrawalReason();
        return cdef != null ? cdef.equals(AppCDef.WithdrawalReason.Prd) : false;
    }

    /**
     * Is the value of withdrawalReasonCode 'Frt'? <br>
     * FRT: フリテンだから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWithdrawalReasonCodeFrt() {
        AppCDef.WithdrawalReason cdef = getWithdrawalReasonCodeAsWithdrawalReason();
        return cdef != null ? cdef.equals(AppCDef.WithdrawalReason.Frt) : false;
    }

    /**
     * Is the value of withdrawalReasonCode 'Oth'? <br>
     * OTH: その他理由
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWithdrawalReasonCodeOth() {
        AppCDef.WithdrawalReason cdef = getWithdrawalReasonCodeAsWithdrawalReason();
        return cdef != null ? cdef.equals(AppCDef.WithdrawalReason.Oth) : false;
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected MemberDto _member;

    public MemberDto getMember() {
        return _member;
    }

    public void setMember(MemberDto member) {
        this._member = member;
    }

    protected WithdrawalReasonDto _withdrawalReason;

    public WithdrawalReasonDto getWithdrawalReason() {
        return _withdrawalReason;
    }

    public void setWithdrawalReason(WithdrawalReasonDto withdrawalReason) {
        this._withdrawalReason = withdrawalReason;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMemberWithdrawalDto)) { return false; }
        final BsMemberWithdrawalDto otherEntity = (BsMemberWithdrawalDto)other;
        if (!helpComparingValue(getMemberId(), otherEntity.getMemberId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "MEMBER_WITHDRAWAL");
        result = xCH(result, getMemberId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getMemberId());
        sb.append(c).append(getWithdrawalReasonCode());
        sb.append(c).append(getWithdrawalReasonInputText());
        sb.append(c).append(getWithdrawalDatetime());
        sb.append(c).append(getRegisterDatetime());
        sb.append(c).append(getRegisterUser());
        sb.append(c).append(getUpdateDatetime());
        sb.append(c).append(getUpdateUser());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER} <br>
     * @return The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.add("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] WITHDRAWAL_REASON_CODE: {IX, CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason} <br>
     * @return The value of the column 'WITHDRAWAL_REASON_CODE'. (NullAllowed)
     */
    public String getWithdrawalReasonCode() {
        return _withdrawalReasonCode;
    }

    /**
     * [set] WITHDRAWAL_REASON_CODE: {IX, CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason} <br>
     * @param withdrawalReasonCode The value of the column 'WITHDRAWAL_REASON_CODE'. (NullAllowed)
     */
    public void setWithdrawalReasonCode(String withdrawalReasonCode) {
        __modifiedProperties.add("withdrawalReasonCode");
        this._withdrawalReasonCode = withdrawalReasonCode;
    }

    /**
     * [get] WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)} <br>
     * @return The value of the column 'WITHDRAWAL_REASON_INPUT_TEXT'. (NullAllowed)
     */
    public String getWithdrawalReasonInputText() {
        return _withdrawalReasonInputText;
    }

    /**
     * [set] WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)} <br>
     * @param withdrawalReasonInputText The value of the column 'WITHDRAWAL_REASON_INPUT_TEXT'. (NullAllowed)
     */
    public void setWithdrawalReasonInputText(String withdrawalReasonInputText) {
        __modifiedProperties.add("withdrawalReasonInputText");
        this._withdrawalReasonInputText = withdrawalReasonInputText;
    }

    /**
     * [get] WITHDRAWAL_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'WITHDRAWAL_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getWithdrawalDatetime() {
        return _withdrawalDatetime;
    }

    /**
     * [set] WITHDRAWAL_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @param withdrawalDatetime The value of the column 'WITHDRAWAL_DATETIME'. (NullAllowed)
     */
    public void setWithdrawalDatetime(java.time.LocalDateTime withdrawalDatetime) {
        __modifiedProperties.add("withdrawalDatetime");
        this._withdrawalDatetime = withdrawalDatetime;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'REGISTER_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getRegisterDatetime() {
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (NullAllowed)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        __modifiedProperties.add("registerDatetime");
        this._registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public String getRegisterUser() {
        return _registerUser;
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * @param registerUser The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.add("registerUser");
        this._registerUser = registerUser;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'UPDATE_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getUpdateDatetime() {
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (NullAllowed)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        __modifiedProperties.add("updateDatetime");
        this._updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'UPDATE_USER'. (NullAllowed)
     */
    public String getUpdateUser() {
        return _updateUser;
    }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @param updateUser The value of the column 'UPDATE_USER'. (NullAllowed)
     */
    public void setUpdateUser(String updateUser) {
        __modifiedProperties.add("updateUser");
        this._updateUser = updateUser;
    }

}
