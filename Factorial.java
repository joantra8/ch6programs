package joans_workspace;
import java.util.Scanner;
/* Joan Tra
 * Period 1
 * Prompts the user for a number and then displays the factorial.
 */
public class Factorial {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		int usernum;
		int factorial = 1;
		
		System.out.print("Enter a number: ");
		usernum = input.nextInt();
		
		for (int i = 1; i <= usernum; i++) {
			factorial = factorial * i;
			}
		System.out.print("The factorial of your number is: " + factorial);
		
		input.close();
	}

}

