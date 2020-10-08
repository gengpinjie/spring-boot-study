package com.itheima.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_customer")
public class Customer {

    @Id
    @Column(name = "cust_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long custId;

    @Column(name = "cust_address")
    private String custAddress;

    @Column(name = "cust_industry")
    private String custIndustry;

    @Column(name = "cust_level")
    private String custLevel;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_phone")
    private String custPhone;

    @Column(name = "cust_source")
    private String custSource;

}
