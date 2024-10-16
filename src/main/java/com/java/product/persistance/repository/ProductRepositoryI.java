package com.java.product.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.product.persistance.models.Product;
@Repository
public interface ProductRepositoryI extends JpaRepository<Product, Integer>{
    /*
    JpaRepository trae por defecto las funcionalidades básicas de CRUD, en este archivo
    añadiremos funciones extra para obtener valores determinados segun lo que necesitemos
    */

    Product findByName(String product_name);
}
