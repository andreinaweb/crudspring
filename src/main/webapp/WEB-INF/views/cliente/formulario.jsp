<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adiciona Cliente</title>
</head>
<body>

	<h3>Adicionar Cliente</h3>

	<form:errors path="cliente.nome"/>
	<form action="adicionaCliente" method="post">

		Nome:<input type="text" id="nome" name="nome"><br>
		Telefone:<input type="text" id="telefone" name="telefone"> <br>
		<br> <input type="submit" value="Adicionar">
	</form>
	<br>
	<a href="listaClientes"><button>Voltar</button> </a>


</body>
</html>