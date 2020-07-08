/** El patrón de diseño Factory es usado principalmente cuando tenemos una clase o interfaz con muchas subclases
 *  o implementaciones y según algún input necesitamos devolver una de estas subclases concretas. */
package app.patron.creacional.factory;

import app.patron.creacional.factory.interfaz.IConexion;

public class MainFactory {

	public static void main(String[] args) {
		ConexionFabrica fabrica = new ConexionFabrica();

		IConexion cx1 = fabrica.getConexion("ORACLE");
		cx1.conectar();
		cx1.desconectar();

		IConexion cx2 = fabrica.getConexion("MYSQL");
		cx2.conectar();
		cx2.desconectar();

		IConexion cx3 = fabrica.getConexion("H2");
		cx3.conectar();
		cx3.desconectar();
	}
}