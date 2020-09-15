package com.geekbrains.geekmarket.services;

import com.geekbrains.geekmarket.entities.*;
import com.geekbrains.geekmarket.repositories.OrderRepository;
import com.geekbrains.geekmarket.repositories.OrderStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private OrderRepository orderRepository;
    private OrderStatusRepository orderStatusRepository;

    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Autowired
    public void setOrderStatusRepository(OrderStatusRepository orderStatusRepository) {
        this.orderStatusRepository = orderStatusRepository;
    }

    public Order createOrderFromItems(User user, List<OrderItem> items) {

        Optional<OrderStatus> orderStatus = orderStatusRepository.findById(1L);
        Date curentDate = new Date();
        Order order = new Order();
        order.setItems(new ArrayList<>());
        order.setUser(user);
        order.setStatus(orderStatus.get());
        order.setCreateDate(curentDate);
        items.stream().forEach(item -> {
            order.getItems().add(item);
            item.setOrder(order);
        });
        items.clear();
        return orderRepository.save(order);
    }

}
