package kforkojo.exercise1;

import java.util.Objects;

class StudentManager {

    private final int MAX_CAPACITY = 5;

    private String[] students;
    private int numberOfStudents;

    public StudentManager() {
        students = new String[MAX_CAPACITY];
        numberOfStudents = 0;
    }

    public void add(String name) throws MaximumStudentCapacityReachedException {
        if (numberOfStudents >= MAX_CAPACITY) {
            throw new MaximumStudentCapacityReachedException("Error: Maximum number of students reached.");
        }
        students[numberOfStudents++] = name;
    }

    public boolean find(String name) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (Objects.equals(students[i], name)) {
                return true;
            }
        }
        return false;
    }

    public void delete(String name) {
        int pos = 0;

        while (pos < numberOfStudents) {
            if (Objects.equals(students[pos++], name)) {
                break;
            }
        }

        if (pos == numberOfStudents) {
            return;
        }

        while (pos < numberOfStudents - 1) {
            students[pos] = students[pos + 1];
            pos++;
        }

        numberOfStudents--;
    }

    public String getStudentNames() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numberOfStudents; i++) {
            sb.append(students[i] + "\n");
        }

        return sb.toString();
    }
}
