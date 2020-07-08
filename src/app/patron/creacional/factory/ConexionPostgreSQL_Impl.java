package app.patron.creacional.factory;

public class ConexionPostgreSQL_Impl implements IConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionPostgreSQL_Impl() {
		this.host = "localhost";
		this.puerto = "5433";
		this.usuario = "postgres";
		this.contrasena = "123";
	}	//fin constructor

	@Override
	public void conectar() {
		// Aqui puede ir c�digo JDBC
		System.out.println("Se conect� a PostgreSQL");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconect� de PostgreSQL");
	}

	@Override
	public String toString() {
		return "ConexionPostgreSQL_Impl [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}