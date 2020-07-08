package app.patron.creacional.abstractfactory.impl;

import app.patron.creacional.abstractfactory.interfaz.IConexionREST;

public class ConexionRESTNoArea_Impl implements IConexionREST{

	@Override
	public void leerURL(String url) {
		System.out.println("AREA NO ELEGIDA");
	}

}