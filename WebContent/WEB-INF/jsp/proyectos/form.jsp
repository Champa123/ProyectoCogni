<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/general/template_top.jsp" />


<script type="text/javascript">
$(function(){
	$("#select-single").select2();
	$(".js-example-basic-multiple").select2();
})

</script>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<br>
<br>
<br>
	<form:form method="post" modelAttribute="proyectoForm" action="guardarproyecto.html">
		<form:input path="id" type="hidden" />
		<div class="form-group">
		<label for="nombre">Nombre</label>
		<form:input class="form-control" path="nombre" type="text" />
		</div>
		<div class="form-group">
		<label for="descripcion">Descripcion</label>
		<form:textarea class="form-control" path="descripcion" />
		</div>
		<div class="form-group">
		<label for="idUsuarioPrincipal">Usuario Principal</label>
		<form:select path="idUsuarioPrincipal" id="select-single" class="js-example-basic-single js-states form-control" items="${usuarios}" itemLabel="nombreCompleto" itemValue="id">
		</form:select>
		</div>
		<div class="form-group">
		<label for="idUsuarios">Usuarios </label>
		<form:select id="select-multiple" class="js-example-basic-multiple js-states form-control" multiple="multiple" path="idUsuarios" items="${usuarios}" itemLabel="nombreCompleto" itemValue="id">
		</form:select>
		</div>
		<br>
		<div class="form-group">
		<input type="submit" class="btn btn-success" value="Guardar">
		<a href="listar.html" 
					class="btn btn-danger">Volver </a>
		</div>
	</form:form>
	

<c:import url="/general/template_bottom.jsp" />