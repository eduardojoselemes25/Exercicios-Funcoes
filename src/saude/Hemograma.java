package saude;
public class Hemograma {

	public static void classificarGlicose(double g) {
		if (g <= 100.0) {
			System.out.println("Normal");
		}
		else if (g <=140.0) {
				System.out.println("Elevado");
		}
		else {
			System.err.println("Diabetes");
		}
	}
}
