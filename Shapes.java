import java.util.Scanner;

public class Shapes {
    void area(int r1) {
        System.out.println("\nArea of Circle with Radius " + r1 + " = " + (3.14 * r1 * r1));
    }

    void area(int l1, int b1) {
        System.out.println("\nArea of Rectangle with dimensions " + l1 + " X " + b1 + " = " + (l1 * b1));
    }

    void area(int l2, int b2, int h2) {
        System.out.println("\nArea of Cuboid with dimensions " + l2 + " X " + b2 + " X " + h2 + " = " + (2 * (l2 * b2 + b2 * h2 + h2 * l2)));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Shapes ob = new Shapes();

        System.out.println("Enter the Radius:");
        int r = s.nextInt();
        ob.area(r);

        System.out.println("Enter the Length and Breadth:");
        int l = s.nextInt();
        int b = s.nextInt();
        ob.area(l, b);

        System.out.println("Enter Length, Breadth, and Height for Cuboid:");
        int l2 = s.nextInt();
        int b2 = s.nextInt();
        int h = s.nextInt();
        ob.area(l2, b2, h);
        s.close();
    }
}