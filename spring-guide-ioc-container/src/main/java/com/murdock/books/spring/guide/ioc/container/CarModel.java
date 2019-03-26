package com.murdock.books.spring.guide.ioc.container;

/**
 * @author weipeng2k 2018年09月24日 下午19:47:13
 */
public class CarModel {

    /**
     * 品牌
     */
    private Brand brand;
    /**
     * 型号
     */
    private String model;
    /**
     * 颜色
     */
    private Color color;
    /**
     * 最高时速
     */
    private int maxSpeed;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
