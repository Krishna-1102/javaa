public class Employee {

    int employeeId;
    String name;
    double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void calculateSalary() {
        double hra = basicSalary * 20 / 100;
        double da = basicSalary * 10 / 100;
        double grossSalary = basicSalary + hra + da;

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }

    public static void main(String[] args) {

        Employee emp = new Employee(101, "Krishna", 30000);

        emp.calculateSalary();
    }
}