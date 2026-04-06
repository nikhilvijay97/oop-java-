import java.util.Scanner;

class Employee {
    int empid;
    String name;
    double salary;
    String address;

    Employee(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee {
    String department;
    String subject;

    Teacher(int empid, String name, double salary, String address, String department, String subject) {
        super(empid, name, salary, address);
        this.department = department;
        this.subject = subject;
    }

    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : " + salary);
        System.out.println("Address    : " + address);
        System.out.println("Department : " + department);
        System.out.println("Subject    : " + subject);
        System.out.println("----------------------------");
    }
}

public class EmpInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for teacher " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int empid = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Department: ");
            String department = sc.nextLine();
            System.out.print("Subject: ");
            String subject = sc.nextLine();

            teachers[i] = new Teacher(empid, name, salary, address, department, subject);
        }

        System.out.println("\n--- Teacher Details ---");
        for (int i = 0; i < n; i++) {
            teachers[i].display();
        }

        sc.close();
    }
}