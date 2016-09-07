<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/general/template_top.jsp" />




<h1>Listado de Tareas</h1>
<a href="nuevatarea.html" class="btn btn-warning">Agregar nueva tarea </a>
<br>
<br>
<form class="form-inline" id="buscador" method="post" action="buscadorproyectos.html">
	<input type="text" id="textoBuscar" name="textoBuscar" placeholder="Buscar..." class="ui-widget">
	<input id="btnBuscar" type="button" value="Buscar">
</form>			

<div id="divResultado"></div>
<div id="divTareas"></div>
<div class="modal fade" id="myModal" role="dialog"></div>



<c:import url="/general/template_bottom.jsp" />