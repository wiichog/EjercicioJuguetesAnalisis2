/**
Autor: Alejandro Cortes
*/

public class Controlador{
	// Private stuff...
	private Proveedor proveedores[];

	// Public stuff...

	//   contructor
	public Controlador(Proveedor proveedores[]){
		this.proveedores = proveedores;
	}

	//   Setters...
	public void setProveedores(Proveedore proveedores[]){
		this.proveedores = proveedores;
	}
	//   Getters...
	public Proveedor[] getProveedores(){
		return proveedores;
	}

	//   Other methods...
	
}