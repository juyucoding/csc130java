/*
 * Scientific programming
 * Spring 2013
 * Assignment#8 Problem#3
 * Author: Julie Yu
 * Modified Date: 18 April 2013
 */

import java.util.Scanner;

class Car 
{
	private double fuelEfficiency;
	private double amountOfFuel;

	public Car(double fuelEfficiency)
	{
		this.fuelEfficiency = fuelEfficiency;
		amountOfFuel = 0;
	}
	public void addGas(double addFuel)
	{
		amountOfFuel = amountOfFuel + addFuel;
	}
	public void drive(double distance)
	{
		amountOfFuel = amountOfFuel - (distance/fuelEfficiency);
	}
	public double getGasLevel()
	{
		return amountOfFuel;
	}

}
public class CarDemo
{

   public static void main(String[] args)
   {
   	double userEfficiency;
	double userGas;
	double userDistance;

	Scanner input = new Scanner(System.in);
	System.out.println("Enter efficiency for your car");
	userEfficiency = input.nextInt();

	Car carEx1 = new Car(userEfficiency);
	
	System.out.println("Enter the amout of gas to add");
	userGas = input.nextInt();

	carEx1.addGas(userGas);

	System.out.println("Enter a distance for your simulation");
	userDistance = input.nextInt();
	carEx1.drive(userDistance);

	System.out.println("Your current gas level: " + carEx1.getGasLevel());
   }
}
