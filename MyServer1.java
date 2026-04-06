import java.io.*;
import java.net.*;

public class MyServer1 {
    public static void main(String[] args) {

        System.out.println("Server is ready to receive UDP packets...");

        try (DatagramSocket dSocket = new DatagramSocket(9000)) {

            while (true) {
                byte[] buf = new byte[256]; // fresh buffer each time

                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                dSocket.receive(packet);

                String message = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Server received: " + message);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}