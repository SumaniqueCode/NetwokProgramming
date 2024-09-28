package np;

import java.net.*;
import java.io.*;
import java.util.List;

public class CookieDemo {
	public static void main(String[] args) {
		try {
			CookieManager cookieManager = new CookieManager();
			cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
			CookieHandler.setDefault(cookieManager);
			URL url = new URL("https://www.google.com");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(conn.getInputStream())
					);
			String line;
			while ((line = reader.readLine())!=null)
			{
				System.out.println(line);
			}
			reader.close();
			List <HttpCookie> cookies =  cookieManager.getCookieStore().getCookies();
			for(HttpCookie cookie : cookies) {
				System.out.println("\nCookies received: "+cookie.getName()+ " = "+cookie.getValue());
			}
			conn.disconnect();
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
}
