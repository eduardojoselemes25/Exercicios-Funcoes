package exercicios_propostos_funcao;
import java.util.Scanner;
import java.util.Locale;
import saude.Hemograma;

public class exercicio_funcao1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a quantidade de glicose no seu sangue?");
		double g = sc.nextDouble();
		Hemograma.classificarGlicose(g);
	}
}