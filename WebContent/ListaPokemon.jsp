<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="entities.ListaDePokemon,entities.Pokemon"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	session.setAttribute("page", "Lista de Pokémon");
%>
<%@include file="head.jsp"%>
<body role="document">
	<%@include file="nav.jsp"%>
	<div class="container theme-showcase" role="main">
		<div class="row">
			<div class="col-md-6">
				<table class="table table-bordered">
					<thead>
						<tr>
							<th>Pokémon</th>
							<th>Tipo(s)</th>
							<th>Descripción</th>
							
						</tr>
					</thead>
					<tbody>
						<% ListaDePokemon.generaLista();
							for(Pokemon p:ListaDePokemon.lista){
								out.println("<tr>");
								out.println("<td>"+p.getNombre()+"<br/><img src=\"imagenes/" + p.getNombre()+".gif\"/></td>");
								out.println("<td>"+"<img src=\"imagenes/" + p.getTipo1()+".gif\"/>");
								if(p.getTipo2()!=null)out.println("<img src=\"imagenes/" + p.getTipo2()+".gif\"/>");
								out.println("</td>");
								//out.println("<td><p>"+p.getDescripcion()+"</p>");//desc
								out.println("<td><details><summary>"+p.getNombre()+"</summary><p>");
								out.println(p.getDescripcion()+"</p></summary></details></td>");
								out.println("</tr>");
							}
						%>
						
					</tbody>
				</table>
			</div>
		</div>
	</div>
	
</body>
</html>