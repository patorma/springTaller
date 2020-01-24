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
	private double radio;
	
	@Column(name = "pi")
	private  double PI;
	
	
	
	
	
	
	public Long getId() {
		return id;
	}






	public void setId(Long id) {
		this.id = id;
	}






	public double getRadio() {
		return radio;
	}






	public void setRadio(double radio) {
		this.radio = radio;
	}






	public  double getPi() {
		return PI;
	}






	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
