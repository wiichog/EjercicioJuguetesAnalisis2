/**
Autor: Alejandro Cortes
*/

public class Juguete {
	// Private stuff
	private String codigo, marca, tipoJuguete;
	private int edad, proveedor, valorAdicional, complejidad,valorU;
	private float precioVenta;
	private boolean estado;

	// public stuff
	//constructor
	public Juguete(String codigo,String marca,String tipoJuguete,int edad,int proveedor,int valorU,int valorAdicional,int complejidad){
		this.codigo = codigo;
		this.valorU = valorU;
		this.marca = marca;
		this.tipoJuguete = tipoJuguete;
		this.edad = edad;
		this.proveedor = proveedor;
		this.valorAdicional = valorAdicional;
		this.complejidad = complejidad;
		
		if (tipoJuguete.equals("Mecanico"))
			this.precioVenta = valorU+(valorAdicional*complejidad);
		else if(tipoJuguete.equals("Electronico"))
			this.precioVenta = valorU+ (valorAdicional*2);
	}
	
	//   Setters...
	public void setEstado(Boolean estado){
		this.estado = estado;
	}
	
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	public void setValorUnitario(int valorU){
		this.valorU = valorU;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	public void setProveedor(int proveedor){
		this.proveedor = proveedor;
	}
	public void setTipoJuguete(String tipoJuguete){
		this.tipoJuguete = tipoJuguete;
	}
	public void setValorAdicional(int valorAdicional){
		this.valorAdicional = valorAdicional;
	}
	public void setComplejidad(int complejidad){
		this.complejidad = complejidad;
	}
	public void setPrecioVenta(float precioVenta){
		this.precioVenta = precioVenta;
	}

	//  Getters...
	public boolean getEstado(){
		return estado;
	}
	
	public String getCodigo(){
		return codigo;
	}
	public int getValorUnitario(){
		return valorU;
	}
	public String getMarca(){
		return marca;
	}
	public int getEdad(){
		return edad;
	}
	public int getProveedor(){
		return proveedor;
	}
	public String getTipoJuguete(){
		return tipoJuguete;
	}
	public int getValorAdiional(){
		return valorAdicional;
	}
	public int getComplejidad(){
		return complejidad;
	}
	public float getPrecioVenta(){
		return precioVenta;
	}
}
