package segmentedfilesystem;
import java.io.IOException;
//DReceiver.java  
import java.net.*;  
public class DReceiver{  
  public static void main(String[] args) throws Exception {  
    
    
    String str = new String(dp.getData(), 0, dp.getLength());  
    System.out.println(str);  
  }  
  public void ServerThread() throws SocketException {
	    DatagramSocket ds = new DatagramSocket(6014);  
	    byte[] buf = new byte[1024];  
	    DatagramPacket dp = new DatagramPacket(buf, 1024); 
	  while(true) {
		  try {
			ds.receive(dp);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		  ds.close();  
	  }
  }
}  