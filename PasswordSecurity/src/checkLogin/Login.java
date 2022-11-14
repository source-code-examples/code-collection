package checkLogin;

import java.util.Scanner;

public class Login {
	
	final static String USERNAME = "Max";
	final static String PASSWORD = "Abcd#6";
	static String inputUsername;
	static String inputPassword;
	
	private static boolean login(String inpUn, String inpPw) {
		if (inpUn.equals(USERNAME) && inpPw.equals(PASSWORD)) {
			return false;			
		}	 		
		return true;
	}
	
	public static void main(String[] args) {		
		System.out.println("*** Login ***\n");	
		boolean noLogin = true;
		try (Scanner scanner = new Scanner(System.in)) {
			while (noLogin) {
				System.out.print("Enter username: ");
				inputUsername = scanner.next();
				System.out.print("Enter password: ");
				inputPassword = scanner.next();
				noLogin = login(inputUsername, inputPassword);
				if (!noLogin) {
					System.out.println("\n* Login successful *");
					break;
				} else {
					System.out.println("\nLogin not successful. Try again.");
				}
			}
		}			
	}
}
