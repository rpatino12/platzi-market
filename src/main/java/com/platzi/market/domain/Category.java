package com.platzi.market.domain;
// This project main focus is the Domain approach, so we are going to apply the Data Mapper pattern to the entity classes
// This Data Mapper pattern allow us to:
    // Protect our database (don't expose the DB in the API)
    // Disengage our API from this puntual database, our application is more flexible and scalable
    // Don't work with all the table fields in the API, avoid using unnecessary data in the API
    // And last but not least, allow us to translate the tables and work in a single language in our project
public class Category {
    private long categoryId;
    private String category;
    private boolean active;

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
