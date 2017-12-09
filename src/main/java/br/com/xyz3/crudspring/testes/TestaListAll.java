package br.com.xyz3.crudspring.testes;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.xyz3.crudspring.dao.ClienteDao;
import br.com.xyz3.crudspring.model.Cliente;

public class TestaListAll {

	public static void main(String[] args) {

		List<Cliente> clientes = new ArrayList<>();
		
		ClienteDao dao = new ClienteDao();
		
		try {
			
			clientes = dao.listAll();
			
			for (Cliente cliente : clientes) {
				
				System.out.println("ID " + cliente.getId());
				System.out.println("Cliente: " + cliente.getNome());
				System.out.println("Telefone: " + cliente.getTelefone());
				System.out.println("-----------------------------------");
				
			}
			
		} catch (SQLException e) {

			System.out.println("Erro: "+e);
			
		}
		
	}

}
