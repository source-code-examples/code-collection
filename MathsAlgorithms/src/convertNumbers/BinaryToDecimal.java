package convertNumbers;

import java.util.Scanner;

/*
 * The program converts binary numbers entered by the user into decimal numbers. 
 * For input numbers that are not binary, the program returns -1.
 */
public class BinaryToDecimal {

	private static int convertBinToDec(int binNum) {
		
		int decNum = 0;
		int binNumLen = (""+ binNum).length();
		
		for (int i = 0; i < binNumLen; i++) {
			//check if it's a binary number
			if (binNum % 10 > 1) {
				return -1;		
			}
			decNum = (int) (decNum + (binNum % 10) * Math.pow(2, i)); 
			binNum = binNum / 10;
		}
		return decNum;
	}
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter Binary Number: ");
			int binaryNum = scanner.nextInt();
			int decimalNum = convertBinToDec(binaryNum);
			System.out.println("Decimal Number: " + decimalNum);
		} catch (Exception e) {
			System.err.println("Exception: " + e);
		}
	}
}
