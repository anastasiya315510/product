/*
 author Anastasiya
 created on 13/07/2021
 */


package com.epam.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
public class RegularClient extends Client{

    @Override
    public double getDiscount(Product product) {
        return product.getDiscount() > 0 ? product.getDiscount() : 0;
    }

    @Override
    public String getDiscountName(Product product) {
        return product.getDiscountName();
    }


}
