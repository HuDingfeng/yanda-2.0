package com.yanda.core.entity.generated;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_question_info")
public class QuestionInfo implements Serializable {
    /**
     * 题目id
     */
    @Id
    @Column(name = "question_id")
    private Long questionId;

    /**
     * 题目名称
     */
    @Column(name = "question_name")
    private String questionName;

    /**
     * 题目内容
     */
    @Column(name = "question_content")
    private String questionContent;

    /**
     * 题目题型  1-选择题 2-判断题
     */
    @Column(name = "question_type")
    private Integer questionType;

    /**
     * 题目答案选项
     */
    private String answer;

    /**
     * 答案选项个数
     */
    @Column(name = "answer_num")
    private Integer answerNum;

    /**
     * 答案选项A
     */
    @Column(name = "answer_A")
    private String answerA;

    /**
     * 答案选项B
     */
    @Column(name = "answer_B")
    private String answerB;

    /**
     * 答案选项C
     */
    @Column(name = "answer_C")
    private String answerC;

    /**
     * 答案选项D
     */
    @Column(name = "answer_D")
    private String answerD;

    /**
     * 题目所属模块 1-章节练习  2-专业知识练习 3-单元测试 4-期中期末
     */
    private Integer module;

    /**
     * 图片附件ID
     */
    @Column(name = "img_appendix_id")
    private Long imgAppendixId;

    /**
     * 音频附件ID
     */
    @Column(name = "mv_appendix_id")
    private Long mvAppendixId;

    /**
     * 解题视频集id
     */
    @Column(name = "episode_id")
    private Long episodeId;

    /**
     * 视频vip权限  0：普通会员 1：vip会员
     */
    @Column(name = "vip_type")
    private Integer vipType;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 一级分类
     */
    @Column(name = "classify_1")
    private Integer classify1;

    /**
     * 二级分类
     */
    @Column(name = "classify_2")
    private Integer classify2;

    /**
     * 三级分类
     */
    @Column(name = "classify_3")
    private Integer classify3;

    /**
     * 分类id路径
     */
    @Column(name = "classify_id")
    private String classifyId;

    /**
     * 分类名称
     */
    @Column(name = "classify_name")
    private String classifyName;

    private static final long serialVersionUID = 1L;

    public QuestionInfo(Long questionId, String questionName, String questionContent, Integer questionType, String answer, Integer answerNum, String answerA, String answerB, String answerC, String answerD, Integer module, Long imgAppendixId, Long mvAppendixId, Long episodeId, Integer vipType, Date createTime, Date updateTime, Integer classify1, Integer classify2, Integer classify3, String classifyId, String classifyName) {
        this.questionId = questionId;
        this.questionName = questionName;
        this.questionContent = questionContent;
        this.questionType = questionType;
        this.answer = answer;
        this.answerNum = answerNum;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.module = module;
        this.imgAppendixId = imgAppendixId;
        this.mvAppendixId = mvAppendixId;
        this.episodeId = episodeId;
        this.vipType = vipType;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.classify1 = classify1;
        this.classify2 = classify2;
        this.classify3 = classify3;
        this.classifyId = classifyId;
        this.classifyName = classifyName;
    }

    public QuestionInfo() {
        super();
    }

    /**
     * 获取题目id
     *
     * @return question_id - 题目id
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * 设置题目id
     *
     * @param questionId 题目id
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    /**
     * 获取题目名称
     *
     * @return question_name - 题目名称
     */
    public String getQuestionName() {
        return questionName;
    }

    /**
     * 设置题目名称
     *
     * @param questionName 题目名称
     */
    public void setQuestionName(String questionName) {
        this.questionName = questionName == null ? null : questionName.trim();
    }

    /**
     * 获取题目内容
     *
     * @return question_content - 题目内容
     */
    public String getQuestionContent() {
        return questionContent;
    }

    /**
     * 设置题目内容
     *
     * @param questionContent 题目内容
     */
    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent == null ? null : questionContent.trim();
    }

    /**
     * 获取题目题型  1-选择题 2-判断题
     *
     * @return question_type - 题目题型  1-选择题 2-判断题
     */
    public Integer getQuestionType() {
        return questionType;
    }

    /**
     * 设置题目题型  1-选择题 2-判断题
     *
     * @param questionType 题目题型  1-选择题 2-判断题
     */
    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    /**
     * 获取题目答案选项
     *
     * @return answer - 题目答案选项
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * 设置题目答案选项
     *
     * @param answer 题目答案选项
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    /**
     * 获取答案选项个数
     *
     * @return answer_num - 答案选项个数
     */
    public Integer getAnswerNum() {
        return answerNum;
    }

    /**
     * 设置答案选项个数
     *
     * @param answerNum 答案选项个数
     */
    public void setAnswerNum(Integer answerNum) {
        this.answerNum = answerNum;
    }

    /**
     * 获取答案选项A
     *
     * @return answer_A - 答案选项A
     */
    public String getAnswerA() {
        return answerA;
    }

    /**
     * 设置答案选项A
     *
     * @param answerA 答案选项A
     */
    public void setAnswerA(String answerA) {
        this.answerA = answerA == null ? null : answerA.trim();
    }

    /**
     * 获取答案选项B
     *
     * @return answer_B - 答案选项B
     */
    public String getAnswerB() {
        return answerB;
    }

    /**
     * 设置答案选项B
     *
     * @param answerB 答案选项B
     */
    public void setAnswerB(String answerB) {
        this.answerB = answerB == null ? null : answerB.trim();
    }

    /**
     * 获取答案选项C
     *
     * @return answer_C - 答案选项C
     */
    public String getAnswerC() {
        return answerC;
    }

    /**
     * 设置答案选项C
     *
     * @param answerC 答案选项C
     */
    public void setAnswerC(String answerC) {
        this.answerC = answerC == null ? null : answerC.trim();
    }

    /**
     * 获取答案选项D
     *
     * @return answer_D - 答案选项D
     */
    public String getAnswerD() {
        return answerD;
    }

    /**
     * 设置答案选项D
     *
     * @param answerD 答案选项D
     */
    public void setAnswerD(String answerD) {
        this.answerD = answerD == null ? null : answerD.trim();
    }

    /**
     * 获取题目所属模块 1-章节练习  2-专业知识练习 3-单元测试 4-期中期末
     *
     * @return module - 题目所属模块 1-章节练习  2-专业知识练习 3-单元测试 4-期中期末
     */
    public Integer getModule() {
        return module;
    }

    /**
     * 设置题目所属模块 1-章节练习  2-专业知识练习 3-单元测试 4-期中期末
     *
     * @param module 题目所属模块 1-章节练习  2-专业知识练习 3-单元测试 4-期中期末
     */
    public void setModule(Integer module) {
        this.module = module;
    }

    /**
     * 获取图片附件ID
     *
     * @return img_appendix_id - 图片附件ID
     */
    public Long getImgAppendixId() {
        return imgAppendixId;
    }

    /**
     * 设置图片附件ID
     *
     * @param imgAppendixId 图片附件ID
     */
    public void setImgAppendixId(Long imgAppendixId) {
        this.imgAppendixId = imgAppendixId;
    }

    /**
     * 获取音频附件ID
     *
     * @return mv_appendix_id - 音频附件ID
     */
    public Long getMvAppendixId() {
        return mvAppendixId;
    }

    /**
     * 设置音频附件ID
     *
     * @param mvAppendixId 音频附件ID
     */
    public void setMvAppendixId(Long mvAppendixId) {
        this.mvAppendixId = mvAppendixId;
    }

    /**
     * 获取解题视频集id
     *
     * @return episode_id - 解题视频集id
     */
    public Long getEpisodeId() {
        return episodeId;
    }

    /**
     * 设置解题视频集id
     *
     * @param episodeId 解题视频集id
     */
    public void setEpisodeId(Long episodeId) {
        this.episodeId = episodeId;
    }

    /**
     * 获取视频vip权限  0：普通会员 1：vip会员
     *
     * @return vip_type - 视频vip权限  0：普通会员 1：vip会员
     */
    public Integer getVipType() {
        return vipType;
    }

    /**
     * 设置视频vip权限  0：普通会员 1：vip会员
     *
     * @param vipType 视频vip权限  0：普通会员 1：vip会员
     */
    public void setVipType(Integer vipType) {
        this.vipType = vipType;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取一级分类
     *
     * @return classify_1 - 一级分类
     */
    public Integer getClassify1() {
        return classify1;
    }

    /**
     * 设置一级分类
     *
     * @param classify1 一级分类
     */
    public void setClassify1(Integer classify1) {
        this.classify1 = classify1;
    }

    /**
     * 获取二级分类
     *
     * @return classify_2 - 二级分类
     */
    public Integer getClassify2() {
        return classify2;
    }

    /**
     * 设置二级分类
     *
     * @param classify2 二级分类
     */
    public void setClassify2(Integer classify2) {
        this.classify2 = classify2;
    }

    /**
     * 获取三级分类
     *
     * @return classify_3 - 三级分类
     */
    public Integer getClassify3() {
        return classify3;
    }

    /**
     * 设置三级分类
     *
     * @param classify3 三级分类
     */
    public void setClassify3(Integer classify3) {
        this.classify3 = classify3;
    }

    /**
     * 获取分类id路径
     *
     * @return classify_id - 分类id路径
     */
    public String getClassifyId() {
        return classifyId;
    }

    /**
     * 设置分类id路径
     *
     * @param classifyId 分类id路径
     */
    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId == null ? null : classifyId.trim();
    }

    /**
     * 获取分类名称
     *
     * @return classify_name - 分类名称
     */
    public String getClassifyName() {
        return classifyName;
    }

    /**
     * 设置分类名称
     *
     * @param classifyName 分类名称
     */
    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName == null ? null : classifyName.trim();
    }

    public enum Col {
        questionId("question_id"),
        questionName("question_name"),
        questionContent("question_content"),
        questionType("question_type"),
        answer("answer"),
        answerNum("answer_num"),
        answerA("answer_A"),
        answerB("answer_B"),
        answerC("answer_C"),
        answerD("answer_D"),
        module("module"),
        imgAppendixId("img_appendix_id"),
        mvAppendixId("mv_appendix_id"),
        episodeId("episode_id"),
        vipType("vip_type"),
        createTime("create_time"),
        updateTime("update_time"),
        classify1("classify_1"),
        classify2("classify_2"),
        classify3("classify_3"),
        classifyId("classify_id"),
        classifyName("classify_name");

        private final String column;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        Col(String column) {
            this.column = column;
        }

        public String desc() {
            return this.column + " DESC";
        }

        public String asc() {
            return this.column + " ASC";
        }
    }
}