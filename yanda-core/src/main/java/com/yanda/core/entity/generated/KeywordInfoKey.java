package com.yanda.core.entity.generated;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_search_keywords")
public class KeywordInfoKey implements Serializable {
    /**
     * �ؼ���
     */
    @Id
    private String keyword;

    /**
     * ����id
     */
    @Id
    private Integer id;

    private static final long serialVersionUID = 1L;

    public KeywordInfoKey(String keyword, Integer id) {
        this.keyword = keyword;
        this.id = id;
    }

    public KeywordInfoKey() {
        super();
    }

    /**
     * ��ȡ�ؼ���
     *
     * @return keyword - �ؼ���
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * ���ùؼ���
     *
     * @param keyword �ؼ���
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
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

    public enum Col {
        keyword("keyword"),
        id("id"),
        isHot("is_hot"),
        isDefault("is_default"),
        isDeleted("is_deleted"),
        sortOrder("sort_order");

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