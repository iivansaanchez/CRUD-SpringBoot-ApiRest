package com.java.product.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.product.persistance.models.Product;
import com.java.product.services.ProductServiceI;

@RestController
@RequestMapping("api/v1/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductServiceI productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.showAllProduct();
    }

    @GetMapping("productName/{productName}")
    public Product getProductByName(@PathVariable String productName){
        return productService.showProductByProductName(productName);
    }

    @PostMapping("/insertProduct")
    public String postProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return "Añadido con Exito";
    }

    @PutMapping("/edit/{id}")
    public String editProduct(@PathVariable Integer id, @RequestBody Product product){
        productService.updateProduct(id, product);
        return "Editado con Exito";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
        return "Borrado con exito";
    }
    

    
}
