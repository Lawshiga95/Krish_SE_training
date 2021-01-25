package com.lawshiga.designPattern.builder;

public class Application {

    public static void main(String[] args) {
        ElectricKeyboard.SaleBuilder saleBuilder1 = new ElectricKeyboard.SaleBuilder("PA-130");
        ElectricKeyboard electricKeyboard1 = saleBuilder1.keyboardStand("L-7").headPhone("HPH-150").subWoofer(true).build();

        ElectricKeyboard.SaleBuilder saleBuilder2 = new ElectricKeyboard.SaleBuilder("PA-500");
        ElectricKeyboard electricKeyboard2 = saleBuilder2.footController("FC3A").keyboardStand("LG-800").build();

        System.out.println(electricKeyboard1);
        System.out.println(electricKeyboard2);
    }
}
