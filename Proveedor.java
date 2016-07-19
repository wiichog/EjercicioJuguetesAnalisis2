/**
	Autores: Alejandro Cortes
			 Freddie Batlle
		     Santiago Solorzano
*/

public class Proveedor{
	
	// Private stuff...
	public String nombre;
	private boolean estado;

	// Public stuff...

	// contructors
	public Proveedor(String nombre){
		this.nombre = nombre;
	}

	//   Setters...
	public void setNombre(boolean estado){
		this.estado = estado;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}


	//   Getters...
	public String getNombre(){
		return nombre;
	}
	public boolean getEstado(){
		return estado;
	}

}
