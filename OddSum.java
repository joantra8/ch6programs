package joans_workspace;
import java.util.Scanner;
/* Joan Tra
 * Period 1
 * Prompts the user for a number and then takes the sum of all numbers up until user-entered value.
 */
public class OddSum {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		int userinput;
		int finalvalue = 1;
		
		System.out.print("Enter an integer: ");
		userinput = input.nextInt();
		
		for (int i = 1; i <= userinput; i += 2) {
		finalvalue += 1;
		}
		
		System.out.print("The sum is equal to: " + (finalvalue - 1));
		
		input.close();
		
	}

}
