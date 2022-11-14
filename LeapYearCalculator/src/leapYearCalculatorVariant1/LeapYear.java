package leapYearCalculatorVariant1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* The program calculates the leap years. 
* 
* The program stops if the user does not enter any year numbers. He can also stop 
* the program by entering the number 0.
* Use three methods, one for entering the annual dates and outputting the results, 
* one for calculating leap years and finally the main method. At the end of each 
* loop, the program "sleeps" for a few seconds.
*/
public class LeapYear {
	
	//find out if the input number is a leap year
	private static boolean isLeapYear(int inputYear) {
		boolean leapYear = (inputYear % 4 == 0) && (inputYear % 100 != 0 || (inputYear % 100 == 0 && inputYear % 400 == 0));
		return leapYear;
	}
	
	//read input data and output results
	private static void inputAndOutput() {
		int inputYear = 0;
		boolean programContinues = true;
		try (Scanner scanner = new Scanner(System.in)) {
			while (programContinues) {
				System.out.print("\nEnter a year or 0 to cancel the program: ");
				inputYear = scanner.nextInt();
				if (inputYear == 0) {
					System.out.println("You cancel the program.");
					programContinues = false;
				} else {
					boolean leapYear = isLeapYear(inputYear);
					if (leapYear) {
						System.out.println(inputYear + " is a leap year."); 
					} else {
						System.out.println(inputYear + " is not a leap year."); 
					}			
				}
				//the program takes a short break
				Thread.sleep(2000);
			}			
		} catch (InputMismatchException inputMismatch) {
			System.err.println("Wrong input! Exception: " + inputMismatch + ".\nStart the program again.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	//program start and end
	public static void main(String[] args) {
		System.out.println("Leap Year Calculator\n\n*** program start ***");	
		inputAndOutput();
		System.out.println("\n*** program end ***");	
	}
}
