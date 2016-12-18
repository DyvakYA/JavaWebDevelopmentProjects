package com.dyvak.model.dao;

import java.util.List;

/**
 * Created by Dyvak on 15.12.2016.
 */
public interface GenericDao<E> {
    E find(int id);
    List<E> findAll();
    void create(E e);
    void update(E e);
    void delete(int id);

}
