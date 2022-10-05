package com.perficient.bootcamp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.perficient.bootcamp.entity.Cat;

public class CatDAO {

    private static String GET_ALL_CATS_SQL = 
        "SELECT * FROM CATS WHERE OWNER_ID = ? ";

    public List<Cat> findAllCatsByOwnerId(int ownerId) throws SQLException {
        Connection connection = null;
        PreparedStatement findQuery = null;
        ResultSet resultSet = null;
        try {
            connection = new ConnectionUtil().getConnection();
            findQuery = connection.prepareStatement(GET_ALL_CATS_SQL);
            findQuery.setInt(1, ownerId);
            resultSet = findQuery.executeQuery();
            List<Cat> cats = new ArrayList<Cat>();
            while (resultSet.next()){
                Cat cat = new Cat();
                cat.setOwnerId(resultSet.getInt("owner_id"));
                cat.setCatId(resultSet.getInt("cat_id"));
                cat.setName(resultSet.getString("name"));
                cat.setBreed(resultSet.getString("breed"));
                cats.add(cat);
            }
            return cats;
        } catch (Exception e){
            e.printStackTrace();
            throw e;
        } finally {
            resultSet.close();
            findQuery.close();
            connection.close();
        }
    }
}