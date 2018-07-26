public class Euler4 {

	public static void main(String[] args) {
		String palindrome = new String();
		int largestPalindrome = 0;

		for(int i = 100; i < 1000; i++) {
			for(int j = 100; j < 1000; j++) {
				int product = i * j;
				palindrome = Integer.toString(product);
				String reversePalindrome = reverseString(palindrome);

				if(palindrome.equals(reversePalindrome) && (product > largestPalindrome)) {
					largestPalindrome = product;
				}
			}
		}

		System.out.println("The largest 3-digit palindromic number is: " + largestPalindrome);

	}

	public static String reverseString(String word) {
		StringBuilder word2 = new StringBuilder(word);
		StringBuilder reverseWord = word2.reverse();
		String newWord = reverseWord.toString();
		return newWord;
	}




}
