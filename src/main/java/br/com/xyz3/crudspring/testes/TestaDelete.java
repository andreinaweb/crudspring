package br.com.xyz3.crudspring.testes;

import java.sql.SQLException;

import br.com.xyz3.crudspring.dao.ClienteDao;
import br.com.xyz3.crudspring.dao.IClienteDao;

public class TestaDelete {

	public static void main(String[] args) {

		IClienteDao dao = new ClienteDao();
		int id = 9;
		
		try {
			dao.delete(id);
			System.out.println("Cliente deletado com sucesso!!!");
		} catch (SQLException e) {
			System.out.println("Erro ao deletar! "+e);
		}
		
	}

}
