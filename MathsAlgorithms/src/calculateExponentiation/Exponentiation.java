package calculateExponentiation;

import java.util.Scanner;

/*
 * This program calculates the result of a number called "base" 
 * to the power of an exponent called "exp". It uses recursion.
 */
public class Exponentiation {
	
	private static int exponentiate(int base, int exp) {
		if (exp == 0) {
			return 1;
		} else {
			int result = base * exponentiate(base, exp - 1);
			return result;
		}
	}
	
	public static void main(String[] args) {	
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a base: ");
			int base = scanner.nextInt();
			System.out.print("Enter an exponent: ");
			int exp = scanner.nextInt();
			int result = exponentiate(base, exp);
			System.out.println("Result: " + result);
		} catch (Exception e) {
			System.err.println("Exception: " + e);
		}
	}
}
