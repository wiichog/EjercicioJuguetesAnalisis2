/**
Autor: Alejandro Cortes
*/

public class Proveedor{
	// Private stuff...
	private String nombre;
	private Juguete listaMecanicos[], listaElectronicos[];	
	// Public stuff...

	// contructors
	public Proveedor(String nombre, Juguetes listaMecanicos[], Juguetes listaElectronicos){
		this.nombre = nombre;
		this.listaMecanicos = listaMecanicos;
		this.listaElectronicos = listaElectronicos;
	}

	//   Setters...
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setListaMecanicos(Juguetes listaMecanicos[]){
		this.listaMecanicos = listaMecanicos;
	}
	public void setListaElectronicos(Juguetes listaElectronicos[]){
		this.listaElectronicos = listaElectronicos;
	}

	//   Getters...
	public String getNombre(){
		return nombre;
	}
	public Juguete[] getListaMecanicos(){
		return listaMecanicos;
	}
	public Juguete[] getListaElectronicos(){
		return listaElectronicos;
	}

	//   Other methods...
	public int getSizeLista(String lista){
		
	}
	public int gatCantidadJuguetes(){

	}
	@Overload
	public int getCantidadJuguetes(String tipo){

	}
	public Juguete getJugueteMasCaro(){

	}
	public Juguete[] getListaSorted(String tipo){
		
	}
}