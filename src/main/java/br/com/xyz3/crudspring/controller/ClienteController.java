package br.com.xyz3.crudspring.controller;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.xyz3.crudspring.dao.ClienteDao;
import br.com.xyz3.crudspring.model.Cliente;

@Controller
public class ClienteController {

	@RequestMapping("/novoCliente")
	public String form() {

		return "cliente/formulario";
	}

	@RequestMapping("adicionaCliente")
	public String adiciona(@Valid Cliente cliente, BindingResult result) {

		ClienteDao dao = new ClienteDao();
		
		if(result.hasFieldErrors("nome")) {			
			return "cliente/formulario";			
		}

		try {

			dao.insert(cliente);
			return "cliente/adiciona";

		} catch (SQLException e) {
			System.out.println("Erro: " + e);
		}

		return "erro";
	}

	@RequestMapping("listaClientes")
	public String lista(Model model) {

		ClienteDao dao = new ClienteDao();

		try {
			model.addAttribute("clientes", dao.listAll());
			return "cliente/lista";

		} catch (SQLException e) {

			System.out.println("Erro: " + e);

		}

		return null;
	}

	@RequestMapping("removeCliente")
	public String remove(Cliente cliente) {

		ClienteDao dao = new ClienteDao();

		try {
			dao.delete(cliente.getId());
			System.out.println("Cliente ID: " + cliente.getId() + " excluido com sucesso!");

			return "redirect:listaClientes";

		} catch (SQLException e) {

			System.out.println("Erro: " + e);

		}
		return null;
	}
	
	
	@RequestMapping("exibeCliente")
	public String exibe(Model model, Integer id) {

		ClienteDao dao = new ClienteDao();
		
		try {
			model.addAttribute("cliente", dao.findById(id));
			System.out.println("Cliente ID: "+id+" exibido com sucesso!");
			return "cliente/exibe";
			
			
		} catch (SQLException e) {
			System.out.println("Erro: " + e);
		}

		return "cliente/exibe";

	}

	@RequestMapping("alteraCliente")
	public String altera(Cliente cliente) {

		ClienteDao dao = new ClienteDao();

		try {

			dao.update(cliente);
			System.out.println("Cliente: " + cliente + " alterado com sucesso!");
			return "redirect:listaClientes";

		} catch (SQLException e) {
			System.out.println("Erro: " + e);
		}

		return null;
	}

}
