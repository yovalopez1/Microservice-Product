package com.cinema.globant.Productmicroservices.repositories;

import com.cinema.globant.Productmicroservices.entities.EntityProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProduct extends JpaRepository<EntityProduct, Long> {
}
