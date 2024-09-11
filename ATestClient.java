// Client.java
import java.io.*;
import java.net.*;

public class ATestClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Enter the word:");
            String word = input.readLine();

            out.println(word);

            String result = in.readLine();
            System.out.println("Result: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}