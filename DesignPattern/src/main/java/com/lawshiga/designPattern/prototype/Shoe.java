package com.lawshiga.designpattern.prototype;

public class Shoe extends Item{
    private String shoeColor;
    private String shoeSize;

    public String getShoeColor() {
        return shoeColor;
    }

    public void setShoeColor(String shoeColor) {
        this.shoeColor = shoeColor;
    }

    public String getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(String shoeSize) {
        this.shoeSize = shoeSize;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "shoeColor='" + shoeColor + '\'' +
                ", shoeSize='" + shoeSize + '\'' +
                '}';
    }
}
