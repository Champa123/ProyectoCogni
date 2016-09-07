<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Track & Bug</title>
    <link href="<c:url value="/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/css/general.css" />" rel="stylesheet">
	<link href="<c:url value="/css/select2.css" />" rel="stylesheet">
	<link href="<c:url value="/css/jquery-ui.css" />" rel="stylesheet">
	<script src="<c:url value="/js/jquery-3.1.0.js" />"></script>
	<script src="<c:url value="/js/jquery-ui.js" />"></script>
    <script src="<c:url value="/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/js/select2.full.min.js" />"></script>
    <script>
   $(document).ready(function(){
    $("#autocomplete").autocomplete({
    	source: '<c:url value="/api/proyectos/autocomplete.json"/>', 
    	minLength:2,
    	select: function(event , ui) {
    		window.location = '/trackandbug/proyectos/verproyecto.html?id=' + ui.item.id;
    }});
   })
    </script>
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Track & Bug</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="<c:url value="/index.jsp" />">Home</a></li>
            <li><a href="<c:url value="/proyectos/index.html" />">Proyectos</a></li>
            <li><a href="<c:url value="/usuarios/listar.html" />">Listar</a></li>
            <li><a href="<c:url value="/tareas/listartareas.html" />">Tareas</a></li>
          </ul>
          <form class="navbar-form navbar-left">
        <div class="form-group">
          <input id="autocomplete" type="text" class="form-control" placeholder="Search">
        </div>
      </form>
       </div>
        <!--/.nav-collapse -->
      </div>
    </nav>

	<!-- container -->
    <div class="container">


