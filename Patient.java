import java.util.Scanner;

public class Patient {

    int patientId;
    String name;
    int age;
    double temperature;

    Patient(int patientId, String name, int age, double temperature) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.temperature = temperature;
    }

    void checkFever() {
        System.out.println("\nPatient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature + " F");

        if (temperature > 100.4) {
            System.out.println("Status: Fever");
        } else {
            System.out.println("Status: Normal");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Temperature: ");
        double temp = sc.nextDouble();

        Patient p = new Patient(id, name, age, temp);

        p.checkFever();

        sc.close();
    }
}