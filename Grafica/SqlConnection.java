package Grafica;
import java.sql.*;
import javax.swing.*;

public class SqlConnection {
	
	Connection con = null;
	
	public static Connection  dbConnector(){
		
		try{
			
			Class.forName("org.sql.jdbc");
			Connection conn = DriverManager.getConnection("direccion");
			JOptionPane.showMessageDialog(null, "Conection Successfull ");
			return conn;
			
		}catch(Exception e){
			
			JOptionPane.showMessageDialog(null, e);
			return null;
			
			
		}
	}
	
	
	

}
