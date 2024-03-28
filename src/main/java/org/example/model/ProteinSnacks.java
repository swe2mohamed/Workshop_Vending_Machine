package org.example.model;

public final class ProteinSnacks extends Product{
    // Field
    private final Content content;

    // Constructor
    public ProteinSnacks(int id, double price, String productName, Content content) {
        super(id, price, productName);
        this.content = content;
    }

    // Methods
    @Override
    public String examine() {
        return super.examine() + " , ProteinContent: " + content.getProteinContent() + content.isGlutenFree();
    }

    @Override
    public String use() {
        return "You eat the protein snacks.";
    }


}
