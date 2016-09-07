<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table id="tablaProyectos" class="table table-striped table-bordered table-hover">
	<tr>
		<th>Id</th>
		<th>Nombre</th>
		<th>Descripcion</th>
		<th>Usuario Principal</th>
		<th></th>
	</tr>
	<c:forEach items="${proyectos}" var="p">
		<tr id="${p.id}">
			<td>${p.id}</td>
			<td>${p.nombre}</td>
			<td>${p.descripcion}</td>
			<td>
				<c:if test="${not empty p.usuarioPrincipal}">
					${p.usuarioPrincipal.nombreCompleto}</c:if>
			</td>
			<td align="center">
   
   
				<button type="button" class="btn btn-primary btn-modal" data-toggle="modal" 
				data-id-proyecto="${p.id}">Ver</button>
				
				<a href="editarproyecto.html?id=${p.id}" 
					class="btn btn-success">Editar</a>
				
				<button type="button" 
					data-id-proyecto="${p.id}" class="vertareas btn btn-warning">Ver Tareas</button>
								
				<a href="borrarproyecto.html?id=${p.id}" 
					class="btn btn-danger">Borrar</a>
					
					
					
					
			</td>
		</tr>
	</c:forEach>
</table>
