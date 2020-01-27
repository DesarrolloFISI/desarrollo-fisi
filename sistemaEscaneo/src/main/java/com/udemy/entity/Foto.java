package com.udemy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="foto")
public class Foto {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="file")
	private String file; 
	
	@Column(name="codigoDoc")
	private String codigoDoc;

	public Foto() {
		
	}

	
	public Foto(int id, String nombre, String file, String codigoDoc) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.file = file;
		this.codigoDoc = codigoDoc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getCodigoDoc() {
		return codigoDoc;
	}

	public void setCodigoDoc(String codigoDoc) {
		this.codigoDoc = codigoDoc;
	}
	
}