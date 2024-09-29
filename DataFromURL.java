package np;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class DataFromURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
