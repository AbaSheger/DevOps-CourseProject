package com.example.demoapi.entities;

public class Product {
    private int productID;
    private String productName;
    private int quantityPerunit;
    private int unitPrice;

    public Product() {
    }

    public Product(int productID, String productName, int quantityPerunit, int unitPrice) {
        this.productID = productID;
        this.productName = productName;
        this.quantityPerunit = quantityPerunit;
        this.unitPrice = unitPrice;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantityPerunit() {
        return quantityPerunit;
    }

    public void setQuantityPerunit(int quantityPerunit) {
        this.quantityPerunit = quantityPerunit;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
