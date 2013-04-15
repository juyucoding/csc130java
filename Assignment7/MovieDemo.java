/*
   CSC130 Scientific Programming
   Assignment#7 problem #3
   Spring 2013
   Author: Julie Yu
   Modified date: 11 Apr 2013
*/
import java.util.Scanner;

class Movie {

	private String movieName;
	private String MPAA;
	private int rating = 0;
	private int numOfPeople_1 = 0;
	private int numOfPeople_2 = 0;
	private int numOfPeople_3 = 0;
	private int numOfPeople_4 = 0;
	private int numOfPeople_5 = 0;
	private int totalPeople = 0;

	Scanner keyboard = new Scanner(System.in);

	private void setMovieName() {
 		System.out.println("Enter a movie name to rate: ");
		movieName = keyboard.nextLine();
	}

	private void setMPAA() {
		System.out.println("Enter MPAA rating: ");
		MPAA = keyboard.nextLine();
 	}

	public void callMovieAndMPAA() {
		setMovieName();
		setMPAA();
	}
	
	public String getMovieName() {
		return movieName;
	}

	public String getMPAA() {
		return MPAA;
	}

	public void addRating(int userRating)	 {
		rating = rating + userRating;


		if ((userRating >=1) && (userRating <= 5)) {
		   switch(userRating)
		   {
			   case(1):
			      numOfPeople_1 = numOfPeople_1 + 1;
			      break;
			   case(2):
			      numOfPeople_2 = numOfPeople_2 + 1;
			      break;
			   case(3):
			      numOfPeople_3 = numOfPeople_3 + 1;
			      break;
			   case(4):
			      numOfPeople_4 = numOfPeople_4 + 1;
			      break;
			   case(5):
			      numOfPeople_5 = numOfPeople_5 + 1;
			      break;
			   default:
			      System.out.println("Invalid input. Good bye!");
		   	      break;
		   }
		}
		else {
			System.out.println("The rating range is between 1 and 5, inclusive."); 
		}

		totalPeople = totalPeople + 1;
	

	}

	public double getAverage() {
		double avg;
		avg = rating/totalPeople;
		return avg;
	}

	

}

public class MovieDemo {

   public static void main(String[] args) {

	int user_rating;

	Scanner input = new Scanner(System.in);
	//First Movie object
	Movie movieDemo_1 = new Movie();
	movieDemo_1.callMovieAndMPAA();
	//5 ratings for the first movie
	
	for (int counter =0; counter < 5; counter++)
	{
	     System.out.println("Enter your rating for " + movieDemo_1.getMovieName() + " , person " + counter);
	     user_rating = input.nextInt();
	     movieDemo_1.addRating(user_rating);
 	}
	
	//get movie name and MPAA
	System.out.println("Movie name: " + movieDemo_1.getMovieName());
	System.out.println("MPAA rating: " + movieDemo_1.getMPAA());
	System.out.println("The average rating for this movie: " + movieDemo_1.getAverage());


	System.out.println();
	//Second Movie object
	Movie movieDemo_2 = new Movie();
	movieDemo_2.callMovieAndMPAA();
	//5 ratings for the second movie
	for (int counter=0; counter <5; counter++)
	{
	     System.out.println("Enter your rating for " + movieDemo_2.getMovieName() + " , person " + counter);
	     user_rating = input.nextInt();
	     movieDemo_2.addRating(user_rating);
	}
	
	//get movie name and MPAA
	System.out.println("Movie name: " + movieDemo_2.getMovieName());
	System.out.println("MPAA rating: " + movieDemo_2.getMPAA());
	System.out.println("The average rating for this moive: " + movieDemo_2.getAverage());
  }


}
