package com.proyecto.tfg.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.tfg.Dto.In.VentaProductoIn;
import com.proyecto.tfg.Entity.Producto;
import com.proyecto.tfg.Entity.Venta;
import com.proyecto.tfg.Entity.VentaProductoId;
import com.proyecto.tfg.Entity.Venta_Producto;

import jakarta.persistence.EntityManager;

@Component
public class VentaProductoMapper {

	@Autowired
	EntityManager entityManager;
	
	public Venta_Producto mapToVentaProducto(VentaProductoIn ventaProductoIn, Venta venta) {
		Venta_Producto vp = new Venta_Producto();
		vp.setCantidad(ventaProductoIn.getCantidad());
		vp.setPrecio(ventaProductoIn.getPrecio());
		
		Producto producto = entityManager.getReference(Producto.class, ventaProductoIn.getId_producto());
		vp.setProducto(producto);
		
		vp.setVenta(venta);
		
		VentaProductoId id = new VentaProductoId(ventaProductoIn.getId_producto(), venta.getId());
		vp.setId(id);
        
        return vp;
    }
	
}