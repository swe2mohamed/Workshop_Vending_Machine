package org.example.model;

public enum Content {
    SMALL(30,false),
    MEDIUM(20,true),
    LOW(10,true);

    
    private final int proteinContent;
    private final boolean isGlutenFree;
    
    Content(int proteinContent, boolean isGlutenFree){
        this.proteinContent = proteinContent;
        this.isGlutenFree = isGlutenFree;
    };

    public int getProteinContent() {
        return proteinContent;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }
}
