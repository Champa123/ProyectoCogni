<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/general/template_top.jsp" />

<script type="text/javascript">
$(document).ready(function(){

	hacerBusqueda();
	
	$('#textoBuscar').keypress(function(event){
		var keycode = (event.keyCode ? event.keyCode : event.which);
		if(keycode == '13'){
			event.preventDefault();
			hacerBusqueda();
			return false;
		}
		
	});

	$('#btnBuscar').click(function(){
		hacerBusqueda();
	});
	
	$("#divResultado").delegate(".vertareas", "click", function(){
		var id = $(this).data("id-proyecto");
		$.get("listartareas.html?id=" + id, function(resp){
			$("#divTareas").html(resp);
			
		});
	});
	
	$("#divResultado").delegate(".btn-modal", "click", function(){
		var id = $(this).data("id-proyecto");
		$.get("modal.html?id=" + id, function(resp){
			$("#myModal").html(resp);
			$("#myModal").modal("show");
		});
	});
	
		
	});

function mostrarTareas(){
	$.get("listartareas.html", function(r){
		$("#divTareas").html(r)
	})
}

function hacerBusqueda (){
	var datos = $('#buscador').serialize();
	$.post('buscadorproyectos.html', datos, function(r){
		$('#divResultado').html(r);
	});
}	
	
</script>


<h1>Listado de Proyectos</h1>
<a href="nuevoproyecto.html" class="btn btn-warning">Agregar nuevo </a>
<br>
<br>
<form class="form-inline" id="buscador" method="post" action="buscadorproyectos.html">
	<input type="text" id="textoBuscar" name="textoBuscar" placeholder="Buscar..." class="ui-widget">
	<input id="btnBuscar" type="button" value="Buscar">
</form>			

<div id="divResultado"></div>
<div id="divTareas"></div>
<div class="modal fade" id="myModal" role="dialog"></div>


<!-- <table class="table table-striped table-bordered table-hover"> -->
<!-- 	<tr> -->
<!-- 		<th>Id</th> -->
<!-- 		<th>Nombre</th> -->
<!-- 		<th>Descripcion</th> -->
		
<!-- 		<th></th> -->
<!-- 	</tr> -->
<%-- 	<c:forEach items="${proyectos}" var="p"> --%>
<!-- 		<tr> -->
<%-- 			<td>${p.id}</td> --%>
<%-- 			<td>${p.nombre}</td> --%>
<%-- 			<td>${p.descripcion}</td> --%>
<!-- 			<td> -->
<%-- 				<c:if test="${not empty p.usuarioPrincipal}"> --%>
<%-- 					${p.usuarioPrincipal.nombreCompleto}</c:if> --%>
<!-- 			</td> -->
<!-- 			<td> -->
  			
<%-- 				<a href="verproyecto.html?id=${p.id}"  --%>
<!-- 					class="btn btn-primary">Ver</a> -->
				
<%-- 				<a href="editarproyecto.html?id=${p.id}"  --%>
<!-- 					class="btn btn-success">Editar</a> -->
				
<%-- 				<a href="borrarproyecto.html?id=${p.id}"  --%>
<!-- 					class="btn btn-danger">Borrar</a> -->
					
					
<!-- 			</td> -->
<!-- 		</tr> -->
<%-- 	</c:forEach> --%>
<!-- </table> -->


<c:import url="/general/template_bottom.jsp" />