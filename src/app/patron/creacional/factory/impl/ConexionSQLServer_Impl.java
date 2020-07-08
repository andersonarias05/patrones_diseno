package app.patron.creacional.factory.impl;

import app.patron.creacional.factory.interfaz.IConexion;

public class ConexionSQLServer_Impl implements IConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionSQLServer_Impl() {
		this.host = "localhost";
		this.puerto = "1433";
		this.usuario = "postgres";
		this.contrasena = "123";
	}	//fin constructor

	@Override
	public void conectar() {
		// Aqui puede ir código JDBC
		System.out.println("Se conectó a SQLServer");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de SQLServer");
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPuerto() {
		return puerto;
	}

	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}