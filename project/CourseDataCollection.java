package project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Course1 {
    private int courseId;
    private String courseName;

    public Course1(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

public class CourseDataCollection {
    private static Map<Integer, Course1> allAvailableCourses = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        // Initialize the map with some sample data
        allAvailableCourses.put(1, new Course1(1, "Java Programming"));
        allAvailableCourses.put(2, new Course1(2, "Data Structures"));
        allAvailableCourses.put(3, new Course1(3, "Web Development"));
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add New Course");
            System.out.println("2. Find Course");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addNewCourse();
                    break;
                case 2:
                    findCourse();
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 3);
    }

    private static void addNewCourse() {
        System.out.print("Enter Course ID: ");
        int courseId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();

        Course1 newCourse = new Course1(courseId, courseName);
        allAvailableCourses.put(courseId, newCourse);

        System.out.println("New course added successfully!");
    }

    private static void findCourse() {
        System.out.print("Enter Course ID to find: ");
        int courseId = scanner.nextInt();

        Course1 foundCourse = allAvailableCourses.get(courseId);

        if (foundCourse != null) {
            System.out.println("Course Found:");
            System.out.println("Course ID: " + foundCourse.getCourseId());
            System.out.println("Course Name: " + foundCourse.getCourseName());
        } else {
            System.out.println("Course not found with ID: " + courseId);
        }
    }
}
