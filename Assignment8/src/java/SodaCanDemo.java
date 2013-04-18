/* 
 * Scientific programming
 * Spring 2013
 * Assignment#8 Problem#2
 * Author: Julie Yu
 * Modified date: 18 April 2013
 */

import java.util.Scanner;

class SodaCan
{

	private double height;
	private double radius;
	private double surfaceArea;
	private double volume;
	public static final double pi = 3.14;

	//constructor
	public SodaCan(double height, double radius)
	{
		this.height = height;
		this.radius = radius;
	}
	private void calSurfaceArea()
	{
		surfaceArea = (2 * pi * Math.pow(radius,2)) + ((2 * pi * radius) * height);
	}
	private void calVolume() 
	{
		volume = pi * Math.pow(radius,2) * height;
	}

	public void getSurfaceArea()
	{
		calSurfaceArea();
		System.out.println("The surface are for the soda can is " + surfaceArea); 
	}
	public void getVolume()
	{
		calVolume();
		System.out.println("The volume of the soda can is " + volume);
	}

}

public class SodaCanDemo
{
	public static void main(String[] args)
	{
		double userHeight;
		double userRadius;

		Scanner input = new Scanner(System.in);
		System.out.println("Eneter a height for the soda can: ");
		userHeight = input.nextDouble();
		System.out.println("Enter a radius for the soda can: ");
		userRadius = input.nextDouble();
		SodaCan demover1 = new SodaCan(userHeight, userRadius);

		demover1.getSurfaceArea();
		demover1.getVolume();
	}
}
