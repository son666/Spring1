package com.geekbrains.controllers;

import com.geekbrains.entites.Product;
import com.geekbrains.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ProductsController {
    private ProductsService productsService;

    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }


    @RequestMapping("/")
    public String showProducts(Model uiModel, @ModelAttribute("product") Product product) {
        uiModel.addAttribute("products", productsService.getAllProducts());
        return "products";
    }

//
    @RequestMapping(path = "/showProductById", method = RequestMethod.GET)
    public String showProductById(Model uiModel, @RequestParam int id) {
        Product product = productsService.getProductById(id);
        uiModel.addAttribute("product", product);
        return "viewproduct";
    }

    @RequestMapping(path = "/showProductById/{sid}", method = RequestMethod.GET)
    @ResponseBody
    public Product showProductById(@PathVariable("sid") int id) {
        Product product = productsService.getProductById(id);
        return product;
    }

    @RequestMapping("/showFormAddProduct")
    public String showFormAddProduct(Model uiModel) {
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "product-form";
    }

    @RequestMapping("/addProduct")
    public String addProduct(@ModelAttribute("product") Product product) {
        productsService.addProduct(product);
        return "redirect:/";
    }

    @RequestMapping(path = "/deleteProduct", method = RequestMethod.GET)
    public String deleteProduct(Model uiModel, @RequestParam int id) {
        productsService.deleteProductById(id);
        return "redirect:/";
    }


}
