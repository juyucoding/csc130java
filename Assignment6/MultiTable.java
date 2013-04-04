/* CSC130 Unit 5 Assignment # 6
   Problem # 4
   Write a program that prints a multiplication table, like this:
   1 2 3 4 5 6 7 8 9 10
   2 4 6 8 10 12 14 16 18 20
   3 6 9 12 15 18 21 24 27 30
   …
   10 20 30 40 50 60 70 80 90 100

   Author: Julie Yu
   Modified date: Mar 21 2013
*/

public class MultiTable
{
   public static void main(String[] args)
   {
	int num;
	int temp;
	int count;
	
	// The first number in every row is increated by 1 and every colum is incrased by the number of row.
	for (num=1; num <= 10; num++) // this for loop represents row 
	{
	    temp=num; // temp will hold the value and loop through 10 times by incremending by temp value
			 
	    for (count=1; count <= 10; count++) // it counts up to 10
	    {
		System.out.print(temp); 
		temp=temp+num; // since num value has not changed in this loop, it goes through by adding the 					intact value of num
	    }
	    // after going through adding num value to temp value, the outer for loop will add 1 to the num
	    // value and the second row will be incremended as it was in the first row
	    
	    System.out.println();
	
	}
   }
}
