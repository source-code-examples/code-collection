package calculateFactorial;

/*
 * The program calculates the faculties of 10 given numbers.
 * If the input number is a negative, the program returns -1. 
 * It uses recursion. The algorithm/mathematical formula is: 
 * n! = 1 * 2 * 3 * ... * (n - 2) * (n - 1) * n = (n - 1)! * n
 */
public class Factorial {

	private static int calculateFactorial(int num) {
		if (num < 0) {
			return -1;
		} else if (num == 0) {
			return 1;
		} else {
			int result =  num * calculateFactorial(num - 1);
			return result;
		}
			
	}
	
	public static void main(String[] args) {
		int nums[] = {0, 1, 2, 3, 4, 5, -6, 9, 10, -15};
		for (int i = 0; i < 10; i++) {
			System.out.println("The factorial of " + nums[i] + " is " + calculateFactorial(nums[i]));
		}
	}
}
