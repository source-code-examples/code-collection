package calculateLeastCommonMultiple;

import java.util.Scanner;

/*
 * The program calculates the Least Common Multiple (called "lcm") 
 * of two integer numbers entered by the user. If one integer is negative
 * it returns -1.
 */
public class LeastCommonMultiple {
	
	private static int calculateLCM(int number1, int number2) {
		if (number1 < 0 || number2 < 0) {
			return -1;
		}
		if (number1 == 0 || number2 == 0) {
			return 0;
		}
		for (int lcm = number1; ; ) {
			for (int num2 = number2; num2 <= lcm * num2 ; num2 += number2) {
				if (lcm == num2) {
					return lcm;
				}							
			}
			lcm += number1;
		}
	}
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Number 1: ");
			int num1 = scanner.nextInt();
			System.out.print("Number 2: ");
			int num2 = scanner.nextInt();
			int gcd = calculateLCM(num1, num2);
			System.out.println("Lowest Common Multiple: " + gcd);
		} catch (Exception e) {
			System.err.println("Exception: " + e);
		}
	}
}

// 12*8=96; 12%12==0, 8%12!=0; 12*2=24%12==0, 24%8==0
// 20*30=600; 


