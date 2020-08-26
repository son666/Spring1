package com.geekbrains.hibernate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "cost")
    private Double cost;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }

    //(fetch = FetchType.LAZY)
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "buyers_products",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "buyer_id")
    )
    private List<Buyer> buyers;
    public List<Buyer> getReaders() {
        return buyers;
    }
    public void setReaders(List<Buyer> buyers) {
        this.buyers = buyers;
    }


    @Override
    public String toString() {
        String allBuyers = "";
        for (Buyer buyer : buyers) {
            allBuyers += buyer.getName() + " | ";
        }
        return "Продукт: " + id + " " + title + " " + cost + "\nПокупатели данного продукта: " + allBuyers;
    }

}