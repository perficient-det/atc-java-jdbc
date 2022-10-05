package com.perficient.bootcamp.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?allowMultiQueries=true", "root", "password");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
