package kforkojo.exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {

    private static StudentManager studentManager;
    private static Scanner scanner;

    public static void main(String[] args) {
        studentManager = new StudentManager();
        scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1 - 5): ");

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Choice should be an integer from 1 to 5");
                break;
            }

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> searchStudent();
                case 3 -> deleteStudent();
                case 4 -> displayStudents();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid Choice!");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void displayStudents() {
        String disp = studentManager.getStudentNames();
        if (disp.isBlank()) {
            System.out.println("No students found");
        }
        System.out.println(disp);
    }

    private static void deleteStudent() {
        System.out.print("Enter student name to delete: ");
        String name = scanner.nextLine();
        studentManager.delete(name);
        System.out.println("Student deleted successfully");
    }

    private static void searchStudent() {
        System.out.print("Enter student name to search: ");
        String name = scanner.nextLine();
        System.out.println(studentManager.find(name) ? "Student found" : "Student not found");
    }

    private static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        try {
            studentManager.add(name);
        } catch (MaximumStudentCapacityReachedException e) {
            System.out.println(e.getMessage());
        }
    }
}
