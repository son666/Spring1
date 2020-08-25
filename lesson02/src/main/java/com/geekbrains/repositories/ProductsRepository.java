package com.geekbrains.repositories;

import com.geekbrains.entites.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsRepository {

    private int countProduct = 0;
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        if (products.isEmpty()) {
            product.setId(countProduct);
        } else {
            product.setId(++countProduct);
        }
        products.add(product);
    }

    public void deleteProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
            }
        }
    }


    public List<Product> findAllProducts() {
        return products;
    }

    public Product findOneProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
