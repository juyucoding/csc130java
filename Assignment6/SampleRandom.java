import java.util.Random;

class RandomNum
{
   public static int RandomRange(int max , int min)
   {
       return (int)(Math.random() + min);
   }
}

public class SampleRandom
{
   public static void main(String[] args)
   {
	int sample;

	RandomNum keyboard = new RandomNum();
	sample = keyboard.RandomRange(4,1);
	
	System.out.println(sample);
	System.out.println((int)Math.random()+1);	
   }
}
