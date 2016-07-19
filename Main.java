/**
Autor: Alejandro Cortes
Edit: tiagosansopa
*/

public class Main
{
	// Private stuff...
	private Controlador controlador;

	// Public stuff...

	// Main  
	public static void main(String[] args)
	{
		int salida = 0, opcion= 0;
		Scanner entrada = new Scanner(System.in);
		
		while(salida!=10)
		{
			System.out.println("Cemaco Jugueton");
			System.out.println("1.  Ingresar Juguete");
			System.out.println("2.  Modificar Juguete");
			System.out.println("3.  Eliminar Juguete");
			System.out.println("4.  Ingresar Proveedor");
			System.out.println("5.  Modificar Proveedor");
			System.out.println("6.  Eliminar Proveedor");
			System.out.println("7.  Listar todos los proveedores que proveen más de 10 juguetes.");
			System.out.println("8. Dado el nombre de un proveedor conocer cuántos juguetes mecánicos o electrónicos suministra.");
			System.out.println("9. Dado un tipo de juguete, listar todos los proveedores que suministran ese tipo de juguete.");
			System.out.println("10. Salir");
			opcion = reader.nextInt();
			
			switch (opcion) 
			{
				case 1:  
					System.out.println("Ingrese el codigo");
					System.out.println("Ingrese la marca");
						 break;
				case 2:  
						 break;
				case 3:  
						 break;
				case 4: 
						 break;
				case 5:  
						 break;
				case 6:  
						 break;
				default:
						 break;
			}
		}	
		
		
		
	}
	}
