package com.platzi.market.persistence;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.repository.ProductRepository;
import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;
import com.platzi.market.persistence.mapper.ProductMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {
    // We inject the repository interface that extends from CrudRepository to get all the methods from there
    private ProductoCrudRepository productoCrudRepository;
    // Let's inject the mapper object
    private ProductMapper mapper;

    // Let's create a method to get all the products from the database
    @Override
    public List<Product> getALl() {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    // This method gets the products that are part of a category
    @Override
    public Optional<List<Product>> getByCategory(int categoryId) {
        List<Producto> productos = productoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
        return Optional.of(mapper.toProducts(productos));
    }

    // This method get the products that are close to be unavailable (that are going to end)
    @Override
    public Optional<List<Product>> getScarce(int quantity) {
        Optional<List<Producto>> productos = productoCrudRepository.findByCantidadStockLessThanAndEstado(quantity, true);
        return productos.map(prods -> mapper.toProducts(prods));
    }

    // This method get a product by its id
    @Override
    public Optional<Product> getProduct(long productId) {
        return productoCrudRepository.findById(productId).map(producto -> mapper.toProduct(producto));
    }

    // This method save a product in the database
    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }

    // This method deletes a product by its id
    @Override
    public void delete(long productId) {
        productoCrudRepository.deleteById(productId);
    }
}
