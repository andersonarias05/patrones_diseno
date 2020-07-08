package app.patron.creacional.abstractfactory;

import app.patron.creacional.abstractfactory.impl.ConexionRESTCompras_Impl;
import app.patron.creacional.abstractfactory.impl.ConexionRESTNoArea_Impl;
import app.patron.creacional.abstractfactory.impl.ConexionRESTVentas_Impl;
import app.patron.creacional.abstractfactory.interfaz.*;

public class ConexionRESTFabrica implements FabricaAbstracta {

	@Override
	public IConexionREST getREST(String area) {
		if (area == null) {
			return new ConexionRESTNoArea_Impl();
		}
		if (area.equalsIgnoreCase("COMPRAS")) {
			return new ConexionRESTCompras_Impl();
		} else if (area.equalsIgnoreCase("VENTAS")) {
			return new ConexionRESTVentas_Impl();
		}
		return new ConexionRESTNoArea_Impl();
	}

	@Override
	public IConexionBD getBD(String motor) {
		return null;
	}
	
}