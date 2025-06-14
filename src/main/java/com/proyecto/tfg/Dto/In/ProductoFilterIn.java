package com.proyecto.tfg.Dto.In;

import java.util.List;

public class ProductoFilterIn {
	
	private Long id_categoria;
	
	private String grupo;
	
	private List<Integer> subcategorias;

	public ProductoFilterIn() {}

	public ProductoFilterIn(Long id_categoria, String grupo, List<Integer> subcategorias) {
		this.id_categoria = id_categoria;
		this.grupo = grupo;
		this.subcategorias = subcategorias;
	}

	public Long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public List<Integer> getSubcategorias() {
		return subcategorias;
	}

	public void setSubcategorias(List<Integer> subcategorias) {
		this.subcategorias = subcategorias;
	}
	
}
