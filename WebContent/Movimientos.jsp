<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="entities.ListaTipos"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	session.setAttribute("page", "Movimientos");
%>
<%@include file="head.jsp"%>
<body role="document">
	<%@include file="nav.jsp"%>
	<div class="container theme-showcase" role="main">
		<div class="page-header">Movimientos</div>

		<h3>Tipos</h3>
		
		<%!
			private String capitalize(final String line) {
			   return Character.toUpperCase(line.charAt(0)) + line.substring(1);
			}
		%>
		
		
		<div class="row">
			<div class="col-md-6">
				<table class="table table-condensed">
					<thead>
						<tr>
							<th>Tipo</th>
							<th>Representación</th>
						</tr>
					</thead>
					<tbody>

						<%
							ListaTipos.inicializaLista();
							for (String s : ListaTipos.lista) {
								out.println("<tr>");
								out.println("<th colspan=\"1\">" + capitalize(s) + "</th>");
								out.println("<th colspan=\"1\"> <img src=\"imagenes/" + s
										+ ".gif\"/></th>");
								out.println("</tr>");
							}
						%>

					</tbody>
				</table>
			</div>

		</div>
		<!-- fin tabla tipos -->


		<div class="row">
			<div class="panel panel-danger">
				<div class="panel-heading">
					<h3 class="panel-title">Categorias de daños de los movimientos</h3>
				</div>
				<div class="panel-body">
					<p>
						Los movimientos se reparten en tres categorías de daño (Damage category en 
						inglés) dependiendo del tipo de daño que provoquen: físico <img src="imagenes/fisico.gif"/>, 
						especial <img src="imagenes/especial.gif"/> o de estado <img src="imagenes/estado.gif"/>. Hasta la tercera generación, 
						según a qué tipo pertenecían los movimientos, estos se clasificaban entre 
						físicos y especiales a efectos del daño que producían. Sin embargo, esta 
						clasificación no siempre reflejaba la verdadera naturaleza de cada 
						movimiento, al haber movimientos que pertenecían a un tipo clasificado 
						como especial pero que no desempeñaba ningún poder especial o viceversa. 
						Por esta razón, a partir de la cuarta generación esta clasificación ya no 
						es válida, y cada movimiento pertenece a una categoría de daño 
						independientemente del tipo del movimiento en combate.
					</p>
				</div>
			</div>
		</div>

		<p></p>
	</div>
	<!-- fin container -->
</body>
</html>