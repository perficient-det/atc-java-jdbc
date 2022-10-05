package com.perficient.bootcamp.business;

import java.sql.SQLException;
import java.util.List;

import com.perficient.bootcamp.dao.CatDAO;
import com.perficient.bootcamp.entity.Cat;

public class CatBO {
    public List<Cat> findAllCatsByOwnerId(int ownerId) throws SQLException {
        return new CatDAO().findAllCatsByOwnerId(ownerId);
    }
}