package com.daf.juego.dao;

import java.util.List;

import com.daf.juego.dto.Usuario;

public interface UsuarioDao {
	
	Usuario findById(int id);
	void saveUsuario(Usuario usuario);
	void deleteUsuarioById(int id);
	List<Usuario> findAllUsuarios();
	Usuario findUsuarioByName(String nombre);

}
