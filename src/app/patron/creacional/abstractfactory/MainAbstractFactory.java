/** El patr�n de dise�o Abstract Factory busca agrupar un conjunto de clases que tiene un funcionamiento
 *  en com�n llamadas familias, las cuales son creadas mediante un Factory, este patr�n es especialmente 
 *  �til cuando requerimos tener ciertas familias de clases para resolver un problema */
package app.patron.creacional.abstractfactory;

import app.patron.creacional.abstractfactory.interfaz.*;

public class MainAbstractFactory {

	public static void main(String[] args) {
		
		FabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
		IConexionBD cxBD1 = fabricaBD.getBD("MYSQL");

		cxBD1.conectar();
		cxBD1.desconectar();

		FabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
		IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

		cxRS1.leerURL("https://janis-monasterios-vitols.000webhostapp.com/");
	}

}