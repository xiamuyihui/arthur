package com.tough.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParkExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andParkNoIsNull() {
            addCriterion("park_no is null");
            return (Criteria) this;
        }

        public Criteria andParkNoIsNotNull() {
            addCriterion("park_no is not null");
            return (Criteria) this;
        }

        public Criteria andParkNoEqualTo(String value) {
            addCriterion("park_no =", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoNotEqualTo(String value) {
            addCriterion("park_no <>", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoGreaterThan(String value) {
            addCriterion("park_no >", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoGreaterThanOrEqualTo(String value) {
            addCriterion("park_no >=", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoLessThan(String value) {
            addCriterion("park_no <", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoLessThanOrEqualTo(String value) {
            addCriterion("park_no <=", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoLike(String value) {
            addCriterion("park_no like", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoNotLike(String value) {
            addCriterion("park_no not like", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoIn(List<String> values) {
            addCriterion("park_no in", values, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoNotIn(List<String> values) {
            addCriterion("park_no not in", values, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoBetween(String value1, String value2) {
            addCriterion("park_no between", value1, value2, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoNotBetween(String value1, String value2) {
            addCriterion("park_no not between", value1, value2, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkAddressIsNull() {
            addCriterion("park_address is null");
            return (Criteria) this;
        }

        public Criteria andParkAddressIsNotNull() {
            addCriterion("park_address is not null");
            return (Criteria) this;
        }

        public Criteria andParkAddressEqualTo(String value) {
            addCriterion("park_address =", value, "parkAddress");
            return (Criteria) this;
        }

        public Criteria andParkAddressNotEqualTo(String value) {
            addCriterion("park_address <>", value, "parkAddress");
            return (Criteria) this;
        }

        public Criteria andParkAddressGreaterThan(String value) {
            addCriterion("park_address >", value, "parkAddress");
            return (Criteria) this;
        }

        public Criteria andParkAddressGreaterThanOrEqualTo(String value) {
            addCriterion("park_address >=", value, "parkAddress");
            return (Criteria) this;
        }

        public Criteria andParkAddressLessThan(String value) {
            addCriterion("park_address <", value, "parkAddress");
            return (Criteria) this;
        }

        public Criteria andParkAddressLessThanOrEqualTo(String value) {
            addCriterion("park_address <=", value, "parkAddress");
            return (Criteria) this;
        }

        public Criteria andParkAddressLike(String value) {
            addCriterion("park_address like", value, "parkAddress");
            return (Criteria) this;
        }

        public Criteria andParkAddressNotLike(String value) {
            addCriterion("park_address not like", value, "parkAddress");
            return (Criteria) this;
        }

        public Criteria andParkAddressIn(List<String> values) {
            addCriterion("park_address in", values, "parkAddress");
            return (Criteria) this;
        }

        public Criteria andParkAddressNotIn(List<String> values) {
            addCriterion("park_address not in", values, "parkAddress");
            return (Criteria) this;
        }

        public Criteria andParkAddressBetween(String value1, String value2) {
            addCriterion("park_address between", value1, value2, "parkAddress");
            return (Criteria) this;
        }

        public Criteria andParkAddressNotBetween(String value1, String value2) {
            addCriterion("park_address not between", value1, value2, "parkAddress");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIsNull() {
            addCriterion("create_person is null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIsNotNull() {
            addCriterion("create_person is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonEqualTo(String value) {
            addCriterion("create_person =", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotEqualTo(String value) {
            addCriterion("create_person <>", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonGreaterThan(String value) {
            addCriterion("create_person >", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonGreaterThanOrEqualTo(String value) {
            addCriterion("create_person >=", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLessThan(String value) {
            addCriterion("create_person <", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLessThanOrEqualTo(String value) {
            addCriterion("create_person <=", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLike(String value) {
            addCriterion("create_person like", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotLike(String value) {
            addCriterion("create_person not like", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIn(List<String> values) {
            addCriterion("create_person in", values, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotIn(List<String> values) {
            addCriterion("create_person not in", values, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonBetween(String value1, String value2) {
            addCriterion("create_person between", value1, value2, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotBetween(String value1, String value2) {
            addCriterion("create_person not between", value1, value2, "createPerson");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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