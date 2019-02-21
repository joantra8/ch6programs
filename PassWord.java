package joans_workspace;
import java.util.Scanner;
/* Joan Tra
 * Period 1
 * Prompts the user for a password and repeats three times if user gets it wrong. 
 */ 
public class PassWord {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
	final String password = "please";
	String guess;
	int counter = 0;
	boolean correctPass;
	
	do { 
		System.out.print("Enter the password: ");
		guess = input.nextLine();
		correctPass = guess.equals(password);
		
		 if (correctPass) {
			System.out.println("Access granted.");
			counter = 5;
		}
		
		 if (!correctPass) {
			counter += 1; 
		}
		
	 } while (counter < 4);
	
	    if (counter == 4 && !correctPass) {
		System.out.print("Access denied.");
	    } else if (counter == 4 && correctPass) {
		System.out.print("Access granted.");
		
		input.close();
	}
	}
		
			
		
	{
	}

}
