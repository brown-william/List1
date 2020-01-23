

import java.util.Scanner;
/**
 * 
 */

/**
 * @author Nate
 *
 */
public class A3dot5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt for integer to represent the day of the week.
		System.out.println("Enter today's day.");

		int dayOfWeek = input.nextInt();
		
		if (dayOfWeek < 0 || dayOfWeek > 6) {
			System.out.println("Invalid Day of Week.");
			System.exit(1);
		}
		//Prompt for the number of days after chosen day
		System.out.println("Enter a future day");
		int futureDays = input.nextInt();
		// Calculate the future day of the week
		if (futureDays < 0) {
			System.out.println("Invalid future Day.");
			System.exit(1);
		}
		
		input.close();
		int futureDayOfWeek;
		
		futureDayOfWeek = futureDays % 7 + dayOfWeek;
		
		if ( futureDayOfWeek >= 7)
		{
			futureDayOfWeek = futureDayOfWeek % 7;
		}
		//Display the Future day of the week
		
		String s1 = "";
		switch (dayOfWeek) {
		case 0: s1 = "Sunday"; break;
		case 1: s1 = "Monday"; break;
		case 2: s1 = "Tuesday"; break;
		case 3: s1 = "Wednesday"; break;
		case 4: s1 = "Thursday"; break;
		case 5: s1 = "Friday"; break;
		case 6: s1 = "Saturday"; break;
		}
		String s2 = "";
		switch (futureDayOfWeek) {
		case 0: s2 = "Sunday"; break;
		case 1: s2 = "Monday"; break;
		case 2: s2 = "Tuesday"; break;
		case 3: s2 = "Wednesday"; break;
		case 4: s2 = "Thursday"; break;
		case 5: s2 = "Friday"; break;
		case 6: s2 = "Saturday"; break;
		}
		
		//Display the Future day of the week
		System.out.println("Today is " + s1 + ", Future Day of the week is " +
		 s2);
		
		
		
	}

}
