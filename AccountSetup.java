package joans_workspace;
import java.util.Scanner;
/* Joan Tra
 * Period 1
 * Prompts the user for a username and a passsword with at least 8 characters.
 */
public class AccountSetup {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		
		String user;
		
		System.out.print("Enter your username: ");
		user = input.nextLine();
		
		user = user.toLowerCase();
		
		int numPass;
		String pass;
		
		do {
			System.out.print("Enter a password with at least 8 characters: ");
			pass = input.nextLine();
			numPass = pass.length();
			
		} while (numPass < 8);
			pass = pass.toLowerCase();
		
		System.out.println("The username is: " + user );
		System.out.println("The password is: " + pass);
		
		input.close();
		
		}
		
	}

