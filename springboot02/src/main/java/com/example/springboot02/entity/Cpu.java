package com.example.springboot02.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "cpus")
public class Cpu {
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

    @Column(name = "cpuinfor")
    private String cpuinfor;

    @Column(name = "socket")
    private String socket;

    @Column(name = "core")
    private String core;

    @Column(name = "cache")
    private String cache;

    @Column(name = "tdp")
    private String tdp;

    @Column(name = "description")
    private String description;

    @Column(name = "imagestring")
    private String imagestring;

    @Column(name = "price")
    private Long price;

    @Column(name = "total")
    private Long total;

    public Cpu() {
    }

    public Cpu(Long id, Date creationtime, Integer isdeleted, String name, String cpuinfor, String socket, String core, String cache, String tdp, String description, String imagestring, Long price, Long total) {
        this.id = id;
        this.creationtime = creationtime;
        this.isdeleted = isdeleted;
        this.name = name;
        this.cpuinfor = cpuinfor;
        this.socket = socket;
        this.core = core;
        this.cache = cache;
        this.tdp = tdp;
        this.description = description;
        this.imagestring = imagestring;
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

    public String getCpuinfor() {
        return cpuinfor;
    }

    public void setCpuinfor(String cpuinfor) {
        this.cpuinfor = cpuinfor;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getTdp() {
        return tdp;
    }

    public void setTdp(String tdp) {
        this.tdp = tdp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagestring() {
        return imagestring;
    }

    public void setImagestring(String imagestring) {
        this.imagestring = imagestring;
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
