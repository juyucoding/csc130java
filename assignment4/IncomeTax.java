/*
   CSC 130 SPRING Scientific Programming 2013
   Assignment # 4 Problem # 3
   Objective: Calculate income tax based on user's income
   Modified Date: Feb 20 2013
   Author: Julie Yu
*/

import java.util.Scanner;

public class IncomeTax
{
  public static void main(String[] args)
  {
	int userIncome;
	double incomeTax;

	Scanner keyboard = new Scanner(System.in);

	System.out.println("Enter your income: ");
	userIncome = keyboard.nextInt();

	if (userIncome < 50000)
	{
	    System.out.println("Your income tax is" + (userIncome * 0.01));
	}
	else if ((50000 < userIncome) && (userIncome <= 75000))
	{
	    System.out.println("Your income tax is " + (userIncome * 0.02));
	}
	else if ((75000 < userIncome) && (userIncome <= 100000))
	{
	    System.out.println("Your income tax is " + (userIncome * 0.03));
	}
	else if ((100000 < userIncome) &&(userIncome <= 250000))
	{
	    System.out.println("Your income tax is " + (userIncome * 0.04));
	}
	else if (( 250000 < userIncome) && (userIncome <= 500000))
	{
	    System.out.println("Your income tax is " + (userIncome * 0.05));
	}
	else
	{
	    System.out.println("Your income tax is " + (userIncome * 0.06));
	}
	
	
  }
}
