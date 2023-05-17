package com.cinema.globant.Productmicroservices.controllers;
import com.cinema.globant.Productmicroservices.entities.EntityProduct;
import com.cinema.globant.Productmicroservices.services.ServicesProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
public class ControllerProduct {
    @Autowired
    private ServicesProduct servicesProduct;

    @GetMapping
    private ResponseEntity<ArrayList<EntityProduct>> getAllProduct(){
        return new ResponseEntity(servicesProduct.getProduct(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    private ResponseEntity<Optional<EntityProduct>> getProductByid(@PathVariable("id") long id){
        return new ResponseEntity(servicesProduct.getProductById(id),HttpStatus.OK) ;
    }

    @PostMapping
    public ResponseEntity<EntityProduct> saveProduct(@RequestBody EntityProduct product){
        return new ResponseEntity(servicesProduct.saveProduct(product),HttpStatus.CREATED);
    }

    @PutMapping
    public void modificarProduct(@RequestBody EntityProduct product){
        servicesProduct.modificarProduct(product);
    }

    @DeleteMapping
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<EntityProduct> DeleteProduct(@PathVariable long id){
        this.servicesProduct.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}
