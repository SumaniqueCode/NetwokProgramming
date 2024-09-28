package np;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetMethod {
	public static void main(String[] args) {
		try {
			// The URL to send the GET request to
			String url = "https://jsonplaceholder.typicode.com/todos";
//Create a URL object
			URL obj = new URL(url);

// Open a connection
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
// Set the request method to GET
			con.setRequestMethod("GET");
// Get the response code
			int responseCode = con.getResponseCode();
			System.out.println("GET Response Code :: " + responseCode);
// If response code is 200 (HTTP_OK), read and print the response
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuilder response = new StringBuilder();
				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
//Close the input stream
				in.close();
// Print the response
				System.out.println("Response :: " + response.toString());
			} else {
				System.out.println("GET request not worked");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}