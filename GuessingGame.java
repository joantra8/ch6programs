package joans_workspace;
import java.util.Scanner;
public class GuessingGame {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		
		final int myNum = 4;
		int guess;
		
		System.out.print("What's your guess? ");
		guess = input.nextInt();
		
		while (guess != myNum) {
			System.out.print("Nope! Guess again. ");
			guess = input.nextInt();
		}
		
		 if (guess == myNum)
			 System.out.print("You got it!");
		 
		 input.close();
		 
		}
	}


