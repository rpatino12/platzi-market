package com.platzi.market.domain;

// This project main focus is the Domain approach, so we are going to apply the Data Mapper pattern to the entity classes
// This Data Mapper pattern allow us to:
    // Protect our database (don't expose the DB in the API)
    // Disengage our API from this puntual database, our application is more flexible and scalable
    // Don't work with all the table fields in the API, avoid using unnecessary data in the API
    // And last but not least, allow us to translate the tables and work in a single language in our project
public class Product {
    private long productId;
    private String name;
    private long categoryId;
    private double price;
    private int stock;
    private boolean active;
    private Category category;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
