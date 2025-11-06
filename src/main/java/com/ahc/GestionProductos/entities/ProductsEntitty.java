package com.ahc.GestionProductos.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name="products")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class ProductsEntitty {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idProduct;

    private String name;
    private BigDecimal price;
    private Integer stock;



}
