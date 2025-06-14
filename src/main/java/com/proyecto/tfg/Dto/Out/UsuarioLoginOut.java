package com.proyecto.tfg.Dto.Out;


public class UsuarioLoginOut {

	private Long id;
	private String usuario;
	private String nombre;
	private String apellidos;
	private String perfil;
	
	public UsuarioLoginOut() {}

	public UsuarioLoginOut(Long id, String usuario, String nombre, String apellidos, String perfil) {
		this.id = id;
		this.usuario = usuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.perfil = perfil;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
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
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
}
