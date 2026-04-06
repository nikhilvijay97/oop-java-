import java.io.*;

public class FileCopy {
    public static void main(String[] args) {

        File source = new File("BCA.txt");
        File target = new File("MCA.txt");

        if (!source.exists()) {
            System.out.println("Source file does not exist!");
            return;
        }

        try (FileInputStream fi = new FileInputStream(source);
             FileOutputStream fo = new FileOutputStream(target)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fi.read(buffer)) != -1) {
                fo.write(buffer, 0, bytesRead);
            }

            System.out.println("Successfully copied one file to another");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}