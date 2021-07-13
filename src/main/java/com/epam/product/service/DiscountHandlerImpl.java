/*
 author Anastasiya
 created on 14/07/2021
 */


package com.epam.product.service;

import com.epam.product.model.Product;
import com.epam.product.model.Response;
import org.springframework.stereotype.Service;

@Service
public class DiscountHandlerImpl implements DiscountHandler {
    @Override
    public Response countDiscount(Product product) {
        if(product.getClient()==null) {
            return Response.builder()
                    .discount(product.getDiscount())
                    .description(product.getDescription())
                    .name(product.getName())
                    .discountName(product.getDiscountName())
                    .grandTotal(calculate(product.getPrice(),
                            product.getDiscount()))
                    .price(product.getPrice())
                    .build();
        }
            return Response.builder()
            .discount(product.getClient().getDiscount(product))
            .description(product.getDescription())
            .name(product.getName())
            .discountName(product.getClient().getDiscountName(product))
            .grandTotal(calculate(product.getPrice(),
                    product.getClient().getDiscount(product)))
            .price(product.getPrice())
            .build();
    }

    private double calculate(double price, double discount) {
        return price - ((price*discount)/100) ;
    }

}
