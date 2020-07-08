package app.patron.creacional.factory.impl;

import app.patron.creacional.factory.interfaz.IConexion;

public class ConexionOracle_Impl implements IConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionOracle_Impl() {
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contrasena = "123";
	}	//fin constructor

	@Override
	public void conectar() {
		// Aqui puede ir código JDBC
		System.out.println("Se conectó a Oracle");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de Oracle");
	}

	@Override
	public String toString() {
		return "ConexionOracle_Impl [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}