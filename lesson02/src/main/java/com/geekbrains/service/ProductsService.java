package com.geekbrains.service;

import com.geekbrains.entites.Product;
import com.geekbrains.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    private ProductsRepository productsRepository;

    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public ProductsService() {

    }

    public void addProduct(Product product) {
        productsRepository.addProduct(product);
    }

    public void deleteProductById(int id) {
        productsRepository.deleteProductById(id);
    }

    public List<Product> getAllProducts() {
        return productsRepository.findAllProducts();
    }

    public Product getProductById(int id) {
        return productsRepository.findOneProductById(id);
    }

}
