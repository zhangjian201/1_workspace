package own.hhw.domain;

import java.util.Date;

public class PayInfo extends PayInfoKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.NETNO
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String netno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.BUSIN_TYPE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String businType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.PAY_METHOD
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String payMethod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.IDENTITY_TYPE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String identityType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.IDENTITY_NO
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String identityNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.USER_NAME
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.CAPITAL_MODE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String capitalMode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.BANK_NO
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String bankNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.BANK_CARD_NO
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String bankCardNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.AMOUNT
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private Object amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.PRD_CODE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String prdCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.LIQ_DATE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String liqDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.REQUEST_DATE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String requestDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.RETURN_URL
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String returnUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.PAY_TIME
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private Date payTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.STATE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.RETURN_CODE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String returnCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.RETURN_MSG
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String returnMsg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.OTHER_SERIAL_NO
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String otherSerialNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.COMMENTS
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private String comments;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.CREAT_TIME
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private Date creatTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PAY_INFO.UPDATE_TIME
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.NETNO
     *
     * @return the value of PAY_INFO.NETNO
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getNetno() {
        return netno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.NETNO
     *
     * @param netno the value for PAY_INFO.NETNO
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setNetno(String netno) {
        this.netno = netno == null ? null : netno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.BUSIN_TYPE
     *
     * @return the value of PAY_INFO.BUSIN_TYPE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getBusinType() {
        return businType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.BUSIN_TYPE
     *
     * @param businType the value for PAY_INFO.BUSIN_TYPE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setBusinType(String businType) {
        this.businType = businType == null ? null : businType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.PAY_METHOD
     *
     * @return the value of PAY_INFO.PAY_METHOD
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getPayMethod() {
        return payMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.PAY_METHOD
     *
     * @param payMethod the value for PAY_INFO.PAY_METHOD
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.IDENTITY_TYPE
     *
     * @return the value of PAY_INFO.IDENTITY_TYPE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getIdentityType() {
        return identityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.IDENTITY_TYPE
     *
     * @param identityType the value for PAY_INFO.IDENTITY_TYPE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setIdentityType(String identityType) {
        this.identityType = identityType == null ? null : identityType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.IDENTITY_NO
     *
     * @return the value of PAY_INFO.IDENTITY_NO
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getIdentityNo() {
        return identityNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.IDENTITY_NO
     *
     * @param identityNo the value for PAY_INFO.IDENTITY_NO
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo == null ? null : identityNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.USER_NAME
     *
     * @return the value of PAY_INFO.USER_NAME
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.USER_NAME
     *
     * @param userName the value for PAY_INFO.USER_NAME
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.CAPITAL_MODE
     *
     * @return the value of PAY_INFO.CAPITAL_MODE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getCapitalMode() {
        return capitalMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.CAPITAL_MODE
     *
     * @param capitalMode the value for PAY_INFO.CAPITAL_MODE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setCapitalMode(String capitalMode) {
        this.capitalMode = capitalMode == null ? null : capitalMode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.BANK_NO
     *
     * @return the value of PAY_INFO.BANK_NO
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.BANK_NO
     *
     * @param bankNo the value for PAY_INFO.BANK_NO
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo == null ? null : bankNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.BANK_CARD_NO
     *
     * @return the value of PAY_INFO.BANK_CARD_NO
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getBankCardNo() {
        return bankCardNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.BANK_CARD_NO
     *
     * @param bankCardNo the value for PAY_INFO.BANK_CARD_NO
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo == null ? null : bankCardNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.AMOUNT
     *
     * @return the value of PAY_INFO.AMOUNT
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public Object getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.AMOUNT
     *
     * @param amount the value for PAY_INFO.AMOUNT
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.PRD_CODE
     *
     * @return the value of PAY_INFO.PRD_CODE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getPrdCode() {
        return prdCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.PRD_CODE
     *
     * @param prdCode the value for PAY_INFO.PRD_CODE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setPrdCode(String prdCode) {
        this.prdCode = prdCode == null ? null : prdCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.LIQ_DATE
     *
     * @return the value of PAY_INFO.LIQ_DATE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getLiqDate() {
        return liqDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.LIQ_DATE
     *
     * @param liqDate the value for PAY_INFO.LIQ_DATE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setLiqDate(String liqDate) {
        this.liqDate = liqDate == null ? null : liqDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.REQUEST_DATE
     *
     * @return the value of PAY_INFO.REQUEST_DATE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getRequestDate() {
        return requestDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.REQUEST_DATE
     *
     * @param requestDate the value for PAY_INFO.REQUEST_DATE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate == null ? null : requestDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.RETURN_URL
     *
     * @return the value of PAY_INFO.RETURN_URL
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.RETURN_URL
     *
     * @param returnUrl the value for PAY_INFO.RETURN_URL
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl == null ? null : returnUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.PAY_TIME
     *
     * @return the value of PAY_INFO.PAY_TIME
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.PAY_TIME
     *
     * @param payTime the value for PAY_INFO.PAY_TIME
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.STATE
     *
     * @return the value of PAY_INFO.STATE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.STATE
     *
     * @param state the value for PAY_INFO.STATE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.RETURN_CODE
     *
     * @return the value of PAY_INFO.RETURN_CODE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.RETURN_CODE
     *
     * @param returnCode the value for PAY_INFO.RETURN_CODE
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode == null ? null : returnCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.RETURN_MSG
     *
     * @return the value of PAY_INFO.RETURN_MSG
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getReturnMsg() {
        return returnMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.RETURN_MSG
     *
     * @param returnMsg the value for PAY_INFO.RETURN_MSG
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg == null ? null : returnMsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.OTHER_SERIAL_NO
     *
     * @return the value of PAY_INFO.OTHER_SERIAL_NO
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getOtherSerialNo() {
        return otherSerialNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.OTHER_SERIAL_NO
     *
     * @param otherSerialNo the value for PAY_INFO.OTHER_SERIAL_NO
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setOtherSerialNo(String otherSerialNo) {
        this.otherSerialNo = otherSerialNo == null ? null : otherSerialNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.COMMENTS
     *
     * @return the value of PAY_INFO.COMMENTS
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.COMMENTS
     *
     * @param comments the value for PAY_INFO.COMMENTS
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.CREAT_TIME
     *
     * @return the value of PAY_INFO.CREAT_TIME
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.CREAT_TIME
     *
     * @param creatTime the value for PAY_INFO.CREAT_TIME
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PAY_INFO.UPDATE_TIME
     *
     * @return the value of PAY_INFO.UPDATE_TIME
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PAY_INFO.UPDATE_TIME
     *
     * @param updateTime the value for PAY_INFO.UPDATE_TIME
     *
     * @mbggenerated Wed Apr 01 15:08:18 CST 2015
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}