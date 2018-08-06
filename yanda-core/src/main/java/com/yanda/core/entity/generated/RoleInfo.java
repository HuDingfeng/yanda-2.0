package com.yanda.core.entity.generated;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_role_info")
public class RoleInfo implements Serializable {
    /**
     * ��ɫID
     */
    @Id
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * ��ɫӢ����
     */
    private String ename;

    /**
     * ��ɫ������
     */
    private String cname;

    /**
     * ��ɫ����
     */
    @Column(name = "role_desc")
    private String roleDesc;

    private static final long serialVersionUID = 1L;

    public RoleInfo(Integer roleId, String ename, String cname, String roleDesc) {
        this.roleId = roleId;
        this.ename = ename;
        this.cname = cname;
        this.roleDesc = roleDesc;
    }

    public RoleInfo() {
        super();
    }

    /**
     * ��ȡ��ɫID
     *
     * @return role_id - ��ɫID
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * ���ý�ɫID
     *
     * @param roleId ��ɫID
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * ��ȡ��ɫӢ����
     *
     * @return ename - ��ɫӢ����
     */
    public String getEname() {
        return ename;
    }

    /**
     * ���ý�ɫӢ����
     *
     * @param ename ��ɫӢ����
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * ��ȡ��ɫ������
     *
     * @return cname - ��ɫ������
     */
    public String getCname() {
        return cname;
    }

    /**
     * ���ý�ɫ������
     *
     * @param cname ��ɫ������
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * ��ȡ��ɫ����
     *
     * @return role_desc - ��ɫ����
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * ���ý�ɫ����
     *
     * @param roleDesc ��ɫ����
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public enum Col {
        roleId("role_id"),
        ename("ename"),
        cname("cname"),
        roleDesc("role_desc");

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