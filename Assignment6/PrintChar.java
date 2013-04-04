/*  CSC130 Assignment # 6
    Problem # 2
    Write a program that reads a word and prints each character of the word on a separate line. For example, if the user provides the input "Harry", the program prints:
    H
    a
    r
    r
    y
    Author : Julie Yu
    Modified Date: 21/03/2013
*/

import java.util.Scanner;
 
public class PrintChar
{
   public static void main(String[] args)
   {
	String userAns;
	int len;

	Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
	userAns = input.next();
	len = userAns.length()-1;

	for (int counter=0; counter <= len; counter++)
	{
	   System.out.println(userAns.charAt(counter));
	}
   }
}
