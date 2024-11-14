package com.ciber.entity.service;

import java.util.List;

import com.ciber.entity.Usuario;

public interface UsuarioService {
	
	public List<Usuario> findAll();
	public Usuario insertaUsuario(Usuario usuario);
	//public abstract Usuario login(Usuario bean);

}
