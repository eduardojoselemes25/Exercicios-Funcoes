package Tabuada;

public class mostrarTabuada {
	
	public static void calN(int n) {
	
		for(int i=1; i<=10; i++) {
			int resultado = n * i;
			System.out.println(n + " x " + i + " = " + resultado);
		}
	}

}
