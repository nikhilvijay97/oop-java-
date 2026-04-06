import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {

        System.out.println("Server is waiting for client...");

        try (ServerSocket serverSocket = new ServerSocket(7011);
             Socket socket = serverSocket.accept();
             DataInputStream dis = new DataInputStream(socket.getInputStream())) {

            String str = dis.readUTF();
            System.out.println("Message = " + str);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}