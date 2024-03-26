package org.example.model;

public enum GummyCandies_GummyCandiesFlavor {
    SMART_SWEET("Fruit",false),
    SQUISH("Sour",false),
    VEGAN_BEARS("ORANGE", true)
    ;
    private final String flavor;
    private final boolean isVegan;

    GummyCandies_GummyCandiesFlavor(String flavor, boolean isVegan){
        this.flavor = flavor;
        this.isVegan = isVegan;
    }

    public String getFlavor() {
        return flavor;
    }

    public boolean isVegan() {
        return isVegan;
    }
}
