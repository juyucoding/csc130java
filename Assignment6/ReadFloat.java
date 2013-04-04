/* CSC130 UNIT5 ASSIGNMENT # 6
   Problem # 1
   Write a program that reads a set of floating-point values. Ask the user to enter the values, then print:

   The average of the values
   The smallest of the values
   The largest of the values
   The range, that is the difference between the smallest and the largest
   Of course, you may only prompt for the values once.

   Author: Julie Yu
   Modified date: 21/03/2013
*/

import java.util.Scanner;

public class ReadFloat
{
   public static void main(String[] args)
   {
	int n=0;
  	int userCount;
	float userInput;
	float sum=0;
	float min;
	float max;
	float range;

	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter number of input you are going to type: ");
	userCount = keyboard.nextInt();

	System.out.println("Enter a float point number: ");
	userInput = keyboard.nextFloat();
 	min = userInput;
	max = userInput;
	sum=sum+userInput;

	for (; n < userCount-1; n++)
	{
	   System.out.println("Enter a float point number: ");
	   userInput = keyboard.nextFloat();
	   sum  = sum + userInput;

	       if (userInput < min)
	       {
	   	   min = userInput;
	       }
	       if (userInput > max)
	       {
		   max = userInput;
	       }
	}
	range = max - min;

	System.out.println("Sum: " + sum + ", min: " + min + ", max: " + max +  ", range: " +  range);
   }
} 

