import java.util.Scanner;

interface Calc {
    void calculate();
}

class Bill implements Calc {
    String pid, pname;
    int quantity;
    double price, total;

    public void getdata(Scanner sc) {
        sc.nextLine(); // clear buffer

        System.out.println("Enter product details:");
        System.out.print("Product id: ");
        pid = sc.nextLine();

        System.out.print("Product name: ");
        pname = sc.nextLine();

        System.out.print("Quantity: ");
        quantity = sc.nextInt();

        System.out.print("Price: ");
        price = sc.nextDouble();
    }

    public void calculate() {
        total = quantity * price;
    }

    public void display() {
        System.out.println(pid + "\t" + pname + "\t" + quantity + "\t" + price + "\t" + total);
    }
}

class Shop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double netAmount = 0;

        System.out.print("Order No: ");
        int order_no = s.nextInt();

        System.out.print("Date: ");
        String date = s.next();

        System.out.print("No. of products: ");
        int n = s.nextInt();

        Bill[] ob = new Bill[n];

        for (int i = 0; i < n; i++) {
            ob[i] = new Bill();
            ob[i].getdata(s);
            ob[i].calculate();
        }

        System.out.println("\nOrder No.: " + order_no + "  Date: " + date);
        System.out.println("ID\tName\tQty\tPrice\tTotal");

        for (int i = 0; i < n; i++) {
            ob[i].display();
            netAmount += ob[i].total;
        }

        System.out.println("\t\t\tNet amount: " + netAmount);

        s.close();
    }
}