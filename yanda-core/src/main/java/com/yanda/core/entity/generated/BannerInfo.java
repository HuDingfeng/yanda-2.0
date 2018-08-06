package com.yanda.core.entity.generated;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_banner_info")
public class BannerInfo implements Serializable {
    @Id
    @Column(name = "banner_id")
    private Long bannerId;

    @Column(name = "banner_desc")
    private String bannerDesc;

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
     * �ֲ�ͼ���� 1-��Ӱ 2-��� 3-����
     */
    private Integer type;

    /**
     * ����ID
     */
    @Column(name = "appendix_id")
    private Long appendixId;

    /**
     * ����ID
     */
    @Column(name = "mv_id")
    private Long mvId;

    private static final long serialVersionUID = 1L;

    public BannerInfo(Long bannerId, String bannerDesc, Date createTime, Date updateTime, Integer type, Long appendixId, Long mvId) {
        this.bannerId = bannerId;
        this.bannerDesc = bannerDesc;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.type = type;
        this.appendixId = appendixId;
        this.mvId = mvId;
    }

    public BannerInfo() {
        super();
    }

    /**
     * @return banner_id
     */
    public Long getBannerId() {
        return bannerId;
    }

    /**
     * @param bannerId
     */
    public void setBannerId(Long bannerId) {
        this.bannerId = bannerId;
    }

    /**
     * @return banner_desc
     */
    public String getBannerDesc() {
        return bannerDesc;
    }

    /**
     * @param bannerDesc
     */
    public void setBannerDesc(String bannerDesc) {
        this.bannerDesc = bannerDesc == null ? null : bannerDesc.trim();
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
     * ��ȡ�ֲ�ͼ���� 1-��Ӱ 2-��� 3-����
     *
     * @return type - �ֲ�ͼ���� 1-��Ӱ 2-��� 3-����
     */
    public Integer getType() {
        return type;
    }

    /**
     * �����ֲ�ͼ���� 1-��Ӱ 2-��� 3-����
     *
     * @param type �ֲ�ͼ���� 1-��Ӱ 2-��� 3-����
     */
    public void setType(Integer type) {
        this.type = type;
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
     * ��ȡ����ID
     *
     * @return mv_id - ����ID
     */
    public Long getMvId() {
        return mvId;
    }

    /**
     * ���ö���ID
     *
     * @param mvId ����ID
     */
    public void setMvId(Long mvId) {
        this.mvId = mvId;
    }

    public enum Col {
        bannerId("banner_id"),
        bannerDesc("banner_desc"),
        createTime("create_time"),
        updateTime("update_time"),
        type("type"),
        appendixId("appendix_id"),
        mvId("mv_id");

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