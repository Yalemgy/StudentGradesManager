
package studentgradesmanager;

import java.util.HashMap;

public class GradeManager {
    private HashMap<String, Student> students;

    public GradeManager() {
        students = new HashMap<>();
    }

    public void addStudent(String name) {
        if (!students.containsKey(name)) {
            students.put(name, new Student(name));
            System.out.println("Student added.");
        } else {
            System.out.println("Student already exists.");
        }
    }

    public void addGrade(String name, int grade) {
        Student student = students.get(name);
        if (student != null) {
            student.addGrade(grade);
            System.out.println("Grade added.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void printReport(String name) {
        Student student = students.get(name);
        if (student != null) {
            System.out.println("\n--- Report for " + name + " ---");
            System.out.println("Grades: " + student.getGrades());
            System.out.println("Average: " + student.getAverage());
            System.out.println("Max Grade: " + student.getMaxGrade());
            System.out.println("Min Grade: " + student.getMinGrade());
        } else {
            System.out.println("Student not found.");
        }
    }
}
