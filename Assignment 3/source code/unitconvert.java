/* 
   CSC130 Assignments #3 problem # 1
   Objective: Convert a value in meter that is obtained from the user to miles, feet and inches
   Modified date: Feb 8 2013
   Author: Julie Yu
*/

import java.util.Scanner;

public class unitconvert {

	public static final double miles = 0.000621317119;
        public static final double feet = 3.2808;
        public static final double inches = 39.37;
	
	public static void main(String[] args) 
	{
	   System.out.println("Please enter a number(meters) to convert: ");
	   double userInput;
 

	   Scanner keyboard = new Scanner(System.in);
	   userInput = keyboard.nextDouble();

	   System.out.println(userInput + " is " + (miles * userInput) + " miles.");
	   System.out.println(userInput + " is " + (feet * userInput) + " feets.");
	   System.out.println(userInput + " is " + (inches * userInput) + " inches.");


	  
	}
}

