package np;
import java.net.*; 
class InetDemo { 
	public static void main(String[] args) 
	{ 
		String host = "www.geeksforgeeks.org"; 
		try { 
			
			InetAddress addr = InetAddress.getByName(host); 
	        System.out.println("HostAddress:  " + addr.getHostAddress()); 
	        System.out.println("Local host name: " + addr.getHostName());
	        System.out.println("Canonical host name: " + addr.getCanonicalHostName());
		} 
		catch (UnknownHostException e) { 
			System.out.println(e); 
		} 
	} 
}
 