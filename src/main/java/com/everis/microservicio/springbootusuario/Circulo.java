package com.everis.microservicio.springbootusuario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="circulos")
public class Circulo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private int radio;
	
	@Column(name = "pi")
	private static final double PI=3.1416;
	
	
	
	
	
	
	public Long getId() {
		return id;
	}






	public void setId(Long id) {
		this.id = id;
	}






	public int getRadio() {
		return radio;
	}






	public void setRadio(int radio) {
		this.radio = radio;
	}






	public static double getPi() {
		return PI;
	}






	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
