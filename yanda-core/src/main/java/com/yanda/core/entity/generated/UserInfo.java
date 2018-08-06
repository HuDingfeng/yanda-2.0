package com.yanda.core.entity.generated;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_info")
public class UserInfo implements Serializable {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    private String password;

    @Column(name = "nick_name")
    private String nickName;

    private String mobile;

    /**
     * �û��Ա� 1����  2��Ů  3��δ֪
     */
    private Integer sex;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private String avatar;

    /**
     * �˺�״̬  0����ͣ��  1������
     */
    private Integer status;

    /**
     * �Ƿ�΢���û�
     */
    @Column(name = "is_wechat")
    private Boolean isWechat;

    /**
     * �û��󶨵�΢��openid
     */
    @Column(name = "open_id")
    private String openId;

    private static final long serialVersionUID = 1L;

    public UserInfo(Integer userId, String userName, String password, String nickName, String mobile, Integer sex, Date createTime, Date updateTime, String avatar, Integer status, Boolean isWechat, String openId) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
        this.mobile = mobile;
        this.sex = sex;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.avatar = avatar;
        this.status = status;
        this.isWechat = isWechat;
        this.openId = openId;
    }

    public UserInfo() {
        super();
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * ��ȡ�û��Ա� 1����  2��Ů  3��δ֪
     *
     * @return sex - �û��Ա� 1����  2��Ů  3��δ֪
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * �����û��Ա� 1����  2��Ů  3��δ֪
     *
     * @param sex �û��Ա� 1����  2��Ů  3��δ֪
     */
    public void setSex(Integer sex) {
        this.sex = sex;
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
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * ��ȡ�˺�״̬  0����ͣ��  1������
     *
     * @return status - �˺�״̬  0����ͣ��  1������
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * �����˺�״̬  0����ͣ��  1������
     *
     * @param status �˺�״̬  0����ͣ��  1������
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ��ȡ�Ƿ�΢���û�
     *
     * @return is_wechat - �Ƿ�΢���û�
     */
    public Boolean getIsWechat() {
        return isWechat;
    }

    /**
     * �����Ƿ�΢���û�
     *
     * @param isWechat �Ƿ�΢���û�
     */
    public void setIsWechat(Boolean isWechat) {
        this.isWechat = isWechat;
    }

    /**
     * ��ȡ�û��󶨵�΢��openid
     *
     * @return open_id - �û��󶨵�΢��openid
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * �����û��󶨵�΢��openid
     *
     * @param openId �û��󶨵�΢��openid
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public enum Col {
        userId("user_id"),
        userName("user_name"),
        password("password"),
        nickName("nick_name"),
        mobile("mobile"),
        sex("sex"),
        createTime("create_time"),
        updateTime("update_time"),
        avatar("avatar"),
        status("status"),
        isWechat("is_wechat"),
        openId("open_id");

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