package com.lawshiga.designPattern.factory;

public class LenovoBrand implements Laptop{
    @Override
    public String getColor() {
        return "White";
    }

    @Override
    public double getPrice() {
        return 80000;
    }

    @Override
    public void getBrand() {
        System.out.println("Lenovo - Yoga C940");
    }
}
