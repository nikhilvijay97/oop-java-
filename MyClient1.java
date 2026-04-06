import java.net.*;
import java.io.*;

public class MyClient1 {
    public static void main(String[] args) {

        try (DatagramSocket dSocket = new DatagramSocket()) {

            InetAddress address = InetAddress.getByName("localhost");

            String message = "Message to Server from Client";
            byte[] buffer = message.getBytes();

            DatagramPacket packet = new DatagramPacket(
                buffer, buffer.length, address, 9000
            );

            dSocket.send(packet);

            System.out.println("UDP Message sent to server.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}