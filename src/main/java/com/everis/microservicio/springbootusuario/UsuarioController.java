package com.everis.microservicio.springbootusuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
	
	//se dispone de todo lo que existe en repository para que lo use el controlador
	@Autowired
	private UsuarioRepository usuarioRepo;
	
	@Autowired
	private UsuarioService usuarioService;
//	
//	public List<Usuario> listAll() {
//		
//		return usuarioRepo.findAll();
//	}
//	
//	public List<Usuario>findAllById(Iterable<Long> id){
//		
//		return usuarioRepo.findAllById(id);
//	}
//	

	@GetMapping("/hola")
	public String holaMundo() {
		usuarioService.listarUsuarios();
		return "Hola Mundo";
	}
	@GetMapping("/usuarios")
	public List<Usuario> listAll() {
		
		return usuarioRepo.findAll();
	}
	
	@GetMapping("/usuarios/{username}")
	public List<Usuario> findByUsername(@PathVariable("username") String username){
		
		return usuarioRepo.findByUsername(username);
	}
	
	
	

}
