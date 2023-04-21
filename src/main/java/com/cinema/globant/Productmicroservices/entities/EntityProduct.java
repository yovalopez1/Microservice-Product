package com.cinema.globant.Productmicroservices.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "product")
public class EntityProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_product;
    private String name_product;
    private String description_product;
    private String Type_product;
    private String size_product;
    private int quantity_product;
    private float price_product;

    public EntityProduct(){

    }

    public EntityProduct(long id_product, String name_product, String description_product, String type_product, String size_product, int quantity_product, float price_product) {
        this.id_product = id_product;
        this.name_product = name_product;
        this.description_product = description_product;
        Type_product = type_product;
        this.size_product = size_product;
        this.quantity_product = quantity_product;
        this.price_product = price_product;
    }

    public long getId_product() {
        return id_product;
    }

    public void setId_product(long id_product) {
        this.id_product = id_product;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public String getDescription_product() {
        return description_product;
    }

    public void setDescription_product(String description_product) {
        this.description_product = description_product;
    }

    public String getType_product() {
        return Type_product;
    }

    public void setType_product(String type_product) {
        Type_product = type_product;
    }

    public String getSize_product() {
        return size_product;
    }

    public void setSize_product(String size_product) {
        this.size_product = size_product;
    }

    public int getQuantity_product() {
        return quantity_product;
    }

    public void setQuantity_product(int quantity_product) {
        this.quantity_product = quantity_product;
    }

    public float getPrice_product() {
        return price_product;
    }

    public void setPrice_product(float price_product) {
        this.price_product = price_product;
    }
}
