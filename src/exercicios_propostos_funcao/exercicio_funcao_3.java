package exercicios_propostos_funcao;

import java.util.Scanner;
import java.util.Locale;
import prestacao.valorPrestacao;
public class exercicio_funcao_3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("Digite o valor do imóvel.: R$ ");
		double vi = sc.nextDouble();
		System.out.print("Digite o valor da entrada: R$ ");
		double ve = sc.nextDouble();
		System.out.print("Digite a qtde de parcelas: ");
		int p = sc.nextInt();
	
		valorPrestacao.calculaPrestacao(vi, ve, p);
	}
}
