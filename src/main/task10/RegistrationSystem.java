package main.task10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RegistrationSystem {
    private List<Course> courses = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public void addCourse(String name, int maxCapacity) {
        courses.add(new Course(name, maxCapacity));
    }

    public void addStudent(String name, String email) {
        students.add(new Student(name, email));
    }

    public boolean register(String studentName, String courseName) {
        Student student = findStudent(studentName);
        Course course = findCourse(courseName);

        if (student == null || course == null) {
            System.out.println("Nie znaleziono studenta lub kursu!");
            return false;
        }

        // BUG #2: > zamiast >= (pozwala zapisać 1 studenta za dużo!)
        if (course.getEnrolledStudents().size() >= course.getMaxCapacity()) {
            System.out.println("Kurs " + courseName + " jest pełny!");
            return false;
        }

        course.addStudent(student);
        student.addCourse(courseName);
        System.out.println(studentName + " zapisany na kurs: " + courseName);
        return true;
    }

    public List<String> getStudentsByCourse(String courseName) {
        Course course = findCourse(courseName);
        if (course == null) {
            return null;
        } else {
            return course.getEnrolledStudents().stream()
                    .map(Student::getName)
                    .collect(Collectors.toList());
        }
        // BUG #1: brak sprawdzenia null! NPE gdy kurs nie istnieje
    }

    public List<String> getMostPopularCourses() {
        // BUG #3: sortowanie rosnące zamiast malejącego!
        return courses.stream()
                .sorted(Comparator.comparingInt((Course c) -> c.getEnrolledStudents().size()) //kolejna kwestia do przegadania to fakt ze nie rozpoznaje obiektu
                        .reversed())
                .map(c -> c.getName() + " (" + c.getEnrolledStudents().size() + " studentów)")
                .collect(Collectors.toList());
    }

    private Student findStudent(String name) {
        return students.stream()
                .filter(s -> s.getName().equals(name))
                .findFirst().orElse(null);
    }

    private Course findCourse(String name) {
        return courses.stream()
                .filter(c -> c.getName().equals(name))
                .findFirst().orElse(null);
    }

    public static void main(String[] args) {
        RegistrationSystem system = new RegistrationSystem();

        // Kursy
        system.addCourse("Java Podstawy", 2);     // max 2 osoby
        system.addCourse("Bazy Danych", 3);        // max 3 osoby
        system.addCourse("Algorytmy", 2);          // max 2 osoby

        // Studenci
        system.addStudent("Anna", "anna@edu.pl");
        system.addStudent("Bartek", "bartek@edu.pl");
        system.addStudent("Celina", "celina@edu.pl");
        system.addStudent("Dawid", "dawid@edu.pl");

        // Rejestracje
        System.out.println("=== Rejestracja ===");
        system.register("Anna", "Java Podstawy");
        system.register("Bartek", "Java Podstawy");
        system.register("Celina", "Java Podstawy");  // Powinno się nie udać (max 2)!
        system.register("Dawid", "Bazy Danych");
        system.register("Anna", "Bazy Danych");
        system.register("Bartek", "Algorytmy");

        // Sprawdź Bug #2: czy Celina została zapisana mimo limitu?
        System.out.println("\n=== Studenci na Java Podstawy ===");
        List<String> javaStudents = system.getStudentsByCourse("Java Podstawy");
        System.out.println(javaStudents);
        System.out.println("Oczekiwano max 2 studentów, jest: " + javaStudents.size());

        // Sprawdź Bug #3: ranking popularności
        System.out.println("\n=== Najpopularniejsze kursy (od najpopularniejszego) ===");
        system.getMostPopularCourses().forEach(System.out::println);

        // Sprawdź Bug #1: kurs który nie istnieje
        System.out.println("\n=== Studenci na Python (nie istnieje) ===");
        List<String> pythonStudents = system.getStudentsByCourse("Python");
        System.out.println(pythonStudents);
    }

    static class Course {
        private String name;
        private int maxCapacity;
        private List<Student> enrolledStudents = new ArrayList<>();

        Course(String name, int maxCapacity) {
            this.name = name;
            this.maxCapacity = maxCapacity;
        }

        void addStudent(Student student) {
            enrolledStudents.add(student);
        }

        String getName() {
            return name;
        }

        int getMaxCapacity() {
            return maxCapacity;
        }

        List<Student> getEnrolledStudents() {
            return enrolledStudents;
        }
    }

    static class Student {
        private String name;
        private String email;
        private List<String> enrolledCourses = new ArrayList<>();

        Student(String name, String email) {
            this.name = name;
            this.email = email;
        }

        void addCourse(String course) {
            enrolledCourses.add(course);
        }

        String getName() {
            return name;
        }

        String getEmail() {
            return email;
        }

        List<String> getEnrolledCourses() {
            return enrolledCourses;
        }
    }
}
