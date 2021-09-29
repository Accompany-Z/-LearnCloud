package com.zwf.pojo;

import java.util.Date;

/**
 * @Discription: 示例实体
 * @Author: 张文峰
 * @Date: 2021-09-25 15:06:44
 */
public class TestEntity {
    private String id;
    private String name;
    private double price;
    private Date date;

    public TestEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TestEntity(String id, String name, double price, Date date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date = date;
    }
}
