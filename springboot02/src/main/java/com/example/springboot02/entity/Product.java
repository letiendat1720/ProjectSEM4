package com.example.springboot02.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(name = "creationtime")
    private Date creationtime;

    @Column(name = "isdeleted")
    private int isdeleted=0;

    @Column(name = "name")
    private String name;

    @Column(name = "cpu")
    private String cpu;

    @Column(name = "ram")
    private String ram;

    @Column(name = "graphic")
    private String graphic;

    @Column(name = "storage")
    private String storage;

    @Column(name = "trademark")
    private String trademark;

    @Column(name = "price")
    private Long price;

    @Column(name = "pricesale")
    private Long pricesale;

    @Column(name = "mass")
    private String mass;

    @Column(name = "imagestring")
    private String imagestring;


    @Column(name = "total")
    private Long total;

    @Column(name = "producttype")
    private Long producttype;

    @NotNull
    @Column(name = "productconfigurationid")
    private Long productconfigurationid;

    public Product() {
    }

    public Product(Long id, Date creationtime, Integer isdeleted, String name, String cpu, String ram, String graphic, String storage, String trademark, Long price, Long pricesale, String mass, String imagestring, Long total, Long producttype, @NotNull Long productconfigurationid) {
        this.id = id;
        this.creationtime = creationtime;
        this.isdeleted = isdeleted;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.graphic = graphic;
        this.storage = storage;
        this.trademark = trademark;
        this.price = price;
        this.pricesale = pricesale;
        this.mass = mass;
        this.imagestring = imagestring;
        this.total = total;
        this.producttype = producttype;
        this.productconfigurationid = productconfigurationid;
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

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphic() {
        return graphic;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPricesale() {
        return pricesale;
    }

    public void setPricesale(Long pricesale) {
        this.pricesale = pricesale;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getImagestring() {
        return imagestring;
    }

    public void setImagestring(String imagestring) {
        this.imagestring = imagestring;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getProducttype() {
        return producttype;
    }

    public void setProducttype(Long producttype) {
        this.producttype = producttype;
    }

    public Long getProductconfigurationid() {
        return productconfigurationid;
    }

    public void setProductconfigurationid(Long productconfigurationid) {
        this.productconfigurationid = productconfigurationid;
    }
}