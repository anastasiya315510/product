/*
 author Anastasiya
 created on 13/07/2021
 */


package com.epam.product.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    private String name;
    private String description;
    private double price;
    private double discount;
    private String discountName;
    private double grandTotal;//price - discount

}
