package np;

import java.io.IOException;
import java.util.List;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class HTTPHeaders {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.example.com");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET");
			connection.connect();

			System.out.println("HTTP Headers:");
			for (Map.Entry<String, List<String>> header : connection.getHeaderFields().entrySet()) {
				System.out.println(header.getKey() + ": " + header.getValue());
			}

			connection.disconnect();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
