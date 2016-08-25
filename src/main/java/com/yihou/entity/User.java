package com.yihou.entity;

import com.yihou.common.model.BaseModel;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Date;

/**
 * 用户实体类
 */
public class User extends BaseModel<User> {

	private static final long serialVersionUID = -5334353370927777615L;
	private Long id;
    private String code;
    private String name;
    private String password;
    private String salt;
    private Boolean admin;
    private Date createtime;
    private Date updatetime;

    /**
     * 获取自增id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户编号（用来登录系统的）
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置用户编号（用来登录系统的）
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取用户姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置盐
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 生成新的种子
     */
    public void randomSalt() {
        setSalt(RandomStringUtils.randomAlphanumeric(10));
    }

    /**
     * 获取是否是管理员（管理员不能删除）
     */
    public Boolean getAdmin() {
        return admin;
    }

    /**
     * 设置是否是管理员（管理员不能删除）
     */
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    /**
     * 获取创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

}
