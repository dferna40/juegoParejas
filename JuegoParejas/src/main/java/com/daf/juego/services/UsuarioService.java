package com.daf.juego.services;

import java.util.List;

import com.daf.juego.dto.Usuario;

public interface UsuarioService {

	Usuario findById(int id);
	void saveUsuario(Usuario usuario);
	void deleteUsuarioById(int id);
	List<Usuario> findAllUsuarios();
	Usuario findUsuarioByName(String nombre);
}
