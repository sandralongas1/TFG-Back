package com.proyecto.tfg.Dto.In;


public class CategoriaIn {
		
    private Long id;

    private String quien;
    
    private boolean activo;
	
	private String descripcion;
	
	private String grupo;

	public CategoriaIn() {}

	public CategoriaIn(Long id, String quien, boolean activo, String descripcion, String grupo) {
		this.id = id;
		this.quien = quien;
		this.activo = activo;
		this.descripcion = descripcion;
		this.grupo = grupo;
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

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	
}
