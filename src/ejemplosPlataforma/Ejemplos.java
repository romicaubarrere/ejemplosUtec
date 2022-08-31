package ejemplosPlataforma;

public class Ejemplos {

	public static void main(String[] args) {
		
/*
		 
		
		int indice = 50;
		
		indice ++;
		indice ++;
		indice ++;
		
		indice --;
		
		indice ++;
		
		System.out.println(indice);


		long var1 = 40;
		long var2 = 91;
		
		boolean booleana1;
		boolean booleana2;
		boolean booleana3;
		
		booleana1 = (56 < 100) || (var1 >= 33);
		
		booleana2 = !(var2 == 81) && booleana1;
					// verdadero y verdadero
		booleana3 = (booleana1 && (!booleana2)) && var1!=var2;
					// verdadero y falso y falso 
		System.out.println(booleana1);
		System.out.println(booleana2);
		System.out.println(booleana3);
		
		 */
		
		String texto1;
		String texto2;
		String texto3;
		
		texto1 = "Hola como estas?";
				
		texto2 = "Todo bien, y vos?";
		
		texto3 = "Muy bien!";
		
		String completo = texto1 + " " + texto2;
		String respuesta = texto2 + " " + texto3 + "Gracias";
		
		System.out.println(completo);
		System.out.println(respuesta);
	}

}
