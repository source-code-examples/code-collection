package calculatePrimeNumbers;

import java.util.Scanner;

/*
 * The program calculates the prime numbers. The user decides what value the prime numbers 
 * should not exceed. The first prime numbers are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, ...
 */
public class PrimeNumber {

	static String firstPrimeNums = "";
	static int num = 0;
	
	private static String calculatePrimeNumbers(int numOfPrimeNums) {
		for (int i = 0; i < numOfPrimeNums; i++) {
			int count = 0;
			for (int k = i; k > 0; k--) {
				if (i % k == 0) {
					count++;
				}
			}
			if (count == 2) {
				firstPrimeNums += i + " ";
			}
		}	
		return firstPrimeNums;
	}
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("You want to get the prime numbers 2 up to a maximum of...? ");
			int numOfPrimeNums = scanner.nextInt();
			String firstPrimeNums = calculatePrimeNumbers(numOfPrimeNums);
			System.out.println("The Prime Numbers up to " + numOfPrimeNums + " are: " + firstPrimeNums);
		} catch (Exception e) {
			System.err.println("Exception: " + e);
		}
	}
}
