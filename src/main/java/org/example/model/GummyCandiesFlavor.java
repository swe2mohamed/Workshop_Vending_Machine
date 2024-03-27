package org.example.model;

public enum GummyCandiesFlavor {
    FRUIT_CANDY("Fruit",true),
    BEARS_CANDY("Sour",false),
    ;
    private final String flavor;
    private final boolean isVegan;

    GummyCandiesFlavor(String flavor, boolean isVegan){
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
