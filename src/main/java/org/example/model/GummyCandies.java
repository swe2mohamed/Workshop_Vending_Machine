package org.example.model;

public final class GummyCandies extends Product{
    // Field
    private String flavor;
    private boolean isVegan;

    // Constructor
    public GummyCandies(int id, double price, String productName) {
        super(id, price, productName);
    }
    // Methods


    @Override
    public String examine() {
        return "Flavor: " + flavor + ", IsVegan: " + isVegan;
    }

    @Override
    public String use() {
        return "You eat the gummy candies.";
    }
}

/*    class GummyCandies {
      -flavor : String
      -isVegan : boolean
      +examine() : String
    }

 */