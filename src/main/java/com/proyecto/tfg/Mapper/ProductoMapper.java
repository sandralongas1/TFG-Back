package com.proyecto.tfg.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.tfg.Dto.In.ProductoIn;
import com.proyecto.tfg.Entity.Producto;
import com.proyecto.tfg.Entity.Subcategoria;

import jakarta.persistence.EntityManager;

@Component
public class ProductoMapper {

	@Autowired
	EntityManager entityManager;
	
	public Producto mapToProducto(Producto producto, ProductoIn productoIn) {
        if (producto == null) {
            producto = new Producto();
            producto.setQuien(productoIn.getQuien());
        }

        producto.setQuienEdita(productoIn.getQuien());
        producto.setActivo(productoIn.isActivo());
        producto.setTitulo(productoIn.getTitulo());
        producto.setDescripcion(productoIn.getDescripcion());
        producto.setPrecio(productoIn.getPrecio());
        producto.setStock(productoIn.getStock());
        producto.setImagen(productoIn.getImagen());
        
        Subcategoria subcategoria = entityManager.getReference(Subcategoria.class, productoIn.getId_subcategoria());
        producto.setSubcategoria(subcategoria);

        return producto;
    }
	
}