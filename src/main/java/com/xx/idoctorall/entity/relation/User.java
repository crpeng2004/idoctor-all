package com.xx.idoctorall.entity.relation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity(name = "user")
@ApiModel
public class User implements Serializable {

    private static final long serialVersionUID = 8655851615465363473L;

    @ApiModelProperty("用户id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;   //病号
    @ApiModelProperty("用户名")
    private String username;  //用户名
    @ApiModelProperty("用户密码")
    @JsonIgnore
    private String password;  //密码

    private String  email;  //邮箱
    /**
     * TODO 忽略该字段的映射
     */
    @Transient
    private boolean rememberMe; //记住密码

    private String name;  //姓名
    private int roleid;   //角色id
    private String phone; //电话
    private Date birthday; //生日
    private String idcard; //身份证
    private String adress; //地址
    private String sex;    //性别
    private String logo;   //logo存储地址
    private int realnamestatus;//实名状态
    private String idcardimgzheng;//身份证正面
    private String idcardimgfan;//身份证反面
    private String zhizhao;//医生执照

    /*@Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", rememberMe=" + rememberMe +
                ", name='" + name + '\'' +
                ", roleid=" + roleid +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                ", idcard='" + idcard + '\'' +
                ", adress='" + adress + '\'' +
                ", sex='" + sex + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }*/
}

