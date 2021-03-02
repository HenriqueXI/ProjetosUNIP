<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html5/loose.dtd">
<%@page import = "java.util.Date"%>
<%@page import = "java.text.SimpleDateFormat"%>
<html>
	<head>

	<meta http-equiv = "Content-Type" content = "text/html; charset=ISO-8859-1">
	<title>Projeto UNIP</title>

	</head>
	
	<body>
		<h2>#Começando a usar a diretiva page</h2>
	
		<%
		Date dataDeHoje = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
		%>
	
	<h2>Hoje, dia <b>%formato.format(dataDeHoje)%></b> usei pela primeira vez o page</h2>
	</body>
</html>