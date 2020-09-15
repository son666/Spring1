package com.geekbrains.geekmarket.repositories;

import com.geekbrains.geekmarket.entities.OrderStatus;
import com.geekbrains.geekmarket.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStatusRepository extends CrudRepository<OrderStatus, Long> {

    OrderStatus findOneByName(String name);
}
