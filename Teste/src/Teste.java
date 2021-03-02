import java.io.IOException;
import java.net.*;


public class Teste {
	
	public static void main(String[] args) throws IOException  {
		
		ServerSocket server = new ServerSocket(12345);
	
		Socket cliente = server.accept();
	
		byte[] b = InetAddress.getByName("local Host").getAddress();
	}
}

