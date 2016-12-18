package com.dyvak.model.dao;

import com.dyvak.model.entities.City;

import java.util.List;

/**
 * Created by Dyvak on 15.12.2016.
 */
public interface CityDao extends GenericDao<City> {
    List<City> findByName(String name);
}
