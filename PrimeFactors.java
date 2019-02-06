package joans_workspace;
import java.util.Scanner;
public class PrimeFactors {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		int number;
		int counter = 2;
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		while (counter <= number) {
			if (number % counter == 0) {
				System.out.println(counter);
				number = number / counter;
			} else {
				counter += 1;
				
				input.close();
				
			}
		}
	
		
	}

}
