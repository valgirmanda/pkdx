<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="entities.ListaTipos,entities.VentajasDesventajas"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<%
	session.setAttribute("page", "Tipos");
%>
<%@include file="head.jsp"%>
<body role="document">
	<%@include file="nav.jsp"%>
	<div class="container theme-showcase" role="main">

		<%!private String capitalize(final String line) {
			return Character.toUpperCase(line.charAt(0)) + line.substring(1);
		}%>
		<div class="page-header">Tipos Elementales</div>

		<p>Los Pokémon pueden desarrollar poderes y tener cierta ventaja o
			debilidad a determinados elementos, así como una morfología similar a
			la de otras especies, que permite clasificarlos dentro de lo que
			llamamos tipo. Cada tipo tiene sus puntos fuertes y puntos débiles, y
			algunos Pokémon, incluso, pueden pertenecer a dos tipos a la vez. Hay
			movimientos con los cuales algunos Pokémon pueden realizar cambios de
			tipo. De la misma forma, los movimientos de los Pokémon se clasifican
			dentro de un tipo o dos como es el caso del ataque plancha voladora
			que es tipo lucha y tipo volador al mismo tiempo.</p>


		<!-- tabla tipos -->
		<%
			ListaTipos.inicializaLista();
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

		<!-- Subtipos -->
		<div class="row">
			<div class="panel panel-danger">
				<div class="panel-heading">
					<h3 class="panel-title">Subtipo o segundo tipo</h3>
				</div>
				<div class="panel-body">
					<p>Se le conoce como segundo tipo a un tipo secundario que
						pueden desarrollar los Pokémon. El subtipo normalmente sólo afecta
						a los tipos de movimientos que va a poder aprender el Pokémon,
						pero también en una mínima parte a su aspecto físico.</p>

					<p>Además, un subtipo puede influir en la efectividad de los
						movimientos que reciba un Pokémon. Por ejemplo: un Trapinch tiene
						como debilidad los ataques de tipo hielo, agua y planta, y es
						resistente a los ataques de tipo roca y veneno. Si Trapinch
						evoluciona a Vibrava gana un subtipo (que es el tipo dragón), por
						lo que ahora su debilidad es ante los ataques de tipo dragón,
						hielo y hada. Se le agregan los tipos dragón y hada por tener de
						subtipo dragón (que es una debilidad de estos) y se le quitan las
						debilidades a agua y planta porque su subtipo es resistente a
						estos dos. Aunque debido a su subtipo, ahora es más débil contra
						el tipo hielo.</p>

					<p>Otro ejemplo son los tipo volador. Estos son resistentes
						ante los ataques tipo lucha, pero hay muchos que son de tipo
						normal por lo que los ataques tipo lucha tienen una efectividad
						normal ante estos. En total, 347 especies de Pokémon, es decir, el
						48,3% del total, tienen un tipo secundario. Para este cálculo se
						tomó a Shaymin como un tipo planta/volador y se supuso que
						Wormadam, Rotom y Meloetta no varían de tipo.</p>
				</div>
			</div>

		</div>


		<!-- tabla daños -->

		<div class="col-md-6">
			<table class="table-bordered">
				<thead>
					<tr>
						<th colspan="2" rowspan="2" style="background: #ff9966;"
							align="center">Efectividad</th>
						<th colspan="18" style="background: #9aff9a;" align="center">Pokémon
							del oponente</th>
					</tr>
					<tr>
						<%
							for (String s : ListaTipos.lista) {
								out.println("<th align=\"center\"><img src=\"imagenes/" + s
										+ "_vertical.gif\"/></th>");
							}
						%>

					</tr>
				</thead>
				<tbody>
					<%
						int count = 0;
						for (String s : ListaTipos.lista) {
							out.println("<tr>");
							if (count == 0) {
								out.println("<th align=\"center\" rowspan=\"18\" style=\"background:#ffd39b\" >");
								out.println("A <br/>");
								out.println("T <br/>");
								out.println("A <br/>");
								out.println("Q <br/>");
								out.println("U <br/>");
								out.println("E <br/>");
								out.println(" <br/>");
								out.println("P <br/>");
								out.println("R <br/>");
								out.println("O <br/>");
								out.println("P <br/>");
								out.println("I <br/>");
								out.println("O <br/>");
								out.println("</th>");
							}
							out.println("<td align=\"center\"> <img src=\"imagenes/" + s
									+ ".gif\"/></td>");
							for (int j = 0; j < 18; j++) {
								//VentajasDesventajas.tabla[count][j];
								if (VentajasDesventajas.tabla[count][j] == 3) {
									out.println("<td align=\"center\">-</td>");
								} else {
									out.println("<td align=\"center\"><img src=\"imagenes/"
											+ VentajasDesventajas.tabla[count][j]
											+ ".png\"/></td>");
								}
							}
							out.println("</tr>");
							count++;
						}
					%>

				</tbody>
			</table>
		</div>

		<!-- fin tabla daños -->


	</div>
	<!-- container -->
</body>
</html>