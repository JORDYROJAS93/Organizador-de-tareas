package com.ciber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ciber.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	
	//Consulta para validar login 
	//@Query("Select x from Usuario x where x.login = :#{#usu.login} and x.password = :#{#usu.password}")
	//public abstract Usuario login(@Param(value = "usu") Usuario bean);

}
