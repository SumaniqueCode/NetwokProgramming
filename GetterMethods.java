package np;

import java.net.*;

public class GetterMethods {
	public static void main(String[] args) {
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println("Local Host: " + localhost);
			System.out.println("Host Name: " + localhost.getHostName());
			System.out.println("Host Address: " + localhost.getHostAddress());
			System.out.println("");
			InetAddress addr = InetAddress.getByName("www.google.com");
			System.out.println("Host: " + addr);
			System.out.println("Host Name: " + addr.getHostName());
			System.out.println("Host Address: " + addr.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		}
	}
}
