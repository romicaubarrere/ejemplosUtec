package ejemplosPlataforma;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int edad = 56;
		boolean trabaja = true;
		boolean estudia = false;
		
		if (edad <18 && !trabaja && !estudia ) {
			System.out.println("Menor que no estudia ni trabaja");	
		}
		
		if(edad > 18 && !trabaja && !estudia){
			System.out.println("mayor que no estudia ni trabaja");
		}
	}

}
