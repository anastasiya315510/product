/*
 author Anastasiya
 created on 13/07/2021
 */


package com.epam.product.service;

import com.epam.product.model.Product;
import com.epam.product.model.Response;

public interface DiscountHandler {

    Response countDiscount(Product product);

}
