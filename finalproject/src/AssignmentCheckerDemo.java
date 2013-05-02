import java.util.Scanner;

public class AssignmentCheckerDemo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String userName;
		int numberOfCourse;
		
		System.out.println("Assignment Checker");
		System.out.println("Please enter your name");
		userName = input.next();
		
		System.out.println("How many course do you take, " + userName + " ?");
		numberOfCourse = input.nextInt();

		System.out.println(userName + "'s Assignment Checker");
		AssignmentChecker sarah = new AssignmentChecker(numberOfCourse);
		sarah.setCourseName();
		sarah.setTaskandDue();
		sarah.displayInfo();


		

	}
}
