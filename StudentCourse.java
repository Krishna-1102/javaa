import java.util.Scanner;

class Student {

    String[] courses = new String[5];
    int count = 0;

    void registerCourse(String course) {

        if (count < 5) {
            courses[count] = course;
            count++;
            System.out.println("Course registered successfully.");
        } else {
            System.out.println("You cannot register for more than 5 courses.");
        }
    }

    void displayCourses() {

        System.out.println("\nRegistered Courses:");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + courses[i]);
        }
    }
}

public class StudentCourse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("How many courses do you want to register? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter course " + (i + 1) + ": ");
            String course = sc.nextLine();

            s.registerCourse(course);
        }

        s.displayCourses();

        sc.close();
    }
}