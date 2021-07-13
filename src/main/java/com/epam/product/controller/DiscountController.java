/*
 author Anastasiya
 created on 13/07/2021
 */


package com.epam.product.controller;

import com.epam.product.model.Client;
import com.epam.product.model.Product;
import com.epam.product.model.Response;
import com.epam.product.service.DiscountHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscountController {
    @Autowired
    DiscountHandler discountHandler;

    @GetMapping("/discount")
    Response countDiscount(@RequestBody Product product){
        return discountHandler.countDiscount(product);
    }

}
