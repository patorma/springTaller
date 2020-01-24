package com.everis.microservicio.springbootusuario;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	public void listarUsuarios() {
		
		//Interfaz           //implementacion
		List<String> lista = new ArrayList<> ();
		lista.add("Hola");
		lista.add("Chau");
		
		for (String mensaje : lista) {
			
			System.out.println(mensaje);
		}
	}

}
