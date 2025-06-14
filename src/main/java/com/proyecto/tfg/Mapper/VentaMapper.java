package com.proyecto.tfg.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.tfg.Dto.In.VentaIn;
import com.proyecto.tfg.Entity.Estado;
import com.proyecto.tfg.Entity.Usuario;
import com.proyecto.tfg.Entity.Venta;

import jakarta.persistence.EntityManager;

@Component
public class VentaMapper {

	@Autowired
	EntityManager entityManager;
	
	public Venta mapToVenta(VentaIn ventaIn, Estado estado) {
    	Venta venta = new Venta();
    	venta.setQuien(ventaIn.getQuien());
        venta.setQuienEdita(ventaIn.getQuien());
        venta.setActivo(true);
        venta.setEstado(estado);
        venta.setFechaEntrega(ventaIn.getFechaEntrega());
        venta.setTotalPrecio(ventaIn.getTotalPrecio());
            
        Usuario usuario = entityManager.getReference(Usuario.class, ventaIn.getId_usuario());
        venta.setUsuario(usuario);
            
        return venta;
    }
	
}