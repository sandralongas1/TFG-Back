package com.proyecto.tfg.Entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="productos")
@NoArgsConstructor
@AllArgsConstructor
public class Producto extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "El campo título no puede estar vacío")
	private String titulo;
	
	@NotEmpty(message = "El campo descripción no puede estar vacío")
	private String descripcion;
	
	private double precio;
	
	private int stock;
	
	@Lob
	private byte[] imagen;
	
	@ManyToOne
    @JoinColumn(name = "subcategorias_id", referencedColumnName = "id")
	private Subcategoria subcategoria;

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

	public Subcategoria getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(Subcategoria subcategoria) {
		this.subcategoria = subcategoria;
	}


	
	
}
