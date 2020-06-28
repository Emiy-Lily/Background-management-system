package zhan.study.syscontroller.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author
 * @date : Created in 2020/6/289:09
 * @description: 数据库实体类
 * @version: 1.0.0$
 */
@Table(name = "person_admin")
@Data
public class PersonAdmin {

    // 用户名
    @Column(name = "user_name")
    private String username;
    // 昵称
    @Column(name = "user_Aname")
    private String userAname;
    // 性别
    @Column(name = "user_gender")
    private Integer gender;
    // 电话
    @Column(name = "user_tel")
    private Integer telephone;
    // 邮箱
    @Column(name = "user_mail")
    private String email;
    // 部门
    @Column(name = "user_department")
    private String department;
    // 岗位
    @Column(name = "user_post")
    private String post;
    // 状态
    @Column(name = "user_status")
    private Integer status;
    // 创建日期
    @Column(name = "user_date")
    private Date datetime;
    // 角色
    @Column(name = "user_role")
    private String userRole;

}
