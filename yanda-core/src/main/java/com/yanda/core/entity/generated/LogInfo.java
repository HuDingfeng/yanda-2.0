package com.yanda.core.entity.generated;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_log_info")
public class LogInfo implements Serializable {
    /**
     * ��־ID
     */
    @Id
    @Column(name = "log_id")
    private Integer logId;

    /**
     * ����url
     */
    @Column(name = "request_url")
    private String requestUrl;

    /**
     * ���󷽷�����
     */
    private String method;

    /**
     * ����ip
     */
    private String ip;

    /**
     * ����ȫ·��
     */
    @Column(name = "class_method")
    private String classMethod;

    /**
     * �������
     */
    private String params;

    /**
     * ����ʱ��
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * ʧ����Ϣ
     */
    private String message;

    /**
     * ��ջ��־
     */
    private String error;

    private static final long serialVersionUID = 1L;

    public LogInfo(Integer logId, String requestUrl, String method, String ip, String classMethod, String params, Date createTime, String message) {
        this.logId = logId;
        this.requestUrl = requestUrl;
        this.method = method;
        this.ip = ip;
        this.classMethod = classMethod;
        this.params = params;
        this.createTime = createTime;
        this.message = message;
    }

    public LogInfo(Integer logId, String requestUrl, String method, String ip, String classMethod, String params, Date createTime, String message, String error) {
        this.logId = logId;
        this.requestUrl = requestUrl;
        this.method = method;
        this.ip = ip;
        this.classMethod = classMethod;
        this.params = params;
        this.createTime = createTime;
        this.message = message;
        this.error = error;
    }

    public LogInfo() {
        super();
    }

    /**
     * ��ȡ��־ID
     *
     * @return log_id - ��־ID
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * ������־ID
     *
     * @param logId ��־ID
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * ��ȡ����url
     *
     * @return request_url - ����url
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * ��������url
     *
     * @param requestUrl ����url
     */
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    /**
     * ��ȡ���󷽷�����
     *
     * @return method - ���󷽷�����
     */
    public String getMethod() {
        return method;
    }

    /**
     * �������󷽷�����
     *
     * @param method ���󷽷�����
     */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    /**
     * ��ȡ����ip
     *
     * @return ip - ����ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * ��������ip
     *
     * @param ip ����ip
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * ��ȡ����ȫ·��
     *
     * @return class_method - ����ȫ·��
     */
    public String getClassMethod() {
        return classMethod;
    }

    /**
     * ���÷���ȫ·��
     *
     * @param classMethod ����ȫ·��
     */
    public void setClassMethod(String classMethod) {
        this.classMethod = classMethod == null ? null : classMethod.trim();
    }

    /**
     * ��ȡ�������
     *
     * @return params - �������
     */
    public String getParams() {
        return params;
    }

    /**
     * �����������
     *
     * @param params �������
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
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
     * ��ȡʧ����Ϣ
     *
     * @return message - ʧ����Ϣ
     */
    public String getMessage() {
        return message;
    }

    /**
     * ����ʧ����Ϣ
     *
     * @param message ʧ����Ϣ
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * ��ȡ��ջ��־
     *
     * @return error - ��ջ��־
     */
    public String getError() {
        return error;
    }

    /**
     * ���ö�ջ��־
     *
     * @param error ��ջ��־
     */
    public void setError(String error) {
        this.error = error == null ? null : error.trim();
    }

    public enum Col {
        logId("log_id"),
        requestUrl("request_url"),
        method("method"),
        ip("ip"),
        classMethod("class_method"),
        params("params"),
        createTime("create_time"),
        message("message"),
        error("error");

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