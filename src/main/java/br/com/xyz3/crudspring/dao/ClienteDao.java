package br.com.xyz3.crudspring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.xyz3.crudspring.model.Cliente;

public class ClienteDao implements IClienteDao {

	Connection conn;

	public ClienteDao() {

		this.conn = new ConnectionFactory().getConnection();

	}

	@Override
	public Cliente insert(Cliente model) throws SQLException {

		final String SQL = "insert into cliente(nome, telefone)" + " values (?,?)";
		PreparedStatement ps = conn.prepareStatement(SQL);

		ps.setString(1, model.getNome());
		ps.setString(2, model.getTelefone());

		ps.execute();
		ps.close();

		return model;
	}

	@Override
	public Cliente update(Cliente model) throws SQLException {

		final String SQL = "update cliente set" + " nome=?, telefone=?" + " where id=?";
		PreparedStatement ps = conn.prepareStatement(SQL);

		ps.setString(1, model.getNome());
		ps.setString(2, model.getTelefone());
		ps.setLong(3, model.getId());

		ps.execute();
		ps.close();

		return model;
	}

	@Override
	public int delete(Object id) throws SQLException {

		final String SQL = "delete from cliente where id=?";
		PreparedStatement ps = conn.prepareStatement(SQL);

		ps.setInt(1, (int) id);
		ps.execute();
		ps.close();

		return (int) id;

	}

	@Override
	public Cliente findById(Object id) throws SQLException {

		Cliente cliente = null;

		final String SQL = "select * from cliente where id=?";
		PreparedStatement ps = conn.prepareStatement(SQL);
		ps.setInt(1, (int) id);

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			
			cliente = new Cliente();
			cliente.setId(rs.getInt("id"));
			cliente.setNome(rs.getString("nome"));
			cliente.setTelefone(rs.getString("telefone"));

		}

		rs.close();
		ps.close();

		return cliente;

	}
	

	@Override
	public List<Cliente> listAll() throws SQLException {

		List<Cliente> clientes = new ArrayList<>();
		
		final String SQL = "select * from cliente";
		PreparedStatement ps = conn.prepareStatement(SQL);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			Cliente cliente = new Cliente();
			cliente.setId(rs.getInt("id"));
			cliente.setNome(rs.getString("nome"));
			cliente.setTelefone(rs.getString("telefone"));
			
			clientes.add(cliente);
		}
		
		rs.close();
		ps.close();
		
		return clientes;
		
	}

}
