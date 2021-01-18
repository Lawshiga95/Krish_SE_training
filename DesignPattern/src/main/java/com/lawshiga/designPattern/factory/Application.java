package com.lawshiga.designPattern.factory;

public class Application {

    public static void main(String args[]) {
        Laptop laptopBrand1 = LaptopBrand.getCarBrand(BrandCode.LENOVO);
        if (laptopBrand1 != null) {
            laptopBrand1.getBrand();
            System.out.println("Color: " + laptopBrand1.getColor());
            System.out.println("Price: " + laptopBrand1.getPrice());
        }

        Laptop laptopBrand2 = LaptopBrand.getCarBrand(BrandCode.ACER);
        if (laptopBrand2 != null) {
            laptopBrand2.getBrand();
            System.out.println("Color: " + laptopBrand2.getColor());
            System.out.println("Price: " + laptopBrand2.getPrice());
        }
    }
}
