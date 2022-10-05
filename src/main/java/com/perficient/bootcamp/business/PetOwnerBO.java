package com.perficient.bootcamp.business;

import java.sql.SQLException;

import com.perficient.bootcamp.dao.PetOwnerDAO;
import com.perficient.bootcamp.entity.PetOwner;

public class PetOwnerBO {
    public PetOwner findOwnerById(int ownerId) throws SQLException {
        return new PetOwnerDAO().findPetOwnerById(ownerId);
    }
    
    public PetOwner findOwnerByLastName(String lastName) throws SQLException {
    	return new PetOwnerDAO().findPetOwnerByLastName(lastName);
    }
}