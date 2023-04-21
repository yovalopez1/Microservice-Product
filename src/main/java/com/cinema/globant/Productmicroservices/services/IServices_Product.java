package com.cinema.globant.Productmicroservices.services;

import com.cinema.globant.Productmicroservices.entities.EntityProduct;

import java.util.ArrayList;
import java.util.Optional;

public interface IServices_Product {

    ArrayList<EntityProduct> getProduct();
    Optional<EntityProduct>getProductById(long id);
    EntityProduct saveProduct(EntityProduct product);
    boolean deleteProduct(long id);

}
