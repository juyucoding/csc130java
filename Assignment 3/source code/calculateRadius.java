/* 
   CSC130 Assingment #3 problem # 2 
   Objective: Calculate area, circimferance, volum and surface area with user given radius value
   Modified date: Feb 8 2013
   Author: Julie Yu
*/

import java.util.Scanner;
import java.lang.Math;

public class calculateRadius {
	

	public static void main(String[] args)
	{	
	   double radius;
	   double area;
	   double circum;
	   double volume;
	   double surfaceArea;
  	  
	   System.out.println("Enter the radius value: ");
	   Scanner keyboard = new Scanner(System.in);
	   radius = keyboard.nextDouble();
	   
	   System.out.println("The area is " + (2 * Math.PI * (Math.pow(radius,2))) + ".");
	   System.out.println("The circumfirence is " + (2 * Math.PI * radius) + ".");
	   System.out.println("The volume is " + ((4/3) * Math.PI * (Math.pow(radius,3))) + ".");
	   System.out.println("The surface area is " + (4 * Math.PI * (Math.pow(radius,2))) + ".");	

	}


}

