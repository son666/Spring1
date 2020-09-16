package com.geekbrains.geekmarket.controllers;

import com.geekbrains.geekmarket.entities.User;
import com.geekbrains.geekmarket.services.OrderService;
import com.geekbrains.geekmarket.services.ShoppingCartService;
import com.geekbrains.geekmarket.services.UserServiceImpl;
import com.geekbrains.geekmarket.utils.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
@RequestMapping("/shop/order")
public class OrderController {

    private OrderService orderService;
    private UserServiceImpl userService;
    private ShoppingCartService shoppingCartService;

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @Autowired
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Autowired
    public void setShoppingCartService(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/create_order")
    public String createOrder(Principal principal, HttpServletRequest httpServletRequest) {
        User user = userService.findByUserName(principal.getName());
        orderService.createOrderFromItems(user, shoppingCartService.getCurrentCart(httpServletRequest.getSession()).getItems());
        return "redirect:/shop";
    }


}
