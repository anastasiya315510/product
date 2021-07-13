/*
 author Anastasiya
 created on 13/07/2021
 */


package com.epam.product.model;

import lombok.*;

@Getter
@Setter
@Builder
public class SilverClient extends Client {

    @Override
    public double getDiscount(Product product) {
        if(product.getDiscount()>5) return product.getDiscount();
        return 5.0;
    }

    @Override
    public String getDiscountName(Product product) {
         if(product.getDiscount()>5.0)return product.getDiscountName();
         return Type.SILVER.toString();
    }


}
