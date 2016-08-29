package com.daf.juego.dto;

import javax.validation.constraints.Pattern;

public class DatosUsuario {
	
	@Pattern(regexp="(^[a-zA-z]{5,10}$)",message="El nombre no puede tener menos de 5 caracteres ni numeros") 
	private String nombre;
	@Pattern(regexp="(^[\\w]{5,10}$)",message="La clave no puede tener menos de 5 caracteres")
	private String clave;
	
	public DatosUsuario() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
}
