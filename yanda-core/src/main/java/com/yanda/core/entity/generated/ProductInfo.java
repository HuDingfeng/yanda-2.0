package com.yanda.core.entity.generated;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_product_info")
public class ProductInfo implements Serializable {
    /**
     * ��Ա������id
     */
    @Id
    private Integer id;

    /**
     * ��������
     */
    private String name;

    /**
     * ���㷽ʽ  1-�� 2-�� 3-�� 4-����
     */
    @Column(name = "time_unit")
    private Integer timeUnit;

    /**
     * ��������
     */
    @Column(name = "time_num")
    private Integer timeNum;

    @Column(name = "current_price")
    private BigDecimal currentPrice;

    @Column(name = "old_price")
    private BigDecimal oldPrice;

    /**
     * ��Ʒ����
     */
    private String product;

    /**
     * ����ʱ��
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * �����
     */
    @Column(name = "product_order")
    private Integer productOrder;

    private static final long serialVersionUID = 1L;

    public ProductInfo(Integer id, String name, Integer timeUnit, Integer timeNum, BigDecimal currentPrice, BigDecimal oldPrice, String product, Date createTime, Integer productOrder) {
        this.id = id;
        this.name = name;
        this.timeUnit = timeUnit;
        this.timeNum = timeNum;
        this.currentPrice = currentPrice;
        this.oldPrice = oldPrice;
        this.product = product;
        this.createTime = createTime;
        this.productOrder = productOrder;
    }

    public ProductInfo() {
        super();
    }

    /**
     * ��ȡ��Ա������id
     *
     * @return id - ��Ա������id
     */
    public Integer getId() {
        return id;
    }

    /**
     * ���û�Ա������id
     *
     * @param id ��Ա������id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ��ȡ��������
     *
     * @return name - ��������
     */
    public String getName() {
        return name;
    }

    /**
     * ������������
     *
     * @param name ��������
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * ��ȡ���㷽ʽ  1-�� 2-�� 3-�� 4-����
     *
     * @return time_unit - ���㷽ʽ  1-�� 2-�� 3-�� 4-����
     */
    public Integer getTimeUnit() {
        return timeUnit;
    }

    /**
     * ���ü��㷽ʽ  1-�� 2-�� 3-�� 4-����
     *
     * @param timeUnit ���㷽ʽ  1-�� 2-�� 3-�� 4-����
     */
    public void setTimeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * ��ȡ��������
     *
     * @return time_num - ��������
     */
    public Integer getTimeNum() {
        return timeNum;
    }

    /**
     * ���ü�������
     *
     * @param timeNum ��������
     */
    public void setTimeNum(Integer timeNum) {
        this.timeNum = timeNum;
    }

    /**
     * @return current_price
     */
    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    /**
     * @param currentPrice
     */
    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * @return old_price
     */
    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    /**
     * @param oldPrice
     */
    public void setOldPrice(BigDecimal oldPrice) {
        this.oldPrice = oldPrice;
    }

    /**
     * ��ȡ��Ʒ����
     *
     * @return product - ��Ʒ����
     */
    public String getProduct() {
        return product;
    }

    /**
     * ������Ʒ����
     *
     * @param product ��Ʒ����
     */
    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
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
     * ��ȡ�����
     *
     * @return product_order - �����
     */
    public Integer getProductOrder() {
        return productOrder;
    }

    /**
     * ���������
     *
     * @param productOrder �����
     */
    public void setProductOrder(Integer productOrder) {
        this.productOrder = productOrder;
    }

    public enum Col {
        id("id"),
        name("name"),
        timeUnit("time_unit"),
        timeNum("time_num"),
        currentPrice("current_price"),
        oldPrice("old_price"),
        product("product"),
        createTime("create_time"),
        productOrder("product_order");

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