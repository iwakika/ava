<%@page import="java.util.Date"%>
<%@page import="java.io.FileNotFoundException"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.IOException"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.parser.ParseException"%>
<%@page import="org.json.simple.parser.JSONParser"%>

<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%!String info = "/home/siena/workspace/AVA/WebContent/data/ghramos/info.json";
	String disciplinas = "/home/siena/workspace/AVA/WebContent/data/ghramos/disciplinas.json";
	JSONParser parser = new JSONParser();

	String getValor(String key) throws FileNotFoundException, IOException, ParseException {
		Object obj = parser.parse(new FileReader(info));
		JSONObject jsonObj = (JSONObject) obj;
		return (String) jsonObj.get(key);
	}

	String getDisciplinas() throws FileNotFoundException, IOException, ParseException {
		String str = "";
		Object obj = parser.parse(new FileReader(disciplinas));
		JSONObject jsonObj = (JSONObject) obj;
		JSONArray disciplinas = (JSONArray) jsonObj.get("disciplinas");

		for (int i = 0; i < disciplinas.size(); i++) {
			JSONObject o = (JSONObject) disciplinas.get(i);
			str += "<dt><a href=\"" + "disciplina.jsp?id=" + o.get("nome")
					+ "\" class=\"padding\"><i class=\"material-icons colored\">class</i>&nbsp;" + o.get("nome")
					+ "</a></dt>";
			str += "<dd>" + o.get("descricao") + "</dd>";

		}
		return str;
	}%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/styles.css">
<link rel="stylesheet" href="css/font-awesome.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Indie+Flower">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<title>FURB - Ambiente Virtual de Aprendizagem</title>
</head>

<body>
	<!--Top Container-->
	<div class="top blue padding large">
		<button class="btn hide-large padding-0" onclick="abrirNav();">
			<i class="fa fa-bars"></i> &nbsp;Menu
		</button>
		<a href="index.jsp" class="right"><i class="material-icons blue">exit_to_app</i></a>
	</div>

	<!-- Sidenav/menu -->
	<nav class="sidenav collapse" id="mySidenav">
		<br>
		<div class="container">
			<div class="col s4">
				<i class="material-icons icon46">face</i>
			</div>
			<div class="col s8">
				<span>&nbsp; Bem Vindo, <strong> <%
 	out.println(getValor("pnome"));
 %>
				</strong>
				</span>
			</div>
		</div>
		<br> <br>
		<hr>
		<div class="container">
			<b>Dashboard</b>
		</div>
		<div>
			<dl>
				<dt class="padding">
					<i class="material-icons colored">class</i>&nbsp; Ciência da
					Computação
				</dt>
				<!--Adicionar conteudo do JSON-->
				<div id="id01" class="paddingDisci">
					<%
						out.println(getDisciplinas());
					%>
				</div>
			</dl>
		</div>
		<a href="preferencia.jsp" class="padding"><i
			class="material-icons">account_circle</i>&nbsp; Preferências</a> <a
			href="#" class="padding"><i class="material-icons">backup</i>&nbsp;
			Backup</a> <a href="index.jsp" class="padding"><i
			class="material-icons">exit_to_app</i>&nbsp; Sair</a>
	</nav>

	<!-- !PAGE CONTENT! -->
	<div class="main" id="myMain"></div>
	<!--Noticias-->
	<div class="noticias right">
		<!-- TODO: Abrir link em nova aba e altura 100% automatica -->
		<iframe src="http://www.furb.br/web/1704/noticias" target="_blank"></iframe>
	</div>
</body>
<script src="js/myJavaScript.js"></script>

</html>
