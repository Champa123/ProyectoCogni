<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/general/template_top.jsp" />

<table class="table table-bordered">
 <tr>
 	<th>Id</th>
 	<th>Nombre completo</th>
 	<th>Usuario</th>
 	<th>Activo</th>
 </tr> 
<tr>
<td>${usuario.id}</td>
<td>${usuario.nombreCompleto}</td>
<td>${usuario.usuario}</td>
<td>${usuario.activo}</td></tr>
</table>

<c:import url="/general/template_bottom.jsp" />