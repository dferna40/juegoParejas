package com.daf.juego.dto;
// Generated 31-ago-2016 22:22:37 by Hibernate Tools 5.1.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Usuarios generated by hbm2java
 */
@Entity
@Table(name = "T_USUARIOS", catalog = "juegobd")
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

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID", unique = true, nullable = false)
	public int getIdusuarios() {
		return this.idusuarios;
	}

	public void setIdusuarios(int idusuarios) {
		this.idusuarios = idusuarios;
	}

	@Column(name = "NOMBRE", length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "CLAVE", length = 45)
	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Column(name = "EMAIL", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
