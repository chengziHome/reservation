package com.chengzi.reservation.bean;

import java.sql.Blob;
import java.sql.Clob;

/**
 * Created by 橙子 on 2015/11/22.
 */
public class Meal {

    private Integer id;
    private String name;
    private Clob mealIntro;
    private Blob mealPic;
    private Integer stock;
    private double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clob getMealIntro() {
        return mealIntro;
    }

    public void setMealIntro(Clob mealIntro) {
        this.mealIntro = mealIntro;
    }

    public Blob getMealPic() {
        return mealPic;
    }

    public void setMealPic(Blob mealPic) {
        this.mealPic = mealPic;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mealIntro=" + mealIntro +
                ", mealPic=" + mealPic +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }
}
