package com.perficient.bootcamp.entity;

public class PetOwner {
    private int ownerId;
    private String lastName;
    private String firstName;
    private int zipCode;
    private java.sql.Date dateOfBirth;

    public int getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public int getZipCode() {
        return zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    public java.sql.Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(java.sql.Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    @Override
    public String toString() {
        return "PetOwner [dateOfBirth=" + dateOfBirth + ", firstName=" + firstName + ", lastName="
                + lastName + ", ownerId=" + ownerId + ", zipCode=" + zipCode + "]";
    }

    
}
