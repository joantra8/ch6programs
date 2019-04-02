package q4;

public class Exponentation {
import java.util.Scanner;
public class Exponentation {
	public static double powerOf(double num1, double num2) {
		double xNum2;
		xNum2 = Math.pow(num1, num2);
		return(xNum2);
		
		
	}
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("Enter the first number: ");
		num1 = input.nextDouble();
		
		System.out.println("Enter the second number: ");
		num2 = input.nextDouble();
		
		input.close();
		
		num2 = powerOf(num1, num2);
		System.out.println(num2);
	}

}


