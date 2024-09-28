package np;

import java.net.URL;

public class splitUrl{
    public static void main(String[] args) {
        String urlString = "https://www.example.com:8080/docs/index.html?id=10&name=John#section2";
        
        try {
            URL url = new URL(urlString);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Fragment: " + url.getRef());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
