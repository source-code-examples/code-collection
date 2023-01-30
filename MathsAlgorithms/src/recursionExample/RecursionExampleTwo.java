package recursionExample;

/*
 * Code Example using recursion.
 */
public class RecursionExampleTwo {
	
	static String[] fruits = {"apple", "cherry", "pineapple", "pear" ,"mango" ,"plum", "kiwi"};
	
	private static void recursiveActionTwo(int idx) {
		if (idx < 2) {
			System.out.println("\nfruit == " + fruits[idx] + ", because idx of fruits = " + idx);
		} else {
			recursiveActionTwo(idx - 1);
			System.out.println(fruits[idx]);
		}
	}
	
	public static void main(String[] args) {
		recursiveActionTwo(5);
	}
}