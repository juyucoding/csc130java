/* 
 * CSC130 Scientific Programming
 * Spring 2013
 * Final Project
 * Author: Julie Yu
 * Modified Date: May 2 2013
 *
 * Assignment Checker
 * -Course Work 
 *  -> This program will be used in Assignment Checker as a data type for an array.
 *     Each course has a number of tasks and corresponding due date. 
 *     It gets the information for a course from the user.
 *     Task name and due date are stored in array since each course can have multiple tasks.
 */

public class CourseWork
{
   //Declare variables to use
   private String courseName;
   String[] taskName; // tasks will be stored in array for the course
   int numOfTask;
   String[] dueDate; // due date will be also stored in array correspondingly
   
   
   // Constructor. It will set course name and determine the size of task array and due date array
   public CourseWork(String courseName, int numOfTask)
   {
   	this.courseName = courseName;
	this.numOfTask = numOfTask;
	taskName = new String[numOfTask];
	dueDate = new String[numOfTask];
	
   }
   // This method will be used to set task and due date
   public void setTaskAndDue(String task, String due, int taskNum)
   {
   	taskName[taskNum] = task;
	dueDate[taskNum] = due;
   }
   
   // This method is to return course name for user interface
   public String getCourseName()
   {
   	return courseName;
   }

   //It will display all information for the course
   public void displayCourseInfo()
   {
   	System.out.println("The coursename: " + courseName);
	System.out.println("-------------------------------");
	for (int counter=0; counter < numOfTask; counter++)
	{
		System.out.println("Task for # " + (counter+1) + ":  " + taskName[counter]);
		System.out.println("Due date for # " + (counter+1) + ":  " + dueDate[counter]);
	}
   }
}i
