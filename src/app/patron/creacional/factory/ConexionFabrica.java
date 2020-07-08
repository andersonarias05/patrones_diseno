package app.patron.creacional.factory;

import app.patron.creacional.factory.impl.ConexionMySQL_Impl;
import app.patron.creacional.factory.impl.ConexionOracle_Impl;
import app.patron.creacional.factory.impl.ConexionPostgreSQL_Impl;
import app.patron.creacional.factory.impl.ConexionSQLServer_Impl;
import app.patron.creacional.factory.impl.ConexionVacia;
import app.patron.creacional.factory.interfaz.IConexion;

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