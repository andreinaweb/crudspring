package br.com.xyz3.crudspring.testes;

import java.sql.SQLException;

import br.com.xyz3.crudspring.dao.ClienteDao;
import br.com.xyz3.crudspring.model.Cliente;

public class TestaUpdate {

	public static void main(String[] args) {

		Cliente	cliente = new Cliente();
		cliente.setId(9);
		cliente.setNome("Mr Friend");
		cliente.setTelefone("33 1234-5678");
		
		ClienteDao dao = new ClienteDao();
		
		try {
			dao.update(cliente);
			System.out.println("Cliente: "+cliente+" atualizado com sucesso!");
			
		} catch (SQLException e) {
			System.out.println("Erro no BD"+e);
		}
				
		}
	
}
