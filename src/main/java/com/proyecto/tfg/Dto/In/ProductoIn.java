package com.proyecto.tfg.Dto.In;


public class ProductoIn {
		
    private Long id;

    private String quien;
    
    private boolean activo;
    
	private String titulo;
	
	private String descripcion;
	
	private double precio;
	
	private int stock;
	
	private byte[] imagen;
	
	private Long id_subcategoria;

	public ProductoIn() {}

	public ProductoIn(Long id, String quien, boolean activo, String titulo, String descripcion, double precio, int stock, byte[] imagen, Long id_subcategoria) {
		this.id = id;
		this.quien = quien;
		this.activo = activo;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.imagen = imagen;
		this.id_subcategoria = id_subcategoria;
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}


	public String getQuien() {
		return quien;
	}


	public void setQuien(String quien) {
		this.quien = quien;
	}

	public Long getId_subcategoria() {
		return id_subcategoria;
	}

	public void setId_subcategoria(Long id_subcategoria) {
		this.id_subcategoria = id_subcategoria;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
}
