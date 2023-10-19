package com.cl.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductConfigExample() {
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

        public Criteria andProductConfigIdIsNull() {
            addCriterion("product_config_id is null");
            return (Criteria) this;
        }

        public Criteria andProductConfigIdIsNotNull() {
            addCriterion("product_config_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductConfigIdEqualTo(Integer value) {
            addCriterion("product_config_id =", value, "productConfigId");
            return (Criteria) this;
        }

        public Criteria andProductConfigIdNotEqualTo(Integer value) {
            addCriterion("product_config_id <>", value, "productConfigId");
            return (Criteria) this;
        }

        public Criteria andProductConfigIdGreaterThan(Integer value) {
            addCriterion("product_config_id >", value, "productConfigId");
            return (Criteria) this;
        }

        public Criteria andProductConfigIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_config_id >=", value, "productConfigId");
            return (Criteria) this;
        }

        public Criteria andProductConfigIdLessThan(Integer value) {
            addCriterion("product_config_id <", value, "productConfigId");
            return (Criteria) this;
        }

        public Criteria andProductConfigIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_config_id <=", value, "productConfigId");
            return (Criteria) this;
        }

        public Criteria andProductConfigIdIn(List<Integer> values) {
            addCriterion("product_config_id in", values, "productConfigId");
            return (Criteria) this;
        }

        public Criteria andProductConfigIdNotIn(List<Integer> values) {
            addCriterion("product_config_id not in", values, "productConfigId");
            return (Criteria) this;
        }

        public Criteria andProductConfigIdBetween(Integer value1, Integer value2) {
            addCriterion("product_config_id between", value1, value2, "productConfigId");
            return (Criteria) this;
        }

        public Criteria andProductConfigIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_config_id not between", value1, value2, "productConfigId");
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

        public Criteria andProductConfigIsNull() {
            addCriterion("product_config is null");
            return (Criteria) this;
        }

        public Criteria andProductConfigIsNotNull() {
            addCriterion("product_config is not null");
            return (Criteria) this;
        }

        public Criteria andProductConfigEqualTo(String value) {
            addCriterion("product_config =", value, "productConfig");
            return (Criteria) this;
        }

        public Criteria andProductConfigNotEqualTo(String value) {
            addCriterion("product_config <>", value, "productConfig");
            return (Criteria) this;
        }

        public Criteria andProductConfigGreaterThan(String value) {
            addCriterion("product_config >", value, "productConfig");
            return (Criteria) this;
        }

        public Criteria andProductConfigGreaterThanOrEqualTo(String value) {
            addCriterion("product_config >=", value, "productConfig");
            return (Criteria) this;
        }

        public Criteria andProductConfigLessThan(String value) {
            addCriterion("product_config <", value, "productConfig");
            return (Criteria) this;
        }

        public Criteria andProductConfigLessThanOrEqualTo(String value) {
            addCriterion("product_config <=", value, "productConfig");
            return (Criteria) this;
        }

        public Criteria andProductConfigLike(String value) {
            addCriterion("product_config like", value, "productConfig");
            return (Criteria) this;
        }

        public Criteria andProductConfigNotLike(String value) {
            addCriterion("product_config not like", value, "productConfig");
            return (Criteria) this;
        }

        public Criteria andProductConfigIn(List<String> values) {
            addCriterion("product_config in", values, "productConfig");
            return (Criteria) this;
        }

        public Criteria andProductConfigNotIn(List<String> values) {
            addCriterion("product_config not in", values, "productConfig");
            return (Criteria) this;
        }

        public Criteria andProductConfigBetween(String value1, String value2) {
            addCriterion("product_config between", value1, value2, "productConfig");
            return (Criteria) this;
        }

        public Criteria andProductConfigNotBetween(String value1, String value2) {
            addCriterion("product_config not between", value1, value2, "productConfig");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("product_price is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("product_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(BigDecimal value) {
            addCriterion("product_price =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(BigDecimal value) {
            addCriterion("product_price <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(BigDecimal value) {
            addCriterion("product_price >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("product_price >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(BigDecimal value) {
            addCriterion("product_price <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("product_price <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<BigDecimal> values) {
            addCriterion("product_price in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<BigDecimal> values) {
            addCriterion("product_price not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_price between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_price not between", value1, value2, "productPrice");
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