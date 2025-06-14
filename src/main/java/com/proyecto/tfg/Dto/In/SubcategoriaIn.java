package com.proyecto.tfg.Dto.In;


public class SubcategoriaIn {
		
    private Long id;

    private String quien;
    
    private boolean activo;
	
	private String descripcion;
	
	private Long id_categoria;
	
	public SubcategoriaIn() {}

	public SubcategoriaIn(Long id, String quien, boolean activo, String descripcion, Long id_categoria) {
		this.id = id;
		this.quien = quien;
		this.activo = activo;
		this.descripcion = descripcion;
		this.id_categoria = id_categoria;
	}

	public Long getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getQuien() {
		return quien;
	}

	public void setQuien(String quien) {
		this.quien = quien;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}

	
	
	
}
