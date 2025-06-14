package com.proyecto.tfg.Dto.In;

public class VentaProductoIn {

	private Long id_producto;
	
	private int cantidad;

	private double precio;
	
	public VentaProductoIn() {}

	public VentaProductoIn(Long id_producto, int cantidad, double precio) {
		this.id_producto = id_producto;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Long getId_producto() {
		return id_producto;
	}

	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
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

	
	
}
