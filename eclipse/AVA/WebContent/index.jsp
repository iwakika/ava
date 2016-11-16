<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width">
<link rel="stylesheet" href="css/styles.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Indie+Flower">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<title>FURB - Ambiente Virtual de Aprendizagem</title>
</head>

<body>
	<header class="blue" style="border-bottom: 3px solid #FFCC00;">
		<div>
			<a href="index.html"><img style="width: 123px; height: 90px;"
				src="logo-furb.gif" alt="Logo FURB" /></a>
		</div>
	</header>

	<div class="login center">

		<div>
			<i class="material-icons" style="font-size: 72px">face</i>
		</div>
		<div>
			<span class="coolFont"><h2>Acesso ao AVA</h2></span>
		</div>

		<div>
			<form name="myForm" method="post" action="validaLogin.jsp">
				<input class="loginWidth" type="text" name="usuario"
					placeholder="Usuário" required>
				<p></p>
				<input class="loginWidth" type="password" name="senha"
					placeholder="Senha" required>
				<p></p>
				<button class="blue loginWidth " type="submit" name="entrar"
					onclick="validaForm();">Entrar</button>

			</form>
		</div>

		<div class="spaceAfter">
			<a href="#">Esqueceu seu login ou senha?</a>
		</div>

	</div>

	<footer class="center">
		<div>
			<a href="#">Termo de Uso</a> | <a href="#">Manuais</a> | <a href="#">Suporte
				técnico</a>
		</div>
	</footer>

</body>
<script src="js/myJavaScript.js"></script>

</html>