/*
   CSC 130 SPRING Scientific Programming 2013
   Assignment # 4 Problem # 1
   Objective: To print out the oldest, youngest from three people that are input from the user
   Modified Date: Feb 20 2013
   Author: Julie Yu
*/

import java.util.Scanner;

// This class compares the older age
class Older
{

	public static int Comp(int num1,int num2)
	{
		if (num1 > num2)
			return (num1);

		else
			return (num2);
	}

}

//This class compares smaller ages
class Smaller
{
	public static int Comp(int n1, int n2)
	{
		if (n1 < n2)
			return n1;
		else
			return n2;
	}
}

// It uses 'Older' and 'Smaller' classes to compare the third element to print out the oldest and smallest age
public class Age2
{
	public static void main(String[] args)
	{
		int p1;
		int p2;
		int p3;
		int middle;
		int oldest;
		int smallest;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first person's age: ");
		p1 = input.nextInt();
		System.out.println("Enter the second person's age: ");
		p2 = input.nextInt();
		System.out.println("Enter the third person's age: ");
		p3 = input.nextInt();

		Older keyboard = new Older();
		middle = keyboard.Comp(p1,p2);
		oldest = keyboard.Comp(middle, p3);
		System.out.println(oldest);

		Smaller userInput = new Smaller();
		middle = userInput.Comp(p1,p2);
		smallest = userInput.Comp(middle, p3);
		System.out.println(smallest);
	}
}
