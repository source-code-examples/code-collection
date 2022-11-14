package checkSecurity;

import java.util.Scanner;

/*
 * The program checks if the given password is secure.
 *  
 * The Password should contain at least one digit, one uppercase letter, one special 
 * character and a minimum length of characters. The special characters that can be 
 * used are: ^°\"²§³$%&/{([)]=}?!\\`´*+~'#,;.:-_|<> . At the end the program prints out
 * if the password is secure or not.
 */
public class SecurePassword {

	final static int SMALLEST_PW_LENGTH = 6;
	
	//check all password security requirements 
	private static boolean checkSecurity(String pw) {
		boolean withMinNumOfChars = pwWithMinNumOfChars(pw);
		boolean withDigit = pwWithDigit(pw);
		boolean withUpperCaseLetter = pwWithUppercaseLetter(pw);
		boolean withSpecialChar = pwWithSpecialChar(pw);
		
		return withMinNumOfChars && withDigit && withUpperCaseLetter && withSpecialChar; 
	}
	
	//check if the minimum length of the entered password is 6 characters
	private static boolean pwWithMinNumOfChars(String pw) {
		if (pw.length() >= SMALLEST_PW_LENGTH) {
			return true;
		}
		return false;
	}
	
	//check if any of the characters is a digit
	private static boolean pwWithDigit(String pw) {
		for (int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		return false;		
	}
	
	//check if any of the characters are uppercase
	private static boolean pwWithUppercaseLetter(String pw) {
		for (int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);
			if (Character.isUpperCase(ch)) {
				return true;
			}
		}		
		return false;
	}
	
	//check if any of the characters is a special character
	private static boolean pwWithSpecialChar(String pw) {	
		String specialChars = "^°\"²§³$%&/{([)]=}?!\\`´*+~'#,;.:-_|<>";
		for (int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);
			for (int k = 0; k < specialChars.length(); k++) {
				char specialCh = specialChars.charAt(k);
				if (ch == specialCh) {
					return true;
				}
			}
		}
		return false;
	}

	//program start and output the result if the password is secure or not
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("*** Password Check ***\n");
			System.out.print("The Password should contain at least one digit, one uppercase"
					+ "\nletter, one special character and a minimum length of six characters."
					+ "\n\nNow enter your password: ");
			String password = scanner.next();
			boolean isSecurePassword = checkSecurity(password);
			if (isSecurePassword) {
				System.out.println("\nThis password is secure.");
			} else {
				System.out.println("\nThis password is not secure.");
			}
		}
	}
}
