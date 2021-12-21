package listQuestionsAnswer;

public class C08_List {

	public static void main(String[] args) {
		/*
		 * Write a java program which accept a sentence as parameter, than reverses
		 * sentence by using StringBuilder and checks if sentence is palindrome or not
		 * (without case sensitivity).Use StringBuilder. Input : I love Java. Output:
		 * Reversed sentence : avaJ evol I. It is not a palindrome"
		 */

		String cumle = "I love Java";

		String ters = "";
		boolean polindrome = true;

		for (int i = cumle.length() - 1; i >= 0; i--) {

			ters += cumle.charAt(i);
			if (cumle.charAt(i) != cumle.charAt(cumle.length() - 1 - i)) {
				polindrome = false;
			}
		}

		System.out.print("kelimenin tersten yazilimi: " + ters + " ,");

		if (!polindrome) {
			System.out.print("Polindrome degildir");
		} else {
			System.out.print("Polindromedur");
		}

	}

}
