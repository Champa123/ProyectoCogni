<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/general/template_top.jsp" />
<br>
<table style=padding-top:50px class="table table-bordered">
 <tr>
 	<th>Id</th>
 	<th>Nombre</th>
 	<th>Descripcion</th>
 	
 </tr> 
<tr>
<td>${proyecto.id}</td>
<td>${proyecto.nombre}</td>
<td>${proyecto.descripcion}</td>
</tr>
</table>

<c:import url="/general/template_bottom.jsp" />