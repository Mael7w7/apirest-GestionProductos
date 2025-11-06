package com.ahc.GestionProductos.respositories;

import com.ahc.GestionProductos.entities.ProductsEntitty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<ProductsEntitty,Long> {

}
