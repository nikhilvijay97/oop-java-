import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", 7011);
             DataOutputStream dout = new DataOutputStream(socket.getOutputStream())) {

            dout.writeUTF("Client Call!!!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}