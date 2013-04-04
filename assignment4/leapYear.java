/* 
   CSC 130 SPRING Scientific Programming 2013
   Assignment # 4 Problem # 5
   Objective: To check if the input year is a leap year
   Modified Date: Feb 20 2013
   Author: Julie Yu
*/

import java.util.Scanner;

public class leapYear
{
  public static void main(String[] args)
  {
	int year;
 	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a year to check: ");
	year = input.nextInt();
	
	if (((year%100 != 0) && (year%400 == 0)) || (year%4 == 0))
	{	
		System.out.println("This is year is a leap year");
	} 
	
	else
	{
		System.out.println("This year is not a leap year");
	}
  }
}
