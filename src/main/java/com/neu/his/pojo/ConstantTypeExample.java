package com.neu.his.pojo;

import java.util.ArrayList;
import java.util.List;

public class ConstantTypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public ConstantTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
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
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
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

        public Criteria andConstantTypeIdIsNull() {
            addCriterion("constant_type_id is null");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdIsNotNull() {
            addCriterion("constant_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdEqualTo(Byte value) {
            addCriterion("constant_type_id =", value, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdNotEqualTo(Byte value) {
            addCriterion("constant_type_id <>", value, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdGreaterThan(Byte value) {
            addCriterion("constant_type_id >", value, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("constant_type_id >=", value, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdLessThan(Byte value) {
            addCriterion("constant_type_id <", value, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdLessThanOrEqualTo(Byte value) {
            addCriterion("constant_type_id <=", value, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdIn(List<Byte> values) {
            addCriterion("constant_type_id in", values, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdNotIn(List<Byte> values) {
            addCriterion("constant_type_id not in", values, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdBetween(Byte value1, Byte value2) {
            addCriterion("constant_type_id between", value1, value2, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("constant_type_id not between", value1, value2, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeIsNull() {
            addCriterion("constant_type_code is null");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeIsNotNull() {
            addCriterion("constant_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeEqualTo(String value) {
            addCriterion("constant_type_code =", value, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeNotEqualTo(String value) {
            addCriterion("constant_type_code <>", value, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeGreaterThan(String value) {
            addCriterion("constant_type_code >", value, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("constant_type_code >=", value, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeLessThan(String value) {
            addCriterion("constant_type_code <", value, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("constant_type_code <=", value, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeLike(String value) {
            addCriterion("constant_type_code like", value, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeNotLike(String value) {
            addCriterion("constant_type_code not like", value, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeIn(List<String> values) {
            addCriterion("constant_type_code in", values, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeNotIn(List<String> values) {
            addCriterion("constant_type_code not in", values, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeBetween(String value1, String value2) {
            addCriterion("constant_type_code between", value1, value2, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeNotBetween(String value1, String value2) {
            addCriterion("constant_type_code not between", value1, value2, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameIsNull() {
            addCriterion("constant_type_name is null");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameIsNotNull() {
            addCriterion("constant_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameEqualTo(String value) {
            addCriterion("constant_type_name =", value, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameNotEqualTo(String value) {
            addCriterion("constant_type_name <>", value, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameGreaterThan(String value) {
            addCriterion("constant_type_name >", value, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("constant_type_name >=", value, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameLessThan(String value) {
            addCriterion("constant_type_name <", value, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameLessThanOrEqualTo(String value) {
            addCriterion("constant_type_name <=", value, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameLike(String value) {
            addCriterion("constant_type_name like", value, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameNotLike(String value) {
            addCriterion("constant_type_name not like", value, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameIn(List<String> values) {
            addCriterion("constant_type_name in", values, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameNotIn(List<String> values) {
            addCriterion("constant_type_name not in", values, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameBetween(String value1, String value2) {
            addCriterion("constant_type_name between", value1, value2, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameNotBetween(String value1, String value2) {
            addCriterion("constant_type_name not between", value1, value2, "constantTypeName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table constant_type
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 22 16:18:51 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
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