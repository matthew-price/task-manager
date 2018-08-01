import java.util.ArrayList;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        // Creating array of Task objects - deprecated
        //Task[] taskList = new Task[50];

        //Creating an ArrayList of Task objects

        ArrayList<Task> taskList = new ArrayList();

        // Count number of entries, and create integer for menu choice
        int count = 0;
        int menuChoice = 0;

        Scanner sc = new Scanner(System.in);

        // Keep returning to the menu, until user input == 3
        while (menuChoice != 3) {
        System.out.println("Welcome. Select an option: \n 1. Add a new task \n 2. View task list \n 3. Do nothing \n 4. Delete a task");
        menuChoice= sc.nextInt();
        if (menuChoice == 1){ // add task
            sc.nextLine(); //removing the CRLF char left by nextInt
            System.out.println("Enter task name");
            String taskName = sc.nextLine();
            System.out.println("Enter task description (optional):");
            String taskDescription = sc.nextLine();
            System.out.println("Enter task priority (1 = Low, 2 = Medium, 3 = High");
            String priority = sc.nextLine();
            // creating a new Task object
            Task myTask = new Task(taskName, taskDescription, priority);
            // adding the new object to the ArrayList
            taskList.add(myTask);
            // incrementing count of entries (maybe would be better to just get the number of items in the ArrayList when needed?)
            count++;
            //confirming to user what has been added
            System.out.println("Added a new " + priority + " priority task called " + taskName + " with description " + taskDescription);
        }

        else if(menuChoice == 3){ //quit
            System.out.println("Finished.");
        }
        else if (menuChoice == 2){ // print list of tasks
            for (int i = 0; i < count; i++){
               System.out.println("Task ID: " + i);
                System.out.println(taskList.get(i).getTaskName());
                System.out.println("Description: " + taskList.get(i).getDescription());
                System.out.println("Priority: " + taskList.get(i).getPriority());
                System.out.println("----------");
            }
        }
        else if (menuChoice == 4){ // delete task
            System.out.println("Deleting a task. This is the current list of tasks:");
            for (int i = 0; i < count; i++){
                System.out.println(i + ":" + taskList.get(i).getTaskName());
            }
            System.out.println("Enter a task number to delete, or 99 to cancel:");
            // getting the user's choice for deletion
            int deletionChoice = sc.nextInt();
            System.out.println("About to delete task " + deletionChoice + " : " + taskList.get(deletionChoice).getTaskName());
            System.out.println("Are you sure?");
            int deletionConfirm = sc.nextInt();
            if (deletionConfirm == 1){
                taskList.remove(deletionChoice);
                count--;
                System.out.println("Task " + deletionChoice + " was deleted.");
            }

        }
    }



}
}
