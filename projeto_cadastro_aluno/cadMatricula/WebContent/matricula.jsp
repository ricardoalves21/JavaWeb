<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Matr�cula de Aluno</title>
</head>
<body>
	<h1>DADOS DA MATR�CULA DO ALUNO</h1>
	
	<form>
		O aluno <%=request.getAttribute("nome")%> com a matr�cula de n�mero <%=request.getAttribute("id") %> tem <%=request.getAttribute("idade") %> anos.
	</form>
</body>
</html>