package com.yanda.core.entity.generated;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_vip_card_info")
public class VipCardInfo implements Serializable {
    /**
     * ����ID
     */
    @Id
    @Column(name = "card_id")
    private Integer cardId;

    /**
     * ��Ա����
     */
    @Column(name = "card_num")
    private String cardNum;

    /**
     * ��������
     */
    @Column(name = "card_password")
    private String cardPassword;

    /**
     * ��������
     */
    @Column(name = "purchase_days")
    private Integer purchaseDays;

    /**
     * ��Ա������ʱ��
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * ��Ա������ʱ��
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * ��Ա������ʱ��
     */
    @Column(name = "exp_time")
    private Date expTime;

    /**
     * ���иû�Ա�����û�ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * �������ǳ�
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * �Ƿ����û�Ա
     */
    @Column(name = "is_forever")
    private Boolean isForever;

    private static final long serialVersionUID = 1L;

    public VipCardInfo(Integer cardId, String cardNum, String cardPassword, Integer purchaseDays, Date createTime, Date updateTime, Date expTime, Integer userId, String nickName, Boolean isForever) {
        this.cardId = cardId;
        this.cardNum = cardNum;
        this.cardPassword = cardPassword;
        this.purchaseDays = purchaseDays;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.expTime = expTime;
        this.userId = userId;
        this.nickName = nickName;
        this.isForever = isForever;
    }

    public VipCardInfo() {
        super();
    }

    /**
     * ��ȡ����ID
     *
     * @return card_id - ����ID
     */
    public Integer getCardId() {
        return cardId;
    }

    /**
     * ��������ID
     *
     * @param cardId ����ID
     */
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    /**
     * ��ȡ��Ա����
     *
     * @return card_num - ��Ա����
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * ���û�Ա����
     *
     * @param cardNum ��Ա����
     */
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }

    /**
     * ��ȡ��������
     *
     * @return card_password - ��������
     */
    public String getCardPassword() {
        return cardPassword;
    }

    /**
     * ���ÿ�������
     *
     * @param cardPassword ��������
     */
    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword == null ? null : cardPassword.trim();
    }

    /**
     * ��ȡ��������
     *
     * @return purchase_days - ��������
     */
    public Integer getPurchaseDays() {
        return purchaseDays;
    }

    /**
     * ���ù�������
     *
     * @param purchaseDays ��������
     */
    public void setPurchaseDays(Integer purchaseDays) {
        this.purchaseDays = purchaseDays;
    }

    /**
     * ��ȡ��Ա������ʱ��
     *
     * @return create_time - ��Ա������ʱ��
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ���û�Ա������ʱ��
     *
     * @param createTime ��Ա������ʱ��
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ��Ա������ʱ��
     *
     * @return update_time - ��Ա������ʱ��
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * ���û�Ա������ʱ��
     *
     * @param updateTime ��Ա������ʱ��
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * ��ȡ��Ա������ʱ��
     *
     * @return exp_time - ��Ա������ʱ��
     */
    public Date getExpTime() {
        return expTime;
    }

    /**
     * ���û�Ա������ʱ��
     *
     * @param expTime ��Ա������ʱ��
     */
    public void setExpTime(Date expTime) {
        this.expTime = expTime;
    }

    /**
     * ��ȡ���иû�Ա�����û�ID
     *
     * @return user_id - ���иû�Ա�����û�ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * ���ó��иû�Ա�����û�ID
     *
     * @param userId ���иû�Ա�����û�ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * ��ȡ�������ǳ�
     *
     * @return nick_name - �������ǳ�
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * ���ó������ǳ�
     *
     * @param nickName �������ǳ�
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * ��ȡ�Ƿ����û�Ա
     *
     * @return is_forever - �Ƿ����û�Ա
     */
    public Boolean getIsForever() {
        return isForever;
    }

    /**
     * �����Ƿ����û�Ա
     *
     * @param isForever �Ƿ����û�Ա
     */
    public void setIsForever(Boolean isForever) {
        this.isForever = isForever;
    }

    public enum Col {
        cardId("card_id"),
        cardNum("card_num"),
        cardPassword("card_password"),
        purchaseDays("purchase_days"),
        createTime("create_time"),
        updateTime("update_time"),
        expTime("exp_time"),
        userId("user_id"),
        nickName("nick_name"),
        isForever("is_forever");

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