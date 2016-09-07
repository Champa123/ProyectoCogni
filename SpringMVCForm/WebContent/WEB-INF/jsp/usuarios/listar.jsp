<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/general/template_top.jsp" />

<h1>Listado de usuarios</h1>
<a href="nuevousuario.html" 
					class="btn btn-warning">Agregar nuevo </a>
					<br>
					<br>
<table class="table table-striped table-bordered table-hover">
	<tr>
		<th>Id</th>
		<th>Usuario</th>
		<th>Nombre Completo</th>
		<th>Activo</th>
		<th></th>
	</tr>
	<c:forEach items="${usuarios}" var="u">
		<tr>
			<td>${u.id}</td>
			<td>${u.usuario}</td>
			<td>${u.nombreCompleto}</td>
			<td><c:if test="${u.activo}">
  			<c:out value="Si"/></c:if>
  			<c:if test="${u.activo == false}">
  			<c:out value="No"/></c:if></td>
			<td>
				<a href="verusuario.html?id=${u.id}" 
					class="btn btn-primary">Ver</a>
				
				<a href="editarusuario.html?id=${u.id}" 
					class="btn btn-success">Editar</a>
				
				<a href="borrarusuario.html?id=${u.id}" 
					class="btn btn-danger">Borrar</a>
					
					
			</td>
		</tr>
	</c:forEach>
</table>

<c:import url="/general/template_bottom.jsp" />