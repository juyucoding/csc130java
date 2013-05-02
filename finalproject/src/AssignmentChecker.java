/*
 * CSC130 Scientific Programming
 * Spring 2013
 * Final Project
 * Author: Julie Yu
 * Modified Date: 2 May 2013
 *
 * Assignment Checker
 * -> It uses a class from CourseWork.java to create a archive of the course information from the user
 *    Checker will be an array of data type CourseWork, which any elements in the array will be a type of CourseWork.
 *    EX) Checker = [new CourseWork(coursname1, tasksize1), new CourseWork(coursename2, taskSize2), new CourseWork(coursename3, tasksize3)]
 *    This program provides
 *    1) School work information [V] 
 *    2) Check box to make sure if the work is submitted
 *    3) What is passed due date and not submitted
 *    4) Individual course information
 */

 
import java.util.Scanner;

public class AssignmentChecker
{
	Scanner input = new Scanner(System.in);

	private int numberOfCourse;
	CourseWork[] Checker;
	private String coursename;
	private int numForTask;
	private String taskname;
	private String duedate;

	//Constructor
	public AssignmentChecker(int numberOfCourse)
	{
		this.numberOfCourse = numberOfCourse;
		Checker = new CourseWork[numberOfCourse]; //size of the Checker array
	}
	
	//Go through the Checker array for a size of a numberOfCourse and assign course name for each element
	public void setCourseName()
	{
		for (int counter=0; counter < numberOfCourse; counter++)
		{
			System.out.println("Enter a course title for # " + (counter+1));
			coursename = input.next();
			System.out.println("[" + coursename.toUpperCase() + "]" + ". How many tasks do you have for the course?");
			numForTask = input.nextInt();
			Checker[counter] = new CourseWork(coursename, numForTask);
		}
	}
	public void setTaskandDue()
	{
		for (int course=0; course < numberOfCourse; course++)
		{
			
			for (int task=0; task < numForTask; task++)
			{
				System.out.println("TASK NAME for " + Checker[course].getCourseName());
				taskname = input.next();
				System.out.println("DUE DATE for " + taskname);
				duedate = input.next();
				Checker[course].setTaskAndDue(taskname,duedate,task);
			}
		}
	}
	public void displayInfo()
	{
		for (int counter=0; counter < numberOfCourse; counter++)
		{
			Checker[counter].displayCourseInfo();
			System.out.println();
		}
	}
}
