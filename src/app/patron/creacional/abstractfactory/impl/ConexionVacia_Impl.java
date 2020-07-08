package app.patron.creacional.abstractfactory.impl;

import app.patron.creacional.abstractfactory.interfaz.IConexionBD;

public class ConexionVacia_Impl implements IConexionBD {

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");		
	}

}