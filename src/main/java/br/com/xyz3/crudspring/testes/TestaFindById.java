package br.com.xyz3.crudspring.testes;

import java.sql.SQLException;

import br.com.xyz3.crudspring.dao.ClienteDao;
import br.com.xyz3.crudspring.dao.IClienteDao;
import br.com.xyz3.crudspring.model.Cliente;

public class TestaFindById {

	public static void main(String[] args) {

		IClienteDao dao = new ClienteDao();

		try {

			Cliente cliente = dao.findById(10);

			if (cliente != null) {

				System.out.println("ID " + cliente.getId());
				System.out.println("Cliente: " + cliente.getNome());
				System.out.println("Telefone: " + cliente.getTelefone());

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
