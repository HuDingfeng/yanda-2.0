package com.yanda.core.entity.generated;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_paper_info")
public class PaperInfo implements Serializable {
    /**
     * ����id
     */
    @Id
    private Integer id;

    /**
     * ��������
     */
    @Column(name = "paper_name")
    private String paperName;

    /**
     * ��������
     */
    @Column(name = "paper_desc")
    private String paperDesc;

    /**
     * ����ID
     */
    @Column(name = "appendix_id")
    private Long appendixId;

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
     * �ļ�����  1-����  2-�μ�
     */
    @Column(name = "paper_type")
    private Integer paperType;

    private static final long serialVersionUID = 1L;

    public PaperInfo(Integer id, String paperName, String paperDesc, Long appendixId, Date createTime, Date updateTime, Integer paperType) {
        this.id = id;
        this.paperName = paperName;
        this.paperDesc = paperDesc;
        this.appendixId = appendixId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.paperType = paperType;
    }

    public PaperInfo() {
        super();
    }

    /**
     * ��ȡ����id
     *
     * @return id - ����id
     */
    public Integer getId() {
        return id;
    }

    /**
     * ��������id
     *
     * @param id ����id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ��ȡ��������
     *
     * @return paper_name - ��������
     */
    public String getPaperName() {
        return paperName;
    }

    /**
     * ������������
     *
     * @param paperName ��������
     */
    public void setPaperName(String paperName) {
        this.paperName = paperName == null ? null : paperName.trim();
    }

    /**
     * ��ȡ��������
     *
     * @return paper_desc - ��������
     */
    public String getPaperDesc() {
        return paperDesc;
    }

    /**
     * ������������
     *
     * @param paperDesc ��������
     */
    public void setPaperDesc(String paperDesc) {
        this.paperDesc = paperDesc == null ? null : paperDesc.trim();
    }

    /**
     * ��ȡ����ID
     *
     * @return appendix_id - ����ID
     */
    public Long getAppendixId() {
        return appendixId;
    }

    /**
     * ���ø���ID
     *
     * @param appendixId ����ID
     */
    public void setAppendixId(Long appendixId) {
        this.appendixId = appendixId;
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
     * ��ȡ�ļ�����  1-����  2-�μ�
     *
     * @return paper_type - �ļ�����  1-����  2-�μ�
     */
    public Integer getPaperType() {
        return paperType;
    }

    /**
     * �����ļ�����  1-����  2-�μ�
     *
     * @param paperType �ļ�����  1-����  2-�μ�
     */
    public void setPaperType(Integer paperType) {
        this.paperType = paperType;
    }

    public enum Col {
        id("id"),
        paperName("paper_name"),
        paperDesc("paper_desc"),
        appendixId("appendix_id"),
        createTime("create_time"),
        updateTime("update_time"),
        paperType("paper_type");

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