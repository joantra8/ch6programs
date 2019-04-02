import java.util.Scanner;
public class DisplayBox2 {
	public static void drawBox(int width) {
		for (int i = 1; i <= width; i++) {
			System.out.print("*");
		}
	}
	
	public static void drawBox(int width, String choice) {
		for (int i = 1; i <= width; i++) {
			System.out.print(choice);
		}
	}
	public static void drawBox(int height, int width) {
		for (int i = 1; i <= height; i++) {
			drawBox(width);
			System.out.print("");
		
		}
	}
	public static void drawBox(int height, int width, String choice) {
		for (int i = 1; i <= height; i++) {
			drawBox(width, choice);
			System.out.print("");
			
		}
	}
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		int width;
		int height;
		
		String answer;
		String choice;
		
		System.out.print("Enter the width: ");
		width = input.nextInt();
		System.out.print("Enter the height: ");
		height = input.nextInt();
		System.out.print("Would you like to choose a character? Enter y for yes or n for no.");
		answer = input.next();
		
		if (answer.equals("y")) {
			System.out.print("Enter your chosen character: ");
			choice = input.next();
			
			drawBox(height, width, choice);
			
		} else {
			drawBox(height, width);
		
			
		}
		input.close();
	}
}
