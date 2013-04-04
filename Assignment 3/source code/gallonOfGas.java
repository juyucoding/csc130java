/* 
   CSC130 Assignment #3
   Objective: Given the input from the user, it calculates cost per 100 miles and efficiency
   Modified date: Feb 08 2013
   Author: Julie Yu
*/

import java.util.Scanner;

public class gallonOfGas 
{
	public static void main(String[] args)
	{
	   double userGas;
	   double userEfficiency;
	   double userPrice;

	   double costPerMiles;
	   double howFar;

	   System.out.println("Enter a number of gallon of gas in the tank: ");
	   Scanner keyboard = new Scanner(System.in);
	   userGas = keyboard.nextDouble();
	   System.out.println("Enter the fuel efficiency(miles per gallon): ");
	   userEfficiency = keyboard.nextDouble();
	   System.out.println("Enter the price of gas per gallon: ");
	   userPrice = keyboard.nextDouble();

	   costPerMiles = (userPrice*100)/userEfficiency;
	   howFar = userEfficiency*userGas;
	
	   System.out.println("The cost per 100 miles is " + costPerMiles + ".");
	   System.out.println("The car can go " + howFar + " at the most with the gas in the car");
	
	}
}
