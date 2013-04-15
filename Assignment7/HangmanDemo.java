/* 
   CSC130 Scientific Programming
   Assignment #7 Problem #2
   Spring 2013
   Author: Julie Yu 
   Modified Date: 11 Ap 2013
*/
import java.util.Scanner;


class Hangman {

	private int userChoiceWord;
	private String secretWord;
	///private char userGuessContinue;
	private String userGuess;
	private String disguisedWord="";
	private String displayGuessedWord;
	private int numOfGuess = 0;
	private int incorrectGuess = 0;


	Scanner keyboard = new Scanner(System.in);

    	public void selectSecretWord() {
	       System.out.println("Pick a number to get a secret word(1 - 5): ");
	       userChoiceWord = keyboard.nextInt();

	       switch(userChoiceWord) {
		     case(1):
			secretWord = "Hello";
			break;
		     case(2):
			secretWord = "Goodbye";
			break;
		     case(3):
			secretWord = "water";
			break;
		     case(4):
			secretWord = "bird";
			break;
		     case(5):
			secretWord = "cookie";
			break;
		     default:
			System.out.println("Invalid input. Good bye!");
			break;    
	        }
		
		for (int i=0; i < secretWord.length(); i++) {
		    disguisedWord = disguisedWord + "?";
		}
	}
	public void makeGuess() {
		
		char userGuessChar;
		

		System.out.println("Guess a word: ");
		userGuess = keyboard.next();
		userGuessChar = userGuess.charAt(0);
		char[] disguisedWordChar = disguisedWord.toCharArray();

		for (int i=0; i < secretWord.length(); i++) {
			

			if (userGuessChar == secretWord.charAt(i))
			{
				disguisedWordChar[i] = userGuessChar;
				disguisedWord = String.valueOf(disguisedWordChar);
			}
			else 
			{
				incorrectGuess = incorrectGuess + 1;
			}
		
		
		
	       }
	       numOfGuess = numOfGuess + 1;
	}
	public String getDisguisedWord() {
	 	return disguisedWord;
	}
	public String getSecretWord() {
		return secretWord;
	}

	public int getGuessCount() {
		return numOfGuess;
	}

	public boolean ifFound() {
		if (disguisedWord == secretWord) {
			return true;
		}
		else {
			return false;
		}
	
	}

}

public class HangmanDemo {

   public static void main(String[] args) {
	
	String userAns;
	char userAnsChar;
	
	Scanner input = new Scanner(System.in);
	
	Hangman hangmanDemo = new Hangman();
	hangmanDemo.selectSecretWord();

	System.out.println("Enter y/Y to continue, enter n/N to exit: ");
	userAns = (input.nextLine()).toLowerCase();
	userAnsChar = userAns.charAt(0);

	while (userAnsChar == 'y') 
	{
		hangmanDemo.makeGuess();
		System.out.println("Enter y/Y to continue, press any to exit: ");
		userAns = input.next();
		userAnsChar = userAns.charAt(0);
	}

	System.out.println("The disguised word is " + hangmanDemo.getDisguisedWord());
	System.out.println("You guessed " + hangmanDemo.getGuessCount() + " times");
	System.out.println("Is the word found? : " + hangmanDemo.ifFound());


   }
}	
