package ejemplosPlataforma;

public class masEejemplos {

	public static void main(String[] args) {
		
		int valor1 = 55;
		valor1++;
		valor1++; //valor1 = 57
		int valor2 = 76;
		int valor3 = 10;
		int valor4 = -15;
		valor3 = valor3 + 11; //valor3 = 21
		boolean comparacion = !((valor1 >= valor3) && (valor4 < valor3));
								// !(vdd y vdd) = false 
		if (comparacion || valor2 == 78 - 1) { //falso o falso
			
			valor4 = valor4 + 15;
			
			if (valor1 == 57) { //no entra
				System.out.println("entre en el if del primer if de la decision");
				valor3= 32;
			} else { //no entra
				System.out.println("entre en el else del primer if de la decision");
				valor3 = 67 + valor1;
			}
		} else if (comparacion){ 
			System.out.println("entre en el primer else if de la decision");
		} else if(comparacion && valor2 ==76) {
			System.out.println("entre en el segundo else if de la decision");
		int numero = valor3 + 10;
		valor3 = valor3 + numero + 100;
		valor4 = valor4 + 30;
		
		} else if (comparacion || valor2 == 77 - 1) {
			
			valor4 = valor4 + 15;
			
		if (valor4 == 0) {
			System.out.println( "entre en if del tercer else id de la decision");
			valor3 = (valor2 + valor4) * 2;
		} else {
			System.out.println("entre en else del tercer else if de la decision");
			valor1 = 45;
			valor1++;
					
		} 
		}
		
		else {
			System.out.println("entre en el else de la decision");
		valor1 = valor1 +30;
		valor4 = valor1 *2;
		}
	System.out.println(valor1);
	System.out.println(valor2);
	System.out.println(valor3);
	System.out.println(valor4);
	}
	

	}
