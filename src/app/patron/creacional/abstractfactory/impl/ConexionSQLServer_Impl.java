package app.patron.creacional.abstractfactory.impl;

import app.patron.creacional.abstractfactory.interfaz.IConexionBD;

public class ConexionSQLServer_Impl implements IConexionBD {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionSQLServer_Impl() {
		this.host = "localhost";
		this.puerto = "1433";
		this.usuario = "postgres";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir código JDBC
		System.out.println("Se conectó a SQLServer");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de SQLServer");
	}

	@Override
	public String toString() {
		return "ConexionSQLServer_Impl [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}
}