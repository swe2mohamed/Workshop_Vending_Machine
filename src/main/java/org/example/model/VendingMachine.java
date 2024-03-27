package org.example.model;

public class VendingMachine implements IVendingMachine{
    Product[] products;
    private int depositPool;

    VendingMachine(Product[] products){

    };

    @Override
    public void addCurrency(double amount) {

    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public Product request(int id) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int id) {
        return null;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
