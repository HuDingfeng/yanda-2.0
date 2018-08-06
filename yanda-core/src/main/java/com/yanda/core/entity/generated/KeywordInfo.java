package com.yanda.core.entity.generated;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_search_keywords")
public class KeywordInfo extends KeywordInfoKey implements Serializable {
    /**
     * �Ƿ�����
     */
    @Column(name = "is_hot")
    private Boolean isHot;

    /**
     * �Ƿ�Ĭ�Ϲؼ���
     */
    @Column(name = "is_default")
    private Boolean isDefault;

    /**
     * �Ƿ���ɾ��
     */
    @Column(name = "is_deleted")
    private Boolean isDeleted;

    /**
     * ���򼶱�
     */
    @Column(name = "sort_order")
    private Integer sortOrder;

    private static final long serialVersionUID = 1L;

    public KeywordInfo(String keyword, Integer id, Boolean isHot, Boolean isDefault, Boolean isDeleted, Integer sortOrder) {
        super(keyword, id);
        this.isHot = isHot;
        this.isDefault = isDefault;
        this.isDeleted = isDeleted;
        this.sortOrder = sortOrder;
    }

    public KeywordInfo() {
        super();
    }

    /**
     * ��ȡ�Ƿ�����
     *
     * @return is_hot - �Ƿ�����
     */
    public Boolean getIsHot() {
        return isHot;
    }

    /**
     * �����Ƿ�����
     *
     * @param isHot �Ƿ�����
     */
    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    /**
     * ��ȡ�Ƿ�Ĭ�Ϲؼ���
     *
     * @return is_default - �Ƿ�Ĭ�Ϲؼ���
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * �����Ƿ�Ĭ�Ϲؼ���
     *
     * @param isDefault �Ƿ�Ĭ�Ϲؼ���
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
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

    /**
     * ��ȡ���򼶱�
     *
     * @return sort_order - ���򼶱�
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * �������򼶱�
     *
     * @param sortOrder ���򼶱�
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
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