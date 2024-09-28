package np;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class ListingInterfaces {
	public static void main(String[] args) {
		try {
			Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
			while (networkInterfaces.hasMoreElements()) {
				NetworkInterface networkInterface = networkInterfaces.nextElement();
				System.out.println("Interface name: " + networkInterface.getName());
				System.out.println("Display name: " + networkInterface.getDisplayName());

				Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
				while (inetAddresses.hasMoreElements()) {
					InetAddress inetAddress = inetAddresses.nextElement();
					System.out.println("IP Address: " + inetAddress.getHostAddress());
				}
				System.out.println("---------------");
			}
		} catch (SocketException e) {
			System.out.println("Error retrieving network interfaces: " + e.getMessage());
		}
	}
}
