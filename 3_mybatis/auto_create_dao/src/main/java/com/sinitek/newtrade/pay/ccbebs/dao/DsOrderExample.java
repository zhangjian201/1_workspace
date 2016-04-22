package com.sinitek.newtrade.pay.ccbebs.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DsOrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DS_ORDER
     *
     * @mbggenerated Fri Apr 01 16:46:14 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DS_ORDER
     *
     * @mbggenerated Fri Apr 01 16:46:14 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DS_ORDER
     *
     * @mbggenerated Fri Apr 01 16:46:14 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DS_ORDER
     *
     * @mbggenerated Fri Apr 01 16:46:14 CST 2016
     */
    public DsOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DS_ORDER
     *
     * @mbggenerated Fri Apr 01 16:46:14 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DS_ORDER
     *
     * @mbggenerated Fri Apr 01 16:46:14 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DS_ORDER
     *
     * @mbggenerated Fri Apr 01 16:46:14 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DS_ORDER
     *
     * @mbggenerated Fri Apr 01 16:46:14 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DS_ORDER
     *
     * @mbggenerated Fri Apr 01 16:46:14 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DS_ORDER
     *
     * @mbggenerated Fri Apr 01 16:46:14 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DS_ORDER
     *
     * @mbggenerated Fri Apr 01 16:46:14 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DS_ORDER
     *
     * @mbggenerated Fri Apr 01 16:46:14 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DS_ORDER
     *
     * @mbggenerated Fri Apr 01 16:46:14 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DS_ORDER
     *
     * @mbggenerated Fri Apr 01 16:46:14 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DS_ORDER
     *
     * @mbggenerated Fri Apr 01 16:46:14 CST 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRequestnoIsNull() {
            addCriterion("REQUESTNO is null");
            return (Criteria) this;
        }

        public Criteria andRequestnoIsNotNull() {
            addCriterion("REQUESTNO is not null");
            return (Criteria) this;
        }

        public Criteria andRequestnoEqualTo(String value) {
            addCriterion("REQUESTNO =", value, "requestno");
            return (Criteria) this;
        }

        public Criteria andRequestnoNotEqualTo(String value) {
            addCriterion("REQUESTNO <>", value, "requestno");
            return (Criteria) this;
        }

        public Criteria andRequestnoGreaterThan(String value) {
            addCriterion("REQUESTNO >", value, "requestno");
            return (Criteria) this;
        }

        public Criteria andRequestnoGreaterThanOrEqualTo(String value) {
            addCriterion("REQUESTNO >=", value, "requestno");
            return (Criteria) this;
        }

        public Criteria andRequestnoLessThan(String value) {
            addCriterion("REQUESTNO <", value, "requestno");
            return (Criteria) this;
        }

        public Criteria andRequestnoLessThanOrEqualTo(String value) {
            addCriterion("REQUESTNO <=", value, "requestno");
            return (Criteria) this;
        }

        public Criteria andRequestnoLike(String value) {
            addCriterion("REQUESTNO like", value, "requestno");
            return (Criteria) this;
        }

        public Criteria andRequestnoNotLike(String value) {
            addCriterion("REQUESTNO not like", value, "requestno");
            return (Criteria) this;
        }

        public Criteria andRequestnoIn(List<String> values) {
            addCriterion("REQUESTNO in", values, "requestno");
            return (Criteria) this;
        }

        public Criteria andRequestnoNotIn(List<String> values) {
            addCriterion("REQUESTNO not in", values, "requestno");
            return (Criteria) this;
        }

        public Criteria andRequestnoBetween(String value1, String value2) {
            addCriterion("REQUESTNO between", value1, value2, "requestno");
            return (Criteria) this;
        }

        public Criteria andRequestnoNotBetween(String value1, String value2) {
            addCriterion("REQUESTNO not between", value1, value2, "requestno");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("BALANCE =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("BALANCE <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("BALANCE >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("BALANCE <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("BALANCE in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("BALANCE not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andCapitalmodeIsNull() {
            addCriterion("CAPITALMODE is null");
            return (Criteria) this;
        }

        public Criteria andCapitalmodeIsNotNull() {
            addCriterion("CAPITALMODE is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalmodeEqualTo(String value) {
            addCriterion("CAPITALMODE =", value, "capitalmode");
            return (Criteria) this;
        }

        public Criteria andCapitalmodeNotEqualTo(String value) {
            addCriterion("CAPITALMODE <>", value, "capitalmode");
            return (Criteria) this;
        }

        public Criteria andCapitalmodeGreaterThan(String value) {
            addCriterion("CAPITALMODE >", value, "capitalmode");
            return (Criteria) this;
        }

        public Criteria andCapitalmodeGreaterThanOrEqualTo(String value) {
            addCriterion("CAPITALMODE >=", value, "capitalmode");
            return (Criteria) this;
        }

        public Criteria andCapitalmodeLessThan(String value) {
            addCriterion("CAPITALMODE <", value, "capitalmode");
            return (Criteria) this;
        }

        public Criteria andCapitalmodeLessThanOrEqualTo(String value) {
            addCriterion("CAPITALMODE <=", value, "capitalmode");
            return (Criteria) this;
        }

        public Criteria andCapitalmodeLike(String value) {
            addCriterion("CAPITALMODE like", value, "capitalmode");
            return (Criteria) this;
        }

        public Criteria andCapitalmodeNotLike(String value) {
            addCriterion("CAPITALMODE not like", value, "capitalmode");
            return (Criteria) this;
        }

        public Criteria andCapitalmodeIn(List<String> values) {
            addCriterion("CAPITALMODE in", values, "capitalmode");
            return (Criteria) this;
        }

        public Criteria andCapitalmodeNotIn(List<String> values) {
            addCriterion("CAPITALMODE not in", values, "capitalmode");
            return (Criteria) this;
        }

        public Criteria andCapitalmodeBetween(String value1, String value2) {
            addCriterion("CAPITALMODE between", value1, value2, "capitalmode");
            return (Criteria) this;
        }

        public Criteria andCapitalmodeNotBetween(String value1, String value2) {
            addCriterion("CAPITALMODE not between", value1, value2, "capitalmode");
            return (Criteria) this;
        }

        public Criteria andBankstateIsNull() {
            addCriterion("BANKSTATE is null");
            return (Criteria) this;
        }

        public Criteria andBankstateIsNotNull() {
            addCriterion("BANKSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andBankstateEqualTo(String value) {
            addCriterion("BANKSTATE =", value, "bankstate");
            return (Criteria) this;
        }

        public Criteria andBankstateNotEqualTo(String value) {
            addCriterion("BANKSTATE <>", value, "bankstate");
            return (Criteria) this;
        }

        public Criteria andBankstateGreaterThan(String value) {
            addCriterion("BANKSTATE >", value, "bankstate");
            return (Criteria) this;
        }

        public Criteria andBankstateGreaterThanOrEqualTo(String value) {
            addCriterion("BANKSTATE >=", value, "bankstate");
            return (Criteria) this;
        }

        public Criteria andBankstateLessThan(String value) {
            addCriterion("BANKSTATE <", value, "bankstate");
            return (Criteria) this;
        }

        public Criteria andBankstateLessThanOrEqualTo(String value) {
            addCriterion("BANKSTATE <=", value, "bankstate");
            return (Criteria) this;
        }

        public Criteria andBankstateLike(String value) {
            addCriterion("BANKSTATE like", value, "bankstate");
            return (Criteria) this;
        }

        public Criteria andBankstateNotLike(String value) {
            addCriterion("BANKSTATE not like", value, "bankstate");
            return (Criteria) this;
        }

        public Criteria andBankstateIn(List<String> values) {
            addCriterion("BANKSTATE in", values, "bankstate");
            return (Criteria) this;
        }

        public Criteria andBankstateNotIn(List<String> values) {
            addCriterion("BANKSTATE not in", values, "bankstate");
            return (Criteria) this;
        }

        public Criteria andBankstateBetween(String value1, String value2) {
            addCriterion("BANKSTATE between", value1, value2, "bankstate");
            return (Criteria) this;
        }

        public Criteria andBankstateNotBetween(String value1, String value2) {
            addCriterion("BANKSTATE not between", value1, value2, "bankstate");
            return (Criteria) this;
        }

        public Criteria andBankordernoIsNull() {
            addCriterion("BANKORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andBankordernoIsNotNull() {
            addCriterion("BANKORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andBankordernoEqualTo(String value) {
            addCriterion("BANKORDERNO =", value, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoNotEqualTo(String value) {
            addCriterion("BANKORDERNO <>", value, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoGreaterThan(String value) {
            addCriterion("BANKORDERNO >", value, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoGreaterThanOrEqualTo(String value) {
            addCriterion("BANKORDERNO >=", value, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoLessThan(String value) {
            addCriterion("BANKORDERNO <", value, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoLessThanOrEqualTo(String value) {
            addCriterion("BANKORDERNO <=", value, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoLike(String value) {
            addCriterion("BANKORDERNO like", value, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoNotLike(String value) {
            addCriterion("BANKORDERNO not like", value, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoIn(List<String> values) {
            addCriterion("BANKORDERNO in", values, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoNotIn(List<String> values) {
            addCriterion("BANKORDERNO not in", values, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoBetween(String value1, String value2) {
            addCriterion("BANKORDERNO between", value1, value2, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoNotBetween(String value1, String value2) {
            addCriterion("BANKORDERNO not between", value1, value2, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andAcceptdateIsNull() {
            addCriterion("ACCEPTDATE is null");
            return (Criteria) this;
        }

        public Criteria andAcceptdateIsNotNull() {
            addCriterion("ACCEPTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptdateEqualTo(String value) {
            addCriterion("ACCEPTDATE =", value, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateNotEqualTo(String value) {
            addCriterion("ACCEPTDATE <>", value, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateGreaterThan(String value) {
            addCriterion("ACCEPTDATE >", value, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateGreaterThanOrEqualTo(String value) {
            addCriterion("ACCEPTDATE >=", value, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateLessThan(String value) {
            addCriterion("ACCEPTDATE <", value, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateLessThanOrEqualTo(String value) {
            addCriterion("ACCEPTDATE <=", value, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateLike(String value) {
            addCriterion("ACCEPTDATE like", value, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateNotLike(String value) {
            addCriterion("ACCEPTDATE not like", value, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateIn(List<String> values) {
            addCriterion("ACCEPTDATE in", values, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateNotIn(List<String> values) {
            addCriterion("ACCEPTDATE not in", values, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateBetween(String value1, String value2) {
            addCriterion("ACCEPTDATE between", value1, value2, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateNotBetween(String value1, String value2) {
            addCriterion("ACCEPTDATE not between", value1, value2, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andBusintypeIsNull() {
            addCriterion("BUSINTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusintypeIsNotNull() {
            addCriterion("BUSINTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusintypeEqualTo(String value) {
            addCriterion("BUSINTYPE =", value, "busintype");
            return (Criteria) this;
        }

        public Criteria andBusintypeNotEqualTo(String value) {
            addCriterion("BUSINTYPE <>", value, "busintype");
            return (Criteria) this;
        }

        public Criteria andBusintypeGreaterThan(String value) {
            addCriterion("BUSINTYPE >", value, "busintype");
            return (Criteria) this;
        }

        public Criteria andBusintypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINTYPE >=", value, "busintype");
            return (Criteria) this;
        }

        public Criteria andBusintypeLessThan(String value) {
            addCriterion("BUSINTYPE <", value, "busintype");
            return (Criteria) this;
        }

        public Criteria andBusintypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINTYPE <=", value, "busintype");
            return (Criteria) this;
        }

        public Criteria andBusintypeLike(String value) {
            addCriterion("BUSINTYPE like", value, "busintype");
            return (Criteria) this;
        }

        public Criteria andBusintypeNotLike(String value) {
            addCriterion("BUSINTYPE not like", value, "busintype");
            return (Criteria) this;
        }

        public Criteria andBusintypeIn(List<String> values) {
            addCriterion("BUSINTYPE in", values, "busintype");
            return (Criteria) this;
        }

        public Criteria andBusintypeNotIn(List<String> values) {
            addCriterion("BUSINTYPE not in", values, "busintype");
            return (Criteria) this;
        }

        public Criteria andBusintypeBetween(String value1, String value2) {
            addCriterion("BUSINTYPE between", value1, value2, "busintype");
            return (Criteria) this;
        }

        public Criteria andBusintypeNotBetween(String value1, String value2) {
            addCriterion("BUSINTYPE not between", value1, value2, "busintype");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andTradedateIsNull() {
            addCriterion("TRADEDATE is null");
            return (Criteria) this;
        }

        public Criteria andTradedateIsNotNull() {
            addCriterion("TRADEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTradedateEqualTo(String value) {
            addCriterion("TRADEDATE =", value, "tradedate");
            return (Criteria) this;
        }

        public Criteria andTradedateNotEqualTo(String value) {
            addCriterion("TRADEDATE <>", value, "tradedate");
            return (Criteria) this;
        }

        public Criteria andTradedateGreaterThan(String value) {
            addCriterion("TRADEDATE >", value, "tradedate");
            return (Criteria) this;
        }

        public Criteria andTradedateGreaterThanOrEqualTo(String value) {
            addCriterion("TRADEDATE >=", value, "tradedate");
            return (Criteria) this;
        }

        public Criteria andTradedateLessThan(String value) {
            addCriterion("TRADEDATE <", value, "tradedate");
            return (Criteria) this;
        }

        public Criteria andTradedateLessThanOrEqualTo(String value) {
            addCriterion("TRADEDATE <=", value, "tradedate");
            return (Criteria) this;
        }

        public Criteria andTradedateLike(String value) {
            addCriterion("TRADEDATE like", value, "tradedate");
            return (Criteria) this;
        }

        public Criteria andTradedateNotLike(String value) {
            addCriterion("TRADEDATE not like", value, "tradedate");
            return (Criteria) this;
        }

        public Criteria andTradedateIn(List<String> values) {
            addCriterion("TRADEDATE in", values, "tradedate");
            return (Criteria) this;
        }

        public Criteria andTradedateNotIn(List<String> values) {
            addCriterion("TRADEDATE not in", values, "tradedate");
            return (Criteria) this;
        }

        public Criteria andTradedateBetween(String value1, String value2) {
            addCriterion("TRADEDATE between", value1, value2, "tradedate");
            return (Criteria) this;
        }

        public Criteria andTradedateNotBetween(String value1, String value2) {
            addCriterion("TRADEDATE not between", value1, value2, "tradedate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DS_ORDER
     *
     * @mbggenerated do_not_delete_during_merge Fri Apr 01 16:46:14 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DS_ORDER
     *
     * @mbggenerated Fri Apr 01 16:46:14 CST 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}