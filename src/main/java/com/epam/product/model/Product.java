/*
 author Anastasiya
 created on 12/07/2021
 */


package com.epam.product.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private  String name;
    private  String description;
    private  double price;
    private  double discount;
    private  String discountName;
    private  double grandTotal;

    public double getGrandTotal() {
        return price - (price*discount/100);
    }

    public void setGrandTotal() {
        this.grandTotal = price - (price*discount/100);
    }

    private  Client client;

}
