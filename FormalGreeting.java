package joans_workspace;
import java.util.Scanner;
/* Joan Tra
 * Period 1
 * Prompt user for name or title and display a message accordingly.
 */
public class FormalGreeting {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		
		String name;
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		input.close();
		
		if(name.startsWith("Mr.")== true) {
			System.out.print("Hello, sir.");
		} else if (name.startsWith("Mrs.")== true) {
			System.out.print("Hello, ma'am.");
		} else if (name.startsWith("Ms.")== true) {
				System.out.print("Hello, ma'am.");
		} else if (name.startsWith("Miss")== true) {
					System.out.print("Hello, ma'am.");
		} else { 
			System.out.print("Hello, " + name + ".");
					
					
		}
		}
		
	}


