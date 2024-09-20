package np;

import java.net.*;

public class InetAddressChecker {
	public static void main(String args[]) {
		try {
			InetAddress addr1 = InetAddress.getByName("www.facebook.com");
			InetAddress addr2 = InetAddress.getByName("www.fb.com");
			if (addr1.equals(addr2)) {
				System.out.println("Equals");
			} else {
				System.out.println("Not Equals");
			}
			if (addr1 instanceof java.net.Inet4Address ) {
				System.out.println("The address is IPV4");
			}
			else if (addr1 instanceof java.net.Inet6Address ) {
				System.out.println("The address is IPV6");
			}
			else {
				System.out.println("Error");
			}
		} catch (Exception error) {
			System.out.println(error);
		}
	}
}
