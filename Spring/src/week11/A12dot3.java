package week11;
import java.util.Scanner;
public class A12dot3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("Enter an integer out of a hundred");
		
		
		
		
			int index = scan.nextInt();
			int[] myList = new int[100];
		
		
		for(int i = 0; 1 < myList.length; i++ ) {
		myList[i] = (int) (Math.random() * 100);
		
		System.out.println("Your number is " + (myList[index]));
		}
		}
		catch(IndexOutOfBoundsException ex) {
		System.out.println("Not within Index");
		System.exit(1);
		}
		
			
		
		
		
	}

}
