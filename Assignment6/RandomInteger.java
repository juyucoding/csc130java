/* Random number generator 
 
   Code from : http://www.javapractices.com/topic/TopicAction.do?Id=62

*/
import java.util.Random;

public final class RandomInteger {
   public static final void main(String... aArgs) {
	System.out.println("Generating 10 random integers in range 0...99");
 	
	//note a single Random object is resued here
	Random randomGenerator = new Random();
	for (int i = 1; i <= 10; i++) {
	     int randomInt = randomGenerator.nextInt(5);
	     System.out.println("Generated : " + randomInt);
 	}
	
	System.out.println("Done");
	}
	
}

