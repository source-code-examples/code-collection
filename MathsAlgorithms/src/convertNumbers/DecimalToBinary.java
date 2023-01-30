package convertNumbers;

import java.util.Scanner;

/*
 * The program converts decimal numbers entered by the user into binary numbers. 
 */
public class DecimalToBinary {

	private static int convertDecToBin(int decNum) {
		if (decNum == 0) {
			return 0;
		}
		int binNum = convertDecToBin(decNum / 2) * 10 +  decNum % 2;
		return binNum;
	}
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter Decimal Number: ");
			int decimalNum = scanner.nextInt();
			int binaryNum = convertDecToBin(decimalNum);
			System.out.println("The Binary Number of " + decimalNum + " is: " + binaryNum);
		} catch (Exception e) {
			System.err.println("Exception: " + e);
		}
	}
}
