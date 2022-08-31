package ejemplosPlataforma;

public class aunMasEjemplos {

	public static void main(String[] args) {
		String var1="La clase String";
		int longitud=var1.length();
		boolean inicia=var1.startsWith("La");
		boolean termina=var1.endsWith("ing");
		int pos=var1.indexOf('a');//si no esta retorna -1
		boolean esta=var1.contains("a");
		boolean resultado=var1.equals("un perro");
		
		System.out.println(" var1 es "+var1);
		System.out.println(" su longitud es "+longitud);
		System.out.println(" Comineza con La ? "+ inicia);
		System.out.println(" Termina con ing ? "+ termina);
		System.out.println(" Posicion de a "+ pos);
		System.out.println(" Esta la a ? "+ esta);
		System.out.println(" Es igual a perro ? "+ resultado);

	}

}
