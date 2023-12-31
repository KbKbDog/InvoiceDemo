package com.example.invoicedemo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
/**
 * 用户表(User)实体类
 *
 */
@Data
@Entity
@Table(name="sys_user")
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -40356785423868312L;

    /**
     * 主键
     */
    @Id
    private Long id;
    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;
    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;
    /**
     * 密码
     */
    @Column
    private String password;
    /**
     * 账号状态（0正常 1停用）
     */
    @Column
    private String status;
    /**
     * 邮箱
     */
    @Column
    private String email;
    /**
     * 手机号
     */
    @Column
    private String phonenumber;
    /**
     * 用户性别（0男，1女，2未知）
     */
    @Column
    private String sex;
    /**
     * 头像
     */
    @Column
    private String avatar;
    /**
     * 用户类型（0管理员，1普通用户）
     */
    @Column(name = "user_type")
    private String userType;
    /**
     * 创建人的用户id
     */
    @Column(name = "create_by")
    private Long createBy;
    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;
    /**
     * 更新人
     */
    @Column(name = "update_by")
    private Long updateBy;
    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;
    /**
     * 删除标志（0代表未删除，1代表已删除）
     */
    @Column(name = "del_flag")
    private Integer delFlag;
}