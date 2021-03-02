package AgendaContatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexoes {
	
	private static final String USERNAME = "root";
	
	private static String PASSWORD = "Hd91511511";
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	public static Connection createConnectionToMySQL() throws Exception{
		Class.forName("com.mysql.jdbc.drive");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

		return connection;
	}	

	
	public static void main(String [] args) throws Exception { 
		
		Connection con = createConnectionToMySQL();
		
		if(con != null)
			System.out.print("Conecxão obtida com sucesso!!" + con);
			con.close();
		
	}
		


}
