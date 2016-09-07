<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
  <h2>Modal Example</h2>
 
  <!-- Modal -->

    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">${proyecto.nombre}</h4>
        </div>
        <div class="modal-body">
           <table class="table table-striped table-bordered table-hover">
           		<tr>
           		<th>Id</th>
           		<th>Descripcion</th>
           		<th>Usuario Principal</th>
           		</tr>
           		<tr>
           			<td>${proyecto.id}</td>
           			<td>${proyecto.descripcion}</td>
           			<td>${proyecto.usuarioPrincipal.nombreCompleto}</td>
           		</tr>
           </table>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
 