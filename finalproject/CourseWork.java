public class CourseWork
{
   private String courseName;
   String[] taskName;
   int numOfTask;
   String[] dueDate;

   public CourseWork(String courseName, int numOfTask)
   {
   	this.courseName = courseName;
	this.numOfTask = numOfTask;
	taskName = new String[numOfTask];
	dueDate = new String[numOfTask];
   }
   public void setTaskAndDue(String task, String due, int taskNum)
   {
   	taskName[taskNum] = task;
	dueDate[taskNum] = due;
   }
   public void displayInfo()
   {
   	System.out.println("The coursename: " + courseName);
	for (int counter=0; counter < numOfTask; counter++)
	{
		System.out.println("Task for # " + (counter+1) + taskName[counter]);
		System.out.println("Due date for # " + (counter+1) + dueDate[counter]);
	}
   }
}
