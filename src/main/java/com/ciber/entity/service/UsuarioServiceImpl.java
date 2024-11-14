package com.ciber.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciber.entity.Usuario;
import com.ciber.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario insertaUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(usuario);
	}

	//@Override
	//public Usuario login(Usuario bean) {
		// TODO Auto-generated method stub
		//return usuarioRepository.login(bean);
	//}

}
