package com.example.springboot02.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "harddiskdrives")
public class Hdd {
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

    @Column(name = "type")
    private String type;

    @Column(name = "color")
    private String color;

    @Column(name = "storage")
    private String storage;

    @Column(name = "size")
    private String size;

    @Column(name = "imagestring")
    private String imagestring;

    @Column(name = "description")
    private String description;

    @Column(name = "gurantee")
    private Long gurantee;

    @Column(name = "price")
    private Long price;

    @Column(name = "total")
    private Long total;

    public Hdd() {
    }

    public Hdd(Long id, Date creationtime, int isdeleted, String name, String type, String color, String storage, String size, String imagestring, String description, Long gurantee, Long price, Long total) {
        this.id = id;
        this.creationtime = creationtime;
        this.isdeleted = isdeleted;
        this.name = name;
        this.type = type;
        this.color = color;
        this.storage = storage;
        this.size = size;
        this.imagestring = imagestring;
        this.description = description;
        this.gurantee = gurantee;
        this.price = price;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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

    public Long getGurantee() {
        return gurantee;
    }

    public void setGurantee(Long gurantee) {
        this.gurantee = gurantee;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
