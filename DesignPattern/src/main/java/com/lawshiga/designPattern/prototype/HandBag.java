package com.lawshiga.designpattern.prototype;

public class HandBag extends Item{
    private String bagType;

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    @Override
    public String toString() {
        return "HandBag{" +
                "bagType='" + bagType + '\'' +
                '}';
    }
}
