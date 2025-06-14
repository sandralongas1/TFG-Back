package com.proyecto.tfg.Entity;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="venta_producto")
@NoArgsConstructor
@AllArgsConstructor
public class Venta_Producto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
    private VentaProductoId id;

	@ManyToOne
	@MapsId("ventaId") // hace referencia al campo de la clave embebida
    @JoinColumn(name = "ventas_id")
	private Venta venta;
	
	@ManyToOne
	@MapsId("productoId") // hace referencia al campo de la clave embebida
    @JoinColumn(name = "productos_id")
	private Producto producto;
	
	private int cantidad;
	
	private double precio;

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public VentaProductoId getId() {
		return id;
	}

	public void setId(VentaProductoId id) {
		this.id = id;
	}
	
	
}
