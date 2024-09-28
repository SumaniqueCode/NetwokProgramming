package np;

import java.net.Socket;

public class SocketInformation {
	public static void main(String[] args) {
		String serverAddress = "www.example.com";
		int serverPort = 80;
		try {
			Socket socket = new Socket(serverAddress, serverPort);
			boolean isConnected = socket.isConnected();
			boolean isClosed = socket.isClosed();
			if (isConnected) {
				System.out.println("Socket is connected");
			} else {
				System.out.println("Socket is not connected");
			}
			if (isClosed) {
				System.out.println("Socket is closed");
			} else {
				System.out.println("Socket is open");
			}
			System.out.println("Socket to string(): " + socket.toString());
			System.out.println("Local Address: " + socket.getLocalAddress());
			System.out.println("Local Port: " + socket.getLocalPort());
			System.out.println("Remote Address: " + socket.getInetAddress());
			System.out.println("Remote Port: " + socket.getPort());
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
