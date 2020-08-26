package com.geekbrains.hibernate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "buyers")
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "buyers_products ",
            joinColumns = @JoinColumn(name = "buyer_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Product> getBooks() {
        return products;
    }
    public void setBooks(List<Product> products) {
        this.products = products;
    }

    public Buyer() {
    }

    @Override
    public String toString() {
        String allProducts = "";
        for (Product product : products) {
            allProducts += product.getTitle() + " | ";
        }
        return "Покупатель: " + id + " " + name + "\nКупленные товары: " + allProducts;
    }
}