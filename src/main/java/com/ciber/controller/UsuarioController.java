package com.ciber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciber.entity.Usuario;
import com.ciber.entity.service.UsuarioService;

@RestController
@RequestMapping("/url/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/lista")
	public List<Usuario> getAllUsuario() {
		return  usuarioService.findAll();
	}
	
	@PostMapping("/inserta")
	public Usuario insertaUsuario(@RequestBody Usuario usuario) {
		return usuarioService.insertaUsuario(usuario);
	}

}
