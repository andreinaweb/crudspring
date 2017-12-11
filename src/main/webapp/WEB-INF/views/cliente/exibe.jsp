<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Altera Cliente</title>
</head>
<body>

	<form action="alteraCliente" method="post">
	
		ID: <label>${cliente.id}</label><br>
		Nome: <input type="text" name="nome" value="${cliente.nome}"><br>
		Telefone: <input type="text" name="telefone" value="${cliente.telefone}"><br><br>
		
		<input type="submit" value="Alterar"> 
	
	</form>



</body>
</html>