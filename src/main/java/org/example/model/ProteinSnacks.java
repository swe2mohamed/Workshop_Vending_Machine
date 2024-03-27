package org.example.model;

public final class ProteinSnacks extends Product{
    // Field
    private final ProteinContent ProteinSnacks;
    public ProteinSnacks(int id, double price, String productName, ProteinContent ProteinSnacks) {
        super(id, price, productName);
        this.ProteinSnacks = ProteinSnacks;
    }

    // Constructor

    // Methods
    @Override
    public String examine() {
        return "ProteinContent: " + ProteinSnacks.getProteinContent() + ", IsGlutenFree: " + ProteinSnacks.isGlutenFree();
    }

    @Override
    public String use() {
        return "You eat the protein snacks.";
    }

}
