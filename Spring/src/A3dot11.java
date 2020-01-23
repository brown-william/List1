import java.util.Scanner;
/**
 * We are going to prompt the user to enter in a month, 1 = January 2 = February ect
 * We will also prompt the user to enter a year. 
 * The program will return the number of days in that month
 */

/**
 * @author Nate
 *
 */
public class A3dot11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//prompt the user to enter in the month
		System.out.println("Enter in the Month; Jan = 1, ect.");
		
		int month = input.nextInt();
		//check input
		if (month < 1 || month > 12) {
			System.out.println("Invalid Month.");
			System.exit(1);
		}
		//prompt the user to enter in the year
		System.out.println("Enter in the Year");
		int year = input.nextInt();
		input.close();
		if (year < 0) {
			System.out.println("Invalid Year.");
			System.exit(1);
		}
		if (year > 3000) {
			System.out.println("Does it matter? Do you think you'll live that long?");
			System.exit(1);
		}
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		String s = "";
		switch(month) {
		
		case 1: s = "January, " + year + " has 31 days."; break;
		case 2: if (isLeapYear == false) 
			s = "February, " + year + " has 28 days."; 
			else 
			s = "February, " + year + " has 29 days."; break;
		case 3: s = "March, " + year + " has 31 days."; break;
		case 4: s = "April, " + year + " has 30 days."; break;
		case 5: s = "May, " + year + " has 31 days."; break;
		case 6: s = "June, " + year + " has 30 days."; break;
		case 7: s = "July, " + year + " has 31 days."; break;
		case 8: s = "August, " + year + " has 31 days."; break;
		case 9: s = "September, " + year + " has 30 days."; break;
		case 10: s = "October, " + year + " has 31 days."; break;
		case 11: s = "November, " + year + " has 30 days."; break;
		case 12: s = "December, " + year + " has 31 days."; break;
		
		
		
		}

		System.out.println(s);
		
		
		
		
		
		
		
	}

}
