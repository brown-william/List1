package week11;
import java.util.InputMismatchException;
import java.util.Scanner;
public class A12dot2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean continueInput = true;
		
		do {
			try {
				
				System.out.println("Input two Integers");
				
				int newInt = scan.nextInt();
				
				int newInt1 = scan.nextInt();
				
				System.out.println("The sum of " + newInt + " and " + newInt1 + " is " + (newInt + newInt1));
				continueInput = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("Try again, Please enter Integers");
				scan.nextLine();
				
				
				
			}
			
			
			
		}while(continueInput);
		
		
		
		
		
		
	
		
		
		
	}

}
