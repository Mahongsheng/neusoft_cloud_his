package com.neu.his.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PatientExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public PatientExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
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
     * This method corresponds to the database table patient
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
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
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
     * This class corresponds to the database table patient
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPatientRecordIdIsNull() {
            addCriterion("patient_record_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientRecordIdIsNotNull() {
            addCriterion("patient_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientRecordIdEqualTo(Integer value) {
            addCriterion("patient_record_id =", value, "patientRecordId");
            return (Criteria) this;
        }

        public Criteria andPatientRecordIdNotEqualTo(Integer value) {
            addCriterion("patient_record_id <>", value, "patientRecordId");
            return (Criteria) this;
        }

        public Criteria andPatientRecordIdGreaterThan(Integer value) {
            addCriterion("patient_record_id >", value, "patientRecordId");
            return (Criteria) this;
        }

        public Criteria andPatientRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_record_id >=", value, "patientRecordId");
            return (Criteria) this;
        }

        public Criteria andPatientRecordIdLessThan(Integer value) {
            addCriterion("patient_record_id <", value, "patientRecordId");
            return (Criteria) this;
        }

        public Criteria andPatientRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("patient_record_id <=", value, "patientRecordId");
            return (Criteria) this;
        }

        public Criteria andPatientRecordIdIn(List<Integer> values) {
            addCriterion("patient_record_id in", values, "patientRecordId");
            return (Criteria) this;
        }

        public Criteria andPatientRecordIdNotIn(List<Integer> values) {
            addCriterion("patient_record_id not in", values, "patientRecordId");
            return (Criteria) this;
        }

        public Criteria andPatientRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("patient_record_id between", value1, value2, "patientRecordId");
            return (Criteria) this;
        }

        public Criteria andPatientRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_record_id not between", value1, value2, "patientRecordId");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("patient_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("patient_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("patient_name =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("patient_name <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("patient_name >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_name >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("patient_name <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("patient_name <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("patient_name like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("patient_name not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("patient_name in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("patient_name not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("patient_name between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("patient_name not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientGenderIsNull() {
            addCriterion("patient_gender is null");
            return (Criteria) this;
        }

        public Criteria andPatientGenderIsNotNull() {
            addCriterion("patient_gender is not null");
            return (Criteria) this;
        }

        public Criteria andPatientGenderEqualTo(Byte value) {
            addCriterion("patient_gender =", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotEqualTo(Byte value) {
            addCriterion("patient_gender <>", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderGreaterThan(Byte value) {
            addCriterion("patient_gender >", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("patient_gender >=", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderLessThan(Byte value) {
            addCriterion("patient_gender <", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderLessThanOrEqualTo(Byte value) {
            addCriterion("patient_gender <=", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderIn(List<Byte> values) {
            addCriterion("patient_gender in", values, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotIn(List<Byte> values) {
            addCriterion("patient_gender not in", values, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderBetween(Byte value1, Byte value2) {
            addCriterion("patient_gender between", value1, value2, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("patient_gender not between", value1, value2, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIsNull() {
            addCriterion("patient_age is null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIsNotNull() {
            addCriterion("patient_age is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeEqualTo(Byte value) {
            addCriterion("patient_age =", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotEqualTo(Byte value) {
            addCriterion("patient_age <>", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeGreaterThan(Byte value) {
            addCriterion("patient_age >", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("patient_age >=", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLessThan(Byte value) {
            addCriterion("patient_age <", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLessThanOrEqualTo(Byte value) {
            addCriterion("patient_age <=", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIn(List<Byte> values) {
            addCriterion("patient_age in", values, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotIn(List<Byte> values) {
            addCriterion("patient_age not in", values, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBetween(Byte value1, Byte value2) {
            addCriterion("patient_age between", value1, value2, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotBetween(Byte value1, Byte value2) {
            addCriterion("patient_age not between", value1, value2, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientIdNumIsNull() {
            addCriterion("patient_id_num is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdNumIsNotNull() {
            addCriterion("patient_id_num is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdNumEqualTo(String value) {
            addCriterion("patient_id_num =", value, "patientIdNum");
            return (Criteria) this;
        }

        public Criteria andPatientIdNumNotEqualTo(String value) {
            addCriterion("patient_id_num <>", value, "patientIdNum");
            return (Criteria) this;
        }

        public Criteria andPatientIdNumGreaterThan(String value) {
            addCriterion("patient_id_num >", value, "patientIdNum");
            return (Criteria) this;
        }

        public Criteria andPatientIdNumGreaterThanOrEqualTo(String value) {
            addCriterion("patient_id_num >=", value, "patientIdNum");
            return (Criteria) this;
        }

        public Criteria andPatientIdNumLessThan(String value) {
            addCriterion("patient_id_num <", value, "patientIdNum");
            return (Criteria) this;
        }

        public Criteria andPatientIdNumLessThanOrEqualTo(String value) {
            addCriterion("patient_id_num <=", value, "patientIdNum");
            return (Criteria) this;
        }

        public Criteria andPatientIdNumLike(String value) {
            addCriterion("patient_id_num like", value, "patientIdNum");
            return (Criteria) this;
        }

        public Criteria andPatientIdNumNotLike(String value) {
            addCriterion("patient_id_num not like", value, "patientIdNum");
            return (Criteria) this;
        }

        public Criteria andPatientIdNumIn(List<String> values) {
            addCriterion("patient_id_num in", values, "patientIdNum");
            return (Criteria) this;
        }

        public Criteria andPatientIdNumNotIn(List<String> values) {
            addCriterion("patient_id_num not in", values, "patientIdNum");
            return (Criteria) this;
        }

        public Criteria andPatientIdNumBetween(String value1, String value2) {
            addCriterion("patient_id_num between", value1, value2, "patientIdNum");
            return (Criteria) this;
        }

        public Criteria andPatientIdNumNotBetween(String value1, String value2) {
            addCriterion("patient_id_num not between", value1, value2, "patientIdNum");
            return (Criteria) this;
        }

        public Criteria andPatientAddressIsNull() {
            addCriterion("patient_address is null");
            return (Criteria) this;
        }

        public Criteria andPatientAddressIsNotNull() {
            addCriterion("patient_address is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAddressEqualTo(String value) {
            addCriterion("patient_address =", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotEqualTo(String value) {
            addCriterion("patient_address <>", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressGreaterThan(String value) {
            addCriterion("patient_address >", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressGreaterThanOrEqualTo(String value) {
            addCriterion("patient_address >=", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressLessThan(String value) {
            addCriterion("patient_address <", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressLessThanOrEqualTo(String value) {
            addCriterion("patient_address <=", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressLike(String value) {
            addCriterion("patient_address like", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotLike(String value) {
            addCriterion("patient_address not like", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressIn(List<String> values) {
            addCriterion("patient_address in", values, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotIn(List<String> values) {
            addCriterion("patient_address not in", values, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressBetween(String value1, String value2) {
            addCriterion("patient_address between", value1, value2, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotBetween(String value1, String value2) {
            addCriterion("patient_address not between", value1, value2, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAgeTypeIsNull() {
            addCriterion("patient_age_type is null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeTypeIsNotNull() {
            addCriterion("patient_age_type is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeTypeEqualTo(String value) {
            addCriterion("patient_age_type =", value, "patientAgeType");
            return (Criteria) this;
        }

        public Criteria andPatientAgeTypeNotEqualTo(String value) {
            addCriterion("patient_age_type <>", value, "patientAgeType");
            return (Criteria) this;
        }

        public Criteria andPatientAgeTypeGreaterThan(String value) {
            addCriterion("patient_age_type >", value, "patientAgeType");
            return (Criteria) this;
        }

        public Criteria andPatientAgeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("patient_age_type >=", value, "patientAgeType");
            return (Criteria) this;
        }

        public Criteria andPatientAgeTypeLessThan(String value) {
            addCriterion("patient_age_type <", value, "patientAgeType");
            return (Criteria) this;
        }

        public Criteria andPatientAgeTypeLessThanOrEqualTo(String value) {
            addCriterion("patient_age_type <=", value, "patientAgeType");
            return (Criteria) this;
        }

        public Criteria andPatientAgeTypeLike(String value) {
            addCriterion("patient_age_type like", value, "patientAgeType");
            return (Criteria) this;
        }

        public Criteria andPatientAgeTypeNotLike(String value) {
            addCriterion("patient_age_type not like", value, "patientAgeType");
            return (Criteria) this;
        }

        public Criteria andPatientAgeTypeIn(List<String> values) {
            addCriterion("patient_age_type in", values, "patientAgeType");
            return (Criteria) this;
        }

        public Criteria andPatientAgeTypeNotIn(List<String> values) {
            addCriterion("patient_age_type not in", values, "patientAgeType");
            return (Criteria) this;
        }

        public Criteria andPatientAgeTypeBetween(String value1, String value2) {
            addCriterion("patient_age_type between", value1, value2, "patientAgeType");
            return (Criteria) this;
        }

        public Criteria andPatientAgeTypeNotBetween(String value1, String value2) {
            addCriterion("patient_age_type not between", value1, value2, "patientAgeType");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIsNull() {
            addCriterion("patient_birthday is null");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIsNotNull() {
            addCriterion("patient_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("patient_birthday =", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("patient_birthday <>", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("patient_birthday >", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("patient_birthday >=", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("patient_birthday <", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("patient_birthday <=", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("patient_birthday in", values, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("patient_birthday not in", values, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("patient_birthday between", value1, value2, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("patient_birthday not between", value1, value2, "patientBirthday");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table patient
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
     * This class corresponds to the database table patient
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