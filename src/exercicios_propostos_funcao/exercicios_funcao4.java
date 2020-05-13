package exercicios_propostos_funcao;

import java.util.Scanner;
import java.util.Locale;
import mensagens.tela;;
public class exercicios_funcao4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		tela.mostrarOnlineOffline(n);
		
		sc.close();
}
}