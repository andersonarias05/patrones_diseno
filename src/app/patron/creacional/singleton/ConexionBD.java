package app.patron.creacional.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
    private String driver;
    private String url;
    private String usuario;
    private String password;
    private static Connection conexion = null;
    
    private ConexionBD() {
    	try {
    		String driver = "com.mysql.jdbc.Driver";
        	String url="jdbc:mysql://localhost/nombre_DB?autoReconnect=true";
        	String usuario = "usuario";
        	String password = "password";
    		Class.forName(driver);
    	    conexion = DriverManager.getConnection(url, usuario, password);
    	 } catch (ClassNotFoundException | SQLException e) {
    	     e.printStackTrace();
    	 }
	}	//fin constructor
    
    public static Connection getConexionInstancia() {
    	if (conexion == null) {
    		new ConexionBD();
    	}
    	return conexion;
    } // fin metodo instancia
    
    // métodos getters and setters
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}