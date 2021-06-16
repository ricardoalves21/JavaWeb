<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Matrícula de Aluno</title>
</head>
<body>
	<h1>DADOS DA MATRÍCULA DO ALUNO</h1>
	
	<form>
		O aluno <%=request.getAttribute("nome")%> com a matrícula de número <%=request.getAttribute("id") %> tem <%=request.getAttribute("idade") %> anos.
	</form>
</body>
</html>