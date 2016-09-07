<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table class="table table-striped table-bordered table-hover">
	<tr>
		<th>Id</th>
		<th>Nombre</th>
		<th></th>
		
		<th></th>
	</tr>
	<c:forEach items="${tareas}" var="t">
		<tr>
			<td>${t.id}</td>
			<td>${t.nombre}</td>
			<td>
   
   
				<button type="button" class="btn btn-primary btn-modal" data-toggle="modal" 
				data-id-tarea="${t.id}">Ver</button>
				
				<a href="editartarea.html?id=${t.id}" 
					class="btn btn-success">Editar</a>
				
				<a href="borrartarea.html?id=${t.id}" 
					class="btn btn-danger">Borrar</a>
					
					
			</td>
		</tr>
	</c:forEach>
</table>

