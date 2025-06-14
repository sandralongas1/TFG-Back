package com.proyecto.tfg.Entity;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="subcategorias")
@NoArgsConstructor
@AllArgsConstructor
public class Subcategoria extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message = "El campo descripción no puede estar vacío")
	private String descripcion;
	
	@ManyToOne
    @JoinColumn(name = "categorias_id", referencedColumnName = "id")
	private Categoria categoria;

	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	
	
}
