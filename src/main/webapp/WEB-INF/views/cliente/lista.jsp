<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List All Clients</title>

<style type="text/css">
.myTable {
	border-style: double;
	border-width: thick;
	background-color: #f5deb3;
	color: #8b4513;
}

#myTable {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#myTable td, #myTable th {
	border: 1px solid #ddd;
	padding: 8px;
}

#myTable tr:nth-child(even) {
	background-color: #f5deb3;
}

#myTable tr:hover {
	background-color: lightblue;
	color: red;
}

#myTable th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #8b4513;
	color: white;
}
</style>

</head>

<body>

	<a href="novoCliente"><button>Novo Cliente</button></a>
	<br />
	<br />
	<table id="myTable">
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Telefone</th>
			<th colspan="2" align="center">Ações</th>
		</tr>
		<c:forEach items="${clientes}" var="cliente">
			<tr>
				<td>${cliente.id}</td>
				<td>${cliente.nome}</td>
				<td>${cliente.telefone}</td>
				<td><a href="removeCliente?id=${cliente.id}">Remover</a></td>
				<td><a href="exibeCliente?id=${cliente.id}">Alterar</a></td>

			</tr>
		</c:forEach>
	</table>
	<br>

</body>
</html>