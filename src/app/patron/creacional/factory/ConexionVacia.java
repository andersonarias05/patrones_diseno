package app.patron.creacional.factory;

public class ConexionVacia implements IConexion {

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

}