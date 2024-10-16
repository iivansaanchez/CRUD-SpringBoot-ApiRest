package com.java.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.product.persistance.models.Product;
import com.java.product.persistance.repository.ProductRepositoryI;

@Service
public class ProductServiceImp implements ProductServiceI {

    @Autowired
    //Llamamos al Repository ya que ahi tenemos todas las consultas necesarias para completar estos metodos
    ProductRepositoryI productRepository;

    @Override
    public List<Product> showAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product showProductByProductName(String product_name) {
        return productRepository.findByName(product_name);
    }


    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void updateProduct(Integer id, Product product) {
        product.setId(id);
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }
    
}
