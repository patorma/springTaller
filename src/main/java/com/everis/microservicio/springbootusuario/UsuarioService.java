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
	
	public double calcularAreaCuadrado1(double d) {
		
		double lado = d;
		
		double area = lado*lado;
		
		System.out.println("El area del cuadrado es: ");
		 return area;
		 
		
	}
	
	public double calcularAreaCirculo(double r, double pi) {
		
		
		
		double area = r*pi;
		System.out.println("El area del circulo  es: ");
		
		 return area;
		 
		
	}

	public double calcularAreaTriangulo(double base, double altura) {
		
		
		
		double area = base*altura/2;
		
		System.out.println("El area del triangulo es: ");
		
		 return area;
		 
		
	}
	
}
