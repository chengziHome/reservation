package com.chengzi.reservation.bean;

import java.sql.Blob;

/**
 * Created by 橙子 on 2015/11/22.
 */
public class Customer {

    private Integer id;
    private String name;
    private String password;
    private String telNumber;
    private double balance;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}

