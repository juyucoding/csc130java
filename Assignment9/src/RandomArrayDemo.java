/*
 * CSC130 Scientific programming
 * Spring 2013
 * Assignment#9 Problem#1
 * Author: Julie Yu
 * Modified Date: Apr 30 2013
 */
import java.util.Random;

class RandomArray
{
  int randomArray[] = new int[10];
  int ranNum;
  
  Random generator = new Random();
  public void setRandomNumbers()
  {
        System.out.println("The originial array ");
  	for (int counter=0; counter < 10; counter++)
  	{
  		ranNum = generator.nextInt(11);
		randomArray[counter] = ranNum;
  	}
  }
  public void displayArray()
  {
    for (int counter=0; counter<10; counter++)
    {
      System.out.print(randomArray[counter] + "  ");
    }
  }
  public void getEvenIndexNum()
  {
        System.out.println("The even indexed numbers ");
  	for (int counter=0; counter < 10; counter++)
	{
		if (counter%2==0)
		{
			System.out.print(randomArray[counter] + " " );
		}
	}
  }
  public void getEvenNum()
  {
         System.out.println("The even number elements ");
  	for (int counter=0; counter < 10; counter++)
	{
		if (randomArray[counter]%2==0)
		{
			System.out.print(randomArray[counter] + "  ");
		}
	}
  }
  public void reverseOrder()
  {
        System.out.println("Reversed order ");
  	for (int counter=9; counter >= 0; counter--)
	{
		System.out.print(randomArray[counter] + "  ");
	}
  }
  public void firstANDlast()
  {
  	System.out.println("The first element: " + randomArray[0]);
	System.out.println("The last element: " + randomArray[9]);
  }
  public void maxMin()
  {
  	int min = randomArray[0];
	int max = randomArray[0];

	for (int counter=0; counter < 10; counter++)
	{
		if (randomArray[counter] < min)
		{
			min = randomArray[counter];
		}
	}
	for (int counter=0; counter < 10; counter++)
	{
		if (randomArray[counter] > max)
		{
			max = randomArray[counter];
		}
	}
	System.out.println("Minimum: " + min);
	System.out.println("Maximum: " + max);
   }
   public void sumOfElements()
   {
   	int sumOfEle = 0;
	for (int counter=0; counter < 10; counter++)
	{
		sumOfEle = sumOfEle + randomArray[counter];
	}
	System.out.println("The sum of the elements is " + sumOfEle);
   }
   public void alternateSum()
   {
   	int evenSum = 0;
	int oddSum = 0;
	for (int counter=0; counter < 10; counter++)
	{
		if (counter%2==0)
		{
			evenSum = evenSum + randomArray[counter];
		}
		else 
		{
			oddSum = oddSum + randomArray[counter];
		}
	}
	System.out.println("The alternate sum of the elements is  " + (evenSum - oddSum));
   }

}

public class RandomArrayDemo
{
  public static void main(String[] args)
  {
    RandomArray demoVer1 = new RandomArray();
    demoVer1.setRandomNumbers();
    
    demoVer1.displayArray();
    System.out.println();
    
    demoVer1.getEvenIndexNum();
    System.out.println();
    
    demoVer1.getEvenNum();
    System.out.println();
    
    demoVer1.reverseOrder();
    System.out.println();
    
    demoVer1.firstANDlast();
    demoVer1.maxMin();
    
    demoVer1.sumOfElements();
    demoVer1.alternateSum();
    
  }
}
