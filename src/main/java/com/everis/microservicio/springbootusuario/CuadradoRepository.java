package com.everis.microservicio.springbootusuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CuadradoRepository extends JpaRepository<Cuadrado, Long> {
	
	//Cuadrado area(Cuadrado cuadrado);

}
