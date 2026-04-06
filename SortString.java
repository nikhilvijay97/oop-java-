import java.util.Arrays;
import java.util.Scanner;

public class SortString {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of Strings:");
        int n = s.nextInt();
        s.nextLine();  // consume newline

        String str[] = new String[n];

        System.out.println("Enter the Strings:");
        for (int i = 0; i < n; i++) {
            str[i] = s.nextLine();   // reading string values
        }

        // sorting the array in ascending order
        Arrays.sort(str);

        System.out.println("\nSorted Strings:");
        for (String word : str) {
            System.out.println(word);
        }

        s.close();
    }
}