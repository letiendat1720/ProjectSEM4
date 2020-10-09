package com.example.springboot02.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "mainbroads")
public class Main {
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

    @Column(name = "size")
    private String size;

    @Column(name = "socket")
    private String socket;

    @Column(name = "ram")
    private String ram;

    @Column(name = "supram")
    private String supram;

    @Column(name = "imagestring")
    private String imagestring;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Long price;

    @Column(name = "total")
    private Long total;

    public Main() {
    }

    public Main(Long id, Date creationtime, int isdeleted, String name, String size, String socket, String ram, String supram, String imagestring, String description, Long price, Long total) {
        this.id = id;
        this.creationtime = creationtime;
        this.isdeleted = isdeleted;
        this.name = name;
        this.size = size;
        this.socket = socket;
        this.ram = ram;
        this.supram = supram;
        this.imagestring = imagestring;
        this.description = description;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSupram() {
        return supram;
    }

    public void setSupram(String supram) {
        this.supram = supram;
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

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
