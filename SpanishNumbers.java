package q4;

public class SpanishNumbers {
	public static void spanish(int number) {
		if (number == 1) {
			System.out.print("uno");
		}
		if (number == 2) {
			System.out.print("dos");
		}
		if (number == 3) {
			System.out.print("tres");
		}
		if (number == 4) {
			System.out.print("cuatro");
		}
		if (number == 5) {
			System.out.print("cinco");
		}
		if (number == 6) {
			System.out.print("seis");
		}
		if (number == 7) {
			System.out.print("siete");
		}
		if (number == 8) {
			System.out.print("ocho");
		}
		if (number == 9) {
			System.out.print("nueve");
		}
		if (number == 10) {
			System.out.print("diez");
		}
	}
	public static void main(String []args) {
		for (int i = 1; i <= 10; i++) {
			spanish(i);
		}
	}
}
