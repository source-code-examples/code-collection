package leapYearCalculatorVariant2;

import java.util.Scanner;

/*
* The program calculates the leap years from 1900 to 2100.
* Use the main method to find out if the input number is a leap year.
*/
public class LeapYear {
	
	public static void main(String[] args) {		
		try (Scanner scanner = new Scanner(System.in)) {		
			System.out.print("* program start *\nEnter a year between 1900 and 2100: ");
			int inputYear = scanner.nextInt();	
			if (inputYear >= 1900 && inputYear <= 2100) {
				//find out if the input number is a leap year
				boolean leapYear = (inputYear % 4 == 0) && (inputYear % 100 != 0 || (inputYear % 100 == 0 && inputYear % 400 == 0));			
				if (leapYear) {
					System.out.println(inputYear + " is a leap year."); 
				} else {
					System.out.println(inputYear + " is not a leap year.");
				}									
			} else {
				System.out.println("The years must be between 1900 and 2100!");
			}
		} catch (Exception e) {
			System.err.println("Exception: " + e);
		}
		System.out.println("* program end *");
	}
}
