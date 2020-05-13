package exercicios_propostos_funcao;

import java.util.Locale;
import java.util.Scanner;
import Tabuada.mostrarTabuada;
public class exercicios_funcao5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		mostrarTabuada.calN(n);

	}

}
