package com.yanda.core.entity.generated;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_classify_info")
public class ClassifyInfo implements Serializable {
    @Id
    @Column(name = "classify_id")
    private Integer classifyId;

    @Column(name = "classify_name")
    private String classifyName;

    @Column(name = "classify_desc")
    private String classifyDesc;

    /**
     * 10-视频分类   
20-考题分类  
21-专题练习章  211-专题练习节   
22-知识巩固章  221-知识巩固节
23-历年真题  
24-仿真练习
     */
    @Column(name = "classify_type")
    private Integer classifyType;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "classify_order")
    private String classifyOrder;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "icon_url")
    private String iconUrl;

    private static final long serialVersionUID = 1L;

    public ClassifyInfo(Integer classifyId, String classifyName, String classifyDesc, Integer classifyType, Integer parentId, String classifyOrder, Date createTime, Date updateTime, String iconUrl) {
        this.classifyId = classifyId;
        this.classifyName = classifyName;
        this.classifyDesc = classifyDesc;
        this.classifyType = classifyType;
        this.parentId = parentId;
        this.classifyOrder = classifyOrder;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.iconUrl = iconUrl;
    }

    public ClassifyInfo() {
        super();
    }

    /**
     * @return classify_id
     */
    public Integer getClassifyId() {
        return classifyId;
    }

    /**
     * @param classifyId
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
     * @return classify_desc
     */
    public String getClassifyDesc() {
        return classifyDesc;
    }

    /**
     * @param classifyDesc
     */
    public void setClassifyDesc(String classifyDesc) {
        this.classifyDesc = classifyDesc == null ? null : classifyDesc.trim();
    }

    /**
     * 获取10-视频分类   
20-考题分类  
21-专题练习章  211-专题练习节   
22-知识巩固章  221-知识巩固节
23-历年真题  
24-仿真练习
     *
     * @return classify_type - 10-视频分类   
20-考题分类  
21-专题练习章  211-专题练习节   
22-知识巩固章  221-知识巩固节
23-历年真题  
24-仿真练习
     */
    public Integer getClassifyType() {
        return classifyType;
    }

    /**
     * 设置10-视频分类   
20-考题分类  
21-专题练习章  211-专题练习节   
22-知识巩固章  221-知识巩固节
23-历年真题  
24-仿真练习
     *
     * @param classifyType 10-视频分类   
20-考题分类  
21-专题练习章  211-专题练习节   
22-知识巩固章  221-知识巩固节
23-历年真题  
24-仿真练习
     */
    public void setClassifyType(Integer classifyType) {
        this.classifyType = classifyType;
    }

    /**
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * @return classify_order
     */
    public String getClassifyOrder() {
        return classifyOrder;
    }

    /**
     * @param classifyOrder
     */
    public void setClassifyOrder(String classifyOrder) {
        this.classifyOrder = classifyOrder == null ? null : classifyOrder.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return icon_url
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * @param iconUrl
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    public enum Col {
        classifyId("classify_id"),
        classifyName("classify_name"),
        classifyDesc("classify_desc"),
        classifyType("classify_type"),
        parentId("parent_id"),
        classifyOrder("classify_order"),
        createTime("create_time"),
        updateTime("update_time"),
        iconUrl("icon_url");

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