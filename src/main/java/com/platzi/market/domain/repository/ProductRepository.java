package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getALl();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarce(int quantity);
    Optional<Product> getProduct(long productId);
    Product save(Product product);
    void delete(long productId);
    Product updateProduct(Product product, long id);
}
