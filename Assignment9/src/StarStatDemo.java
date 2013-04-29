/* 
 * CSC130 Scientific programming
 * Spring 2013
 * Assignment#9 Problem #2
 * Author: Julie Yu
 * Date modifired: 29 Apr 2013
 * NOTE: I don't understand the problem well. 
 * 1) Shorter bars should be drawn with fewer asterisks proportionally
 * ??
*/

import java.util.Scanner;

class StarStat
{
	//initialize the array
	
	int numOfValues;
	String[] valueName;
	int[] value;
	double currentMax;

	Scanner keyboard = new Scanner(System.in);

	// set the values for the array
	public void setValues()
	{
		// Determine how many values should be input
		System.out.println("please enter how many values to input: ");
		numOfValues = keyboard.nextInt();
		valueName = new String[numOfValues];
		value = new int[numOfValues];

		// set the value with the caption
		for (int counter=0; counter < numOfValues; counter++)
		{
			System.out.println("Please type a caption for the value # " + (counter+1));
			valueName[counter] = keyboard.next();
			System.out.println("Please type a value for the value # " + (counter+1));
			value[counter] = keyboard.nextInt();
		}
	}

	// Find the maximum value in the value array
	public void findMax()
	{
		currentMax = value[0];
		for (int counter=0; counter < numOfValues; counter++)
		{
			if (currentMax < value[counter])
			{
				currentMax = value[counter];
			}
		}
	}
	
	// First the smaller value other than maximum should be calculated proportionally 
	public void displayStarStat()
	{
		double valueStars;
		for (int counter=0; counter < numOfValues; counter++)
		{
			double newValue = value[counter];
			
			valueStars = newValue/currentMax;
			
			System.out.print(valueName[counter]);

			for (int count=0; count<valueStars; count++)
			{	
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
public class StarStatDemo
{
   public static void main(String[] args)
   {
   	StarStat demoVer1 = new StarStat();
	demoVer1.setValues();
	demoVer1.findMax();
	demoVer1.displayStarStat();
   }
}
