package org.example.model;

public abstract class Product {
    // Field
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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        // todo
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // todo
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        // todo
        this.productName = productName;
    }

    public String examine(){
        // todo: return name and price
        return "ItemId: " + id + ",Price: " + price + ", ProductName: " + productName;
    }

    public abstract String use();

}

