package com.yanda.core.entity.generated;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BannerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BannerInfoExample() {
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

        public Criteria andBannerIdIsNull() {
            addCriterion("banner_id is null");
            return (Criteria) this;
        }

        public Criteria andBannerIdIsNotNull() {
            addCriterion("banner_id is not null");
            return (Criteria) this;
        }

        public Criteria andBannerIdEqualTo(Long value) {
            addCriterion("banner_id =", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotEqualTo(Long value) {
            addCriterion("banner_id <>", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThan(Long value) {
            addCriterion("banner_id >", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("banner_id >=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThan(Long value) {
            addCriterion("banner_id <", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThanOrEqualTo(Long value) {
            addCriterion("banner_id <=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdIn(List<Long> values) {
            addCriterion("banner_id in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotIn(List<Long> values) {
            addCriterion("banner_id not in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdBetween(Long value1, Long value2) {
            addCriterion("banner_id between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotBetween(Long value1, Long value2) {
            addCriterion("banner_id not between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerDescIsNull() {
            addCriterion("banner_desc is null");
            return (Criteria) this;
        }

        public Criteria andBannerDescIsNotNull() {
            addCriterion("banner_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBannerDescEqualTo(String value) {
            addCriterion("banner_desc =", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescNotEqualTo(String value) {
            addCriterion("banner_desc <>", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescGreaterThan(String value) {
            addCriterion("banner_desc >", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescGreaterThanOrEqualTo(String value) {
            addCriterion("banner_desc >=", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescLessThan(String value) {
            addCriterion("banner_desc <", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescLessThanOrEqualTo(String value) {
            addCriterion("banner_desc <=", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescLike(String value) {
            addCriterion("banner_desc like", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescNotLike(String value) {
            addCriterion("banner_desc not like", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescIn(List<String> values) {
            addCriterion("banner_desc in", values, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescNotIn(List<String> values) {
            addCriterion("banner_desc not in", values, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescBetween(String value1, String value2) {
            addCriterion("banner_desc between", value1, value2, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescNotBetween(String value1, String value2) {
            addCriterion("banner_desc not between", value1, value2, "bannerDesc");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAppendixIdIsNull() {
            addCriterion("appendix_id is null");
            return (Criteria) this;
        }

        public Criteria andAppendixIdIsNotNull() {
            addCriterion("appendix_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppendixIdEqualTo(Long value) {
            addCriterion("appendix_id =", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdNotEqualTo(Long value) {
            addCriterion("appendix_id <>", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdGreaterThan(Long value) {
            addCriterion("appendix_id >", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdGreaterThanOrEqualTo(Long value) {
            addCriterion("appendix_id >=", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdLessThan(Long value) {
            addCriterion("appendix_id <", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdLessThanOrEqualTo(Long value) {
            addCriterion("appendix_id <=", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdIn(List<Long> values) {
            addCriterion("appendix_id in", values, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdNotIn(List<Long> values) {
            addCriterion("appendix_id not in", values, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdBetween(Long value1, Long value2) {
            addCriterion("appendix_id between", value1, value2, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdNotBetween(Long value1, Long value2) {
            addCriterion("appendix_id not between", value1, value2, "appendixId");
            return (Criteria) this;
        }

        public Criteria andMvIdIsNull() {
            addCriterion("mv_id is null");
            return (Criteria) this;
        }

        public Criteria andMvIdIsNotNull() {
            addCriterion("mv_id is not null");
            return (Criteria) this;
        }

        public Criteria andMvIdEqualTo(Long value) {
            addCriterion("mv_id =", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdNotEqualTo(Long value) {
            addCriterion("mv_id <>", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdGreaterThan(Long value) {
            addCriterion("mv_id >", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mv_id >=", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdLessThan(Long value) {
            addCriterion("mv_id <", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdLessThanOrEqualTo(Long value) {
            addCriterion("mv_id <=", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdIn(List<Long> values) {
            addCriterion("mv_id in", values, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdNotIn(List<Long> values) {
            addCriterion("mv_id not in", values, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdBetween(Long value1, Long value2) {
            addCriterion("mv_id between", value1, value2, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdNotBetween(Long value1, Long value2) {
            addCriterion("mv_id not between", value1, value2, "mvId");
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