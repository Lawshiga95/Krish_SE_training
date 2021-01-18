package com.lawshiga.designPattern.factory;

public class LaptopBrand {
    public static Laptop getCarBrand(BrandCode brandCode) {
        switch (brandCode) {
            case ACER:
                return new AcerBrand();
            case APPLE:
                return new AppleBrand();
            case DELL:
                return new DellBrand();
            case LENOVO:
                return new LenovoBrand();
            default:
                return null;
        }
    }
}
