package com.daf.juego.hibernate;
// Generated 31-ago-2016 20:51:01 by Hibernate Tools 5.1.0.Beta1

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios implements java.io.Serializable {

	private int idusuarios;
	private String nombre;
	private String clave;
	private String email;

	public Usuarios() {
	}

	public Usuarios(int idusuarios) {
		this.idusuarios = idusuarios;
	}

	public Usuarios(int idusuarios, String nombre, String clave, String email) {
		this.idusuarios = idusuarios;
		this.nombre = nombre;
		this.clave = clave;
		this.email = email;
	}

	public int getIdusuarios() {
		return this.idusuarios;
	}

	public void setIdusuarios(int idusuarios) {
		this.idusuarios = idusuarios;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
