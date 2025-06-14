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
@Table(name="usuarios")
@NoArgsConstructor
@AllArgsConstructor
public class Usuario extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "El campo nombre no puede estar vacío")
	private String nombre;
	
	@NotEmpty(message = "El campo apellidos no puede estar vacío")
	private String apellidos;
	
	@NotEmpty(message = "El campo dni no puede estar vacío")
	private String dni;
	
	@NotEmpty(message = "El campo teléfono no puede estar vacío")
	private String telf;
	
	@NotEmpty(message = "El campo dirección no puede estar vacío")
	private String direccion;
	
	@NotEmpty(message = "El campo email no puede estar vacío")
	private String email;
	
	@NotEmpty(message = "El campo usuario no puede estar vacío")
	private String usuario;
	
	@NotEmpty(message = "El campo clave no puede estar vacío")
	private String clave;
	
	@Lob
	private byte[] imagen;
	
	@ManyToOne
    @JoinColumn(name = "perfiles_id", referencedColumnName = "id")
	private Perfil perfil;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelf() {
		return telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}


}
