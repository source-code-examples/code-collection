package findSpecialValuesInArray;

import java.util.Scanner;

/*
 * The program finds the largest integer of numbers that the user enters. 
 * The user can set the amount of input numbers himself.
 */
public class MaximumInArray {
	
	private static int findMaxNum(int[] numArray) {
		int largest = numArray[0];
		for (int i = 0; i < numArray.length; i++) {
			if (largest < numArray[i]) {
				largest = numArray[i];
			}
		}
		return largest;
	}
	
	public static void main(String[] args) {
		System.out.println("*** Finding the Maximum Number in an Array ***");
		System.out.print("\nHow many numbers should the array contain? ");
		try (Scanner scanner = new Scanner(System.in)) {
			int numOfArrayNums = scanner.nextInt();
			int[] numArray = new int[numOfArrayNums];
			System.out.print("Now enter these " + numOfArrayNums + " numbers: ");
			for (int i = 0; i < numArray.length; i++) {
				numArray[i] = scanner.nextInt();
			}
			int largest = findMaxNum(numArray);
		
			System.out.print("\nArray Numbers: ");
			for (int k = 0; k < numArray.length; k++) {
				System.out.print(numArray[k] + " ");
			}	
			System.out.println("\n\nMaximum Number: " + largest);

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}
