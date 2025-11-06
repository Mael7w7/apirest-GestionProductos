package com.ahc.GestionProductos.controller;

import com.ahc.GestionProductos.dtos.ProductsDTO;
import com.ahc.GestionProductos.entities.ProductsEntitty;
import com.ahc.GestionProductos.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor

public class ProductController {

    //inyection dependency
    private final ProductService productService;

    @PostMapping
    ProductsEntitty createProduct(@RequestBody ProductsEntitty product) {
        return productService.addProduct(product);

    }

    @GetMapping
    List<ProductsDTO> getAllProducts() {
        return productService.getAllProducts();
    }
    @PutMapping("/{id}")
    ProductsDTO updateProduct(@PathVariable Long id,@RequestBody ProductsDTO product) {
        return productService.updateProduct(id,product);
    }

    @GetMapping("/{id}")
    ProductsDTO getProduct( @PathVariable Long id) {
        return productService.getProductById(id);
    }


    @DeleteMapping("/{id}")
    void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }




}
