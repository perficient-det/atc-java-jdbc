package com.perficient.bootcamp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.perficient.bootcamp.entity.PetOwner;

public class PetOwnerDAO {

    private static String GET_PET_OWNER_BY_OWNER_ID =
        "SELECT * FROM PET_OWNER WHERE OWNER_ID = ? ";

    public PetOwner findPetOwnerById(int ownerId) throws SQLException {
        Connection connection = null;
        PreparedStatement findQuery = null;
        ResultSet resultSet = null;
        try {
            connection = new ConnectionUtil().getConnection();
            findQuery = connection.prepareStatement(GET_PET_OWNER_BY_OWNER_ID);
            findQuery.setInt(1, ownerId);
            resultSet = findQuery.executeQuery();
            if (resultSet.next()){
                PetOwner petOwner = new PetOwner();
                petOwner.setOwnerId(resultSet.getInt("owner_id"));
                petOwner.setLastName(resultSet.getString("last_name"));
                petOwner.setFirstName(resultSet.getString("first_name"));
                petOwner.setZipCode(resultSet.getInt("zip_code"));
                petOwner.setDateOfBirth(resultSet.getDate("date_of_birth"));
                return petOwner;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            resultSet.close();
            findQuery.close();
            connection.close();
        }
    }

	public PetOwner findPetOwnerByLastName(String lastName) throws SQLException{
        Connection connection = null;
        Statement findQuery = null;
        ResultSet resultSet = null;
        try {
            connection = new ConnectionUtil().getConnection();
            findQuery = connection.createStatement();
            String query = "SELECT * FROM PET_OWNER WHERE LAST_NAME = " + lastName;
            System.out.println(query);
			if (findQuery.execute(query))
            {
            	resultSet = findQuery.getResultSet();
            }
//            resultSet = findQuery.executeQuery("SELECT * FROM PET_OWNER WHERE LAST_NAME = " + lastName);
            if (resultSet != null && resultSet.next()){
                PetOwner petOwner = new PetOwner();
                petOwner.setOwnerId(resultSet.getInt("owner_id"));
                petOwner.setLastName(resultSet.getString("last_name"));
                petOwner.setFirstName(resultSet.getString("first_name"));
                petOwner.setZipCode(resultSet.getInt("zip_code"));
                petOwner.setDateOfBirth(resultSet.getDate("date_of_birth"));
                return petOwner;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            resultSet.close();
            findQuery.close();
            connection.close();
        }
	}
}