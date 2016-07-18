/**
Autor: Alejandro Cortes
*/

public class Juguete {
	// Private stuff
	private String codigo, valorU, marca, tipoJuguete;
	private int edad, proveedor, valorAdicional, complejidad;
	private float precioVenta;

	// public stuff
	//   Setters...
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	public void setValorUnitario(String valorU){
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
	public String getCodigo(){
		return codigo;
	}
	public String getValorUnitario(){
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