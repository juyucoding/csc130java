/* 
   CSC130 Assignment #3 problem #3 ver.2
   Objective: Break the numer into each digit
   Modified date: Feb 8 2013
   Author: Julie Yu

*/
import java.util.Scanner;

public class breakNum2
{
	public static void main(String[] args)
	{
	   int counter;
	   String userInput;
	   String answer = "";

	   System.out.println("Enter a number(less than 5 digit and positive): ");

	   Scanner input = new Scanner(System.in);
	   userInput = input.next();

	   counter = 0;

	   if (userInput.length() > 5)
	   {
		System.out.println("Your number digit is more than 5. Invalid.");
	   	
	   }

	   else
	   {
               while (counter < userInput.length())
               {
                       answer = answer + userInput.charAt(counter) + " ";
                       counter++;
               }
           
               System.out.println("Your number is " + answer);
	   }

	}
}

