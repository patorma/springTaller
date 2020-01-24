package com.everis.microservicio.springbootusuario;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
	
	//se dispone de todo lo que existe en repository para que lo use el controlador
	@Autowired
	private UsuarioRepository usuarioRepo;
	
	@Autowired
	private TrianguloRepository trianguloRepo;
	
	@Autowired
	private CuadradoRepository cuadradoRepo;
	
	@Autowired
	private CirculoRepository circuloRepo;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/triangulos")
	public List<Triangulo> listTriangulo(){
		
		System.out.println(usuarioService.calcularAreaTriangulo(3, 10));
		return trianguloRepo.findAll();
	}
	
	
	@GetMapping("/circulos")
	public List<Circulo> listCirculo(){
		System.out.println(usuarioService.calcularAreaCirculo(5, 3.1416));
		return circuloRepo.findAll();
	}
	
	@GetMapping("/cuadrados")
	public List<Cuadrado> listCuadrado(){
		Scanner sc = new Scanner(System.in);
		
//		Cuadrado cuadrado = new Cuadrado();
//		cuadrado.setLado(lado);
		System.out.println(usuarioService.calcularAreaCuadrado1(4));
		return cuadradoRepo.findAll();
	}
	
	
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
