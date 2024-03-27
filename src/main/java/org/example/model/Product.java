package org.example.model;

public abstract class Product implements IProduct{
    // Field
    //// make private
    int id;
    double price;
    String productName;

    // Constructors
    public Product(int id, double price, String productName){
        this.id = id;
        this.price = price;
        this.productName = productName;
    }

    // Methods
    int getId() {
        return 0;
    }

    String getProductName() {
        return null;
    }

    void setProductName(String productName) {

    }

    double getPrice() {
        return 0;
    }

    void setPrice(double price) {
    }

}

