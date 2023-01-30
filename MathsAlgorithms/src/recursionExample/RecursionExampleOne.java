package recursionExample;

/*
 * Code example using recursion
 */
public class RecursionExampleOne {
	
	private static void recursiveActionOne(int num) {
		if (num < 10) {
			System.out.println("num < 10, because num = " + num);
		} else {
			recursiveActionOne(num - 10);
			System.out.println("num = " + num);
		}
	}
	
	public static void main(String[] args) {
		recursiveActionOne(50);
	}
}
