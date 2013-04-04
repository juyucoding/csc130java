/*
   CSC130 Spring Scientific Programming 2013
   Assignment # 4 Problem # 2
   Objective: Calculate employee payment based on working hour
   Modified date: Feb 20 2013
   Author: Julie Yu
*/

import java.util.Scanner;

public class EmpCal
{
  public static void main(String[] args)
  {
	//Declare needed variables
	String empName; // it holds employee name value
	double empSalary; // it holds the salary for the employee
	double empHour; // it holds the hour value to calculate the paycheck
	double empPay; //it holds the value of payment for the employee

	Scanner input = new Scanner(System.in); 

	// get all information from the user
	System.out.println("Enter your name: ");
	empName = input.next();
	System.out.println("Enter your salary(per hour wage): ");
	empSalary = input.nextDouble();
	System.out.println("How many hours did you work for the past week?");
	empHour = input.nextDouble();

	// control sturucture to determine the mehod of calculating payment
	if (empHour > 40) 
	{
		empPay = (empSalary * 40) + (empSalary + 1.5 * (empHour - 40)); // if the employee worked over 40 hours, salary is 1.5 times for the over workng hour
		System.out.println(empName + " , your paycheck is " + empPay);
	}

	else
	{
		empPay = (empSalary * empHour);
		System.out.println(empName + ", your paycheck is " + empPay);	
	}
  }
}

