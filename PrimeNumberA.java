package joans_workspace;
import java.util.Scanner;
public class PrimeNumberA {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		int divide = 1;
		int integer;
		int remainder;
		boolean prime;
		
		System.out.println("Enter a whole number greater than 1: ");
		integer = input.nextInt();
		
		do {
			divide += 1;
			remainder = (integer % divide);
			prime = true;
			if (remainder == 0) {
				prime = false;
			}
			
		} while ((divide + 1) < integer && remainder != 0);
		if (prime == false) {
			System.out.println("The number is not prime.");
		} else if (prime == true) {
			System.out.println("The number is prime.");
			
			input.close();
			
		}
		
		
		
	
	}

}

