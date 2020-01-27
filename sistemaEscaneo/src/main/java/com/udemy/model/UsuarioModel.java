package com.udemy.model;

public class UsuarioModel {
	private String username;
	private String password;
	private String rol;
	
	public UsuarioModel() {
		
	}
	
	public UsuarioModel(String username, String password, String rol) {
		super();
		this.username = username;
		this.password = password;
		this.rol = rol;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserCredential [username=" + username + ", password=" + password + "]";
	}
	
}
