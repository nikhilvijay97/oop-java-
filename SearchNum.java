import java.util.Scanner;

public class SearchNum {

    public static void main(String[] args) {

        int i, pos = -1, flag = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Enter the element to search:");
        int key = s.nextInt();

        // Searching element
        for (i = 0; i < n; i++) {
            if (a[i] == key) {
                flag = 1;
                pos = i + 1;  // position (1-based index)
                break;
            }
        }

        if (flag == 1) {
            System.out.println("Element found at position: " + pos);
        } else {
            System.out.println("Element not found");
        }

        s.close();
    }
}