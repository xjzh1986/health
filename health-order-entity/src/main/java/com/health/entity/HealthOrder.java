package com.health.entity;

/**
 * 
 *
 * @author Michael Chow
 * @date   2020/01/08
 */
public class HealthOrder {
    /**
     * id
     */
    private Integer id;

    /**
     * 订单名称
     */
    private String orderName;

    /**
     * 封面
     */
    private String orderFrontImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderFrontImg() {
        return orderFrontImg;
    }

    public void setOrderFrontImg(String orderFrontImg) {
        this.orderFrontImg = orderFrontImg;
    }
}