/* 
 * Scientific Programming
 * Spring 2013
 * Assignment#8 Problem#1
 * Author: Julie Yu
 * Modified Date: 18 April 2013
 */

import java.util.Scanner;

class Address {

	private int houseNum;
	private String street;
	private int aptNum;
	private String city;
	private String state;
	private int postalCode;

 	//without apt num
	public Address(int houseNum, String street, String city, String state, int postalCode)
	{
		this.houseNum = houseNum;
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	//with an apt num
	public Address(int houseNum, int aptNum, String street, String city, String state, int postalCode)
	{
		this.houseNum = houseNum;
		this.aptNum = aptNum;
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	public void displayAddress()
	{
		System.out.println(street);
		System.out.print(city + " ");
		System.out.print(state + " ");
		System.out.println(postalCode + " ");
	}
	public boolean comesBefore(int posCode)
	{
		if (posCode < postalCode)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class AddressDemo {
	public static void main(String[] args) {
	
	int userAns;
	int userHouseNum;
	int userAptNum;
	String userStreet;
	String userCity;
	String userState;
	int userPosCode;
	int comparePosCode;

	Scanner keyboard = new Scanner(System.in);

	System.out.println("To enter your address, ");
	System.out.println("Press 1 for address without an apartment number.");
	System.out.println("Or press 2 for address with an apartment number.");

	userAns = keyboard.nextInt();

	if (userAns == 1)
	{
		System.out.println("Eneter your house number: ");
		userHouseNum = keyboard.nextInt();
		System.out.println("Enter your street name: ");
		userStreet = keyboard.next();
		keyboard.nextLine();
		System.out.println("Enter your city name: ");
		userCity = keyboard.next();
		keyboard.nextLine();
		System.out.println("Enter your state: ");
		userState = keyboard.next();
		keyboard.nextLine();
		System.out.println("Enter the postal code: ");
		userPosCode = keyboard.nextInt();

		Address demover1 = new Address(userHouseNum, userStreet, userCity, userState, userPosCode);
		System.out.println("Here is what you typed");
	
		demover1.displayAddress();
		System.out.println("Enter other postal code to compare if the postal code comes before yours");
		comparePosCode = keyboard.nextInt();
		System.out.println(demover1.comesBefore(comparePosCode));
	}
	else if (userAns == 2)
	{
		System.out.println("Enter your house number: ");
		userHouseNum = keyboard.nextInt();
		System.out.println("Enter your apartment number ");
		userAptNum = keyboard.nextInt();
		System.out.println("Enter your street name: ");
		userStreet = keyboard.next();
		System.out.println("Enter your city name: ");
		userCity = keyboard.next();
		System.out.println("Enter your state: ");
		userState = keyboard.next();
		System.out.println("Enter your postal code: ");
		userPosCode = keyboard.nextInt();

		Address demover1 = new Address(userHouseNum, userAptNum, userStreet, userCity, userState, userPosCode);
		System.out.println("Here is what you typed");

		demover1.displayAddress();
		System.out.println("Enter other postal code to compare if the postal code comes before yours");
		comparePosCode = keyboard.nextInt();
		System.out.println(demover1.comesBefore(comparePosCode));
	}
	else
	{
		System.out.println("Invalid input.");
	}
    }
}
