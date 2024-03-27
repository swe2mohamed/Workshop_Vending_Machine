package org.example.model;

public final class ProteinSnacks extends Product{
    // Field
    private ProteinContent proteinContent;


    // Constructor
    public ProteinSnacks(int id, double price, String productName, ProteinContent proteinContent) {
        super(id, price, productName);
        this.proteinContent = proteinContent;
    }

    // Methods


    @Override
    public String examine() {
        return null;
    }

    @Override
    public String use() {
        return "You eat the protein snacks.";
    }


}
