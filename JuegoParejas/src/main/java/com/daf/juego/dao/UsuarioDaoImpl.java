package com.daf.juego.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.daf.juego.dto.Usuario;

@Repository("usuarioDao")
public class UsuarioDaoImpl extends AbstractDao<Integer, Usuario> implements UsuarioDao{

	@Override
	public Usuario findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUsuarioById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> findAllUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findUsuarioByName(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
