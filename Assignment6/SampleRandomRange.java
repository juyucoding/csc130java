/* Another example to generate a random number in java
   code source: http://www.javapractices.com/topic/TopicAction.do?Id=62
*/

import java.util.Random;

//Generate random integers in a certain ragne//

public final class SampleRandomRange 
{
   public static final void main(String... aArgs)
   {
	System.out.println("Generating integers in the rage 1...10");
	
	int START = 1;
	int END = 4;
	Random random = new Random();
	for (int i =1; i <= 10; ++i)
	{
	    showRandomInteger(START,END,random);
	
	}
	System.out.println("Done.");
   }

   private static void showRandomInteger(int aStart, int aEnd, Random aRandom) 
   {
	if (aStart > aEnd)
  	{
		throw new IllegalArgumentException("Start cannot exceed End.");
	}
	//get the range, casting to long to avoid overflow problems
	long range = (long)aEnd - (long)aStart+1;
 	//compute a fraction of the rage, 0 <= frac < range
	long fraction = (long)(range * aRandom.nextDouble());
	int randomNumber = (int)(fraction+aStart);
	log("Generated : " + randomNumber);
	
   }
   
   private static void log(String aMessage) 
   {
	System.out.println(aMessage);
   } 


}

