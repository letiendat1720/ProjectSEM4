package com.example.springboot02.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "videographicsarrays")
public class Vga {
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

    @Column(name = "trademark")
    private String trademark;

    @Column(name = "chip")
    private String chip;

    @Column(name = "cpu")
    private String cpu;

    @Column(name = "memory")
    private String memory;

    @Column(name = "gpuclock")
    private String gpuclock;

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

    public Vga() {
    }

    public Vga(Long id, Date creationtime, int isdeleted, String name, String trademark, String chip, String cpu, String memory, String gpuclock, String imagestring, String description, Long price, Long gurantee, Long total) {
        this.id = id;
        this.creationtime = creationtime;
        this.isdeleted = isdeleted;
        this.name = name;
        this.trademark = trademark;
        this.chip = chip;
        this.cpu = cpu;
        this.memory = memory;
        this.gpuclock = gpuclock;
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

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getGpuclock() {
        return gpuclock;
    }

    public void setGpuclock(String gpuclock) {
        this.gpuclock = gpuclock;
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
