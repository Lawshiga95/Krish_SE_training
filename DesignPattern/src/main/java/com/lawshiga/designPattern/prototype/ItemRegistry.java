package com.lawshiga.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {
    private Map<ItemType, Item> items = new HashMap<>();

    public ItemRegistry(){
        this.initialize();
    }

    public Item getItem(ItemType itemType){
        Item item = null;
        try {
             item = (Item) items.get(itemType).clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone is not valid");
        }
        return item;
    }

    private void initialize() {
        HandBag handBag = new HandBag();
        handBag.setBagType("ShoulderBag");
        handBag.setItemBrand("Calvin Klein");
        handBag.setItemPrice(5000.0);

        Shoe shoe = new Shoe();
        shoe.setShoeSize("Small");
        shoe.setShoeColor("Pink");
        shoe.setItemBrand("Nike");
        shoe.setItemPrice(7500.0);

        items.put(ItemType.HANDBAG, handBag);
        items.put(ItemType.SHOE, shoe);
    }
}
