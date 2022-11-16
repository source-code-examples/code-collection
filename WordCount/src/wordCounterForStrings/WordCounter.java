package wordCounterForStrings;


public class WordCounter {
	
	final static String INPUT_TEXT = "This program counts the words of the given text.\n"
									+ "It does not count the whitespaces. It also counts\n"
									+ "the lines.\nFinally "
									+ "the program prints out: the number of words\n"
									+ "and lines.\n"
									+ "The result is:\n"
									+ "7 lines and 43 words."
									+ "Then the program stops.";
		
	private static int countLines() {
		String[] lines = INPUT_TEXT.split("\n");
		return lines.length;
	}
	
	private static int countWords() {
		String[] words = INPUT_TEXT.split(" ");
		return words.length + countLines();		
	}
	
	public static void main(String[] args) {		
		System.out.println("*** Word and Line Counter ***");
		System.out.println("\nThe input text is: \n- - - - - - - - - -\n" + INPUT_TEXT +"\n- - - - - - - - - -\n");
		System.out.println("Number of Lines: " + countLines());
		System.out.println("Number of Words: " + countWords());
	}
}