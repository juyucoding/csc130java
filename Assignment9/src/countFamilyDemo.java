/*
 * CSC130 Scientific Programming
 * Spring 2013
 * Assignment#9 Problem#2
 * Author: Julie Yu
 * Modified date: Apr 30 2013
 */

import java.util.Scanner;

class CountFamily
{
   
   double userInput;
   double maxIncome;
   double[] income;

   Scanner keyboard = new Scanner(System.in);

   public void getFamilyNum(int k)
   {
   	income = new double[k];
   }

   public void setIncome()
   {
   	
	for (int counter=0; counter < income.length; counter++)
	{
   	    System.out.println("Enter family income: ");
	    userInput = keyboard.nextDouble();
	    income[counter] = userInput;
	}

   }
   private double maxIncome()
   {
   	maxIncome = income[0];

   	for (int counter=0; counter < income.length; counter++)
	{	
		if (maxIncome < income[counter])
		{
		   maxIncome = income[counter];
		}

	}
	return maxIncome;
   }
   public void familyLessthan10()
   {
   	double lessthan10 = (maxIncome * 0.1);
	int countFamily = 0 ;

	for (int counter=0; counter < income.length; counter++)
	{
		if (income[counter] < lessthan10)
		{
			System.out.println("Family less than 10% of maximum: " + income[counter]);
			countFamily = countFamily + 1;
		}
	}
	
   }

}
public class countFamilyDemo
{
        
	
        public static void main(String[] args)
	{
                  
         Scanner keyboard = new Scanner(System.in);         
	 int familyNum;
	 
         System.out.println("Enter how many family: ");
	 familyNum = keyboard.nextInt();
	 
         CountFamily demoVer1 = new CountFamily();
	 demoVer1.getFamilyNum(familyNum);
	 demoVer1.setIncome();
	}
}
