import java.util.Scanner;

/**
Autor: Alejandro Cortes
Edit: tiagosansopa
*/

public class Main
{
	// Private stuff...
	

	// Public stuff...

	// Main  
	public static void main(String[] args)
	{
				Controlador controlador;
		
		int salida = 0, opcion= 0;
		Scanner entrada = new Scanner(System.in);
		//Arreglos de objetos
		Juguete[] juguetes = new Juguete [30];
		Proveedor[] proveedores = new Proveedor [30];
		controlador = new Controlador(proveedores);
		//Contador de Juguetes y Proveedores
		int posJuguetes = 0, posProv = 0, mod = 0;
		
		while(salida!=10)
		{
			System.out.println("Cemaco Jugueton");
			System.out.println("1.  Ingresar Juguete");
			System.out.println("2.  Modificar Juguete");
			System.out.println("3.  Eliminar Juguete");
			System.out.println("4.  Ingresar Proveedor");
			System.out.println("5.  Modificar Proveedor");
			System.out.println("6.  Eliminar Proveedor");
			System.out.println("7.  Listar todos los proveedores que proveen mÃ¡s de 10 juguetes.");
			System.out.println("8. Dado el nombre de un proveedor conocer cuÃ¡ntos juguetes mecÃ¡nicos o electrÃ³nicos suministra.");
			System.out.println("9. Dado un tipo de juguete, listar todos los proveedores que suministran ese tipo de juguete.");
			System.out.println("10. Salir");
			opcion = entrada.nextInt();
			
			switch (opcion) 
			{
				case 1:  
					System.out.println("Ingreso de Nuevo Juguete");
					
					System.out.println("Ingrese el codigo");
					String codigo = entrada.nextLine();
					System.out.println("Ingrese la marca");
					String marca = entrada.nextLine();
					System.out.println("Ingrese tipo de juguete");
					String tipoDeJuguete = entrada.nextLine();
					System.out.println("Ingrese edad");
					int edad = entrada.nextInt();
					System.out.println("Ingese el nombre del proveedor");
					String nombreProveedor = entrada.nextLine();
					System.out.println("Ingrese el proveedor del juguete");
					int proveedor = entrada.nextInt();
					System.out.println("Ingrese el valor unitario");
					int valorUnitario = entrada.nextInt();
					System.out.println("Ingrese el valor adicional");
					int valorAdicional = entrada.nextInt();
					System.out.println("Ingrese la complejidad");
					int complejidad = entrada.nextInt();
					
					//Se crea el nuevo juguete
					
					juguetes[posJuguetes] = new Juguete(codigo,marca,tipoDeJuguete,edad,proveedor,valorUnitario,valorAdicional,complejidad);
					controlador.addToy(proveedores, nombreProveedor, juguetes[posJuguetes], tipoDeJuguete);					
				break;
				
				case 2:
					System.out.println("Modificar Juguete Existente");
					System.out.println("Id del Juguete a modificar");
					mod = entrada.nextInt();
					
					System.out.println("Ingrese el codigo");
					codigo = entrada.nextLine();
					System.out.println("Ingrese la marca");
					marca = entrada.nextLine();
					System.out.println("Ingrese tipo de juguete");
					tipoDeJuguete = entrada.nextLine();
					System.out.println("Ingrese edad");
					edad = entrada.nextInt();
					System.out.println("Ingrese el proveedor del juguete");
					proveedor = entrada.nextInt();
					System.out.println("Ingrese el valor unitario");
					valorUnitario = entrada.nextInt();
					System.out.println("Ingrese el valor adicional");
					valorAdicional = entrada.nextInt();
					System.out.println("Ingrese la complejidad");
					complejidad = entrada.nextInt();
					
					//Se modifica el juguete
					juguetes[mod] = new Juguete(codigo,marca,tipoDeJuguete,edad,proveedor,valorUnitario,valorAdicional,complejidad);
					controlador.addToy(proveedores, nombreProveedor, juguetes[posJuguetes], tipoDeJuguete);
					
				break;
				
				case 3:  
					System.out.println("Eliminar Juguete Existente");
				break;
				
				case 4: 
					System.out.println("Ingreso de Nuevo Proveedor");
					
					System.out.println("Ingrese el nombre");
					String nombreProveedor = entrada.nextLine();
					
					//Se crea el proveedor
					proveedores[posProv] = new Proveedor(nombreProveedor);
					
				break;
				
				case 5:  
					System.out.println("Modificar Proveedor Existente");
				break;
				
				case 6:  
					System.out.println("Eliminar Proveedor Existente");
				break;
				
				case 7:  
					System.out.println("Listar todos los proveedores que proveen mas de 10 juguetes."");
					System.out.println("Listar todos los proveedores que proveen mas de 10 juguetes.");
					controlador.tenPcs();
				break;
				
				case 8:  
					System.out.println("Dado el nombre de un proveedor conocer cuÃ¡ntos juguetes mecÃ¡nicos y electrÃ³nicos suministra.");
					System.out.println("Ingrese el nombre");
					String nombreProveedor = entrada.nextLine();
					System.out.println("Dado el nombre de un proveedor conocer cuántos juguetes mecánicos y electrónicos suministra.");
					System.out.println("Ingrese el nombre");
					nombreProveedor = entrada.nextLine();
					controlador.totalToys(nombreProveedor);
				break;
				
				case 9:  
					System.out.println("Dado un tipo de juguete, listar todos los proveedores que suministran ese tipo de juguete.");
					//controlador.
				break;
				
				default:
					System.out.println("Error. Ingrese opcion correcta.");
				break;
			}
		}	
		
	}
}
