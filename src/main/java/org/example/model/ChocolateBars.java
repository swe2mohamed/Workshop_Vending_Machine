package org.example.model;

public final class ChocolateBars extends Product{
    // Field
    private final ChocolateBars_ChocolateType chocolateBarsChocolateType;
    private final ChocolateBars_CocoaContentLevel chocolateBarsCocoaContentLevel;

    // Constructor
    public ChocolateBars(int id, double price, String productName, ChocolateBars_ChocolateType chocolateBarsChocolateType, ChocolateBars_CocoaContentLevel chocolateBarsCocoaContentLevel) {
        super(id, price, productName);
        this.chocolateBarsChocolateType = chocolateBarsChocolateType;
        this.chocolateBarsCocoaContentLevel = chocolateBarsCocoaContentLevel;
    }
    // Methods

    @Override
    public String examine() {
        return super.examine() + ", ChocolateType: " + chocolateBarsChocolateType + ", CocoaContentLevel: " + chocolateBarsCocoaContentLevel;
    }

    @Override
    public String use() {
        return "You choose " + this.chocolateBarsChocolateType + " chocolate bars has " + chocolateBarsCocoaContentLevel + " level from Cocoa";
    }
}

