package com.cl.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductSketchIsNull() {
            addCriterion("product_sketch is null");
            return (Criteria) this;
        }

        public Criteria andProductSketchIsNotNull() {
            addCriterion("product_sketch is not null");
            return (Criteria) this;
        }

        public Criteria andProductSketchEqualTo(String value) {
            addCriterion("product_sketch =", value, "productSketch");
            return (Criteria) this;
        }

        public Criteria andProductSketchNotEqualTo(String value) {
            addCriterion("product_sketch <>", value, "productSketch");
            return (Criteria) this;
        }

        public Criteria andProductSketchGreaterThan(String value) {
            addCriterion("product_sketch >", value, "productSketch");
            return (Criteria) this;
        }

        public Criteria andProductSketchGreaterThanOrEqualTo(String value) {
            addCriterion("product_sketch >=", value, "productSketch");
            return (Criteria) this;
        }

        public Criteria andProductSketchLessThan(String value) {
            addCriterion("product_sketch <", value, "productSketch");
            return (Criteria) this;
        }

        public Criteria andProductSketchLessThanOrEqualTo(String value) {
            addCriterion("product_sketch <=", value, "productSketch");
            return (Criteria) this;
        }

        public Criteria andProductSketchLike(String value) {
            addCriterion("product_sketch like", value, "productSketch");
            return (Criteria) this;
        }

        public Criteria andProductSketchNotLike(String value) {
            addCriterion("product_sketch not like", value, "productSketch");
            return (Criteria) this;
        }

        public Criteria andProductSketchIn(List<String> values) {
            addCriterion("product_sketch in", values, "productSketch");
            return (Criteria) this;
        }

        public Criteria andProductSketchNotIn(List<String> values) {
            addCriterion("product_sketch not in", values, "productSketch");
            return (Criteria) this;
        }

        public Criteria andProductSketchBetween(String value1, String value2) {
            addCriterion("product_sketch between", value1, value2, "productSketch");
            return (Criteria) this;
        }

        public Criteria andProductSketchNotBetween(String value1, String value2) {
            addCriterion("product_sketch not between", value1, value2, "productSketch");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNull() {
            addCriterion("product_description is null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNotNull() {
            addCriterion("product_description is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionEqualTo(String value) {
            addCriterion("product_description =", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotEqualTo(String value) {
            addCriterion("product_description <>", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThan(String value) {
            addCriterion("product_description >", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("product_description >=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThan(String value) {
            addCriterion("product_description <", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThanOrEqualTo(String value) {
            addCriterion("product_description <=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLike(String value) {
            addCriterion("product_description like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotLike(String value) {
            addCriterion("product_description not like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIn(List<String> values) {
            addCriterion("product_description in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotIn(List<String> values) {
            addCriterion("product_description not in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionBetween(String value1, String value2) {
            addCriterion("product_description between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotBetween(String value1, String value2) {
            addCriterion("product_description not between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductStratingPriceIsNull() {
            addCriterion("product_strating_price is null");
            return (Criteria) this;
        }

        public Criteria andProductStratingPriceIsNotNull() {
            addCriterion("product_strating_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductStratingPriceEqualTo(BigDecimal value) {
            addCriterion("product_strating_price =", value, "productStratingPrice");
            return (Criteria) this;
        }

        public Criteria andProductStratingPriceNotEqualTo(BigDecimal value) {
            addCriterion("product_strating_price <>", value, "productStratingPrice");
            return (Criteria) this;
        }

        public Criteria andProductStratingPriceGreaterThan(BigDecimal value) {
            addCriterion("product_strating_price >", value, "productStratingPrice");
            return (Criteria) this;
        }

        public Criteria andProductStratingPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("product_strating_price >=", value, "productStratingPrice");
            return (Criteria) this;
        }

        public Criteria andProductStratingPriceLessThan(BigDecimal value) {
            addCriterion("product_strating_price <", value, "productStratingPrice");
            return (Criteria) this;
        }

        public Criteria andProductStratingPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("product_strating_price <=", value, "productStratingPrice");
            return (Criteria) this;
        }

        public Criteria andProductStratingPriceIn(List<BigDecimal> values) {
            addCriterion("product_strating_price in", values, "productStratingPrice");
            return (Criteria) this;
        }

        public Criteria andProductStratingPriceNotIn(List<BigDecimal> values) {
            addCriterion("product_strating_price not in", values, "productStratingPrice");
            return (Criteria) this;
        }

        public Criteria andProductStratingPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_strating_price between", value1, value2, "productStratingPrice");
            return (Criteria) this;
        }

        public Criteria andProductStratingPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_strating_price not between", value1, value2, "productStratingPrice");
            return (Criteria) this;
        }

        public Criteria andProductImgPathIsNull() {
            addCriterion("product_img_path is null");
            return (Criteria) this;
        }

        public Criteria andProductImgPathIsNotNull() {
            addCriterion("product_img_path is not null");
            return (Criteria) this;
        }

        public Criteria andProductImgPathEqualTo(String value) {
            addCriterion("product_img_path =", value, "productImgPath");
            return (Criteria) this;
        }

        public Criteria andProductImgPathNotEqualTo(String value) {
            addCriterion("product_img_path <>", value, "productImgPath");
            return (Criteria) this;
        }

        public Criteria andProductImgPathGreaterThan(String value) {
            addCriterion("product_img_path >", value, "productImgPath");
            return (Criteria) this;
        }

        public Criteria andProductImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("product_img_path >=", value, "productImgPath");
            return (Criteria) this;
        }

        public Criteria andProductImgPathLessThan(String value) {
            addCriterion("product_img_path <", value, "productImgPath");
            return (Criteria) this;
        }

        public Criteria andProductImgPathLessThanOrEqualTo(String value) {
            addCriterion("product_img_path <=", value, "productImgPath");
            return (Criteria) this;
        }

        public Criteria andProductImgPathLike(String value) {
            addCriterion("product_img_path like", value, "productImgPath");
            return (Criteria) this;
        }

        public Criteria andProductImgPathNotLike(String value) {
            addCriterion("product_img_path not like", value, "productImgPath");
            return (Criteria) this;
        }

        public Criteria andProductImgPathIn(List<String> values) {
            addCriterion("product_img_path in", values, "productImgPath");
            return (Criteria) this;
        }

        public Criteria andProductImgPathNotIn(List<String> values) {
            addCriterion("product_img_path not in", values, "productImgPath");
            return (Criteria) this;
        }

        public Criteria andProductImgPathBetween(String value1, String value2) {
            addCriterion("product_img_path between", value1, value2, "productImgPath");
            return (Criteria) this;
        }

        public Criteria andProductImgPathNotBetween(String value1, String value2) {
            addCriterion("product_img_path not between", value1, value2, "productImgPath");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNull() {
            addCriterion("product_category_id is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNotNull() {
            addCriterion("product_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdEqualTo(Integer value) {
            addCriterion("product_category_id =", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotEqualTo(Integer value) {
            addCriterion("product_category_id <>", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThan(Integer value) {
            addCriterion("product_category_id >", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_category_id >=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThan(Integer value) {
            addCriterion("product_category_id <", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_category_id <=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIn(List<Integer> values) {
            addCriterion("product_category_id in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotIn(List<Integer> values) {
            addCriterion("product_category_id not in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("product_category_id between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_category_id not between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCreationTimeIsNull() {
            addCriterion("product_creation_time is null");
            return (Criteria) this;
        }

        public Criteria andProductCreationTimeIsNotNull() {
            addCriterion("product_creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andProductCreationTimeEqualTo(Date value) {
            addCriterion("product_creation_time =", value, "productCreationTime");
            return (Criteria) this;
        }

        public Criteria andProductCreationTimeNotEqualTo(Date value) {
            addCriterion("product_creation_time <>", value, "productCreationTime");
            return (Criteria) this;
        }

        public Criteria andProductCreationTimeGreaterThan(Date value) {
            addCriterion("product_creation_time >", value, "productCreationTime");
            return (Criteria) this;
        }

        public Criteria andProductCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_creation_time >=", value, "productCreationTime");
            return (Criteria) this;
        }

        public Criteria andProductCreationTimeLessThan(Date value) {
            addCriterion("product_creation_time <", value, "productCreationTime");
            return (Criteria) this;
        }

        public Criteria andProductCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("product_creation_time <=", value, "productCreationTime");
            return (Criteria) this;
        }

        public Criteria andProductCreationTimeIn(List<Date> values) {
            addCriterion("product_creation_time in", values, "productCreationTime");
            return (Criteria) this;
        }

        public Criteria andProductCreationTimeNotIn(List<Date> values) {
            addCriterion("product_creation_time not in", values, "productCreationTime");
            return (Criteria) this;
        }

        public Criteria andProductCreationTimeBetween(Date value1, Date value2) {
            addCriterion("product_creation_time between", value1, value2, "productCreationTime");
            return (Criteria) this;
        }

        public Criteria andProductCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("product_creation_time not between", value1, value2, "productCreationTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeIsNull() {
            addCriterion("product_update_time is null");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeIsNotNull() {
            addCriterion("product_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeEqualTo(Date value) {
            addCriterion("product_update_time =", value, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeNotEqualTo(Date value) {
            addCriterion("product_update_time <>", value, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeGreaterThan(Date value) {
            addCriterion("product_update_time >", value, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_update_time >=", value, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeLessThan(Date value) {
            addCriterion("product_update_time <", value, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("product_update_time <=", value, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeIn(List<Date> values) {
            addCriterion("product_update_time in", values, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeNotIn(List<Date> values) {
            addCriterion("product_update_time not in", values, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("product_update_time between", value1, value2, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("product_update_time not between", value1, value2, "productUpdateTime");
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