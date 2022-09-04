package com.avk.app.homework_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CartService {
    private ProductRepository productRepository;
     private Cart cart;

    @Autowired
    public CartService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public CartService(Cart cart) {this.cart = cart;}

    @PostConstruct
    public void init() {
        this.cart = new Cart();
    }
    public void addToCartByProductId(long productId) {
        Product product = productRepository.findById(productId).get();
        cart.add(product);
    }
    public Cart getCurrentCart() {
        return cart;
    }



        public void addToCartByProductId(Long productId) {
//        for (int id = 1; 6 < id; id++) {
            Product product = productRepository.findById(productId).get();
            cart.add(product);
//        }
    }
//    public void clearCurrentCart() {
//        cart.clear();
//    }

//    public void removeFromCart(String productName) {
//        cart.removeByName(productName);
//    }
}
