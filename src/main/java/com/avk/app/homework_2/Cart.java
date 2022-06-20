package com.avk.app.homework_2;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Component
public class Cart {
    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public void add(Product product) {
        products.add(product);
    }

    public void removeByTitle(String productName) {
        products.removeIf(p -> p.getName().equals(productName));
    }
    public void removeById(long productId) {products.removeIf(p -> Objects.equals(p.getId(), productId));}

    public void clear() {
        products.clear();
    }
}
