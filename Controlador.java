import java.util.Arrays;

/**
Autores: Alejandro Cortes
	   Freddie Batlle
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
	public void setProveedores(Proveedor proveedores[]){
		this.proveedores = proveedores;
	}
	//   Getters...
	public Proveedor[] getProveedores(){
		return proveedores;
	}

	//   Other methods...
	
	//Returns array of Providers who provide 10+ toys of any kind
	public Proveedor[] tenPcs(){
		
		Proveedor[] tempProveedores = new Proveedor[proveedores.length];  //cant be higher
		int tempCounter = 0;
		for (int i=0;i<proveedores.length;i++){  
			if (proveedores[i].getCantidadJuguetes() >= 10){
				tempProveedores[tempCounter]=proveedores[i];
				tempCounter++;
			}
		}
		
		return tempProveedores;
	}
	
	//Returns most expensiveToy (not just of a provider)
	public String expensiveToy(){
		return null;
	}
	
	//Returns a list of toys given a complexity
	public Juguete[] mechComplex(int complexity){
		return null;
	}
	
	//Returns a list of toys sorted by price
	public Juguete[] electricSorted(){
		return null;
	}
	
	//Returns a list of providers with toy
	public Proveedor[] providersFor(Juguete toy){
		
		Proveedor[] tempProveedores = new Proveedor[proveedores.length];  //cant be higher
		int tempCounter =0;
		
		for (int i=0;i<proveedores.length;i++){  
			//arrays ,of both types of toys, converted to lists to use contains
			if(Arrays.asList(proveedores[i].getListaElectronicos()).contains(toy)||Arrays.asList(proveedores[i].getListaElectronicos()).contains(toy)){
				tempProveedores[tempCounter] = proveedores[i];
				tempCounter++;
			}
		}
		
		return tempProveedores;
	}

	//Returns total of mechanic or electronic toys
	public int totalToys(String providerName) {
		int totalToys = 0;
		for (int i=0; i<proveedores.length; i++){ 

			if(providerName.equals(proveedores[i].getNombre())){
				totalToys = proveedores[i].getListaElectronicos().length + proveedores[i].getListaMecanicos().length;
				
			}
		}
		return totalToys;
	}
	
	public Proveedor[] addToy(Proveedor[] providers,String providerName,Juguete toy,String type){
		int pos = searchAddProvider(providers,providerName,toy,type);
		if (type.equals("Mecanico"))
			providers[pos].addMecanico(toy);
		else if(type.equals("Electronico"))
			providers[pos].addElectronico(toy);
	}
	
	public int searchAddProvider(Proveedor[] providers,String providerName,Juguete toy,String type){
		int firstNull =0;
		for (int i=0; i<providers.length;i++){
			if(providers[i].getNombre().equals(providerName))
				return i;
			else if(providers[i].getNombre()==null)
				firstNull = i;
		}
		providers[firstNull]= new Proveedor(providerName,toy,type);
		return 51; //if it didnt find the item
	}
}