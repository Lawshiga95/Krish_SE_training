package com.lawshiga.designPattern.factory;

public class AppleBrand implements Laptop{
    @Override
    public String getColor() {
        return "Silver";
    }

    @Override
    public double getPrice() {
        return 200000;
    }

    @Override
    public void getBrand() {
        System.out.println("Apple - macbook pro");
    }
}
