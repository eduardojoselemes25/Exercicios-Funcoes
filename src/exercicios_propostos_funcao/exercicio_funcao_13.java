package exercicios_propostos_funcao;

import java.util.Locale;
import java.util.Scanner;

import imc.indice;

public class exercicio_funcao_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite seu Peso");
		double peso = sc.nextDouble();
		System.out.println("Digite sua Altura");
		double altura = sc.nextDouble();
		
		double resultado = indice.imc(peso, altura);
		System.out.printf("Seu IMC é: " + resultado);

	}

}
