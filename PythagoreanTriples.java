package q4;

public class PythagoreanTriples {
	public static void main (String []args) {
		int z, x, c;
		for (z = 1; z < 100; z++) {
		for (x = 1; x < 100; x++) {
		for (c = 1; c < 100; c++) {
		int a = z, b = x;
		if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) {
			if (a < b) {
				System.out.println(z +" " + x + " " + c);
			}
		}
		}
		}
		}
	}

}
