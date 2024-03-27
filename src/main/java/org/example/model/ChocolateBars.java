package org.example.model;

public final class ChocolateBars extends Product{
    // Field
    private ChocolateType chocolateType;
    private CocoaContentLevel cocoaContentLevel;


    // Constructor
    public ChocolateBars(int id, double price, String productName, ChocolateType chocolateType, CocoaContentLevel cocoaContentLevel) {
        super(id, price, productName);
        this.chocolateType = chocolateType;
        this.cocoaContentLevel = cocoaContentLevel;
    }


    // Methods
    @Override
    public String examine() {
        return null;
    }

    @Override
    public String use() {
        return null;
    }

}

