package app.patron.creacional.abstractfactory;

import app.patron.creacional.abstractfactory.impl.ConexionMySQL_Impl;
import app.patron.creacional.abstractfactory.impl.ConexionOracle_Impl;
import app.patron.creacional.abstractfactory.impl.ConexionPostgreSQL_Impl;
import app.patron.creacional.abstractfactory.impl.ConexionSQLServer_Impl;
import app.patron.creacional.abstractfactory.impl.ConexionVacia_Impl;
import app.patron.creacional.abstractfactory.interfaz.*;

public class ConexionBDFabrica implements FabricaAbstracta {

	@Override
	public IConexionBD getBD(String motor) {
		if (motor == null) {
			return new ConexionVacia_Impl();
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

		return new ConexionVacia_Impl();
	}

	@Override
	public IConexionREST getREST(String area) {
		return null;
	}
	
}