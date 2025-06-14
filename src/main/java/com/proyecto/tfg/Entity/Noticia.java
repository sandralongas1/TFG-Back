package com.proyecto.tfg.Entity;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="noticias")
@NoArgsConstructor
@AllArgsConstructor
public class Noticia extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "El campo título no puede estar vacío")
	private String titulo;
	
	@NotEmpty(message = "El campo descripción no puede estar vacío")
	private String descripcion;
	
	private int reacciones;
	
	@Lob
	private byte[] imagen;

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

	public int getReacciones() {
		return reacciones;
	}

	public void setReacciones(int reacciones) {
		this.reacciones = reacciones;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}
	
	
}
