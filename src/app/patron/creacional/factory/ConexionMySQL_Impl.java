package app.patron.creacional.factory;

public class ConexionMySQL_Impl implements IConexion {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionMySQL_Impl() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}	//fin constructor

	@Override
	public void conectar() {
		// Aqui puede ir c�digo JDBC
		System.out.println("Se conect� a MySQL");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconect� de MySQL");
	}

	@Override
	public String toString() {
		return "ConexionMySQL_Impl [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}
	
}