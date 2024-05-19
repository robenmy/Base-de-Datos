package jdbc_I;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasPreparadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			//1. crear conexion
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
			
			//2. preparar la consultar
			
			PreparedStatement miSentencias = miConexion.prepareStatement("Select nombrearticulo, seccion, paisdeorigen from"
					+ "where Seccion=? and paisorigen=?");
			
			//3. Establecer parametros
			
			miSentencias.setString(1, "deportes"); //(orden de la consulta, columna)
			miSentencias.setString(2, "USA");
			
			//4. eJECUTAR Y RECORRER CONSULTA
			
			ResultSet rs = miSentencias.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1)+" "+ rs.getString(2)+" "+rs.getString(3));
			}
			
			rs.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}


	}

}

