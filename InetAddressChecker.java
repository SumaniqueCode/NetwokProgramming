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
		} catch (Exception error) {
			System.out.println(error);
		}
	}
}
