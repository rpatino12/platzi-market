package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    // We inject the repository interface that extends from CrudRepository to get all the methods from there
    private ProductoCrudRepository productoCrudRepository;

    // Let's create a method to get all the products from the database
    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    // This method gets the products that are part of a category
    public List<Producto> getByCategory(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    // This method get the products that are close to be unavailable (that are going to end)
    public Optional<List<Producto>> getScarce(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

    // This method get a product by its id
    public Optional<Producto> getProduct(Long idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    // This method save a product in the database
    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    // This method deletes a product by its id
    public void delete(Long idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
}
