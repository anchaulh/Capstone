package com.capstone1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long categoryId;
    private String categoryName;
    private String categoryImages;
    private String categoryDescription;

    
    public Category() {
    }

    
    public long getCategoryId() {
        return categoryId;
    }public Category(String categoryName, String categoryImages, String categoryDescription) {
        this.categoryName = categoryName;
        this.categoryImages = categoryImages;
        this.categoryDescription = categoryDescription;
    }


    public String getCategoryName() {
        return categoryName;
    }
    public String getCategoryImages() {
        return categoryImages;
    }
    public String getCategoryDescription() {
        return categoryDescription;
    }


    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    public void setCategoryImages(String categoryImages) {
        this.categoryImages = categoryImages;
    }


    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    
}