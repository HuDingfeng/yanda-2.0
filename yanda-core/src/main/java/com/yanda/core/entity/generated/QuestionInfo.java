package com.yanda.core.entity.generated;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_question_info")
public class QuestionInfo implements Serializable {
    /**
     * ��Ŀid
     */
    @Id
    @Column(name = "question_id")
    private Long questionId;

    /**
     * ��Ŀ����
     */
    @Column(name = "question_name")
    private String questionName;

    /**
     * ��Ŀ����
     */
    @Column(name = "question_content")
    private String questionContent;

    /**
     * ��Ŀ����  1-ѡ���� 2-�ж���
     */
    @Column(name = "question_type")
    private Integer questionType;

    /**
     * ��Ŀ��ѡ��
     */
    private String answer;

    /**
     * ��ѡ�����
     */
    @Column(name = "answer_num")
    private Integer answerNum;

    /**
     * ��ѡ��A
     */
    @Column(name = "answer_A")
    private String answerA;

    /**
     * ��ѡ��B
     */
    @Column(name = "answer_B")
    private String answerB;

    /**
     * ��ѡ��C
     */
    @Column(name = "answer_C")
    private String answerC;

    /**
     * ��ѡ��D
     */
    @Column(name = "answer_D")
    private String answerD;

    /**
     * ��Ŀ����ģ�� 1-�½���ϰ  2-רҵ֪ʶ��ϰ 3-��Ԫ���� 4-������ĩ
     */
    private Integer module;

    /**
     * ͼƬ����ID
     */
    @Column(name = "img_appendix_id")
    private Long imgAppendixId;

    /**
     * ��Ƶ����ID
     */
    @Column(name = "mv_appendix_id")
    private Long mvAppendixId;

    /**
     * ������Ƶ��id
     */
    @Column(name = "episode_id")
    private Long episodeId;

    /**
     * ��ƵvipȨ��  0����ͨ��Ա 1��vip��Ա
     */
    @Column(name = "vip_type")
    private Integer vipType;

    /**
     * ����ʱ��
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * ����ʱ��
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * �����꼶����ID
     */
    @Column(name = "classify_nj")
    private Integer classifyNj;

    /**
     * �����½ڷ���ID
     */
    @Column(name = "classify_z")
    private Integer classifyZ;

    /**
     * ����С�ڷ���ID
     */
    @Column(name = "classify_j")
    private Integer classifyJ;

    /**
     * ������Ԫ����ID
     */
    @Column(name = "classify_dy")
    private Integer classifyDy;

    /**
     * ����������ĩ����ID
     */
    @Column(name = "classify_q")
    private Integer classifyQ;

    /**
     * ����id·��
     */
    @Column(name = "classify_id")
    private String classifyId;

    /**
     * ��������
     */
    @Column(name = "classify_name")
    private String classifyName;

    private static final long serialVersionUID = 1L;

    public QuestionInfo(Long questionId, String questionName, String questionContent, Integer questionType, String answer, Integer answerNum, String answerA, String answerB, String answerC, String answerD, Integer module, Long imgAppendixId, Long mvAppendixId, Long episodeId, Integer vipType, Date createTime, Date updateTime, Integer classifyNj, Integer classifyZ, Integer classifyJ, Integer classifyDy, Integer classifyQ, String classifyId, String classifyName) {
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
        this.classifyNj = classifyNj;
        this.classifyZ = classifyZ;
        this.classifyJ = classifyJ;
        this.classifyDy = classifyDy;
        this.classifyQ = classifyQ;
        this.classifyId = classifyId;
        this.classifyName = classifyName;
    }

    public QuestionInfo() {
        super();
    }

    /**
     * ��ȡ��Ŀid
     *
     * @return question_id - ��Ŀid
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * ������Ŀid
     *
     * @param questionId ��Ŀid
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    /**
     * ��ȡ��Ŀ����
     *
     * @return question_name - ��Ŀ����
     */
    public String getQuestionName() {
        return questionName;
    }

    /**
     * ������Ŀ����
     *
     * @param questionName ��Ŀ����
     */
    public void setQuestionName(String questionName) {
        this.questionName = questionName == null ? null : questionName.trim();
    }

    /**
     * ��ȡ��Ŀ����
     *
     * @return question_content - ��Ŀ����
     */
    public String getQuestionContent() {
        return questionContent;
    }

    /**
     * ������Ŀ����
     *
     * @param questionContent ��Ŀ����
     */
    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent == null ? null : questionContent.trim();
    }

    /**
     * ��ȡ��Ŀ����  1-ѡ���� 2-�ж���
     *
     * @return question_type - ��Ŀ����  1-ѡ���� 2-�ж���
     */
    public Integer getQuestionType() {
        return questionType;
    }

    /**
     * ������Ŀ����  1-ѡ���� 2-�ж���
     *
     * @param questionType ��Ŀ����  1-ѡ���� 2-�ж���
     */
    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    /**
     * ��ȡ��Ŀ��ѡ��
     *
     * @return answer - ��Ŀ��ѡ��
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * ������Ŀ��ѡ��
     *
     * @param answer ��Ŀ��ѡ��
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    /**
     * ��ȡ��ѡ�����
     *
     * @return answer_num - ��ѡ�����
     */
    public Integer getAnswerNum() {
        return answerNum;
    }

    /**
     * ���ô�ѡ�����
     *
     * @param answerNum ��ѡ�����
     */
    public void setAnswerNum(Integer answerNum) {
        this.answerNum = answerNum;
    }

    /**
     * ��ȡ��ѡ��A
     *
     * @return answer_A - ��ѡ��A
     */
    public String getAnswerA() {
        return answerA;
    }

    /**
     * ���ô�ѡ��A
     *
     * @param answerA ��ѡ��A
     */
    public void setAnswerA(String answerA) {
        this.answerA = answerA == null ? null : answerA.trim();
    }

    /**
     * ��ȡ��ѡ��B
     *
     * @return answer_B - ��ѡ��B
     */
    public String getAnswerB() {
        return answerB;
    }

    /**
     * ���ô�ѡ��B
     *
     * @param answerB ��ѡ��B
     */
    public void setAnswerB(String answerB) {
        this.answerB = answerB == null ? null : answerB.trim();
    }

    /**
     * ��ȡ��ѡ��C
     *
     * @return answer_C - ��ѡ��C
     */
    public String getAnswerC() {
        return answerC;
    }

    /**
     * ���ô�ѡ��C
     *
     * @param answerC ��ѡ��C
     */
    public void setAnswerC(String answerC) {
        this.answerC = answerC == null ? null : answerC.trim();
    }

    /**
     * ��ȡ��ѡ��D
     *
     * @return answer_D - ��ѡ��D
     */
    public String getAnswerD() {
        return answerD;
    }

    /**
     * ���ô�ѡ��D
     *
     * @param answerD ��ѡ��D
     */
    public void setAnswerD(String answerD) {
        this.answerD = answerD == null ? null : answerD.trim();
    }

    /**
     * ��ȡ��Ŀ����ģ�� 1-�½���ϰ  2-רҵ֪ʶ��ϰ 3-��Ԫ���� 4-������ĩ
     *
     * @return module - ��Ŀ����ģ�� 1-�½���ϰ  2-רҵ֪ʶ��ϰ 3-��Ԫ���� 4-������ĩ
     */
    public Integer getModule() {
        return module;
    }

    /**
     * ������Ŀ����ģ�� 1-�½���ϰ  2-רҵ֪ʶ��ϰ 3-��Ԫ���� 4-������ĩ
     *
     * @param module ��Ŀ����ģ�� 1-�½���ϰ  2-רҵ֪ʶ��ϰ 3-��Ԫ���� 4-������ĩ
     */
    public void setModule(Integer module) {
        this.module = module;
    }

    /**
     * ��ȡͼƬ����ID
     *
     * @return img_appendix_id - ͼƬ����ID
     */
    public Long getImgAppendixId() {
        return imgAppendixId;
    }

    /**
     * ����ͼƬ����ID
     *
     * @param imgAppendixId ͼƬ����ID
     */
    public void setImgAppendixId(Long imgAppendixId) {
        this.imgAppendixId = imgAppendixId;
    }

    /**
     * ��ȡ��Ƶ����ID
     *
     * @return mv_appendix_id - ��Ƶ����ID
     */
    public Long getMvAppendixId() {
        return mvAppendixId;
    }

    /**
     * ������Ƶ����ID
     *
     * @param mvAppendixId ��Ƶ����ID
     */
    public void setMvAppendixId(Long mvAppendixId) {
        this.mvAppendixId = mvAppendixId;
    }

    /**
     * ��ȡ������Ƶ��id
     *
     * @return episode_id - ������Ƶ��id
     */
    public Long getEpisodeId() {
        return episodeId;
    }

    /**
     * ���ý�����Ƶ��id
     *
     * @param episodeId ������Ƶ��id
     */
    public void setEpisodeId(Long episodeId) {
        this.episodeId = episodeId;
    }

    /**
     * ��ȡ��ƵvipȨ��  0����ͨ��Ա 1��vip��Ա
     *
     * @return vip_type - ��ƵvipȨ��  0����ͨ��Ա 1��vip��Ա
     */
    public Integer getVipType() {
        return vipType;
    }

    /**
     * ������ƵvipȨ��  0����ͨ��Ա 1��vip��Ա
     *
     * @param vipType ��ƵvipȨ��  0����ͨ��Ա 1��vip��Ա
     */
    public void setVipType(Integer vipType) {
        this.vipType = vipType;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return create_time - ����ʱ��
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ���ô���ʱ��
     *
     * @param createTime ����ʱ��
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return update_time - ����ʱ��
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * ���ø���ʱ��
     *
     * @param updateTime ����ʱ��
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * ��ȡ�����꼶����ID
     *
     * @return classify_nj - �����꼶����ID
     */
    public Integer getClassifyNj() {
        return classifyNj;
    }

    /**
     * ���������꼶����ID
     *
     * @param classifyNj �����꼶����ID
     */
    public void setClassifyNj(Integer classifyNj) {
        this.classifyNj = classifyNj;
    }

    /**
     * ��ȡ�����½ڷ���ID
     *
     * @return classify_z - �����½ڷ���ID
     */
    public Integer getClassifyZ() {
        return classifyZ;
    }

    /**
     * ���������½ڷ���ID
     *
     * @param classifyZ �����½ڷ���ID
     */
    public void setClassifyZ(Integer classifyZ) {
        this.classifyZ = classifyZ;
    }

    /**
     * ��ȡ����С�ڷ���ID
     *
     * @return classify_j - ����С�ڷ���ID
     */
    public Integer getClassifyJ() {
        return classifyJ;
    }

    /**
     * ��������С�ڷ���ID
     *
     * @param classifyJ ����С�ڷ���ID
     */
    public void setClassifyJ(Integer classifyJ) {
        this.classifyJ = classifyJ;
    }

    /**
     * ��ȡ������Ԫ����ID
     *
     * @return classify_dy - ������Ԫ����ID
     */
    public Integer getClassifyDy() {
        return classifyDy;
    }

    /**
     * ����������Ԫ����ID
     *
     * @param classifyDy ������Ԫ����ID
     */
    public void setClassifyDy(Integer classifyDy) {
        this.classifyDy = classifyDy;
    }

    /**
     * ��ȡ����������ĩ����ID
     *
     * @return classify_q - ����������ĩ����ID
     */
    public Integer getClassifyQ() {
        return classifyQ;
    }

    /**
     * ��������������ĩ����ID
     *
     * @param classifyQ ����������ĩ����ID
     */
    public void setClassifyQ(Integer classifyQ) {
        this.classifyQ = classifyQ;
    }

    /**
     * ��ȡ����id·��
     *
     * @return classify_id - ����id·��
     */
    public String getClassifyId() {
        return classifyId;
    }

    /**
     * ���÷���id·��
     *
     * @param classifyId ����id·��
     */
    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId == null ? null : classifyId.trim();
    }

    /**
     * ��ȡ��������
     *
     * @return classify_name - ��������
     */
    public String getClassifyName() {
        return classifyName;
    }

    /**
     * ���÷�������
     *
     * @param classifyName ��������
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
        classifyNj("classify_nj"),
        classifyZ("classify_z"),
        classifyJ("classify_j"),
        classifyDy("classify_dy"),
        classifyQ("classify_q"),
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