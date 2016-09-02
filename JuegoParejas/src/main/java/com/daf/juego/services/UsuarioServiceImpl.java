package com.daf.juego.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daf.juego.dao.UsuarioDao;
import com.daf.juego.dto.Usuario;

@Service("usuarioService")
@Transactional
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioDao dao;
	
	@Override
	public Usuario findById(int id) {
		return dao.findById(id);
	}

	@Override
	public void saveUsuario(Usuario usuario) {
		dao.saveUsuario(usuario);
	}
	
	public void updateUsuario(Usuario usuario) {
		Usuario entity = dao.findById(usuario.getIdusuario());
		if(entity != null) {
			entity.setNombre(usuario.getNombre());
			entity.setClave(usuario.getClave());
			entity.setEmail(usuario.getEmail());
		}
	}

	@Override
	public void deleteUsuarioById(int id) {
		dao.deleteUsuarioById(id);
	}

	@Override
	public List<Usuario> findAllUsuarios() {
		return dao.findAllUsuarios();
	}

	@Override
	public Usuario findUsuarioByName(String nombre) {
		return dao.findUsuarioByName(nombre);
	}

}
