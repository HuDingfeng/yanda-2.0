package com.yanda.core.entity.generated;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_attachment_info")
public class AttachmentInfo implements Serializable {
    /**
     * ����ID
     */
    @Id
    @Column(name = "appendix_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appendixId;

    /**
     * �����ϴ�ʱ������
     */
    @Column(name = "old_filename")
    private String oldFilename;

    /**
     * �����ɵĸ�����
     */
    @Column(name = "new_filename")
    private String newFilename;

    /**
     * ������׺
     */
    @Column(name = "file_ext")
    private String fileExt;

    /**
     * �����ļ���·��
     */
    @Column(name = "file_path")
    private String filePath;

    /**
     * �������� 10.ͼƬ 20.��Ƶ 30.����
     */
    @Column(name = "file_type")
    private Integer fileType;

    /**
     * ����ʱ��
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * ����Ƶ��������ʱ��
     */
    private Long duration;

    private static final long serialVersionUID = 1L;

    public AttachmentInfo(Long appendixId, String oldFilename, String newFilename, String fileExt, String filePath, Integer fileType, Date createTime, Long duration) {
        this.appendixId = appendixId;
        this.oldFilename = oldFilename;
        this.newFilename = newFilename;
        this.fileExt = fileExt;
        this.filePath = filePath;
        this.fileType = fileType;
        this.createTime = createTime;
        this.duration = duration;
    }

    public AttachmentInfo() {
        super();
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
     * ��ȡ�����ϴ�ʱ������
     *
     * @return old_filename - �����ϴ�ʱ������
     */
    public String getOldFilename() {
        return oldFilename;
    }

    /**
     * ���ø����ϴ�ʱ������
     *
     * @param oldFilename �����ϴ�ʱ������
     */
    public void setOldFilename(String oldFilename) {
        this.oldFilename = oldFilename == null ? null : oldFilename.trim();
    }

    /**
     * ��ȡ�����ɵĸ�����
     *
     * @return new_filename - �����ɵĸ�����
     */
    public String getNewFilename() {
        return newFilename;
    }

    /**
     * ���������ɵĸ�����
     *
     * @param newFilename �����ɵĸ�����
     */
    public void setNewFilename(String newFilename) {
        this.newFilename = newFilename == null ? null : newFilename.trim();
    }

    /**
     * ��ȡ������׺
     *
     * @return file_ext - ������׺
     */
    public String getFileExt() {
        return fileExt;
    }

    /**
     * ���ø�����׺
     *
     * @param fileExt ������׺
     */
    public void setFileExt(String fileExt) {
        this.fileExt = fileExt == null ? null : fileExt.trim();
    }

    /**
     * ��ȡ�����ļ���·��
     *
     * @return file_path - �����ļ���·��
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * ���ø����ļ���·��
     *
     * @param filePath �����ļ���·��
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    /**
     * ��ȡ�������� 10.ͼƬ 20.��Ƶ 30.����
     *
     * @return file_type - �������� 10.ͼƬ 20.��Ƶ 30.����
     */
    public Integer getFileType() {
        return fileType;
    }

    /**
     * ���ø������� 10.ͼƬ 20.��Ƶ 30.����
     *
     * @param fileType �������� 10.ͼƬ 20.��Ƶ 30.����
     */
    public void setFileType(Integer fileType) {
        this.fileType = fileType;
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
     * ��ȡ����Ƶ��������ʱ��
     *
     * @return duration - ����Ƶ��������ʱ��
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * ��������Ƶ��������ʱ��
     *
     * @param duration ����Ƶ��������ʱ��
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public enum Col {
        appendixId("appendix_id"),
        oldFilename("old_filename"),
        newFilename("new_filename"),
        fileExt("file_ext"),
        filePath("file_path"),
        fileType("file_type"),
        createTime("create_time"),
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