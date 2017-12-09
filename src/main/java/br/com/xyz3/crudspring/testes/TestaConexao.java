package br.com.xyz3.crudspring.testes;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.xyz3.crudspring.dao.ConnectionFactory;

public class TestaConexao {

		public static void main(String[] args) {
			
			Connection conn = new ConnectionFactory().getConnection();
			
			if(conn!=null) {
				
				System.out.println("CONECTADO COM SUCESSO!");
				
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println("Erro:"+e);
				}
				
			}else {
				
				System.out.println("ERRO NA CONEXÃO!");
				
			}
			
		}
	
}
