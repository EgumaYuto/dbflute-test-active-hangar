package org.docksidestage.hangar.simpleflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * The simple DTO of SimpleMember. <br>
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, BIRTHDATE, MEMBER_STATUS_NAME
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
 *     
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsSimpleMemberDto implements Serializable {

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
    /** MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} */
    @JsonKey
    protected Integer _memberId;

    /** MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} */
    @JsonKey
    protected String _memberName;

    /** BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} */
    @JsonKey
    protected java.time.LocalDate _birthdate;

    /** MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} */
    @JsonKey
    protected String _memberStatusName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSimpleMemberDto() {
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
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsSimpleMemberDto)) { return false; }
        final BsSimpleMemberDto otherEntity = (BsSimpleMemberDto)other;
        if (!helpComparingValue(getMemberId(), otherEntity.getMemberId())) { return false; }
        if (!helpComparingValue(getMemberName(), otherEntity.getMemberName())) { return false; }
        if (!helpComparingValue(getBirthdate(), otherEntity.getBirthdate())) { return false; }
        if (!helpComparingValue(getMemberStatusName(), otherEntity.getMemberStatusName())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SimpleMember");
        result = xCH(result, getMemberId());
        result = xCH(result, getMemberName());
        result = xCH(result, getBirthdate());
        result = xCH(result, getMemberStatusName());
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
        sb.append(c).append(getMemberName());
        sb.append(c).append(getBirthdate());
        sb.append(c).append(getMemberStatusName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br>
     * @return The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.add("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br>
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed)
     */
    public String getMemberName() {
        return _memberName;
    }

    /**
     * [set] MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br>
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed)
     */
    public void setMemberName(String memberName) {
        __modifiedProperties.add("memberName");
        this._memberName = memberName;
    }

    /**
     * [get] BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} <br>
     * @return The value of the column 'BIRTHDATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public java.time.LocalDate getBirthdate() {
        return _birthdate;
    }

    /**
     * [set] BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} <br>
     * @param birthdate The value of the column 'BIRTHDATE'. (NullAllowed)
     */
    public void setBirthdate(java.time.LocalDate birthdate) {
        __modifiedProperties.add("birthdate");
        this._birthdate = birthdate;
    }

    /**
     * [get] MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br>
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed)
     */
    public String getMemberStatusName() {
        return _memberStatusName;
    }

    /**
     * [set] MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br>
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed)
     */
    public void setMemberStatusName(String memberStatusName) {
        __modifiedProperties.add("memberStatusName");
        this._memberStatusName = memberStatusName;
    }

}
