package com.example.springboot02.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "solidstatedrives")
public class Ssd {
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

    @Column(name = "capacity")
    private String capacity;

    @Column(name = "size")
    private String size;

    @Column(name = "connect")
    private String connect;

    @Column(name = "nand")
    private String nand;

    @Column(name = "imagestring")
    private String imagestring;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Long price;

    @Column(name = "gurantee")
    private Long gurantee;

    @Column(name = "total")
    private Long total;

    public Ssd() {
    }

    public Ssd(Long id, Date creationtime, int isdeleted, String name, String capacity, String size, String connect, String nand, String imagestring, String description, Long price, Long gurantee, Long total) {
        this.id = id;
        this.creationtime = creationtime;
        this.isdeleted = isdeleted;
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.connect = connect;
        this.nand = nand;
        this.imagestring = imagestring;
        this.description = description;
        this.price = price;
        this.gurantee = gurantee;
        this.total = total;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getConnect() {
        return connect;
    }

    public void setConnect(String connect) {
        this.connect = connect;
    }

    public String getNand() {
        return nand;
    }

    public void setNand(String nand) {
        this.nand = nand;
    }

    public String getImagestring() {
        return imagestring;
    }

    public void setImagestring(String imagestring) {
        this.imagestring = imagestring;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getGurantee() {
        return gurantee;
    }

    public void setGurantee(Long gurantee) {
        this.gurantee = gurantee;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
