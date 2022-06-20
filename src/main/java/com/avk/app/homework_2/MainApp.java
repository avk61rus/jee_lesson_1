package com.avk.app.homework_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CartService cartService = context.getBean(CartService.class);
//        System.out.println(cartService.getCurrentCart());


        for (long id = 1; 6 < id; id++) cartService.addToCartByProductId (id);

        System.out.println(cartService.getCurrentCart());

        ProductRepository productRepository = context.getBean(ProductRepository.class);
        System.out.println(productRepository);


        Product product = context.getBean(Product.class);
        System.out.println(product);

        context.close();
    }


}
