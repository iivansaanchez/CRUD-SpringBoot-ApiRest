package com.java.product.services;

import java.util.List;

import com.java.product.persistance.models.Product;


public interface ProductServiceI {
    //Aqui vamos a crear los metodos principales para usarlos luego en el controller
    
    //Extraemos todos los productos
    List<Product> showAllProduct();
    
    //Consultamos un producto por su nombre
    Product  showProductByProductName(String product_name);
    
    //Crear un nuevo producto
    void saveProduct(Product product);
    
    //Actualizar un proyecto por su id
    void updateProduct(Integer id, Product product);
    
    //Borrar un producto por su id
    void deleteProduct(Integer id);   
} 
    

