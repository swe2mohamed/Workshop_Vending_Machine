package org.example.model;

public final class ProteinSnacks extends Product{
    // Field
    private final ProteinSnacks_ProteinContent proteinSnacksProteinContent;
    public ProteinSnacks(int id, double price, String productName,ProteinSnacks_ProteinContent proteinSnacksProteinContent) {
        super(id, price, productName);
        this.proteinSnacksProteinContent = proteinSnacksProteinContent;
    }

    // Constructor

    // Methods
    @Override
    public String examine() {
        return super.examine() + ", ProteinContent: " + proteinSnacksProteinContent.getProteinContent() + ", IsGlutenFree: " + proteinSnacksProteinContent.isGlutenFree();
    }

    @Override
    public String use() {
        return "You eat the protein snacks.";
    }
/*
    class ProteinSnacks {
      -proteinContent : int
      -isGlutenFree : boolean
      +examine() : String
    }
     */


}
