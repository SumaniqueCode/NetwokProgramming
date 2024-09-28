package np;

import java.net.*;
import java.io.*;

public class UrlEncoderDecoder {
	public static void main(String[] args) {
		String url = "https:www.example.com";
		try {
			System.out.println("Url before encoding: " + url);
			// Encoding the URL
			String encoded_url = URLEncoder.encode(url, "utf-8");
			System.out.println("Url after encoding: " + encoded_url);

			// Decoding the URL
			String decoded_url = URLDecoder.decode(encoded_url, "utf-8");
			System.out.println("Url after decoding: " + decoded_url);
		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage());
		}

	}
}
