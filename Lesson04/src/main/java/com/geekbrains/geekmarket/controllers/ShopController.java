package com.geekbrains.geekmarket.controllers;

import com.geekbrains.geekmarket.entities.Product;
import com.geekbrains.geekmarket.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/shop")
public class ShopController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public String shopPage(Model model) {
        List<Product> allProducts = productService.getAllProducts();
        model.addAttribute("products", allProducts);
        return "shop-page";
    }

    @RequestMapping(value = "/betweencost", method = RequestMethod.GET)
    public String getProductsByCostBetween(Model model, @RequestParam double min, @RequestParam double max){
        List<Product> allProducts = productService.getProductsByCostBetween(min, max);
        model.addAttribute("products", allProducts);
        return "shop-page";
    }

    @RequestMapping(value = "/mincost", method = RequestMethod.GET)
    public String getProductsByMinCost(Model model, @RequestParam double min){
        List<Product> allProducts = productService.getProductsByMinCost(min);
        model.addAttribute("products", allProducts);
        return "shop-page";
    }

    @RequestMapping(value = "/maxcost", method = RequestMethod.GET)
    public String getProductsByMaxCost(Model model, @RequestParam double max){
        List<Product> allProducts = productService.getProductsByMaxCost(max);
        model.addAttribute("products", allProducts);
        return "shop-page";
    }


}
