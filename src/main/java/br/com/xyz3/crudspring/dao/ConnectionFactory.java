package br.com.xyz3.crudspring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
public Connection getConnection() {
		
		String url = "jdbc:mysql://localhost:3306/";
		String bd = "crudspring";
		String user = "root";
		String password = "123456";
		
		//"jdbc:mysql://localhost:3306/"+"meubd", "user", "senha"
		
			try {
				
				//DriverManager.registerDriver(new com.mysql.jdbc.Driver());//essa aqui é imprescindível para o Tomcat
				return DriverManager.getConnection(url+bd, user, password);
				
			} catch (SQLException e) {
				
				throw new RuntimeException(e);
			}
			
	}

}
