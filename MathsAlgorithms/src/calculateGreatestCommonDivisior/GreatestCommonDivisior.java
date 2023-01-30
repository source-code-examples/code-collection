package calculateGreatestCommonDivisior;

import java.util.Scanner;

/*
 * The program calculates the Greatest Common Divisor of two numbers entered by the user.
 */
public class GreatestCommonDivisior {

	public static int calculateGCD(int num1, int num2) {
		if (num1 < 0 || num2 < 0) {
			return -1;
		} if (num2 == 0) {
			return num1;
		} else {
			int gct = calculateGCD(num2, num1 % num2);
			return gct;
		}
	}
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Number 1: ");
			int num1 = scanner.nextInt();
			System.out.print("Number 2: ");
			int num2 = scanner.nextInt();
			int gcd = calculateGCD(num1, num2);
			System.out.println("The Greatest Common Divisor of "
					+ num1 + " and " + num2 + " is: " + gcd);
		} catch (Exception e) {
			System.err.println("Exception: " + e);
		}
	}
}
