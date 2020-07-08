/** Este patrón se implementa haciendo privado el constructor de la clase y creando (en la propia clase) un método 
 *  que crea una instancia del objeto si este no existe. **/

package app.patron.creacional.singleton;

public class Singleton {
	
	private String nombre;
	private static Singleton singleton;
	
	private Singleton(String nombre) {
		this.nombre = nombre;
		System.out.println("Mi nombre es: "+nombre);
	}	// el contructor es privado, no permite que se genere un contructor por defecto

	public static Singleton getSingletonInstance(String nombre) {
		if (singleton == null){
        	singleton = new Singleton(nombre);
        } else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase Singleton");
        }
        return singleton;
    }
	
	public String getNombre() {
		return nombre;
	}	// método getter
	
}