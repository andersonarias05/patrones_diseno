package app.patron.creacional.singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainSingleton {

	public static void main(String[] args) {
		
		//Conexion c = new Conexion(); ======>>> Instanciación por constructor prohíbido por ser "private"
		Conexion conexion = Conexion.getInstancia();
		conexion.conectar();
		conexion.desconectar();
				
		boolean rpta = conexion instanceof Conexion;
		System.out.println(rpta);
		System.out.println("//-------------------------------------------------------------------------");
		//-------------------------------------------------------------------------
		
		Singleton ricardo = Singleton.getSingletonInstance("Ricardo Moya");
		Singleton ramon = Singleton.getSingletonInstance("Ramón Perez");
        
        // ricardo y ramon son referencias a un único objeto de la clase SoyUnico
        System.out.println(ramon.getNombre());
        System.out.println(ramon.getNombre());
        System.out.println(ramon.getNombre());
        System.out.println(ramon.getNombre());
        System.out.println(ricardo.getNombre());
        System.out.println("//-------------------------------------------------------------------------");
        //-------------------------------------------------------------------------
        System.out.println("Error hasta que se establezca una conexion especifica");
        
        //Ejemplo 3: Conexion a base de datos con singleton
        try {
            Connection c = ConexionBD.getConexionInstancia();
            PreparedStatement st;
            st = c.prepareStatement("INSERT INTO NombreTable VALUES (?,?,?)");
            st.setInt(1, 1234);  //el 1 indica que se sustituira el primer '?' con el valor en int de 1234
            st.setDouble(2, 123.45); //el 2 indica que se sustituira el segundo '?' por el valor en double de 123.45 
            st.setString(3, "hola");  //el 3 indica que se sustiruira el tercer '?' por la cadena "hola"
           //los tipos de variables deben coincidir con los tipos definidos en las columnas de la tabla en la que se insertaran
           if(st.executeUpdate()==1){
              System.out.println("filtrada correctamente");
            }
        } 
        catch (SQLException ex) {
          //captura la excepcion
        }
	}

}