package leapYearCalculatorVariant3;

import java.util.Scanner;

/*
 *  The program calculates the leap years.
 */
public class LeapYear {
	
	//Leap Year Algorithm; find out if the input number is a leap year
	private static boolean isLeap(int year) {
		boolean divByFour = year % 4 == 0;
		boolean divByHundred = year % 100 != 0;
		boolean divByFourHundred = year % 400 == 0;
		boolean leapYear = divByFour && (divByHundred || divByFourHundred);
		return leapYear;
	}
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a year: ");
			int inputYear = scanner.nextInt();
			boolean leapYear = isLeap(inputYear);
			System.out.println(inputYear + " is a leap year: " + leapYear);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}
