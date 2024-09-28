package np;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) {
        String host = "www.example.com";
        int port = 80;
        try {
            Socket socket = new Socket(host, port);
            
            // Sending request to the server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            out.println("GET / HTTP/1.1");
            out.println("Host: " + host);
            out.println("Connection: close");
            out.println();  // Blank line indicates end of request headers
            
            // Reading response from the server
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


