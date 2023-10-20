package com.cl.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductColorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductColorExample() {
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

        public Criteria andProductColorIdIsNull() {
            addCriterion("product_color_id is null");
            return (Criteria) this;
        }

        public Criteria andProductColorIdIsNotNull() {
            addCriterion("product_color_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductColorIdEqualTo(Integer value) {
            addCriterion("product_color_id =", value, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdNotEqualTo(Integer value) {
            addCriterion("product_color_id <>", value, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdGreaterThan(Integer value) {
            addCriterion("product_color_id >", value, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_color_id >=", value, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdLessThan(Integer value) {
            addCriterion("product_color_id <", value, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_color_id <=", value, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdIn(List<Integer> values) {
            addCriterion("product_color_id in", values, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdNotIn(List<Integer> values) {
            addCriterion("product_color_id not in", values, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdBetween(Integer value1, Integer value2) {
            addCriterion("product_color_id between", value1, value2, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_color_id not between", value1, value2, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductColorIsNull() {
            addCriterion("product_color is null");
            return (Criteria) this;
        }

        public Criteria andProductColorIsNotNull() {
            addCriterion("product_color is not null");
            return (Criteria) this;
        }

        public Criteria andProductColorEqualTo(String value) {
            addCriterion("product_color =", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorNotEqualTo(String value) {
            addCriterion("product_color <>", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorGreaterThan(String value) {
            addCriterion("product_color >", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorGreaterThanOrEqualTo(String value) {
            addCriterion("product_color >=", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorLessThan(String value) {
            addCriterion("product_color <", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorLessThanOrEqualTo(String value) {
            addCriterion("product_color <=", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorLike(String value) {
            addCriterion("product_color like", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorNotLike(String value) {
            addCriterion("product_color not like", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorIn(List<String> values) {
            addCriterion("product_color in", values, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorNotIn(List<String> values) {
            addCriterion("product_color not in", values, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorBetween(String value1, String value2) {
            addCriterion("product_color between", value1, value2, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorNotBetween(String value1, String value2) {
            addCriterion("product_color not between", value1, value2, "productColor");
            return (Criteria) this;
        }

        public Criteria andColorCodeIsNull() {
            addCriterion("color_code is null");
            return (Criteria) this;
        }

        public Criteria andColorCodeIsNotNull() {
            addCriterion("color_code is not null");
            return (Criteria) this;
        }

        public Criteria andColorCodeEqualTo(String value) {
            addCriterion("color_code =", value, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeNotEqualTo(String value) {
            addCriterion("color_code <>", value, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeGreaterThan(String value) {
            addCriterion("color_code >", value, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("color_code >=", value, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeLessThan(String value) {
            addCriterion("color_code <", value, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeLessThanOrEqualTo(String value) {
            addCriterion("color_code <=", value, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeLike(String value) {
            addCriterion("color_code like", value, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeNotLike(String value) {
            addCriterion("color_code not like", value, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeIn(List<String> values) {
            addCriterion("color_code in", values, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeNotIn(List<String> values) {
            addCriterion("color_code not in", values, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeBetween(String value1, String value2) {
            addCriterion("color_code between", value1, value2, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeNotBetween(String value1, String value2) {
            addCriterion("color_code not between", value1, value2, "colorCode");
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