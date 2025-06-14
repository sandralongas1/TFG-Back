package com.proyecto.tfg.Dto.Out;


public class SubcategoriaOut {
	
    private Long id;
	
	private String descripcion;
	
	private String categoria;
	
	public SubcategoriaOut() {}

	public SubcategoriaOut(Long id, String descripcion, String categoria) {
		this.id = id;
		this.descripcion = descripcion;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
