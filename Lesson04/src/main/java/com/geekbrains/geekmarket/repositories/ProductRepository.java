package com.geekbrains.geekmarket.repositories;

import com.geekbrains.geekmarket.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

    List<Product> findAll();

    List<Product> findAllByCostBetween(double min, double max);

    @Query(value ="SELECT * FROM products WHERE cost >=?1", nativeQuery = true)
    List<Product> findAllByMinCost(double min);

    @Query(value ="SELECT * FROM products WHERE cost <=?1", nativeQuery = true)
    List<Product> findAllByMaxCost(double max);

}
