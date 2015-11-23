<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	session.setAttribute("page", "Ayuda");
%>
<%@include file="head.jsp"%>
<body role="document">
	<%@include file="nav.jsp"%>
	<div class="container theme-showcase" role="main">
		<div class="page-header">Ayuda</div>
		<div class="panel panel-danger">
			<div class="panel-heading">
				<h3 class="panel-title">Navegación</h3>
			</div>
			<div class="panel-body">
				<p>Los apartados que se tienen dentro de la página son los
					siguientes:</p>
				<br />
				<div class="col-sm-4">
					<div class="list-group">
						<a href="#" class="list-group-item active"> Contenido </a> <a
							href="Index.jsp" class="list-group-item">Home</a> <a
							href="Tipos.jsp" class="list-group-item">Tipos</a> <a
							href="Movimientos.jsp" class="list-group-item">Movimientos</a> <a
							href="ListaPokemon.jsp" class="list-group-item">Pokémon</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>