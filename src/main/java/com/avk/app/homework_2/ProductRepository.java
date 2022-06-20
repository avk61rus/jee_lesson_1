package com.avk.app.homework_2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ProductRepository  {

    ArrayList<Product> products;

    public List<Product> findAll() {
        throw new UnsupportedOperationException();
    }

    public Optional<Product> findById(Long id) {
        throw new UnsupportedOperationException();
    }

    private ArrayList<Product> products() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Хлеб", 80L));
        products.add(new Product(2L, "Сыр", 180L));
        products.add(new Product(3L, "Масло", 190L));
        products.add(new Product(4L, "Рыба", 280L));
        products.add(new Product(5L, "Мясо", 215L));

        return products;
    }

}
