package calculateFibonacciNumbers;

import java.util.Scanner;

/*
 * The program calculates the fibonacci number of a given index of the fibonacci sequence. 
 * This index called fibIdx starts from 0. The program use a recursion algorithm. If the 
 * input number is a negative, the program returns -1.
 * 
 * The fibonacci sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, ...
 */
public class FibonacciSequence {

	private static int calculateFibNum(int fibIdx) {
		if (fibIdx < 0) {
			return -1;
		} else if (fibIdx <= 1) {
			return fibIdx;
		}
		int fibNum = calculateFibNum(fibIdx - 1) + calculateFibNum(fibIdx - 2);
		return fibNum;
	}
	
	public static void main(String[] args) {
		System.out.print("Which index of the Fibonacci sequence should be printed? ");
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("The Fibonacci Number is: " + calculateFibNum(scanner.nextInt()));
		} catch (Exception e) {
			System.err.println("Exception: " + e);
		}
	}
}
