package org.example.model;

public final class ChocolateBars extends Product{
    // Field
    private final ChocolateType ChocolateType;
    private final CocoaContentLevel CocoaContentLevel;

    // Constructor
    public ChocolateBars(int id, double price, String productName, ChocolateType ChocolateType, CocoaContentLevel CocoaContentLevel) {
        super(id, price, productName);
        this.ChocolateType = ChocolateType;
        this.CocoaContentLevel = CocoaContentLevel;
    }
    // Methods

    @Override
    public String examine() {
        return "ChocolateType: " + ChocolateType + ", CocoaContentLevel: " + CocoaContentLevel;
    }

    @Override
    public String use() {
        return "You choose " + this.ChocolateType + " chocolate bars has " + CocoaContentLevel + " level from Cocoa";
    }
}

