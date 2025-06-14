package com.proyecto.tfg.Dto.Out;


public class UsuarioOut {
	
	private Long id;
    
	private String nombre;
	
	private String apellidos;
	
	private String dni;
	
	private String telf;
	
	private String direccion;
	
	private String email;
	
	private String usuario;
	
	private byte[] imagen;
	
	private String perfil;
	
	public UsuarioOut() {}

	public UsuarioOut(Long id, String nombre, String apellidos, String dni, String telf, String direccion, String email,
			String usuario, byte[] imagen, String perfil) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telf = telf;
		this.direccion = direccion;
		this.email = email;
		this.usuario = usuario;
		this.imagen = imagen;
		this.perfil = perfil;
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

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public Long getId() {
		return id;
	}

	
	
}
