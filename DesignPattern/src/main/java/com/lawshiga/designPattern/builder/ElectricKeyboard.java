package com.lawshiga.designPattern.builder;

public class ElectricKeyboard {
    private final String powerAdapter;
    private final String keyboardStand;
    private final String headPhone;
    private final Boolean subWoofer;
    private final String footController;

    public ElectricKeyboard(SaleBuilder saleBuilder){
        this.powerAdapter = saleBuilder.powerAdapter;
        this.keyboardStand = saleBuilder.keyboardStand;
        this.headPhone = saleBuilder.headPhone;
        this.subWoofer = saleBuilder.subWoofer;
        this.footController = saleBuilder.footController;
    }

    static class SaleBuilder{
        private String powerAdapter;
        private String keyboardStand;
        private String headPhone;
        private Boolean subWoofer;
        private String footController;

        public SaleBuilder(String powerAdapter){
            this.powerAdapter = powerAdapter;
        }

        public ElectricKeyboard build(){
            return new ElectricKeyboard(this);
        }

        public SaleBuilder subWoofer(Boolean subWoofer) {
            this.subWoofer = subWoofer;
            return this;
        }

        public SaleBuilder keyboardStand(String keyboardStand){
            this.keyboardStand = keyboardStand;
            return this;
        }

        public SaleBuilder headPhone(String headPhone){
            this.headPhone = headPhone;
            return this;
        }

        public SaleBuilder footController(String footController){
            this.footController = footController;
            return this;
        }
    }

    @Override
    public String toString() {
        return "ElectricKeyboard{" +
                "powerAdapter='" + powerAdapter + '\'' +
                ", keyboardStand='" + keyboardStand + '\'' +
                ", headPhone='" + headPhone + '\'' +
                ", subWoofer=" + subWoofer +
                ", footController='" + footController + '\'' +
                '}';
    }
}
