package com.geekbrains.geekmarket.services;

import com.geekbrains.geekmarket.entities.Product;
import com.geekbrains.geekmarket.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        Page<Product> pr = productRepository.findAll(PageRequest.of(0,5));
        System.out.println(pr);
        return pr.stream().collect(Collectors.toList());
    }

    public Product getProductById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            return product.get();
        }
        return null;
    }

    public List<Product> getProductsByCostBetween(double min, double max) {
        List<Product> products = productRepository.findAllByCostBetween(min, max);
        return products;
    }

    public List<Product> getProductsByMinCost(double min) {
        List<Product> products = productRepository.findAllByMinCost(min);
        return products;
    }

    public List<Product> getProductsByMaxCost(double max) {
        List<Product> products = productRepository.findAllByMaxCost(max);
        return products;
    }

}
