import java.util.Scanner;

class Student {
    String name;
    int total;
    float percentage;

    Student(String n, int m1, int m2, int m3, int m4, int m5) {
        name = n;
        total = m1 + m2 + m3 + m4 + m5;
        percentage = total / 5.0f;
    }

    void result() {
        System.out.println("Name : " + name);
        System.out.println("Total : " + total);
        System.out.println("Percentage : " + percentage);

        if (percentage >= 90)
            System.out.println("Grade : A+");
        else if (percentage >= 80)
            System.out.println("Grade : A");
        else if (percentage >= 70)
            System.out.println("Grade : B");
        else if (percentage >= 60)
            System.out.println("Grade : C");
        else if (percentage >= 50)
            System.out.println("Grade : D");
        else
            System.out.println("Grade : F");

        if (percentage >= 50)
            System.out.println("Result : PASS");
        else
            System.out.println("Result : FAIL");
    }
}

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter 5 marks: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        Student s = new Student(name, m1, m2, m3, m4, m5);

        s.result();
    }
}