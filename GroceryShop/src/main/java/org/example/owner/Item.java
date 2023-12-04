package org.example.owner;

public class Item {
    private final String name;
    private final String categoryName;
    public Item(String name, String categoryName) {
        this.name = name;
        this.categoryName = categoryName;
    }

    public String getItemName()
    {
        return this.name;
    }

    public String getCategoryName()
    {
        return this.categoryName;
    }
}

