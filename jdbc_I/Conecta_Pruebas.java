package jdbc_I;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conecta_Pruebas {

	public static void main(String[] args) {
		
		try {
			// 1 - crear conexion
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
			
			//2 - crear objeto statement
			
			Statement miStatement = miConexion.createStatement();
			
			// 3 - Ejecutar sentencia sql y devueve objeto resulset que es un objeto de una tabla sql
			
			ResultSet miResulset = miStatement.executeQuery("Select * from PRODUCTOS"); // RESULSET ES UNA ESPECIE DE TABLA
			
			// 4- Recorrer o leer el resulset
			
			while(miResulset.next()) { // mientras haya un siguiente registro
				
				System.out.println(miResulset.getString("NOMBREARTICULO"+" "+miResulset.getString("CODIGOARTICULO"))); //le pasamos el nombre de la columna de la bbdd
				
				
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
