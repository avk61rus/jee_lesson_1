package com.avk.app.homework_2;

import org.springframework.stereotype.Component;

@Component
public class Product {
   private Long id;
   private String name;
   private Long cost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }
    public Product() {
    }
    public Product(long id, String name, long cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;

    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}





