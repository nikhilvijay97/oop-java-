import java.util.Scanner;

class Multiplication extends Thread {
    public void run() {
        System.out.println("Multiplication table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x 5 = " + (i * 5));
        }
    }
}

class EvenNumbers extends Thread {
    int n;

    EvenNumbers(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Even numbers up to " + n + ":");
        for (int x = 1; x <= n; x++) {
            if (x % 2 == 0) System.out.print(x + " ");
        }
        System.out.println();
    }
}

public class ThreadClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N for Even Numbers: ");
        int n = sc.nextInt();

        Multiplication t1 = new Multiplication();
        EvenNumbers t2 = new EvenNumbers(n);

        t1.start();
        t2.start();
    }
}
