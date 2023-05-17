package com.cinema.globant.Productmicroservices.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "products")
public class EntityProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_product;
    private String name_product;
    private String description_product;
    private String type_product;
    private String size_product;
    private int quantity_product;
    private float price_product;

    public EntityProduct(){
    }

    public EntityProduct(long id_product, String name_product, String description_product, String type_product, String size_product, int quantity_product, float price_product) {
        this.id_product = id_product;
        this.name_product = name_product;
        this.description_product = description_product;
        this.type_product = type_product;
        this.size_product = size_product;
        this.quantity_product = quantity_product;
        this.price_product = price_product;
    }

}
