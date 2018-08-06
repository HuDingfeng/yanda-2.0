package com.yanda.core.entity.generated;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_search")
public class UserSearchInfo extends UserSearchInfoKey implements Serializable {
    /**
     * ����ʱ��
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * �Ƿ���ɾ��
     */
    @Column(name = "is_deleted")
    private Boolean isDeleted;

    private static final long serialVersionUID = 1L;

    public UserSearchInfo(String keyword, Integer userId, Date addTime, Boolean isDeleted) {
        super(keyword, userId);
        this.addTime = addTime;
        this.isDeleted = isDeleted;
    }

    public UserSearchInfo() {
        super();
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return add_time - ����ʱ��
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * ��������ʱ��
     *
     * @param addTime ����ʱ��
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * ��ȡ�Ƿ���ɾ��
     *
     * @return is_deleted - �Ƿ���ɾ��
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * �����Ƿ���ɾ��
     *
     * @param isDeleted �Ƿ���ɾ��
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public enum Col {
        keyword("keyword"),
        userId("user_id"),
        addTime("add_time"),
        isDeleted("is_deleted");

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