package projects;
import java.util.ArrayList;
import java.util.Scanner;
public class Todo {
	    private static class Task {
	        private String description;
	        private boolean completed;

	        public Task(String description) {
	            this.description = description;
	            this.completed = false;
	        }

	        public String getDescription() {
	            return description;
	        }

	        public boolean isCompleted() {
	            return completed;
	        }

	        public void markAsCompleted() {
	            this.completed = true;
	        }
	    }

	    public static void main(String[] args) {
	        ArrayList<Task> tasks = new ArrayList<>();
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nTask Manager Menu:");
	            System.out.println("1. Add Task");
	            System.out.println("2. Delete Task");
	            System.out.println("3. Mark Task as Completed");
	            System.out.println("4. Display Tasks");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter task description: ");
	                    String description = sc.nextLine();
	                    tasks.add(new Task(description));
	                    System.out.println("Task added: " + description);
	                    break;
	                case 2:
	                    System.out.print("Enter task index to delete: ");
	                    int deleteIndex = sc.nextInt();
	                    if (deleteIndex >= 1 && deleteIndex <= tasks.size()) {
	                        Task deletedTask = tasks.remove(deleteIndex - 1);
	                        System.out.println("Task deleted: " + deletedTask.getDescription());
	                    } else {
	                        System.out.println("Invalid task index.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Enter task index to mark as completed: ");
	                    int markIndex = sc.nextInt();
	                    if (markIndex >= 1 && markIndex <= tasks.size()) {
	                        Task task = tasks.get(markIndex - 1);
	                        task.markAsCompleted();
	                        System.out.println("Task marked as completed: " + task.getDescription());
	                    } else {
	                        System.out.println("Invalid task index.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("Tasks:");
	                    for (int i = 0; i < tasks.size(); i++) {
	                        Task task = tasks.get(i);
	                        System.out.println((i + 1) + ". " + task.getDescription() + " - " + (task.isCompleted() ? "Completed" : "Not Completed"));
	                    }
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}