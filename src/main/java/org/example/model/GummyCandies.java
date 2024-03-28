package org.example.model;

public final class GummyCandies extends Product{
    // Field
    private final GummyCandiesFlavor gummyCandiesFlavor;

    // Constructor
    public GummyCandies(GummyCandiesFlavor gummyCandiesFlavor , int id, double price, String productName) {
        super(id, price, productName);
        this.gummyCandiesFlavor = gummyCandiesFlavor;
    }


    // Methods
    @Override
    public String examine() {
        return super.examine() + " ,Flavor: " + gummyCandiesFlavor.getFlavor() + ", isVegan: " + gummyCandiesFlavor.isVegan();
    }

    @Override
    public String use() {
        return "You eat the gummy candies.";
    }

}
