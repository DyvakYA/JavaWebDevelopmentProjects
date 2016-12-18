package com.dyvak.model.dao.jdbc;

import com.dyvak.model.dao.CityDao;
import com.dyvak.model.dao.DaoFactory;
import com.dyvak.model.dao.PersonDao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Created by Dyvak on 15.12.2016.
 */
public class JdbcDaoFactory extends DaoFactory{

    private Connection connection;
    private static final String DB_URL = "url";

    public JdbcDaoFactory(){
        try{
            InputStream inputStream =
                    DaoFactory.class.getResourceAsStream(DB_FILE);
            Properties dbProps = new Properties();
            dbProps.load(inputStream);
            String url = dbProps.getProperty(DB_URL);
            connection = DriverManager.getConnection(url, dbProps);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public CityDao createCityDao() {
        return new JdbcCityDao(connection);
    }

    @Override
    public PersonDao createPersonDao() {
        return new JdbcPersonDao(connection);
    }
}
