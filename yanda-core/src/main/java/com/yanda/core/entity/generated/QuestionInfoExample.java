package com.yanda.core.entity.generated;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionInfoExample() {
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

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Long value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Long value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Long value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Long value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Long value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Long> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Long> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Long value1, Long value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Long value1, Long value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIsNull() {
            addCriterion("question_name is null");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIsNotNull() {
            addCriterion("question_name is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionNameEqualTo(String value) {
            addCriterion("question_name =", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotEqualTo(String value) {
            addCriterion("question_name <>", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameGreaterThan(String value) {
            addCriterion("question_name >", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameGreaterThanOrEqualTo(String value) {
            addCriterion("question_name >=", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLessThan(String value) {
            addCriterion("question_name <", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLessThanOrEqualTo(String value) {
            addCriterion("question_name <=", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLike(String value) {
            addCriterion("question_name like", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotLike(String value) {
            addCriterion("question_name not like", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIn(List<String> values) {
            addCriterion("question_name in", values, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotIn(List<String> values) {
            addCriterion("question_name not in", values, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameBetween(String value1, String value2) {
            addCriterion("question_name between", value1, value2, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotBetween(String value1, String value2) {
            addCriterion("question_name not between", value1, value2, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionContentIsNull() {
            addCriterion("question_content is null");
            return (Criteria) this;
        }

        public Criteria andQuestionContentIsNotNull() {
            addCriterion("question_content is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionContentEqualTo(String value) {
            addCriterion("question_content =", value, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentNotEqualTo(String value) {
            addCriterion("question_content <>", value, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentGreaterThan(String value) {
            addCriterion("question_content >", value, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentGreaterThanOrEqualTo(String value) {
            addCriterion("question_content >=", value, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentLessThan(String value) {
            addCriterion("question_content <", value, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentLessThanOrEqualTo(String value) {
            addCriterion("question_content <=", value, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentLike(String value) {
            addCriterion("question_content like", value, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentNotLike(String value) {
            addCriterion("question_content not like", value, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentIn(List<String> values) {
            addCriterion("question_content in", values, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentNotIn(List<String> values) {
            addCriterion("question_content not in", values, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentBetween(String value1, String value2) {
            addCriterion("question_content between", value1, value2, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentNotBetween(String value1, String value2) {
            addCriterion("question_content not between", value1, value2, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNull() {
            addCriterion("question_type is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNotNull() {
            addCriterion("question_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeEqualTo(Integer value) {
            addCriterion("question_type =", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotEqualTo(Integer value) {
            addCriterion("question_type <>", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThan(Integer value) {
            addCriterion("question_type >", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_type >=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThan(Integer value) {
            addCriterion("question_type <", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("question_type <=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIn(List<Integer> values) {
            addCriterion("question_type in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotIn(List<Integer> values) {
            addCriterion("question_type not in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeBetween(Integer value1, Integer value2) {
            addCriterion("question_type between", value1, value2, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("question_type not between", value1, value2, "questionType");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNumIsNull() {
            addCriterion("answer_num is null");
            return (Criteria) this;
        }

        public Criteria andAnswerNumIsNotNull() {
            addCriterion("answer_num is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerNumEqualTo(Integer value) {
            addCriterion("answer_num =", value, "answerNum");
            return (Criteria) this;
        }

        public Criteria andAnswerNumNotEqualTo(Integer value) {
            addCriterion("answer_num <>", value, "answerNum");
            return (Criteria) this;
        }

        public Criteria andAnswerNumGreaterThan(Integer value) {
            addCriterion("answer_num >", value, "answerNum");
            return (Criteria) this;
        }

        public Criteria andAnswerNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_num >=", value, "answerNum");
            return (Criteria) this;
        }

        public Criteria andAnswerNumLessThan(Integer value) {
            addCriterion("answer_num <", value, "answerNum");
            return (Criteria) this;
        }

        public Criteria andAnswerNumLessThanOrEqualTo(Integer value) {
            addCriterion("answer_num <=", value, "answerNum");
            return (Criteria) this;
        }

        public Criteria andAnswerNumIn(List<Integer> values) {
            addCriterion("answer_num in", values, "answerNum");
            return (Criteria) this;
        }

        public Criteria andAnswerNumNotIn(List<Integer> values) {
            addCriterion("answer_num not in", values, "answerNum");
            return (Criteria) this;
        }

        public Criteria andAnswerNumBetween(Integer value1, Integer value2) {
            addCriterion("answer_num between", value1, value2, "answerNum");
            return (Criteria) this;
        }

        public Criteria andAnswerNumNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_num not between", value1, value2, "answerNum");
            return (Criteria) this;
        }

        public Criteria andAnswerAIsNull() {
            addCriterion("answer_A is null");
            return (Criteria) this;
        }

        public Criteria andAnswerAIsNotNull() {
            addCriterion("answer_A is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerAEqualTo(String value) {
            addCriterion("answer_A =", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerANotEqualTo(String value) {
            addCriterion("answer_A <>", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerAGreaterThan(String value) {
            addCriterion("answer_A >", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerAGreaterThanOrEqualTo(String value) {
            addCriterion("answer_A >=", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerALessThan(String value) {
            addCriterion("answer_A <", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerALessThanOrEqualTo(String value) {
            addCriterion("answer_A <=", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerALike(String value) {
            addCriterion("answer_A like", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerANotLike(String value) {
            addCriterion("answer_A not like", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerAIn(List<String> values) {
            addCriterion("answer_A in", values, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerANotIn(List<String> values) {
            addCriterion("answer_A not in", values, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerABetween(String value1, String value2) {
            addCriterion("answer_A between", value1, value2, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerANotBetween(String value1, String value2) {
            addCriterion("answer_A not between", value1, value2, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerBIsNull() {
            addCriterion("answer_B is null");
            return (Criteria) this;
        }

        public Criteria andAnswerBIsNotNull() {
            addCriterion("answer_B is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerBEqualTo(String value) {
            addCriterion("answer_B =", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBNotEqualTo(String value) {
            addCriterion("answer_B <>", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBGreaterThan(String value) {
            addCriterion("answer_B >", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBGreaterThanOrEqualTo(String value) {
            addCriterion("answer_B >=", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBLessThan(String value) {
            addCriterion("answer_B <", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBLessThanOrEqualTo(String value) {
            addCriterion("answer_B <=", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBLike(String value) {
            addCriterion("answer_B like", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBNotLike(String value) {
            addCriterion("answer_B not like", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBIn(List<String> values) {
            addCriterion("answer_B in", values, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBNotIn(List<String> values) {
            addCriterion("answer_B not in", values, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBBetween(String value1, String value2) {
            addCriterion("answer_B between", value1, value2, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBNotBetween(String value1, String value2) {
            addCriterion("answer_B not between", value1, value2, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerCIsNull() {
            addCriterion("answer_C is null");
            return (Criteria) this;
        }

        public Criteria andAnswerCIsNotNull() {
            addCriterion("answer_C is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerCEqualTo(String value) {
            addCriterion("answer_C =", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCNotEqualTo(String value) {
            addCriterion("answer_C <>", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCGreaterThan(String value) {
            addCriterion("answer_C >", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCGreaterThanOrEqualTo(String value) {
            addCriterion("answer_C >=", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCLessThan(String value) {
            addCriterion("answer_C <", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCLessThanOrEqualTo(String value) {
            addCriterion("answer_C <=", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCLike(String value) {
            addCriterion("answer_C like", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCNotLike(String value) {
            addCriterion("answer_C not like", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCIn(List<String> values) {
            addCriterion("answer_C in", values, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCNotIn(List<String> values) {
            addCriterion("answer_C not in", values, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCBetween(String value1, String value2) {
            addCriterion("answer_C between", value1, value2, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCNotBetween(String value1, String value2) {
            addCriterion("answer_C not between", value1, value2, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerDIsNull() {
            addCriterion("answer_D is null");
            return (Criteria) this;
        }

        public Criteria andAnswerDIsNotNull() {
            addCriterion("answer_D is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerDEqualTo(String value) {
            addCriterion("answer_D =", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDNotEqualTo(String value) {
            addCriterion("answer_D <>", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDGreaterThan(String value) {
            addCriterion("answer_D >", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDGreaterThanOrEqualTo(String value) {
            addCriterion("answer_D >=", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDLessThan(String value) {
            addCriterion("answer_D <", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDLessThanOrEqualTo(String value) {
            addCriterion("answer_D <=", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDLike(String value) {
            addCriterion("answer_D like", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDNotLike(String value) {
            addCriterion("answer_D not like", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDIn(List<String> values) {
            addCriterion("answer_D in", values, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDNotIn(List<String> values) {
            addCriterion("answer_D not in", values, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDBetween(String value1, String value2) {
            addCriterion("answer_D between", value1, value2, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDNotBetween(String value1, String value2) {
            addCriterion("answer_D not between", value1, value2, "answerD");
            return (Criteria) this;
        }

        public Criteria andModuleIsNull() {
            addCriterion("module is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("module is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(Integer value) {
            addCriterion("module =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(Integer value) {
            addCriterion("module <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(Integer value) {
            addCriterion("module >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("module >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(Integer value) {
            addCriterion("module <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(Integer value) {
            addCriterion("module <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<Integer> values) {
            addCriterion("module in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<Integer> values) {
            addCriterion("module not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(Integer value1, Integer value2) {
            addCriterion("module between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(Integer value1, Integer value2) {
            addCriterion("module not between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andImgAppendixIdIsNull() {
            addCriterion("img_appendix_id is null");
            return (Criteria) this;
        }

        public Criteria andImgAppendixIdIsNotNull() {
            addCriterion("img_appendix_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgAppendixIdEqualTo(Long value) {
            addCriterion("img_appendix_id =", value, "imgAppendixId");
            return (Criteria) this;
        }

        public Criteria andImgAppendixIdNotEqualTo(Long value) {
            addCriterion("img_appendix_id <>", value, "imgAppendixId");
            return (Criteria) this;
        }

        public Criteria andImgAppendixIdGreaterThan(Long value) {
            addCriterion("img_appendix_id >", value, "imgAppendixId");
            return (Criteria) this;
        }

        public Criteria andImgAppendixIdGreaterThanOrEqualTo(Long value) {
            addCriterion("img_appendix_id >=", value, "imgAppendixId");
            return (Criteria) this;
        }

        public Criteria andImgAppendixIdLessThan(Long value) {
            addCriterion("img_appendix_id <", value, "imgAppendixId");
            return (Criteria) this;
        }

        public Criteria andImgAppendixIdLessThanOrEqualTo(Long value) {
            addCriterion("img_appendix_id <=", value, "imgAppendixId");
            return (Criteria) this;
        }

        public Criteria andImgAppendixIdIn(List<Long> values) {
            addCriterion("img_appendix_id in", values, "imgAppendixId");
            return (Criteria) this;
        }

        public Criteria andImgAppendixIdNotIn(List<Long> values) {
            addCriterion("img_appendix_id not in", values, "imgAppendixId");
            return (Criteria) this;
        }

        public Criteria andImgAppendixIdBetween(Long value1, Long value2) {
            addCriterion("img_appendix_id between", value1, value2, "imgAppendixId");
            return (Criteria) this;
        }

        public Criteria andImgAppendixIdNotBetween(Long value1, Long value2) {
            addCriterion("img_appendix_id not between", value1, value2, "imgAppendixId");
            return (Criteria) this;
        }

        public Criteria andMvAppendixIdIsNull() {
            addCriterion("mv_appendix_id is null");
            return (Criteria) this;
        }

        public Criteria andMvAppendixIdIsNotNull() {
            addCriterion("mv_appendix_id is not null");
            return (Criteria) this;
        }

        public Criteria andMvAppendixIdEqualTo(Long value) {
            addCriterion("mv_appendix_id =", value, "mvAppendixId");
            return (Criteria) this;
        }

        public Criteria andMvAppendixIdNotEqualTo(Long value) {
            addCriterion("mv_appendix_id <>", value, "mvAppendixId");
            return (Criteria) this;
        }

        public Criteria andMvAppendixIdGreaterThan(Long value) {
            addCriterion("mv_appendix_id >", value, "mvAppendixId");
            return (Criteria) this;
        }

        public Criteria andMvAppendixIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mv_appendix_id >=", value, "mvAppendixId");
            return (Criteria) this;
        }

        public Criteria andMvAppendixIdLessThan(Long value) {
            addCriterion("mv_appendix_id <", value, "mvAppendixId");
            return (Criteria) this;
        }

        public Criteria andMvAppendixIdLessThanOrEqualTo(Long value) {
            addCriterion("mv_appendix_id <=", value, "mvAppendixId");
            return (Criteria) this;
        }

        public Criteria andMvAppendixIdIn(List<Long> values) {
            addCriterion("mv_appendix_id in", values, "mvAppendixId");
            return (Criteria) this;
        }

        public Criteria andMvAppendixIdNotIn(List<Long> values) {
            addCriterion("mv_appendix_id not in", values, "mvAppendixId");
            return (Criteria) this;
        }

        public Criteria andMvAppendixIdBetween(Long value1, Long value2) {
            addCriterion("mv_appendix_id between", value1, value2, "mvAppendixId");
            return (Criteria) this;
        }

        public Criteria andMvAppendixIdNotBetween(Long value1, Long value2) {
            addCriterion("mv_appendix_id not between", value1, value2, "mvAppendixId");
            return (Criteria) this;
        }

        public Criteria andEpisodeIdIsNull() {
            addCriterion("episode_id is null");
            return (Criteria) this;
        }

        public Criteria andEpisodeIdIsNotNull() {
            addCriterion("episode_id is not null");
            return (Criteria) this;
        }

        public Criteria andEpisodeIdEqualTo(Long value) {
            addCriterion("episode_id =", value, "episodeId");
            return (Criteria) this;
        }

        public Criteria andEpisodeIdNotEqualTo(Long value) {
            addCriterion("episode_id <>", value, "episodeId");
            return (Criteria) this;
        }

        public Criteria andEpisodeIdGreaterThan(Long value) {
            addCriterion("episode_id >", value, "episodeId");
            return (Criteria) this;
        }

        public Criteria andEpisodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("episode_id >=", value, "episodeId");
            return (Criteria) this;
        }

        public Criteria andEpisodeIdLessThan(Long value) {
            addCriterion("episode_id <", value, "episodeId");
            return (Criteria) this;
        }

        public Criteria andEpisodeIdLessThanOrEqualTo(Long value) {
            addCriterion("episode_id <=", value, "episodeId");
            return (Criteria) this;
        }

        public Criteria andEpisodeIdIn(List<Long> values) {
            addCriterion("episode_id in", values, "episodeId");
            return (Criteria) this;
        }

        public Criteria andEpisodeIdNotIn(List<Long> values) {
            addCriterion("episode_id not in", values, "episodeId");
            return (Criteria) this;
        }

        public Criteria andEpisodeIdBetween(Long value1, Long value2) {
            addCriterion("episode_id between", value1, value2, "episodeId");
            return (Criteria) this;
        }

        public Criteria andEpisodeIdNotBetween(Long value1, Long value2) {
            addCriterion("episode_id not between", value1, value2, "episodeId");
            return (Criteria) this;
        }

        public Criteria andVipTypeIsNull() {
            addCriterion("vip_type is null");
            return (Criteria) this;
        }

        public Criteria andVipTypeIsNotNull() {
            addCriterion("vip_type is not null");
            return (Criteria) this;
        }

        public Criteria andVipTypeEqualTo(Integer value) {
            addCriterion("vip_type =", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotEqualTo(Integer value) {
            addCriterion("vip_type <>", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeGreaterThan(Integer value) {
            addCriterion("vip_type >", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_type >=", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeLessThan(Integer value) {
            addCriterion("vip_type <", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeLessThanOrEqualTo(Integer value) {
            addCriterion("vip_type <=", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeIn(List<Integer> values) {
            addCriterion("vip_type in", values, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotIn(List<Integer> values) {
            addCriterion("vip_type not in", values, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeBetween(Integer value1, Integer value2) {
            addCriterion("vip_type between", value1, value2, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_type not between", value1, value2, "vipType");
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

        public Criteria andClassify1IsNull() {
            addCriterion("classify_1 is null");
            return (Criteria) this;
        }

        public Criteria andClassify1IsNotNull() {
            addCriterion("classify_1 is not null");
            return (Criteria) this;
        }

        public Criteria andClassify1EqualTo(Integer value) {
            addCriterion("classify_1 =", value, "classify1");
            return (Criteria) this;
        }

        public Criteria andClassify1NotEqualTo(Integer value) {
            addCriterion("classify_1 <>", value, "classify1");
            return (Criteria) this;
        }

        public Criteria andClassify1GreaterThan(Integer value) {
            addCriterion("classify_1 >", value, "classify1");
            return (Criteria) this;
        }

        public Criteria andClassify1GreaterThanOrEqualTo(Integer value) {
            addCriterion("classify_1 >=", value, "classify1");
            return (Criteria) this;
        }

        public Criteria andClassify1LessThan(Integer value) {
            addCriterion("classify_1 <", value, "classify1");
            return (Criteria) this;
        }

        public Criteria andClassify1LessThanOrEqualTo(Integer value) {
            addCriterion("classify_1 <=", value, "classify1");
            return (Criteria) this;
        }

        public Criteria andClassify1In(List<Integer> values) {
            addCriterion("classify_1 in", values, "classify1");
            return (Criteria) this;
        }

        public Criteria andClassify1NotIn(List<Integer> values) {
            addCriterion("classify_1 not in", values, "classify1");
            return (Criteria) this;
        }

        public Criteria andClassify1Between(Integer value1, Integer value2) {
            addCriterion("classify_1 between", value1, value2, "classify1");
            return (Criteria) this;
        }

        public Criteria andClassify1NotBetween(Integer value1, Integer value2) {
            addCriterion("classify_1 not between", value1, value2, "classify1");
            return (Criteria) this;
        }

        public Criteria andClassify2IsNull() {
            addCriterion("classify_2 is null");
            return (Criteria) this;
        }

        public Criteria andClassify2IsNotNull() {
            addCriterion("classify_2 is not null");
            return (Criteria) this;
        }

        public Criteria andClassify2EqualTo(Integer value) {
            addCriterion("classify_2 =", value, "classify2");
            return (Criteria) this;
        }

        public Criteria andClassify2NotEqualTo(Integer value) {
            addCriterion("classify_2 <>", value, "classify2");
            return (Criteria) this;
        }

        public Criteria andClassify2GreaterThan(Integer value) {
            addCriterion("classify_2 >", value, "classify2");
            return (Criteria) this;
        }

        public Criteria andClassify2GreaterThanOrEqualTo(Integer value) {
            addCriterion("classify_2 >=", value, "classify2");
            return (Criteria) this;
        }

        public Criteria andClassify2LessThan(Integer value) {
            addCriterion("classify_2 <", value, "classify2");
            return (Criteria) this;
        }

        public Criteria andClassify2LessThanOrEqualTo(Integer value) {
            addCriterion("classify_2 <=", value, "classify2");
            return (Criteria) this;
        }

        public Criteria andClassify2In(List<Integer> values) {
            addCriterion("classify_2 in", values, "classify2");
            return (Criteria) this;
        }

        public Criteria andClassify2NotIn(List<Integer> values) {
            addCriterion("classify_2 not in", values, "classify2");
            return (Criteria) this;
        }

        public Criteria andClassify2Between(Integer value1, Integer value2) {
            addCriterion("classify_2 between", value1, value2, "classify2");
            return (Criteria) this;
        }

        public Criteria andClassify2NotBetween(Integer value1, Integer value2) {
            addCriterion("classify_2 not between", value1, value2, "classify2");
            return (Criteria) this;
        }

        public Criteria andClassify3IsNull() {
            addCriterion("classify_3 is null");
            return (Criteria) this;
        }

        public Criteria andClassify3IsNotNull() {
            addCriterion("classify_3 is not null");
            return (Criteria) this;
        }

        public Criteria andClassify3EqualTo(Integer value) {
            addCriterion("classify_3 =", value, "classify3");
            return (Criteria) this;
        }

        public Criteria andClassify3NotEqualTo(Integer value) {
            addCriterion("classify_3 <>", value, "classify3");
            return (Criteria) this;
        }

        public Criteria andClassify3GreaterThan(Integer value) {
            addCriterion("classify_3 >", value, "classify3");
            return (Criteria) this;
        }

        public Criteria andClassify3GreaterThanOrEqualTo(Integer value) {
            addCriterion("classify_3 >=", value, "classify3");
            return (Criteria) this;
        }

        public Criteria andClassify3LessThan(Integer value) {
            addCriterion("classify_3 <", value, "classify3");
            return (Criteria) this;
        }

        public Criteria andClassify3LessThanOrEqualTo(Integer value) {
            addCriterion("classify_3 <=", value, "classify3");
            return (Criteria) this;
        }

        public Criteria andClassify3In(List<Integer> values) {
            addCriterion("classify_3 in", values, "classify3");
            return (Criteria) this;
        }

        public Criteria andClassify3NotIn(List<Integer> values) {
            addCriterion("classify_3 not in", values, "classify3");
            return (Criteria) this;
        }

        public Criteria andClassify3Between(Integer value1, Integer value2) {
            addCriterion("classify_3 between", value1, value2, "classify3");
            return (Criteria) this;
        }

        public Criteria andClassify3NotBetween(Integer value1, Integer value2) {
            addCriterion("classify_3 not between", value1, value2, "classify3");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIsNull() {
            addCriterion("classify_id is null");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIsNotNull() {
            addCriterion("classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyIdEqualTo(String value) {
            addCriterion("classify_id =", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotEqualTo(String value) {
            addCriterion("classify_id <>", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdGreaterThan(String value) {
            addCriterion("classify_id >", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("classify_id >=", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLessThan(String value) {
            addCriterion("classify_id <", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLessThanOrEqualTo(String value) {
            addCriterion("classify_id <=", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLike(String value) {
            addCriterion("classify_id like", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotLike(String value) {
            addCriterion("classify_id not like", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIn(List<String> values) {
            addCriterion("classify_id in", values, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotIn(List<String> values) {
            addCriterion("classify_id not in", values, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdBetween(String value1, String value2) {
            addCriterion("classify_id between", value1, value2, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotBetween(String value1, String value2) {
            addCriterion("classify_id not between", value1, value2, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyNameIsNull() {
            addCriterion("classify_name is null");
            return (Criteria) this;
        }

        public Criteria andClassifyNameIsNotNull() {
            addCriterion("classify_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyNameEqualTo(String value) {
            addCriterion("classify_name =", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameNotEqualTo(String value) {
            addCriterion("classify_name <>", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameGreaterThan(String value) {
            addCriterion("classify_name >", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameGreaterThanOrEqualTo(String value) {
            addCriterion("classify_name >=", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameLessThan(String value) {
            addCriterion("classify_name <", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameLessThanOrEqualTo(String value) {
            addCriterion("classify_name <=", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameLike(String value) {
            addCriterion("classify_name like", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameNotLike(String value) {
            addCriterion("classify_name not like", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameIn(List<String> values) {
            addCriterion("classify_name in", values, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameNotIn(List<String> values) {
            addCriterion("classify_name not in", values, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameBetween(String value1, String value2) {
            addCriterion("classify_name between", value1, value2, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameNotBetween(String value1, String value2) {
            addCriterion("classify_name not between", value1, value2, "classifyName");
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