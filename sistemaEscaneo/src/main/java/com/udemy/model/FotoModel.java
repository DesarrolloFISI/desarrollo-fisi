package com.udemy.model;

public class FotoModel {
	
	private int id;
	private String nombre;
	private String file; 
	private String codigoDoc;

	public FotoModel() {
		
	}
	
	public FotoModel(int id, String nombre, String file, String codigoDoc) {
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
