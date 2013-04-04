/* CSC130 Unit 5 Assignment # 6 

 Prolem # 5
 Author: Julie Yu
 Date: Mar 21st 2013
 
 The Drunkard's Walk. A drunkard in a grid of streets randomly picks one of four directions and stumbles to the next intersection,
 then again randomly picks one of four directions, and so on. You might think that on average the drunkard doesn't move very far because the choices cancel each other out,
 but that is actually not the case.
 Represent locations as integer pairs (x, y). Implement the drunkard's walk over 100 intersections, starting at (0, 0), and print the ending location.
 
 My approach: I imagine this drunkard is at (0.0) on a grid where @ appears on the pic below. This drunkard can only move one step at one time, up, down, left or right.
 This also should be a random. So I generate a random number between 1 to 4 inclusive. One thing that I paid attention is that if the position is (0,0), the drunkard can't go down or left anymore
 Therefore, it should remain still untill the next move is determined. So when it comes to go to down or left, I set a condition to move only when x or y is positive number, other wise the counter
 goes up.
 
 When this program runs, the drunkard doesn't seem to move that much. This program does not tell exactly which movement the drunkard made at each 100 intersections and tells where the drunkard
 ends up after all.
 ______________________
 |  |  |  |  |  |  |  |
 ----------------------
 |  |  |  |  |  |  |  |
 ----------------------
 |  |  |  |  |  |  |  |
 @----------------------
 */
 
import java.util.Random;
import java.util.Scanner;

// This class will generate random number with range between 1 through 4. It is for selecting which direction to go.


public class DrunkGardWalk
{
    public static void main(String[] args)
    {
        int counter;
        int move;
        int x=0;
        int y=0;
        
        
        for (counter=0; counter < 100; counter++)
        {
           Random rand = new Random(); // using Random class here to generate
           move = rand.nextInt(5);   // it generates a number between 1 and 4.
    	   //System.out.println(move);
	  
	   //Since drunkgard can only walk one direction at a time, the direction is determined by the random number
	   //then for each number it represents the direction. The draunkgard can go up,down,left and right. The one thing to notice is
	   //when x = 0 or y = 0. If the drunkgard is at x=0 or y=0 but the random nubmer is selected to go down or left, then it does not do anything as it is not possible to go down or left
	   //when the drunkgard is already at 0 point. Therefore, going left and down are only executed when x and y is positive.

           switch(move)
           {
            case(1): // 1 -> up(+y)
            {
                y=y+1;
                
                break;
            }
            case(2): // 2 -> down(-y)
            {
                if (y>0) // The drunkard only goes down when y position is not 0 or negative.
                {
                    y=y-1;
                }
                
                break;
            }
            case(3): // 3 -> right(+x)
            {
                x=x+1;
                
                break;
            }
            case(4): // 4 -> left(-x)
            {
                if (x >0) //Same above
                {
                    x=x-1;
                }
                
                break;
                
            }
            
           }
        }
        
     System.out.println("The point of X is " + x); 
     System.out.println("The point of y is " + y);
     System.out.println(counter);
           
        
    }
}

