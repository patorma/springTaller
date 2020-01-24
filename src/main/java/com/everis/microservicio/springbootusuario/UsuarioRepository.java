package com.everis.microservicio.springbootusuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	List<Usuario> findByUsername(String username);

}
