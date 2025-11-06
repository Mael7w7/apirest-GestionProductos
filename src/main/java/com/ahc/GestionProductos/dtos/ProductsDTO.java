package com.ahc.GestionProductos.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class ProductsDTO {
    private String name;
    private BigDecimal price;
    private Integer stock;

}
