/*
   CSC 130 SPRING Scientific Programming 2013
   Assignment # 4 Problem 4
   Objective: Get an user input of the month to return the days in the month
   Modified Date: Feb 20 2013
   Author: Julie Yu
*/

import java.util.Scanner;

public class CheckMonth
{
   public static void main(String[] args)
   {
      int userMon;
     

      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number for the month to get how many days in the month: ");
      userMon = input.nextInt();

      if ((userMon < 0) || (userMon > 12))
      {
	  System.out.println("Your input is not valid.(Month: 1 ~ 12)");
      }

      if (userMon == 2)
      {
	  System.out.println("Days in this month: 28 days or 29 days");
   
      }
      else if ((userMon == 1) || (userMon == 3) || (userMon == 5) || (userMon == 7) || (userMon == 8) || (userMon == 10) || (userMon == 12))
      {
	  System.out.println("Days in the month: 31 days");
      }
      else if((userMon == 4) || (userMon == 6) || (userMon == 9) || (userMon == 11))
      {
	  System.out.println("Days in the month: 30 days");
      } 
   }
}
