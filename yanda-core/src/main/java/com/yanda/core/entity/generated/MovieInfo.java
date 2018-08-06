package com.yanda.core.entity.generated;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_mv_info")
public class MovieInfo implements Serializable {
    /**
     * ��Ƶid
     */
    @Id
    @Column(name = "mv_id")
    private Long mvId;

    /**
     * ��Ƶ����
     */
    @Column(name = "mv_name")
    private String mvName;

    /**
     * ��Ƶ���
     */
    @Column(name = "mv_intro")
    private String mvIntro;

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
     * ����ID
     */
    @Column(name = "classify_id")
    private Integer classifyId;

    @Column(name = "classify_name")
    private String classifyName;

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
     * ��Ƶ����
     */
    @Column(name = "episode_count")
    private Integer episodeCount;

    /**
     * �����Ƶ���ļ���·��
     */
    @Column(name = "mv_path")
    private String mvPath;

    /**
     * �Ƿ��ѷ���
     */
    @Column(name = "is_public")
    private Boolean isPublic;

    /**
     * ����ʱ��
     */
    @Column(name = "public_time")
    private Date publicTime;

    /**
     * ��ƵvipȨ��  0����ͨ��Ա 1��vip��Ա
     */
    @Column(name = "vip_type")
    private Integer vipType;

    private static final long serialVersionUID = 1L;

    public MovieInfo(Long mvId, String mvName, String mvIntro, Date createTime, Date updateTime, Integer classifyId, String classifyName, Long imgAppendixId, Long mvAppendixId, Integer episodeCount, String mvPath, Boolean isPublic, Date publicTime, Integer vipType) {
        this.mvId = mvId;
        this.mvName = mvName;
        this.mvIntro = mvIntro;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.classifyId = classifyId;
        this.classifyName = classifyName;
        this.imgAppendixId = imgAppendixId;
        this.mvAppendixId = mvAppendixId;
        this.episodeCount = episodeCount;
        this.mvPath = mvPath;
        this.isPublic = isPublic;
        this.publicTime = publicTime;
        this.vipType = vipType;
    }

    public MovieInfo() {
        super();
    }

    /**
     * ��ȡ��Ƶid
     *
     * @return mv_id - ��Ƶid
     */
    public Long getMvId() {
        return mvId;
    }

    /**
     * ������Ƶid
     *
     * @param mvId ��Ƶid
     */
    public void setMvId(Long mvId) {
        this.mvId = mvId;
    }

    /**
     * ��ȡ��Ƶ����
     *
     * @return mv_name - ��Ƶ����
     */
    public String getMvName() {
        return mvName;
    }

    /**
     * ������Ƶ����
     *
     * @param mvName ��Ƶ����
     */
    public void setMvName(String mvName) {
        this.mvName = mvName == null ? null : mvName.trim();
    }

    /**
     * ��ȡ��Ƶ���
     *
     * @return mv_intro - ��Ƶ���
     */
    public String getMvIntro() {
        return mvIntro;
    }

    /**
     * ������Ƶ���
     *
     * @param mvIntro ��Ƶ���
     */
    public void setMvIntro(String mvIntro) {
        this.mvIntro = mvIntro == null ? null : mvIntro.trim();
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
     * ��ȡ����ID
     *
     * @return classify_id - ����ID
     */
    public Integer getClassifyId() {
        return classifyId;
    }

    /**
     * ���÷���ID
     *
     * @param classifyId ����ID
     */
    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    /**
     * @return classify_name
     */
    public String getClassifyName() {
        return classifyName;
    }

    /**
     * @param classifyName
     */
    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName == null ? null : classifyName.trim();
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
     * ��ȡ��Ƶ����
     *
     * @return episode_count - ��Ƶ����
     */
    public Integer getEpisodeCount() {
        return episodeCount;
    }

    /**
     * ������Ƶ����
     *
     * @param episodeCount ��Ƶ����
     */
    public void setEpisodeCount(Integer episodeCount) {
        this.episodeCount = episodeCount;
    }

    /**
     * ��ȡ�����Ƶ���ļ���·��
     *
     * @return mv_path - �����Ƶ���ļ���·��
     */
    public String getMvPath() {
        return mvPath;
    }

    /**
     * ���ô����Ƶ���ļ���·��
     *
     * @param mvPath �����Ƶ���ļ���·��
     */
    public void setMvPath(String mvPath) {
        this.mvPath = mvPath == null ? null : mvPath.trim();
    }

    /**
     * ��ȡ�Ƿ��ѷ���
     *
     * @return is_public - �Ƿ��ѷ���
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    /**
     * �����Ƿ��ѷ���
     *
     * @param isPublic �Ƿ��ѷ���
     */
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return public_time - ����ʱ��
     */
    public Date getPublicTime() {
        return publicTime;
    }

    /**
     * ���÷���ʱ��
     *
     * @param publicTime ����ʱ��
     */
    public void setPublicTime(Date publicTime) {
        this.publicTime = publicTime;
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

    public enum Col {
        mvId("mv_id"),
        mvName("mv_name"),
        mvIntro("mv_intro"),
        createTime("create_time"),
        updateTime("update_time"),
        classifyId("classify_id"),
        classifyName("classify_name"),
        imgAppendixId("img_appendix_id"),
        mvAppendixId("mv_appendix_id"),
        episodeCount("episode_count"),
        mvPath("mv_path"),
        isPublic("is_public"),
        publicTime("public_time"),
        vipType("vip_type");

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