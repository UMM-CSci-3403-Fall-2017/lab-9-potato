package segmentedfilesystem;
import java.net.*;
import java.io.*;


public class Main {

	public static void main(String[] args) throws Exception {

		Client client = new Client();
		Server server = new Server();
		client.ds.send(client.dp);
		while(true) {
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			serverSocket.receive(receivePacket);
			String sentence = new String( receivePacket.getData());
			System.out.println("RECEIVED: " + sentence);
			InetAddress IPAddress = receivePacket.getAddress();
			int port = receivePacket.getPort();
			String capitalizedSentence = sentence.toUpperCase();
			sendData = capitalizedSentence.getBytes();
			DatagramPacket sendPacket =
					new DatagramPacket(sendData, sendData.length, IPAddress, port);
			serverSocket.send(sendPacket);





			Server.dpServer.receive(Server.receivePacket);
			String sentence1 = new String(Server.receivePacket.getData());
			System.out.println("RECEIVED: " + sentence1);
			Server.IPAddress = Server.receivePacket.getAddress();
			Server.port = Server.receivePacket.getPort();

		}
	}
	static class Client {
		DatagramSocket ds;
		byte [] b = new byte [1024];
		InetAddress ip;
		int port = 6014;
		DatagramPacket dp;
		public Client () throws UnknownHostException, SocketException {
			this.ds = new DatagramSocket();
			this.ip = InetAddress.getByName("localhost");
			this.dp = new DatagramPacket(b, b.length, ip, port);
		}

	}
	static class Server {
		byte [] arr = new byte [1024];
		static int port;
		static DatagramPacket receivePacket;
		static DatagramSocket dpServer;
		static InetAddress IPAddress;
		public  Server () throws SocketException {
			this.receivePacket = new DatagramPacket(arr, arr.length);
			this.dpServer = new DatagramSocket();
		}
	}

	class DataPacket {
		Byte [] packet;
		DataPacket(Byte [] packet) {
			this.packet = packet;
		}
		class PacketManager {
			PacketManager() {
			}
		}
	}
}
}