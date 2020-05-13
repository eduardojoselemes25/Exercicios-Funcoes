package prestacao;

public class valorPrestacao {

	public static void main(String[] args) {
	}

	public static void calculaPrestacao(double vi, double ve, int p) {
		double valor = (vi - ve) / p;
		System.out.print("O valor da prestação será de: R$ ");
		System.out.printf("%.2f", valor);
	}

}

