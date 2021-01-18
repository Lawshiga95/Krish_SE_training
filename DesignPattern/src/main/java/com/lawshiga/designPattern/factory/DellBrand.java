package com.lawshiga.designPattern.factory;

public class DellBrand implements Laptop{
    @Override
    public String getColor() {
        return "Blue";
    }

    @Override
    public double getPrice() {
        return 70000;
    }

    @Override
    public void getBrand() {
        System.out.println("Dell - WD19");
    }
}
