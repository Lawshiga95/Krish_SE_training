package com.lawshiga.designpattern.prototype;

public class ShoppingCart {

    public static void main(String[] args) {
        ItemRegistry itemRegistry = new ItemRegistry();

        HandBag handBag = (HandBag) itemRegistry.getItem(ItemType.HANDBAG);
        System.out.println(handBag);
        handBag.setBagType("Clutch");
        System.out.println(handBag);

        HandBag handBag1 = (HandBag) itemRegistry.getItem(ItemType.HANDBAG);
        System.out.println(handBag1);
    }
}
