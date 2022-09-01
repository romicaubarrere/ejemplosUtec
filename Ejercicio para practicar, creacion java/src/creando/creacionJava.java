package creando;

public class creacionJava {

	public static void main(String[] args) {
		
		/*
		 Se pide:
1. Dentro del archivo Java llamado Actividad1.java que debe realizar en el main las
siguientes funcionalidades:
a. Declare 2 variables String (de nombres: “nombre” y “apellido”) y 3 variables
enteras (“a”,”b”,”c”)
b. Asignarle a una de las variables String su nombre y a la otra su apellido
c. Concatenar las variables de forma que quede en una tercera variable
llamada nombreCompleto String su nombre seguido de un espacio (“ ”) y
luego el apellido
d. Asignarle a la variable a, el valor 380, a la variable b el valor 200 y a la
variable c la suma de las variables a y b
e. Imprimir la variable nombreCompleto precedida por “Mi nombre es:”
f. Luego imprimir el valor de la variable c precedida por “La suma de a + b es:”
g. Debe subir el archivo Actividad1.java, debe compilar y ejecutar
correctamente produciendo la salida esperada de acuerdo a las
funcionalidades mencionadas.

		 */

		String nombre = "Romina";
		String apellido = "Caubarrere";
		String nombreCompleto = nombre + apellido;
		
		int a = 380;
		int b = 200;
		int c = a + b;
		
		System.out.println("Mi nombre es: " + nombreCompleto);
		System.out.println("La suma de a + b es: " + c);		
		
	}

}
