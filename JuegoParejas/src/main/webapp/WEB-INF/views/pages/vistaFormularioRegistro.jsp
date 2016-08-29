<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<title>AUTENTIA - Prueba de Formulario de validación con Spring MVC 3.1</title>
	<style type="text/css">
		body {
			font-family: verdana, sans-serif;			
		}
		
		span.campoConError {
			color: red;
		}
		
	</style>	
</head>
<body>

<c:url value="/formularioRegistro/manejar" var="destino"/>
<form:form method="post" action="${destino}" commandName="datosUsuario">
<h1>Formulario registro</h1>
<table>
<tbody>
<tr>
<td>Nombre:</td>
<td><form:input path="nombre"/></td>
<td><form:errors path="nombre" cssClass="campoConError"/></td>
</tr>
<tr>
<td>Clave:</td>
<td><form:input path="clave"/></td>
<td><form:errors path="clave" cssClass="campoConError"/></td>
</tr>
<tr>
<td colspan="3"><input type="submit" value="Enviar" /></td>
</tr>
</tbody>
</table>
</form:form>
</body>
</html>