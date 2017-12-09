package br.com.xyz3.crudspring.dao;

import java.sql.SQLException;
import java.util.List;

public interface IDao<T> {
	
	T insert (T model) throws SQLException;
	T update (T model) throws SQLException;
	int delete(Object id) throws SQLException;
	T findById(Object id) throws SQLException;
	List<T> listAll() throws SQLException;

}
