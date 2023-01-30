package calculateAverageOfArrayNumbers;

import java.util.Scanner;

/*
 * The program calculates the sum of any set of integer numbers entered by the user.
 * And it also calculates the average of any set of integer to exactly two decimal places.
 */
public class AverageOfArrayNumbers {	
	static double sumOfArrayNums = 0;
	
	//calculate the average of the array numbers
	private static double calculateAverage(double[] numArray) {
		for (int i = 0; i < numArray.length ; i++) {
			sumOfArrayNums += numArray[i];
		}
		double avgOfNums = sumOfArrayNums / numArray.length;
		return avgOfNums;
	}
	
	public static void main(String[] args) {
		System.out.println("*** Calculating the Average of Numbers in an Array ***");
		System.out.print("\nHow many integers should the array contain? ");
		try (Scanner scanner = new Scanner(System.in)) {
			int numOfArrayNums = scanner.nextInt();
			double[] numArray = new double[numOfArrayNums];
			System.out.print("Now enter these " + numOfArrayNums + " integers: ");
			for (int i = 0; i < numArray.length; i++) {
				numArray[i] = scanner.nextDouble();
			}
			double averageOfNums = calculateAverage(numArray);
			
			System.out.print("\nArray Numbers: ");
			for (int k = 0; k < numArray.length; k++) {
				System.out.printf("%.0f ", numArray[k]);
			}	
			System.out.printf("%nSum of Array Numbers: %.0f%n", sumOfArrayNums);
			System.out.printf("Average of Array Numbers: %.2f", averageOfNums);
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}
