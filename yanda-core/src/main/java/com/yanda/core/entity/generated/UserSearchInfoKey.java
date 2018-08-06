package com.yanda.core.entity.generated;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_user_search")
public class UserSearchInfoKey implements Serializable {
    /**
     * �����ؼ���
     */
    @Id
    private String keyword;

    /**
     * �û�ID
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    private static final long serialVersionUID = 1L;

    public UserSearchInfoKey(String keyword, Integer userId) {
        this.keyword = keyword;
        this.userId = userId;
    }

    public UserSearchInfoKey() {
        super();
    }

    /**
     * ��ȡ�����ؼ���
     *
     * @return keyword - �����ؼ���
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * ���������ؼ���
     *
     * @param keyword �����ؼ���
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * ��ȡ�û�ID
     *
     * @return user_id - �û�ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * �����û�ID
     *
     * @param userId �û�ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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