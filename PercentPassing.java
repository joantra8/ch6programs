package joans_workspace;
import java.util.Scanner;
public class PercentPassing {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		final int SENTINAL = -1;
		int userscore = 0;
		int numvalues = 0;
		int numPassing = 0;
		double percentPassing;
		
		while (userscore != SENTINAL) {
			System.out.print("Enter your score: ("+ SENTINAL +"to quit)");
			userscore = input.nextInt();
			
			if (userscore > 70) {
				numPassing += 1;
				
			}
			numvalues += 1;
		}
		percentPassing = (double)numPassing/((double) numvalues - 1) * 100;
		System.out.print("The average of your passing scores is: " + percentPassing + "%");
		input.close();
	}

}
