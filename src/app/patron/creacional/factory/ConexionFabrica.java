package app.patron.creacional.factory;

public class ConexionFabrica {

	public IConexion getConexion(String motor) {
		
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL_Impl();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle_Impl();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL_Impl();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer_Impl();
		}

		return new ConexionVacia();
	}
}