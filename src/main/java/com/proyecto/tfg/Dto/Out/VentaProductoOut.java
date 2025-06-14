package com.proyecto.tfg.Dto.Out;


public class VentaProductoOut {
	
	private String titulo;
	
	private int cantidad;
	
	private double precio;
	
	public VentaProductoOut() {}

	public VentaProductoOut(String titulo, int cantidad, double precio) {
		this.titulo = titulo;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
