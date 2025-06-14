package com.proyecto.tfg.Dto.In;


public class UsuarioIn {
		
    private Long id;

    private String quien;
    
    private boolean activo;
    
	private String nombre;
	
	private String apellidos;
	
	private String dni;
	
	private String telf;
	
	private String direccion;
	
	private String email;
	
	private String usuario;
	
	private String clave;
	
	private byte[] imagen;
	
	private Long id_perfil;

	public UsuarioIn() {}

	public UsuarioIn(Long id, String quien, boolean activo, String nombre, String apellidos, String dni, String telf,
			String direccion, String email, String usuario, String clave, byte[] imagen, Long id_perfil) {
		this.id = id;
		this.quien = quien;
		this.activo = activo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telf = telf;
		this.direccion = direccion;
		this.email = email;
		this.usuario = usuario;
		this.clave = clave;
		this.imagen = imagen;
		this.id_perfil = id_perfil;
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

	public Long getId_perfil() {
		return id_perfil;
	}

	public void setId_perfil(Long id_perfil) {
		this.id_perfil = id_perfil;
	}

	public Long getId() {
		return id;
	}
	
}
