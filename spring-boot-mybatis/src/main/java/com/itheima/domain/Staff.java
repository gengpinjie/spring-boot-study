package com.itheima.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Staff {

    /**id*/
    private String id;
    /**员工名称*/
    private String name;
    /**邮箱*/
    private String email;
    /**部门名称*/
    private String dept;
    /**手机号*/
    private String mobile;
    /**工号*/
    private String jobNumber;
    /**公司id*/
    private String componyId;
    /**公司名称*/
    private String componyName;
    /**备注*/
    private String remark;
    /**入职日期*/
    private Date confirmJoinTime;
    /**员工状态*/
    private String status;
    /**试用期*/
    private String probatioPeriod;
    /**转正日期*/
    private Date regularTime;
    /**岗位级别*/
    private String positionLevel;
    /**身份证姓名*/
    private String realName;
    /**身份证号*/
    private String certNo;
    /**出生日期*/
    private Date birthTime;
    /**性别*/
    private String sex;
    /**民族*/
    private String nation;
    /**现居住地址*/
    private String address;
    /**职位id*/
    private Integer positionId;
    /*职位名称*/
    private String positionName;
    /**开户行*/
    private String accountBank;
    /**银行卡号*/
    private String accountNo;
    /**紧急联系人*/
    private String concactName;
    /**基本工资*/
    private java.math.BigDecimal basePay;
    /**绩效工资*/
    private java.math.BigDecimal achievements;
    /**创建时间*/
    private Date createTime;
    /**创建人*/
    private String createBy;
    /**修改时间*/
    private Date updateTime;
    /**修改人*/
    private String updateBy;

}
