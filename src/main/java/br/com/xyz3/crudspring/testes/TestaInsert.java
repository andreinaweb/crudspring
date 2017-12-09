package br.com.xyz3.crudspring.testes;

import java.sql.SQLException;

import br.com.xyz3.crudspring.dao.ClienteDao;
import br.com.xyz3.crudspring.model.Cliente;

public class TestaInsert {

	public static void main(String[] args){
		
		Cliente	cliente = new Cliente();
		cliente.setNome("Jouuu");
		cliente.setTelefone("55 3322-1155");
		
		ClienteDao dao = new ClienteDao();
		
		try {
			dao.insert(cliente);
			System.out.println("Cliente: "+cliente+" adicionadp com sucesso!");
			
		} catch (SQLException e) {
			System.out.println("Erro no BD"+e);
		}
		
	}

}
