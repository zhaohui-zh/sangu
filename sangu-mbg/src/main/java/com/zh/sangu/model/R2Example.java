package com.zh.sangu.model;

import java.util.ArrayList;
import java.util.List;

public class R2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public R2Example() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDnnIsNull() {
            addCriterion("DNN is null");
            return (Criteria) this;
        }

        public Criteria andDnnIsNotNull() {
            addCriterion("DNN is not null");
            return (Criteria) this;
        }

        public Criteria andDnnEqualTo(String value) {
            addCriterion("DNN =", value, "dnn");
            return (Criteria) this;
        }

        public Criteria andDnnNotEqualTo(String value) {
            addCriterion("DNN <>", value, "dnn");
            return (Criteria) this;
        }

        public Criteria andDnnGreaterThan(String value) {
            addCriterion("DNN >", value, "dnn");
            return (Criteria) this;
        }

        public Criteria andDnnGreaterThanOrEqualTo(String value) {
            addCriterion("DNN >=", value, "dnn");
            return (Criteria) this;
        }

        public Criteria andDnnLessThan(String value) {
            addCriterion("DNN <", value, "dnn");
            return (Criteria) this;
        }

        public Criteria andDnnLessThanOrEqualTo(String value) {
            addCriterion("DNN <=", value, "dnn");
            return (Criteria) this;
        }

        public Criteria andDnnLike(String value) {
            addCriterion("DNN like", value, "dnn");
            return (Criteria) this;
        }

        public Criteria andDnnNotLike(String value) {
            addCriterion("DNN not like", value, "dnn");
            return (Criteria) this;
        }

        public Criteria andDnnIn(List<String> values) {
            addCriterion("DNN in", values, "dnn");
            return (Criteria) this;
        }

        public Criteria andDnnNotIn(List<String> values) {
            addCriterion("DNN not in", values, "dnn");
            return (Criteria) this;
        }

        public Criteria andDnnBetween(String value1, String value2) {
            addCriterion("DNN between", value1, value2, "dnn");
            return (Criteria) this;
        }

        public Criteria andDnnNotBetween(String value1, String value2) {
            addCriterion("DNN not between", value1, value2, "dnn");
            return (Criteria) this;
        }

        public Criteria andSvrIsNull() {
            addCriterion("SVR is null");
            return (Criteria) this;
        }

        public Criteria andSvrIsNotNull() {
            addCriterion("SVR is not null");
            return (Criteria) this;
        }

        public Criteria andSvrEqualTo(String value) {
            addCriterion("SVR =", value, "svr");
            return (Criteria) this;
        }

        public Criteria andSvrNotEqualTo(String value) {
            addCriterion("SVR <>", value, "svr");
            return (Criteria) this;
        }

        public Criteria andSvrGreaterThan(String value) {
            addCriterion("SVR >", value, "svr");
            return (Criteria) this;
        }

        public Criteria andSvrGreaterThanOrEqualTo(String value) {
            addCriterion("SVR >=", value, "svr");
            return (Criteria) this;
        }

        public Criteria andSvrLessThan(String value) {
            addCriterion("SVR <", value, "svr");
            return (Criteria) this;
        }

        public Criteria andSvrLessThanOrEqualTo(String value) {
            addCriterion("SVR <=", value, "svr");
            return (Criteria) this;
        }

        public Criteria andSvrLike(String value) {
            addCriterion("SVR like", value, "svr");
            return (Criteria) this;
        }

        public Criteria andSvrNotLike(String value) {
            addCriterion("SVR not like", value, "svr");
            return (Criteria) this;
        }

        public Criteria andSvrIn(List<String> values) {
            addCriterion("SVR in", values, "svr");
            return (Criteria) this;
        }

        public Criteria andSvrNotIn(List<String> values) {
            addCriterion("SVR not in", values, "svr");
            return (Criteria) this;
        }

        public Criteria andSvrBetween(String value1, String value2) {
            addCriterion("SVR between", value1, value2, "svr");
            return (Criteria) this;
        }

        public Criteria andSvrNotBetween(String value1, String value2) {
            addCriterion("SVR not between", value1, value2, "svr");
            return (Criteria) this;
        }

        public Criteria andLrIsNull() {
            addCriterion("LR is null");
            return (Criteria) this;
        }

        public Criteria andLrIsNotNull() {
            addCriterion("LR is not null");
            return (Criteria) this;
        }

        public Criteria andLrEqualTo(String value) {
            addCriterion("LR =", value, "lr");
            return (Criteria) this;
        }

        public Criteria andLrNotEqualTo(String value) {
            addCriterion("LR <>", value, "lr");
            return (Criteria) this;
        }

        public Criteria andLrGreaterThan(String value) {
            addCriterion("LR >", value, "lr");
            return (Criteria) this;
        }

        public Criteria andLrGreaterThanOrEqualTo(String value) {
            addCriterion("LR >=", value, "lr");
            return (Criteria) this;
        }

        public Criteria andLrLessThan(String value) {
            addCriterion("LR <", value, "lr");
            return (Criteria) this;
        }

        public Criteria andLrLessThanOrEqualTo(String value) {
            addCriterion("LR <=", value, "lr");
            return (Criteria) this;
        }

        public Criteria andLrLike(String value) {
            addCriterion("LR like", value, "lr");
            return (Criteria) this;
        }

        public Criteria andLrNotLike(String value) {
            addCriterion("LR not like", value, "lr");
            return (Criteria) this;
        }

        public Criteria andLrIn(List<String> values) {
            addCriterion("LR in", values, "lr");
            return (Criteria) this;
        }

        public Criteria andLrNotIn(List<String> values) {
            addCriterion("LR not in", values, "lr");
            return (Criteria) this;
        }

        public Criteria andLrBetween(String value1, String value2) {
            addCriterion("LR between", value1, value2, "lr");
            return (Criteria) this;
        }

        public Criteria andLrNotBetween(String value1, String value2) {
            addCriterion("LR not between", value1, value2, "lr");
            return (Criteria) this;
        }

        public Criteria andRrIsNull() {
            addCriterion("RR is null");
            return (Criteria) this;
        }

        public Criteria andRrIsNotNull() {
            addCriterion("RR is not null");
            return (Criteria) this;
        }

        public Criteria andRrEqualTo(String value) {
            addCriterion("RR =", value, "rr");
            return (Criteria) this;
        }

        public Criteria andRrNotEqualTo(String value) {
            addCriterion("RR <>", value, "rr");
            return (Criteria) this;
        }

        public Criteria andRrGreaterThan(String value) {
            addCriterion("RR >", value, "rr");
            return (Criteria) this;
        }

        public Criteria andRrGreaterThanOrEqualTo(String value) {
            addCriterion("RR >=", value, "rr");
            return (Criteria) this;
        }

        public Criteria andRrLessThan(String value) {
            addCriterion("RR <", value, "rr");
            return (Criteria) this;
        }

        public Criteria andRrLessThanOrEqualTo(String value) {
            addCriterion("RR <=", value, "rr");
            return (Criteria) this;
        }

        public Criteria andRrLike(String value) {
            addCriterion("RR like", value, "rr");
            return (Criteria) this;
        }

        public Criteria andRrNotLike(String value) {
            addCriterion("RR not like", value, "rr");
            return (Criteria) this;
        }

        public Criteria andRrIn(List<String> values) {
            addCriterion("RR in", values, "rr");
            return (Criteria) this;
        }

        public Criteria andRrNotIn(List<String> values) {
            addCriterion("RR not in", values, "rr");
            return (Criteria) this;
        }

        public Criteria andRrBetween(String value1, String value2) {
            addCriterion("RR between", value1, value2, "rr");
            return (Criteria) this;
        }

        public Criteria andRrNotBetween(String value1, String value2) {
            addCriterion("RR not between", value1, value2, "rr");
            return (Criteria) this;
        }

        public Criteria andBrrIsNull() {
            addCriterion("BRR is null");
            return (Criteria) this;
        }

        public Criteria andBrrIsNotNull() {
            addCriterion("BRR is not null");
            return (Criteria) this;
        }

        public Criteria andBrrEqualTo(String value) {
            addCriterion("BRR =", value, "brr");
            return (Criteria) this;
        }

        public Criteria andBrrNotEqualTo(String value) {
            addCriterion("BRR <>", value, "brr");
            return (Criteria) this;
        }

        public Criteria andBrrGreaterThan(String value) {
            addCriterion("BRR >", value, "brr");
            return (Criteria) this;
        }

        public Criteria andBrrGreaterThanOrEqualTo(String value) {
            addCriterion("BRR >=", value, "brr");
            return (Criteria) this;
        }

        public Criteria andBrrLessThan(String value) {
            addCriterion("BRR <", value, "brr");
            return (Criteria) this;
        }

        public Criteria andBrrLessThanOrEqualTo(String value) {
            addCriterion("BRR <=", value, "brr");
            return (Criteria) this;
        }

        public Criteria andBrrLike(String value) {
            addCriterion("BRR like", value, "brr");
            return (Criteria) this;
        }

        public Criteria andBrrNotLike(String value) {
            addCriterion("BRR not like", value, "brr");
            return (Criteria) this;
        }

        public Criteria andBrrIn(List<String> values) {
            addCriterion("BRR in", values, "brr");
            return (Criteria) this;
        }

        public Criteria andBrrNotIn(List<String> values) {
            addCriterion("BRR not in", values, "brr");
            return (Criteria) this;
        }

        public Criteria andBrrBetween(String value1, String value2) {
            addCriterion("BRR between", value1, value2, "brr");
            return (Criteria) this;
        }

        public Criteria andBrrNotBetween(String value1, String value2) {
            addCriterion("BRR not between", value1, value2, "brr");
            return (Criteria) this;
        }

        public Criteria andDtrIsNull() {
            addCriterion("DTR is null");
            return (Criteria) this;
        }

        public Criteria andDtrIsNotNull() {
            addCriterion("DTR is not null");
            return (Criteria) this;
        }

        public Criteria andDtrEqualTo(String value) {
            addCriterion("DTR =", value, "dtr");
            return (Criteria) this;
        }

        public Criteria andDtrNotEqualTo(String value) {
            addCriterion("DTR <>", value, "dtr");
            return (Criteria) this;
        }

        public Criteria andDtrGreaterThan(String value) {
            addCriterion("DTR >", value, "dtr");
            return (Criteria) this;
        }

        public Criteria andDtrGreaterThanOrEqualTo(String value) {
            addCriterion("DTR >=", value, "dtr");
            return (Criteria) this;
        }

        public Criteria andDtrLessThan(String value) {
            addCriterion("DTR <", value, "dtr");
            return (Criteria) this;
        }

        public Criteria andDtrLessThanOrEqualTo(String value) {
            addCriterion("DTR <=", value, "dtr");
            return (Criteria) this;
        }

        public Criteria andDtrLike(String value) {
            addCriterion("DTR like", value, "dtr");
            return (Criteria) this;
        }

        public Criteria andDtrNotLike(String value) {
            addCriterion("DTR not like", value, "dtr");
            return (Criteria) this;
        }

        public Criteria andDtrIn(List<String> values) {
            addCriterion("DTR in", values, "dtr");
            return (Criteria) this;
        }

        public Criteria andDtrNotIn(List<String> values) {
            addCriterion("DTR not in", values, "dtr");
            return (Criteria) this;
        }

        public Criteria andDtrBetween(String value1, String value2) {
            addCriterion("DTR between", value1, value2, "dtr");
            return (Criteria) this;
        }

        public Criteria andDtrNotBetween(String value1, String value2) {
            addCriterion("DTR not between", value1, value2, "dtr");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("MONTH is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("MONTH =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("MONTH <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("MONTH >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("MONTH >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("MONTH <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("MONTH <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("MONTH like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("MONTH not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("MONTH in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("MONTH not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("MONTH between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("MONTH not between", value1, value2, "month");
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