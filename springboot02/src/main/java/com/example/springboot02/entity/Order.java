package com.example.springboot02.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(name = "creationtime")
    private Date creationtime;

    @Column(name = "isdeleted")
    private int isdeleted=0;

    @NotNull
    @Column(name = "status")
    private int status;

    @NotNull
    @Column(name = "requireddate")
    private Date requiredate;

    @Column(name = "placeorder")
    private String  placeorder;

    @Column(name = "trandate")
    private Date trandate;

    @Column(name = "description")
    private String  description;

    @NotNull
    @Column(name = "totalpay")
    private Long  totalpay;

    @Column(name = "email")
    private String  email;

    @Column(name = "phone")
    private String  phone;

    @Column(name = "customername")
    private String  customername;

    public Order() {
    }

    public Order(Long id, Date creationtime, int isdeleted, int status, Date requiredate, String placeorder, Date trandate, String description, Long totalpay, String email, String phone, String customername) {
        this.id = id;
        this.creationtime = creationtime;
        this.isdeleted = isdeleted;
        this.status = status;
        this.requiredate = requiredate;
        this.placeorder = placeorder;
        this.trandate = trandate;
        this.description = description;
        this.totalpay = totalpay;
        this.email = email;
        this.phone = phone;
        this.customername = customername;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public int getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(int isdeleted) {
        this.isdeleted = isdeleted;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getRequiredate() {
        return requiredate;
    }

    public void setRequiredate(Date requiredate) {
        this.requiredate = requiredate;
    }

    public String getPlaceorder() {
        return placeorder;
    }

    public void setPlaceorder(String placeorder) {
        this.placeorder = placeorder;
    }

    public Date getTrandate() {
        return trandate;
    }

    public void setTrandate(Date trandate) {
        this.trandate = trandate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTotalpay() {
        return totalpay;
    }

    public void setTotalpay(Long totalpay) {
        this.totalpay = totalpay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }
}
