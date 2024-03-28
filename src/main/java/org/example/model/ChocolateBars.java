package org.example.model;

public final class ChocolateBars extends Product{
    // Field
    private final ChocolateType chocolateType;
    private final CocoaContentLevel cocoaContentLevel;


    // Constructor
    public ChocolateBars(int id, double price, String productName, ChocolateType chocolateType, CocoaContentLevel cocoaContentLevel) {
        super(id, price, productName);
        this.chocolateType = chocolateType;
        this.cocoaContentLevel = cocoaContentLevel;
    }


    // Methods
    @Override
    public String examine() {
        return super.examine() + " , ChocolateType: " + chocolateType + " , CocoaContentLevel: " + cocoaContentLevel;
    }

    @Override
    public String use() {
        return null;
    }

}

