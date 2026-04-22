package main.task2;

import java.util.ArrayList;
import java.util.List;

public class GradeBook {
    private List<StudentRecord> students = new ArrayList<>();

    public void addStudent(String name) {
        students.add(new StudentRecord(name));
    }

    public void addGrade(String name, int grade) {
        for (StudentRecord s : students) {
            if (s.getName().equals(name)) {
                s.addGrade(grade);
                return;
            }
        }
    }

    public StudentRecord getBestStudent() {
        if (students.isEmpty())
            return null;

        StudentRecord best = students.get(0);
        for (int i = 0; i < students.size(); i++) {
            StudentRecord current = students.get(i);
            // BUG: < zamiast > (znajduje najgorszego zamiast najlepszego!)
            if (current.getAverage() < best.getAverage()) {
                best = current;
            }
        }
        return best;
    }

    public void printReport() {
        System.out.println("=== Dziennik ocen ===");
        for (StudentRecord s : students) {
            System.out.println(s.getName() + ": oceny=" + s.getGrades()
                    + ", średnia=" + String.format("%.2f", s.getAverage()));
        }
        StudentRecord best = getBestStudent();
        System.out.println("Najlepszy student: " + (best != null ? best.getName() : "brak"));
    }

    public static void main(String[] args) {
        GradeBook book = new GradeBook();

        book.addStudent("Anna");
        book.addStudent("Bartek");
        book.addStudent("Celina");
        book.addStudent("Dawid");

        book.addGrade("Anna", 5);
        book.addGrade("Anna", 4);
        book.addGrade("Anna", 5);

        book.addGrade("Bartek", 3);
        book.addGrade("Bartek", 2);
        book.addGrade("Bartek", 3);

        book.addGrade("Celina", 4);
        book.addGrade("Celina", 5);
        book.addGrade("Celina", 4);

        book.addGrade("Dawid", 2);
        book.addGrade("Dawid", 3);
        book.addGrade("Dawid", 2);

        book.printReport();
        // Oczekujemy: "Najlepszy student: Anna" (średnia 4.67)
        // Dostajemy kogoś innego...
    }

    static class StudentRecord {
        private String name;
        private List<Integer> grades;

        StudentRecord(String name) {
            this.name = name;
            this.grades = new ArrayList<>();
        }

        void addGrade(int grade) {
            grades.add(grade);
        }

        String getName() {
            return name;
        }

        List<Integer> getGrades() {
            return grades;
        }

        double getAverage() {
            if (grades.isEmpty()) return 0;
            int sum = 0;
            for (int g : grades) {
                sum += g;
            }
            return (double) sum / grades.size();
        }
    }
}
