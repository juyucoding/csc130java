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

  //First initialize the array by getting number for the size
  //then ask user to input the values
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
  //display array to chekc if swap is succeeded
  public void displayArray()
  {
	for (int counter=0; counter < numOfValues; counter++)
	{
		System.out.print(array[counter] + "  ");
	}
	
  }
  //swap the elements in array with the front and the back
  public void arraySwap()
  {
  	int temp; // temporary value to hold the previous value
	int item = numOfValues; // the size needs to be decreased to count down
	for (int front=0; front < item; front++)
	{
		temp = array[front]; //the front element starting from 0 will be held in temp variable
		array[front]=array[item-1]; // then the that front variable will be replaced with the last element
		array[item-1] = temp; // since the first element value has been held in tmep variable, the last element will be replzed with the temp value
		item=item-1; // count down from the back
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

