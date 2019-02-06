package joans_workspace;
import java.util.Scanner;
public class PrimeNumberB {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		int remainder;
		int min;
		int max;
		int divide = 1;
		int checknum;
		boolean prime;
		
		System.out.println("Enter a minimum number: ");
		min = input.nextInt();
		System.out.println("Enter a maximum number: ");
		max = input.nextInt();
		
		checknum = min + 1;
		
		while (checknum < max) {
			do { 
				divide  += 1;
				remainder = checknum % divide;
				prime = true;
				if (remainder == 0) {
					prime = false;
					
				}
			} while ((divide + 1) < checknum && remainder != 0);
			if (prime == true) {
				System.out.println(checknum);
				input.close();
			}
			checknum += 1;
			divide = 1;
		}
		
	}

}
