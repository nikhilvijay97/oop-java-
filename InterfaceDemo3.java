import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

public class InterfaceDemo3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Circle\n2. Rectangle\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = s.nextDouble();
                    Shape c = new Circle(r);  // polymorphism
                    System.out.println("Area: " + c.area());
                    System.out.println("Perimeter: " + c.perimeter());
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double l = s.nextDouble();
                    System.out.print("Enter width: ");
                    double w = s.nextDouble();
                    Shape rect = new Rectangle(l, w); // polymorphism
                    System.out.println("Area: " + rect.area());
                    System.out.println("Perimeter: " + rect.perimeter());
                    break;

                case 3:
                    System.out.println("Exiting...");
                    s.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}