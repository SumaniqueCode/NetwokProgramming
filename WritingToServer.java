package np;

import java.io.PrintWriter;
import java.net.Socket;

public class WritingToServer {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 8080;
        try (Socket socket = new Socket(host, port)) {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String message = "Hello Server";
            out.println(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

