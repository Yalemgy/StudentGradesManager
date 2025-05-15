
package studentgradesmanager;

import java.util.Scanner;

public class StudentGradesManager {
    public static void main(String[] args) {
        GradeManager gradeManager = new GradeManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Grade Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Enter Grade");
            System.out.println("3. View Student Report");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    gradeManager.addStudent(name);
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter grade (0-100): ");
                    int grade = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    gradeManager.addGrade(studentName, grade);
                    break;
                case 3:
                    System.out.print("Enter student name: ");
                    String reportName = scanner.nextLine();
                    gradeManager.printReport(reportName);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
