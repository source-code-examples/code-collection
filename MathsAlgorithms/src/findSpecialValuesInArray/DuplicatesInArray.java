package findSpecialValuesInArray;

import java.util.Scanner;

/*
 * The program prints the first integer that occurs more than once. 
 * The user decides how many numbers to check. The program returns -1,
 * if there is no number twice.
 */
public class DuplicatesInArray {
	
	static String firstDuplicate = "";

	private static int findFirstDuplicate(int[] numArray) {
		for (int i = 0; i < numArray.length; i++) {
			for (int k = i + 1; k < numArray.length; k++) {
				if (numArray[i] == numArray[k]) {
					return numArray[k];
				}
			} 	
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println("*** Finding First Duplicate Number in an Array ***");
		System.out.print("\nHow many numbers should the array contain? ");
		try (Scanner scanner = new Scanner(System.in)) {
			int numOfArrayNums = scanner.nextInt();
			int[] numArray = new int[numOfArrayNums];
			System.out.print("Now enter these " + numOfArrayNums + " numbers: ");
			for (int i = 0; i < numArray.length; i++) {
				numArray[i] = scanner.nextInt();
			}
			int firstDublicate = findFirstDuplicate(numArray);
		
			System.out.print("\nArray Numbers: ");
			for (int k = 0; k < numArray.length; k++) {
				System.out.print(numArray[k] + " ");
			}	
			System.out.println("\n\nFirst Duplicate Number: " + firstDublicate);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

	}

}
