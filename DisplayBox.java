package q4;
import java.util.Scanner;
public class DisplayBox {
	public static void drawBox(int width) {
		for (int i = 1; i <= width; i++) {
			System.out.print("*");
		}
	}
	
	public static void drawBox(int height, int width) {
		for (int i = 1; i <= height; i++) {
			drawBox(width);
			System.out.println();
		}
	}
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int height;
		int width;
		System.out.println("Enter the height of the box: ");
		height = input.nextInt();
		System.out.println("Enter the width of the box: ");
		width = input.nextInt();
		
		drawBox(height, width);
		input.close();
		
	}

}
