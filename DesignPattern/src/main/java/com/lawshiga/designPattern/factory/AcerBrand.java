package com.lawshiga.designPattern.factory;

public class AcerBrand implements Laptop{
    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public double getPrice() {
        return 50000;
    }

    @Override
    public void getBrand() {
        System.out.println("Acer - Aspire 7");
    }
}
