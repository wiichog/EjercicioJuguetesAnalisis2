/**
Autores: Alejandro Cortes
	   Freddie Batlle
*/

public class Proveedor{
	// Private stuff...
	private String nombre;
	private boolean estado;
	private Juguete listaMecanicos[], listaElectronicos[];
	// Public stuff...

	// contructors
	public Proveedor(String nombre, Juguete listaMecanicos[], Juguete listaElectronicos[]){
		this.nombre = nombre;
		this.listaMecanicos = listaMecanicos;
		this.listaElectronicos = listaElectronicos;
	}
	public Proveedor(String nombre, Juguete toy, String tipoJuguete) {
		this.nombre = nombre;
		this.listaMecanicos = new Juguete[50];
		this.listaElectronicos = new Juguete[50];
		
		if (tipoJuguete.equals("Mecanico")) {
			this.listaMecanicos[0] = toy;
		} else {
			this.listaMecanicos[0] = toy;
		}
	}

	//   Setters...
	public void setNombre(boolean estado){
		this.estado = estado;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setListaMecanicos(Juguete listaMecanicos[]){
		this.listaMecanicos = listaMecanicos;
	}
	public void setListaElectronicos(Juguete listaElectronicos[]){
		this.listaElectronicos = listaElectronicos;
	}

	//   Getters...
	public String getNombre(){
		return nombre;
	}
	public boolean getEstado(){
		return estado;
	}
	public Juguete[] getListaMecanicos(){
		return listaMecanicos;
	}
	public Juguete[] getListaElectronicos(){
		return listaElectronicos;
	}

	//   Other methods...
	public int getSizeLista(String lista){
		return lista.length();
	}
	public int getCantidadJuguetes(){
		return listaMecanicos.length + listaElectronicos.length;
	}
	
	public int getCantidadJuguetes(String tipo){
		if (tipo.equals("Mecanicos"))
			return listaMecanicos.length;
		else
			return listaElectronicos.length;
	}
	
	public void addMecanico(Juguete toy){
		int i = 0;
		while (this.listaMecanicos[i] != null) {
			i++;
		}
		this.listaMecanicos[i] = toy;
	}
	
	public void addElectronico(Juguete toy){
		int i = 0;
		while (this.listaElectronicos[i] != null) {
			i++;
		}
		this.listaElectronicos[i] = toy;
	}
}
