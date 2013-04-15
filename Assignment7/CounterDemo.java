/*
   CSC130 Scientific Programming
   2013 Spring Assignment # 7
   Problem # 1 
   Author: Julie Yu
   Modified Date: 10 Apr 2013
*/


class Counter
{
   private int counter;

   public void setZero() {
   	counter = 0;
   }
   public void increaseCounter() {
	counter = counter + 1;
   }
   public void decreaseCounter() {
	if (counter < 0)
	{
	   System.out.println("The counter cannot be negative.");
	}
	else
	{
	   counter = counter - 1;
	}
   }

   public int getCounter() {
   	return counter;
   }
   public void displayCounter() {
   	System.out.println("Counter: " + counter);
   }

}

public class CounterDemo {

	public static void main(String[] args) {

	Counter firstDemo = new Counter();
	
	System.out.println("Setting the counter to 0");
	firstDemo.setZero();
	System.out.println("Showing the counter");
	firstDemo.displayCounter();
	System.out.println(firstDemo.getCounter());

	System.out.println("Increasing the counter...");
	firstDemo.increaseCounter();
	firstDemo.increaseCounter();
	System.out.println("Current counter");
	firstDemo.displayCounter();
	System.out.println("Decreasing the counter...");
	firstDemo.decreaseCounter();
	System.out.println(firstDemo.getCounter());

	}

}
