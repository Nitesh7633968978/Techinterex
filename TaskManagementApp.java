import java.util.ArrayList;
import java.util.Scanner;

public class TaskManagementApp {

    // Task class to store task details
    static class Task {
        private String title;
        private String description;

        public Task(String title, String description) {
            this.title = title;
            this.description = description;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return "Task Title: " + title + "\nDescription: " + description;
        }
    }

    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Management Application");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Task
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    tasks.add(new Task(title, description));
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    // View Tasks
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i).getTitle());
                        }
                        System.out.print("Enter the task number to view details (or 0 to go back): ");
                        int taskNumber = scanner.nextInt();
                        scanner.nextLine();
                        if (taskNumber > 0 && taskNumber <= tasks.size()) {
                            System.out.println(tasks.get(taskNumber - 1));
                        } else if (taskNumber != 0) {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 3:
                    // Delete Task
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available to delete.");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i).getTitle());
                        }
                        System.out.print("Enter the task number to delete: ");
                        int taskNumber = scanner.nextInt();
                        scanner.nextLine();
                        if (taskNumber > 0 && taskNumber <= tasks.size()) {
                            tasks.remove(taskNumber - 1);
                            System.out.println("Task deleted successfully!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting Task Management Application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
