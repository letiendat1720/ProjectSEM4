package com.example.springboot02.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "productconfigurations")
public class Configuration {
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

    @Column(name = "color")
    private String color;

    @Column(name = "mainbroad")
    private String mainbroad;

    @Column(name = "trademark")
    private String trademark;

    @Column(name = "price")
    private Long price;

    @Column(name = "hhd")
    private String hhd;

    @Column(name = "ssd")
    private String ssd;

    @Column(name = "card")
    private String card;

    @Column(name = "chip")
    private String chip;

    @Column(name = "vga")
    private String vga;

    @Column(name = "total")
    private Long total;

    @Column(name = "gurantee")
    private Long gurantee;

    @Column(name = "screen")
    private String screen;

    @Column(name = "keybroad")
    private String keybroad;

    @Column(name = "description")
    private String description;


    public Configuration() {
    }

    public Configuration(Long id, Date creationtime, Integer isdeleted, String name, String cpu, String ram, String color, String mainbroad, String trademark, Long price, String hhd, String ssd, String card, String chip, String vga, Long total, Long gurantee, String screen, String keybroad, String description) {
        this.id = id;
        this.creationtime = creationtime;
        this.isdeleted = isdeleted;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.color = color;
        this.mainbroad = mainbroad;
        this.trademark = trademark;
        this.price = price;
        this.hhd = hhd;
        this.ssd = ssd;
        this.card = card;
        this.chip = chip;
        this.vga = vga;
        this.total = total;
        this.gurantee = gurantee;
        this.screen = screen;
        this.keybroad = keybroad;
        this.description = description;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMainbroad() {
        return mainbroad;
    }

    public void setMainbroad(String mainbroad) {
        this.mainbroad = mainbroad;
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

    public String getHhd() {
        return hhd;
    }

    public void setHhd(String hhd) {
        this.hhd = hhd;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getGurantee() {
        return gurantee;
    }

    public void setGurantee(Long gurantee) {
        this.gurantee = gurantee;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getKeybroad() {
        return keybroad;
    }

    public void setKeybroad(String keybroad) {
        this.keybroad = keybroad;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
