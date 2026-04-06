import java.util.Scanner;

class Multiplication extends Thread {
    public void run() {
        System.out.println("Multiplication table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x 5 = " + (i * 5));
        }
    }
}

class PrimeNumbers extends Thread {
    int n;

    PrimeNumbers(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Prime numbers up to " + n + ":");
        for (int x = 2; x <= n; x++) {
            boolean isPrime = true;
            for (int y = 2; y <= x / 2; y++) {
                if (x % y == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(x + " ");
        }
        System.out.println();
    }
}

public class ThreadClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N for Primes: ");
        int n = sc.nextInt();

        Multiplication t1 = new Multiplication();
        PrimeNumbers t2 = new PrimeNumbers(n);

        t1.start();
        t2.start();
    }
}