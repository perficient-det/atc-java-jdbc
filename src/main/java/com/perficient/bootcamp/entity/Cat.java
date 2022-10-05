package com.perficient.bootcamp.entity;

public class Cat {
    private int catId;
    private int ownerId;
    private String name;
    private String breed;
    
    public int getCatId() {
        return catId;
    }
    public void setCatId(int catId) {
        this.catId = catId;
    }
    public int getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public String toString() {
        return "Cat [breed=" + breed + ", catId=" + catId + ", name=" + name + ", ownerId=" + ownerId + "]";
    }

    
}
