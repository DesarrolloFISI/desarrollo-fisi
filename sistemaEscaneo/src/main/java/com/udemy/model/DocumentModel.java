package com.udemy.model;

public class DocumentModel {

	private int id;
	private String codigoDoc;
	private String tipo;
	private int anaquel;
	private int columna;
	private String solicitante;
	private String proveedor;
	private String tema;
	private float monto;
	private String fecha;
	
	public DocumentModel() {
		
	}

	public DocumentModel(int id, String codigoDoc, String tipo, int anaquel, int columna, String solicitante,
			String proveedor, String tema, float monto, String fecha) {
		super();
		this.id = id;
		this.codigoDoc = codigoDoc;
		this.tipo = tipo;
		this.anaquel = anaquel;
		this.columna = columna;
		this.solicitante = solicitante;
		this.proveedor = proveedor;
		this.tema = tema;
		this.monto = monto;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoDoc() {
		return codigoDoc;
	}

	public void setCodigoDoc(String codigoDoc) {
		this.codigoDoc = codigoDoc;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAnaquel() {
		return anaquel;
	}

	public void setAnaquel(int anaquel) {
		this.anaquel = anaquel;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	

	
}