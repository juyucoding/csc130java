/* 
   CSC130 Assignment #3 problem #3 ver.1
   Objective: Break the numer into each digit
   Modified date: Feb 8 2013
   Author: Julie Yu

*/

import java.util.Scanner;

public class breakNumber {

	public static void main(String[] args)
	{

		// Initialize variable types and names
		
		int k;
		int r;
		String digitNum = "";  //digitNum will accumulate the remiander of the number backward
		int counter; // counter for a loop to make digitNum in the right order
   		String answer=""; // the final answer with space between digit

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number less than 5 digit: "); // get user input that has less than 5 digits and positive
		k = input.nextInt();

		while (k > 0) // this loop goes through to get a reminder of the number and divide the number into smaller digits
		{
		   r = k%10; // first it gets a reminder by modulo 10. It will generate the last digit number
		   k = k/10; // Then the number k which is the user input is divided by 10 to get a 1 smaller digit than original number
		   digitNum = digitNum + r; // the reminder is concatnated into digitNum and is converted to string type from integer
		   
		}
		System.out.println(digitNum); //it shows the reversed version of the number
		//System.out.println(digittNum.length());
		
		counter = digitNum.length()-1; // counter is set to the length of digitNum to count back

		// this loop runs from the length of digitNum to get reverse the order of the number.
		while (counter >= 0)
		{
			answer = answer + digitNum.charAt(counter) + " "; // answer will have the right order of the number as well as space between numbers
			counter--;
		}
		System.out.println(answer);
		
		
	}
}
