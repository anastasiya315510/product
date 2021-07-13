/*
 author Anastasiya
 created on 13/07/2021
 */


package com.epam.product.model;

import lombok.*;

@Getter
@Setter
@Builder
public class GoldClient extends Client {

    @Override
    public double getDiscount(Product product) {
        return product.getDiscount() +10.0;
    }

    @Override
    public String getDiscountName(Product product) {
        if(product.getDiscount()==0.0) return Type.GOLDEN.toString();
        return product.getDiscountName()+" "+Type.GOLDEN;
    }


}
