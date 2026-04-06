import java.io.*;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {

            System.out.print("\nEnter File Name: ");
            String fname = s.nextLine();

            if (fname.isEmpty()) {
                System.out.println("File name cannot be empty!");
                return;
            }

            // Writing to file
            try (FileWriter obW = new FileWriter(fname, true)) {

                System.out.print("\nEnter no. of entries in file: ");
                int n;

                try {
                    n = Integer.parseInt(s.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number!");
                    return;
                }

                System.out.println("\nEnter " + n + " entries into file:");
                for (int i = 0; i < n; i++) {
                    String data = s.nextLine();
                    obW.write(data + System.lineSeparator());
                }
            }

            // Reading from file
            System.out.println("\nData read from " + fname + " file:");

            try (BufferedReader br = new BufferedReader(new FileReader(fname))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}