package com.ahc.GestionProductos.service;

import com.ahc.GestionProductos.dtos.ProductsDTO;
import com.ahc.GestionProductos.entities.ProductsEntitty;

import java.util.List;

public interface IProductService {
    ProductsEntitty addProduct(ProductsEntitty product); //esto no va devolver nada solo se utilizara para registrar los datos
    List<ProductsDTO> getAllProducts();//esto se intacia con dto dado que a la hora de llamarlo solo se mostrara los datos del dto
    ProductsDTO getProductById(Long id);//esti de igual forma de instacia para traer los datos del dto
    ProductsDTO updateProduct(Long id ,ProductsDTO product); //actualiza los datos pero solo del dto
    void deleteProduct(Long id);



}
