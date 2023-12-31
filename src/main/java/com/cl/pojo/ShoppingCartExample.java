package com.cl.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoppingCartExample() {
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

        public Criteria andCartIdIsNull() {
            addCriterion("cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNotNull() {
            addCriterion("cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartIdEqualTo(Integer value) {
            addCriterion("cart_id =", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotEqualTo(Integer value) {
            addCriterion("cart_id <>", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThan(Integer value) {
            addCriterion("cart_id >", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_id >=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThan(Integer value) {
            addCriterion("cart_id <", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThanOrEqualTo(Integer value) {
            addCriterion("cart_id <=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdIn(List<Integer> values) {
            addCriterion("cart_id in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotIn(List<Integer> values) {
            addCriterion("cart_id not in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdBetween(Integer value1, Integer value2) {
            addCriterion("cart_id between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_id not between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andProductQuantityIsNull() {
            addCriterion("product_quantity is null");
            return (Criteria) this;
        }

        public Criteria andProductQuantityIsNotNull() {
            addCriterion("product_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andProductQuantityEqualTo(Integer value) {
            addCriterion("product_quantity =", value, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityNotEqualTo(Integer value) {
            addCriterion("product_quantity <>", value, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityGreaterThan(Integer value) {
            addCriterion("product_quantity >", value, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_quantity >=", value, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityLessThan(Integer value) {
            addCriterion("product_quantity <", value, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("product_quantity <=", value, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityIn(List<Integer> values) {
            addCriterion("product_quantity in", values, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityNotIn(List<Integer> values) {
            addCriterion("product_quantity not in", values, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityBetween(Integer value1, Integer value2) {
            addCriterion("product_quantity between", value1, value2, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("product_quantity not between", value1, value2, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andCartStatusIsNull() {
            addCriterion("cart_status is null");
            return (Criteria) this;
        }

        public Criteria andCartStatusIsNotNull() {
            addCriterion("cart_status is not null");
            return (Criteria) this;
        }

        public Criteria andCartStatusEqualTo(Integer value) {
            addCriterion("cart_status =", value, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusNotEqualTo(Integer value) {
            addCriterion("cart_status <>", value, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusGreaterThan(Integer value) {
            addCriterion("cart_status >", value, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_status >=", value, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusLessThan(Integer value) {
            addCriterion("cart_status <", value, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cart_status <=", value, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusIn(List<Integer> values) {
            addCriterion("cart_status in", values, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusNotIn(List<Integer> values) {
            addCriterion("cart_status not in", values, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusBetween(Integer value1, Integer value2) {
            addCriterion("cart_status between", value1, value2, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_status not between", value1, value2, "cartStatus");
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