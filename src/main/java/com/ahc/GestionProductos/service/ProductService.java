package com.ahc.GestionProductos.service;

import com.ahc.GestionProductos.dtos.ProductsDTO;
import com.ahc.GestionProductos.entities.ProductsEntitty;
import com.ahc.GestionProductos.respositories.ProductsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductService implements IProductService{

    //inyection dependency
    private final ProductsRepository productsRepository;

    @Override
    public ProductsEntitty addProduct(ProductsEntitty product) {
        return productsRepository.save(product);
    }


    @Override
    public List<ProductsDTO> getAllProducts() {

        return productsRepository.findAll()
                .stream()
                .map(r-> new ProductsDTO(r.getName(),r.getPrice(),r.getStock()))
                .collect(Collectors.toList());

    }


    @Override
    public ProductsDTO getProductById(Long id) {
        return productsRepository.findById(id)
                .map(r-> new ProductsDTO(r.getName(),r.getPrice(),r.getStock()))
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public ProductsDTO updateProduct(Long id, ProductsDTO product) {
                    return productsRepository.findById(id)
                            .map(existingProduct->{
                                existingProduct.setName(product.getName());
                                existingProduct.setPrice(product.getPrice());
                                existingProduct.setStock(product.getStock());
                                ProductsEntitty update = productsRepository.save(existingProduct);
                                return new ProductsDTO(
                                        update.getName(),
                                        update.getPrice(),
                                        update.getStock()
                                );
                            })
                            .orElse(null);

    }


    @Override
    public void deleteProduct(Long id) {
        productsRepository.deleteById(id);

    }
}
