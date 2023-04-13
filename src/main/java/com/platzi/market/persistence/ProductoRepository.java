package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    // We inject the repository interface that extends from CrudRepository to get all the methods from there
    private ProductoCrudRepository productoCrudRepository;

    // Let's create a method to get all the products from the database
    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
