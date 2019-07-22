package co.grandcircus;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		System.out.println("Welcome to the Pig Latin Translator!");
		Scanner scan = new Scanner(System.in); 
		String cont = "y";
		do {
		System.out.println();
		System.out.println("Enter a word to be translated: ");
		String userWord = scan.nextLine();
		userWord = userWord.toLowerCase();
		System.out.println();

		if ((userWord.startsWith("a") || (userWord.startsWith("e")
				|| (userWord.startsWith("i") || (userWord.startsWith("o") || (userWord.startsWith("u"))))))) {
			System.out.println(userWord + "way");
		} else {
			System.out.println(consWord(userWord));
		}
		
		System.out.println();
		System.out.println("Would you like to translate another word? (y/n)");
        cont = scan.nextLine();
	}
	
		while (cont.equalsIgnoreCase("y")) ;
        System.out.println("Thanks for playing.");
    
        scan.close();
}
	public static boolean vowelWord(String firstLetter) {
		if (firstLetter.charAt(0) == 'a' || firstLetter.charAt(0) == 'e' || firstLetter.charAt(0) == 'i'
				|| firstLetter.charAt(0) == 'o' || firstLetter.charAt(0) == 'u') {

			return true;
		}
		return false;
	}

	private static StringBuffer consWord(String userInput) {
		StringBuffer userConsIndex = new StringBuffer(userInput);

		for (int i = 0; i < userInput.length(); i++) {

			if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i'
					|| userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u') {

				userConsIndex = userConsIndex.append(userConsIndex.subSequence(0, i) + ("ay"));
				userConsIndex.delete(0, i);
			
				return userConsIndex;
			}

		}
		return userConsIndex;

	}
}
