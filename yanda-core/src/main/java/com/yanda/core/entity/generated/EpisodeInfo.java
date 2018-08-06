package com.yanda.core.entity.generated;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_mv_episode")
public class EpisodeInfo implements Serializable {
    /**
     * ����ID
     */
    @Id
    @Column(name = "episode_id")
    private Long episodeId;

    /**
     * ��ǰ������
     */
    @Column(name = "episode_name")
    private String episodeName;

    /**
     * �������
     */
    @Column(name = "episode_intro")
    private String episodeIntro;

    /**
     * ��ǰ����
     */
    @Column(name = "episode_num")
    private Integer episodeNum;

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
     * ����ƵID
     */
    @Column(name = "mv_id")
    private Long mvId;

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
     * ��Ƶ���ͣ� 1-��Ƶ 2-��Ƶ
     */
    private Integer type;

    /**
     * ��ƵvipȨ��  0����ͨ��Ա 1��vip��Ա
     */
    @Column(name = "vip_type")
    private Integer vipType;

    /**
     * ����Ƶ��ʱ��
     */
    private Long duration;

    private static final long serialVersionUID = 1L;

    public EpisodeInfo(Long episodeId, String episodeName, String episodeIntro, Integer episodeNum, Long imgAppendixId, Long mvAppendixId, Long mvId, Date createTime, Date updateTime, Integer type, Integer vipType, Long duration) {
        this.episodeId = episodeId;
        this.episodeName = episodeName;
        this.episodeIntro = episodeIntro;
        this.episodeNum = episodeNum;
        this.imgAppendixId = imgAppendixId;
        this.mvAppendixId = mvAppendixId;
        this.mvId = mvId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.type = type;
        this.vipType = vipType;
        this.duration = duration;
    }

    public EpisodeInfo() {
        super();
    }

    /**
     * ��ȡ����ID
     *
     * @return episode_id - ����ID
     */
    public Long getEpisodeId() {
        return episodeId;
    }

    /**
     * ���ü���ID
     *
     * @param episodeId ����ID
     */
    public void setEpisodeId(Long episodeId) {
        this.episodeId = episodeId;
    }

    /**
     * ��ȡ��ǰ������
     *
     * @return episode_name - ��ǰ������
     */
    public String getEpisodeName() {
        return episodeName;
    }

    /**
     * ���õ�ǰ������
     *
     * @param episodeName ��ǰ������
     */
    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName == null ? null : episodeName.trim();
    }

    /**
     * ��ȡ�������
     *
     * @return episode_intro - �������
     */
    public String getEpisodeIntro() {
        return episodeIntro;
    }

    /**
     * ���ö������
     *
     * @param episodeIntro �������
     */
    public void setEpisodeIntro(String episodeIntro) {
        this.episodeIntro = episodeIntro == null ? null : episodeIntro.trim();
    }

    /**
     * ��ȡ��ǰ����
     *
     * @return episode_num - ��ǰ����
     */
    public Integer getEpisodeNum() {
        return episodeNum;
    }

    /**
     * ���õ�ǰ����
     *
     * @param episodeNum ��ǰ����
     */
    public void setEpisodeNum(Integer episodeNum) {
        this.episodeNum = episodeNum;
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
     * ��ȡ����ƵID
     *
     * @return mv_id - ����ƵID
     */
    public Long getMvId() {
        return mvId;
    }

    /**
     * ��������ƵID
     *
     * @param mvId ����ƵID
     */
    public void setMvId(Long mvId) {
        this.mvId = mvId;
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
     * ��ȡ��Ƶ���ͣ� 1-��Ƶ 2-��Ƶ
     *
     * @return type - ��Ƶ���ͣ� 1-��Ƶ 2-��Ƶ
     */
    public Integer getType() {
        return type;
    }

    /**
     * ������Ƶ���ͣ� 1-��Ƶ 2-��Ƶ
     *
     * @param type ��Ƶ���ͣ� 1-��Ƶ 2-��Ƶ
     */
    public void setType(Integer type) {
        this.type = type;
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
     * ��ȡ����Ƶ��ʱ��
     *
     * @return duration - ����Ƶ��ʱ��
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * ��������Ƶ��ʱ��
     *
     * @param duration ����Ƶ��ʱ��
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public enum Col {
        episodeId("episode_id"),
        episodeName("episode_name"),
        episodeIntro("episode_intro"),
        episodeNum("episode_num"),
        imgAppendixId("img_appendix_id"),
        mvAppendixId("mv_appendix_id"),
        mvId("mv_id"),
        createTime("create_time"),
        updateTime("update_time"),
        type("type"),
        vipType("vip_type"),
        duration("duration");

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