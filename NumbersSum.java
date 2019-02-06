package joans_workspace;
import java.util.Scanner;
public class NumbersSum {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		int compnum = 1;
		int sumcomp = 0;
		int usernum;
		System.out.println("Please enter a number greater than 1: ");
		usernum = input.nextInt();
		
		while (compnum <= usernum) {
			System.out.print(compnum);
			sumcomp += compnum;
			compnum += 1;
		}
		System.out.print(sumcomp);
		
		input.close();
		
	}

}

