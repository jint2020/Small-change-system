package com.smallchangesys;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ewallet {
    private String name;
    private double money;
    private Date time;
    private double balance = 0;

    public Ewallet() {
    }

    public Ewallet(String name, double money, Date time, double balance) {
        this.name = name;
        this.money = money;
        this.time = time;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        if (name.equals("收益入账")) {
            return name +" " +
                    " " + money +
                    " " + ft.format(time) +
                    " " + balance;
        }else {
            return name +" " +
                    " -" + money +
                    " " + ft.format(time) +
                    " " + balance;
        }

    }


}
