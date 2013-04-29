/*
 * CSC130 Scientific programming
 * Spring 2013
 * Assignment#9 Problem #3
 * Author: Julie Yu
 * Modified Date: 29 April 2013
 *
 */
 

import java.util.Scanner;

class theaterChart
{
   Scanner keyboard = new Scanner(System.in);
   int[][] table= new int[9][10];

   
   //When the class is invoked, then this constructor for theater seat chart is created.
   public theaterChart()
   {
         
   	for (int row=0; row<3; row++)
	{
	   for (int colum=0; colum<10; colum++)
	   {
	   	table[row][colum] = 10;
	   }
	   //System.out.println();
	}
	for (int row=3; row<6; row++)
	{
	   for (int colum=0; colum<10; colum++)
	   {
	   	if ((colum == 0) || (colum == 1) || (colum == 8) || (colum == 9))
		{
		    table[row][colum] = 10;
		}
		else
		{
	   	    table[row][colum] = 20;
	        }
	   }
	   //System.out.println();
	}
	for(int row=6; row<9; row++)
	{
	   for (int colum=0; colum<10; colum++)
	   {
	   	if (row==6)
		{
		    if ((colum==0) || (colum==1) || (colum==8) || (colum==9))
		    {
		    	table[row][colum]=20;
		    }
		    else if ((colum==2) || (colum==3) || (colum==6) || (colum==7))
		    {
		    	table[row][colum]=30;
		    }
		    else
		    {
		    	table[row][colum]=40;
		    }
		}
		else if (row==7)
		{		
		    if (colum==0)
		    {
		    	table[row][colum]=20;
		    }
		    else if ((colum==1) || (colum==2) || (colum==7) || (colum==8))
		    {
		    	table[row][colum]=30;
		    }
		    else if ((colum==3) || (colum==6))
		    {
		    	table[row][colum]=40;
		    }
		    else
		    {
		    	table[row][colum]=50;
		    }
	   	}
		else
		{
		    if ((colum==0) || (colum==9))
		    {
		    	table[row][colum]=30;
		    }
		    else if ((colum==1) || (colum==8))
		    {
		    	table[row][colum]=40;
		    }
		    else
		    {
		    	table[row][colum]=50;
		    }
		}
	    

	   }
	 //System.out.println();
        }
   }
   
   // This display the seat
   public void displayChart()
   {
      for (int row=0; row<9; row++)
      {
         for (int colum=0; colum<10; colum++)
         {
            System.out.print(table[row][colum] + "  ");
         }
         System.out.println();
      }
   }
   public int userChoice()
   {
      int userInput;
      
      System.out.println("Do you want get a tickey by a price or a seat?");
      System.out.println("Please press 1 for seat or 2 for a price");
      userInput = keyboard.nextInt();
      
      if (userInput == 1)
      {
         System.out.println("You select number 1");
         System.out.println("We will find your ticket by seats");
         
      }
      else if(userInput == 2)
      {
         System.out.println("You select number 2");
         System.out.println("We will find your ticket by price");
         
      }

      return userInput;

   }
   
   //Check if the seat is taken
   private boolean isTaken(int row, int colum)
   {
      if (table[row][colum] == 0)
      {
         return false;
      }
      else
      {
         return true;
      }
   }
   
   //Get a ticket by a seat location
   public void pickBySeat()
   {
      int rowNum;
      int colNum;
      
      displayChart();
      System.out.println("Please select row and colum ");
      System.out.print("Type a row number: ");
      rowNum = keyboard.nextInt();
      System.out.print("Type a colum number: ");
      colNum = keyboard.nextInt();
      
      if ((rowNum < 9) && (colNum < 10))
      {
         if (isTaken(rowNum, colNum))
         {
            table[rowNum][colNum] = 0;
            System.out.println("Your seat is selected.");
            System.out.println("Your seat is at " + rowNum + " row and " + colNum + " colum.");
         }
         else
         {
            System.out.println("Sorry, this seat is taken. Please choose other seat");
         }
      }
      else
      {
         System.out.println("Invalid input. Row number: 0 - 8(included), Colum number: 0 - 9(included)");
      }
   }
   
   //Get a seat by price
   public void pickByPrice()
   {
      int userPrice;
      int userRowPick;
      int userColPick;
      
      //Get price from user to filter the seat location
      System.out.println("Type your price to pick a seat");
      userPrice = keyboard.nextInt();
      
      //When the price is $10
      if (userPrice == 10)
      {
         //It explains where the available seats are located
         System.out.println("$10 seats are");
         System.out.println("-----------------------------------");
         System.out.println("ROW: 0 - 2 and COLUM: 0 - 9");
         System.out.println("-----------------------------------");
         System.out.println("ROW: 3 - 5 and COLLUM: 0,1 or 8,9");
         
         //Among the available seats, ask user to select a seat
         System.out.println("Please choose a row: ");
         userRowPick = keyboard.nextInt();
         
         //When the user choose row between 0 to 2 inclusive, user can choose anyseat colum between 0 - 9
         if ((userRowPick >=0) && (userRowPick <= 2))
         {
            System.out.println("Please choose a colum: ");
            userColPick = keyboard.nextInt();
            
            //if the row and colum are valid inputs, then the value in the table becomes 0 and indicates the seat location.
            if ((userColPick >= 0) && (userColPick <=9))
            {
               if (isTaken(userRowPick, userColPick))
               {
                  table[userRowPick][userColPick] = 0;
                  System.out.println("Your $10 seat is at " + userRowPick + " row " + userColPick + " colum");
               }
               else
               {
                  System.out.println("Sorry the seat is taken");
               }
            }
            //other wise print out that user typed invalid colum input
            else
            {
               System.out.println("Invalid colum input");
            }
         }
         
         // if user choose a seat row between 3 - 5(inclusive) than user can select colum amont 0,1,8 or 9.
         else if ((userRowPick >= 3) && (userRowPick <= 5))
         {
            System.out.println("Please choose a colum: ");
            userColPick=keyboard.nextInt();
            if ((userColPick == 0) || (userColPick == 1) || (userColPick == 8) || (userColPick == 9))
            {
               if (isTaken(userRowPick,userColPick))
               {
                  table[userRowPick][userColPick] = 0;
                  System.out.println("Your $10 seat is at " + userRowPick + " row " + userColPick + " colum");
               }
               else
               {
                  System.out.println("Sorry the seat is taken");
               }
            }
            else
            {
               System.out.println("Invalid colum input");
            }
         }
         //If user selects row number exceeds 5, than it is invalid input
         else
         {
            System.out.println("Invalid row input");
         }
      }
      
      //When user selects $20 seat 
      else if (userPrice == 20)
      {
         System.out.println("$20 seats are");
         System.out.println("--------------------------------------------------------");
         System.out.println("ROW: 3 - 5(inclusive) and COLUM: 2 - 7(inclusive)");
         System.out.println("--------------------------------------------------------");
         System.out.println("ROW: 6 and COLUM: 0,1,8 or 9");
         System.out.println("--------------------------------------------------------");
         System.out.println("ROW: 7 and COLUM: 0 or 9");
         
         System.out.println("Please choose a row: ");
         userRowPick = keyboard.nextInt();
         
         
         if ((userRowPick >= 3) && (userRowPick <= 5))
         {
            System.out.println("Please choose a colum");
            userColPick = keyboard.nextInt();
            if ((userColPick >= 2) && (userColPick <= 7))
            {
               if (isTaken(userRowPick, userColPick))
               {
                  table[userRowPick][userColPick] = 0;
                  System.out.println("Your $20 seat is at " + userRowPick + " row " + userColPick + " colum.");
               }
               else
               {
                  System.out.println("Sorry the seat is taken");
               }
            }
            else
            {
               System.out.println("Invalid colum input.");
            }
         }
         else if (userRowPick == 6)
         {
            System.out.println("Please choose a colum");
            userColPick = keyboard.nextInt();
            if ((userColPick == 0) || (userColPick == 1) || (userColPick == 8) || (userColPick == 9))
            {
               if (isTaken(userRowPick, userColPick))
               {
                  table[userRowPick][userColPick] = 0;
                  System.out.println("Your $20 seat is at " + userRowPick + " row " + userColPick + " colum");
               }
               else
               {
                  System.out.println("Sorry the seat is taken");
               }
            }
            else
            {
               System.out.println("Invalid colum input");
            }
         }
         else if (userRowPick == 7)
         {
            System.out.println("Please choose a colum");
            userColPick = keyboard.nextInt();
            if ((userColPick == 0) || (userColPick == 9))
            {
               if (isTaken(userRowPick, userColPick))
               {
                  table[userRowPick][userColPick] = 0;
                  System.out.println("Your $ 20 seat is at " + userRowPick + " row " + userColPick + " colum");
               }
               else
               {
                  System.out.println("Sorry the seat is taken");
               }
            }
            else
            {
               System.out.println("Invalid colum input");
            }
         }
         else
         {
            System.out.println("Invalid row input");
         }
         
      }
      
      //When user selects $30 seat
      else if (userPrice == 30)
      {
         System.out.println("$30 seats are ");
         System.out.println("------------------------------------------");
         System.out.println("ROW: 6 and COLUM: 2,3,6 or 7");
         System.out.println("------------------------------------------");
         System.out.println("ROW: 7 and COLUM: 1,2,7 or 8");
         System.out.println("------------------------------------------");
         System.out.println("ROW: 8 and COLUM: 0,9");
         
         System.out.println("Please choose a row: ");
         userRowPick = keyboard.nextInt();
         
         if (userRowPick == 6)
         {
            System.out.println("Please choose a colum: ");
            userColPick = keyboard.nextInt();
            if ((userColPick == 2) || (userColPick == 3) || (userColPick == 6) || (userColPick == 7))
            {
               if (isTaken(userRowPick, userColPick))
               {
                  table[userRowPick][userColPick] = 0;
                  System.out.println("You $30 seat is at " + userRowPick + " row " + userColPick + " colum");
               }
               else
               {
                  System.out.println("Sorry the seat is taken");   
               }
            }
            else
            {
               System.out.println("Invalid colum input");
            }
         }
         else if (userRowPick == 7)
         {
            System.out.println("Please Choose a colum: ");
            userColPick = keyboard.nextInt();
            if ((userColPick == 1) || (userColPick == 2) || (userColPick == 7) || (userColPick == 8))
            {
               if (isTaken(userRowPick, userColPick))
               {
                  table[userRowPick][userColPick] = 0;
                  System.out.println("Your $30 seat is at " + userRowPick + " row " + userColPick + " colum");
               }
               else
               {
                  System.out.println("Sorry the seat is taken");
               }
            }
            else
            {
               System.out.println("Invalid colum input");
            }
         }
         else if (userRowPick == 8)
         {
            System.out.println("Please choose a colum: ");
            userColPick = keyboard.nextInt();
            if ((userColPick == 0) || (userColPick == 9))
            {
               if (isTaken(userRowPick, userColPick))
               {
                  table[userRowPick][userColPick] = 0;
                  System.out.println("Your $30 seat is at " + userRowPick + " row " + userColPick + " colum");
               }
               else
               {
                  System.out.println("Sorry the seat is taken");
               }
            }
            else
            {
               System.out.println("Invalid colum input");
            }
         }
         else
         {
            System.out.println("Invalid row input");
         }
      }
      
      else if (userPrice == 40)
      {
         System.out.println("$40 seats are: ");
         System.out.println("-------------------------------------------");
         System.out.println("ROW: 6 and COLUM: 4 or 5");
         System.out.println("--------------------------------------------");
         System.out.println("ROW: 7 and COLUM: 3 or 6");
         System.out.println("--------------------------------------------");
         System.out.println("ROW: 8 and COLUM: 1 or 8");
         
         System.out.println("Please choose a row: ");
         userRowPick = keyboard.nextInt();
         
         if (userRowPick == 6)
         {
            System.out.println("Please choose a colum: ");
            userColPick = keyboard.nextInt();
            if ((userColPick == 4) || (userColPick == 5))
            {
               if (isTaken(userRowPick, userColPick))
               {
                  table[userRowPick][userColPick] = 0;
                  System.out.println("Your $40 seat is at " + userRowPick + " row " + userColPick + " colum");
               }
               else
               {
                  System.out.println("Sorry the seat is taken");
               }
            }
            else
            {
               System.out.println("Invalid colum input");
            }
         }
         else if (userRowPick == 7)
         {
            System.out.println("Please choose a colum: ");
            userColPick = keyboard.nextInt();
            if((userColPick == 3) || (userColPick == 6))
            {
               if (isTaken(userRowPick, userColPick))
               {
                  table[userRowPick][userColPick] = 0;
                  System.out.println("Your $40 seat is at  " + userRowPick + " row " + userColPick + " colum");
               }
               else
               {
                  System.out.println("Sorry the seat is taken");
               }
            }
            else
            {
               System.out.println("Invalid colum input");
            }
         }
         else if (userRowPick == 8)
         {
            System.out.println("Please choose a colum: ");
            userColPick = keyboard.nextInt();
            if ((userColPick == 1) || (userColPick == 8))
            {
               if(isTaken(userRowPick, userColPick))
               {
                  table[userRowPick][userColPick] = 0;
                  System.out.println("Your $40 seat is at " + userRowPick + " row "+ userColPick + " colum");
               }
               else
               {
                  System.out.println("Sorry the seat is taken");
               }
            }
            else
            {
               System.out.println("Invalid colum input");
            }
         }
         else
         {
            System.out.println("Invalid row input");
         }
      }
      else if (userPrice==50)
      {
         System.out.println("$50 seats are: ");
         System.out.println("--------------------------------------");
         System.out.println("ROW: 7 and COLUM: 4 or 5");
         System.out.println("--------------------------------------");
         System.out.println("ROW: 8 and COLUM: 1 - 7(inclusive)");
         
         System.out.println("Please choose a row: ");
         userRowPick = keyboard.nextInt();
         
         if (userRowPick == 7)
         {
            System.out.println("Please choose a colum: ");
            userColPick = keyboard.nextInt();
            if ((userColPick == 4) || (userColPick == 5))
            {
               if (isTaken(userRowPick, userColPick))
               {
                  table[userRowPick][userColPick] = 0;
                  System.out.println("Your $ 50 seat is at " + userRowPick + " row " + userColPick + " colum");
               }
               else
               {
                  System.out.println("Sorry the seat is taken");
               }
            }
            else
            {
               System.out.println("Invalid colum input");
            }
         }
         else if (userRowPick == 8)
         {
            System.out.println("Please choose a colum: ");
            userColPick = keyboard.nextInt();
            if ((userColPick >= 1) && (userColPick <= 7))
            {
               if (isTaken(userRowPick, userColPick))
               {
                  table[userRowPick][userColPick] = 0;
                  System.out.println("Your $ 50 seat is at " + userRowPick + " row " + userColPick + " colum");
               }
               else
               {
                  System.out.println("Sorry the seat is taken");
               }
            }
            else
            {
               System.out.println("Invalid colum input");
            }
         }
         else
         {
            System.out.println("Invalid row input");
         }
      }
      else
      {
         System.out.println("Invalid user price.");
      }
      
      
      
   }
   
   

}

public class theaterCharDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int  userInput;
      boolean userFlag=true;
      
      int userSeatMethod;
      
      theaterChart demo = new theaterChart();
      demo.displayChart();
      
      System.out.println("Press 0 to exit");
      userInput = keyboard.nextInt();
      while (userFlag)
      {
         userSeatMethod = demo.userChoice();
         if (userSeatMethod == 1)
         {
            demo.pickBySeat();
         }
         else if (userSeatMethod == 2)
         {
            demo.pickByPrice();
         }
         else
         {
            System.out.println("Invalid user input.");
         }
         System.out.println("Press 0 to exit");
         userInput = keyboard.nextInt();
         if (userInput == 0)
         {
            userFlag = false;
         }
      }
   	
   	       
      
   }
}
