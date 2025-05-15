
package studentgradesmanager;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getAverage() {
        if (grades.isEmpty()) return 0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / (double) grades.size();
    }

    public int getMaxGrade() {
        if (grades.isEmpty()) return 0;
        int max = grades.get(0);
        for (int grade : grades) {
            if (grade > max) max = grade;
        }
        return max;
    }

    public int getMinGrade() {
        if (grades.isEmpty()) return 0;
        int min = grades.get(0);
        for (int grade : grades) {
            if (grade < min) min = grade;
        }
        return min;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
}
