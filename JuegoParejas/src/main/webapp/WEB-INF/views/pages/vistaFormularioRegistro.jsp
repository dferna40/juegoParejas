

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form method="post" action="${pageContext.request.contextPath}/manejarRegistro" commandName="datosUsuario">
	<h1>Rellena estos datos para realizar el registro en el juego:</h1>
	<table>
		<tbody>
			<tr>
				<td>Nombre </td>
				<td><form:input path="nombre" /></td>
				<td><form:errors path="nombre" cssClass="campoConError" /></td>
			</tr>
			<tr>
				<td>Clave </td>
				<td><form:input path="clave" /></td>
				<td><form:errors path="clave" cssClass="campoConError" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Enviar" /></td>
			</tr>
		</tbody>
	</table>
</form:form>
