package com.cinema.globant.Productmicroservices.controllers;
import com.cinema.globant.Productmicroservices.entities.EntityProduct;
import com.cinema.globant.Productmicroservices.services.ServicesProduct;
import org.springframework.beans.factory.annotation.Autowired;
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
    private ArrayList<EntityProduct> getAllProduct(){
        return servicesProduct.getProduct();
    }
    @GetMapping("/{id}")
    private Optional<EntityProduct> getProductByid(@PathVariable("id") long id){
        return servicesProduct.getProductById(id);
    }

    @PostMapping
    public EntityProduct saveProduct(@RequestBody EntityProduct product){
        return  servicesProduct.saveProduct(product);
    }

 /*   @DeleteMapping
    public String deleteProduct(@PathVariable("id")long id){
     if (servicesProduct.deleteProduct(id)){
         return "se borro el producto"+ HttpStatus.OK;
     }else {
         return "No se logro borrar el producto";
     }
    }*/

    @DeleteMapping
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<EntityProduct> DeleteProduct(@PathVariable long id){
        this.servicesProduct.deleteProduct(id);
        return ResponseEntity.ok().build();
    }
}
