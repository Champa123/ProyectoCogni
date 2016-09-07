<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/general/template_top.jsp" />

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<br>
<br>
<br>
	<form:form method="post" modelAttribute="usuarioForm" action="guardarusuario.html">
		<form:input path="id" type="hidden" />
		ApeNom<form:input class="form-control" path="nombreCompleto" type="text" />
		User: <form:input class="form-control" path="usuario" type="text" />
		Password: <form:input  class="form-control" path="password" type="password" />
		¿Activo?<form:checkbox  path="activo"/>
		<br>
		<input type="submit" class="btn btn-success" value="Guardar">
		<a href="listar.html" 
					class="btn btn-danger">Volver </a>
	</form:form>
	

<c:import url="/general/template_bottom.jsp" />