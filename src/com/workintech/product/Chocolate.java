package com.workintech.product;

public class Chocolate extends ProductForSale {

    private String brand;

    public Chocolate(String type, double price, String description, String brand) {
        super(type, price, description);
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.println("this is a chocolate " + "\n");
        System.out.printf("type: " + this.getType() + "\n");
        System.out.printf("price: " + this.getPrice() + "\n");
        System.out.printf("description " + this.getDescription() + "\n");
        System.out.println("brand: " + this.getBrand() + "\n");
    }

    public String getBrand() {
        return brand;
    }


}
