package com.platzi.market.domain.service;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// This service class works as a middle layer (intermediary) between the controller and the repository
// This helps to hide how our repository is build
@Service
public class ProductService {
    //
    @Autowired
    private ProductRepository productRepository;

    // Here we are working in domain terms
    // The conversion of the objects is made in the ProductoRepository class
    // The service layer doesn't know about the conversion
    public List<Product> getALl() {
        return productRepository.getALl();
    }

    public Optional<Product> getProduct(long productId) {
        return productRepository.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId) {
        return productRepository.getByCategory(categoryId);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(long productId) {
        try {
            productRepository.delete(productId);
            return true;
        } catch (EmptyResultDataAccessException e){
            return false;
        }
    }
}
