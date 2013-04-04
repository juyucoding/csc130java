/* CSC130 Unit 5 Assignment # 6
   Problem # 3
   The Fibonacci numbers are defined by the sequence:

   f1 = 1
   f2 = 1
   fn = fn-1 + fn-2.

   Reformulate that as

   Fold1 = 1;
   Fold2=1;
   Fnew=fold1+fold2;

   After that, discard fold2, which is no longer needed, and set fold2 to fold1, and fold1 to fnew. Repeat an appropriate number of times.

   Implement a program that prompts the user for an integer n and prints the nth Fibonacci number, using the above algorithm. 
*/

import java.util.Scanner;

public class Fib
{
   public static void main(String[] args)
   {
	int fib_1 = 1; // 1th fibonacci number as a default
  	int fib_2 = 1; // 2nd fib number as a default
	int fib_new = fib_1 + fib_2; // 3rd fib number
	int userAns;

	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number for fibonacci number: ");
	userAns = input.nextInt();

	if (userAns == 1) // if user inputs 1th fib number, then it returns 1
	{
	   System.out.println(fib_1);
	}	 
	else if (userAns == 2) // if user inputs to get 2nd fib number, then it returns 1
	{
	   System.out.println(fib_2);
	}
	else if (userAns >= 3)
	{
	   int n=4; // From user inputs greater than equal to 3 for the nth fib number, it returns accordingly by swaping the value and re-assigning a value
	   while (n <= userAns)
	   {
		fib_2 = fib_1; // fib_2 gets the previous value fib_1
	   	fib_1 = fib_new; // then fib_1 gets a new value fib_new and hold it
		fib_new = fib_2 + fib_1; // then fib_new gets updated with summation of two values
		n=n+1; // n goes up to count to loop through
	   }
	   System.out.println("You typed to get " + userAns + "th fibonacci number");
	   System.out.println("Your fibonacci number is " + fib_new);
	}
	
   }
}


