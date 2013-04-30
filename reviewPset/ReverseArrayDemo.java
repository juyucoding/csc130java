/*
 * CSC130 Scientific Programming
 * Spring 2013
 * Review Problem #9
 * Author: Julie Yu
 * Modified date: Apr 30 2013
 */
import java.util.Scanner;

class ReverseArray
{
  int numOfValues;
  int array[];

  Scanner keyboard = new Scanner(System.in);

  public void setArray()
  {
  	System.out.println("Type a number of values to input: ");
	numOfValues = keyboard.nextInt();
	array = new int[numOfValues];
	for (int counter=0; counter<numOfValues; counter++)
	{
		System.out.println("Please enter a value for value # " + (counter+1));
		array[counter] = keyboard.nextInt();
	}
  }
  public void displayArray()
  {
	for (int counter=0; counter < numOfValues; counter++)
	{
		System.out.print(array[counter] + "  ");
	}
	
  }
  public void arraySwap()
  {
  	int temp;
	int item = numOfValues;
	for (int front=0; front < item; front++)
	{
		temp = array[front];
		array[front]=array[item-1];
		array[item-1] = temp;
		item=item-1;
	}
  }
}
public class ReverseArrayDemo
{
   public static void main(String[] args)
   {
   	ReverseArray demoVer1 = new ReverseArray();
	demoVer1.setArray();
   	System.out.print("The originial array: "); 
	demoVer1.displayArray();
	System.out.println();
	demoVer1.arraySwap();
	System.out.println();
	System.out.print("The reversed array: ");
	demoVer1.displayArray();
	System.out.println();
   }
}

