package com.cinema.globant.Productmicroservices.services;

import com.cinema.globant.Productmicroservices.entities.EntityProduct;
import com.cinema.globant.Productmicroservices.repositories.RepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ServicesProduct implements IServices_Product {

    @Autowired
    RepositoryProduct repositoryProduct;


    public ArrayList<EntityProduct> getProduct() {
        return (ArrayList<EntityProduct>) repositoryProduct.findAll();
    }

    public Optional<EntityProduct> getProductById(long id) {
        return repositoryProduct.findById(id);
    }

    public EntityProduct saveProduct(EntityProduct product) {
        return repositoryProduct.save(product);
    }

    public void modificarProduct(EntityProduct product){
        repositoryProduct.save(product);
    }

    public boolean deleteProduct(long id) {
       try {
           Optional<EntityProduct>product=getProductById(id);
           repositoryProduct.delete(product.get());
           return true;
       }catch (Exception e){
           e.printStackTrace(System.out);
       }
       return false;
    }
}
