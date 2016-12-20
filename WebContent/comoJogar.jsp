<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
<head>
<title>Como jogar</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="apple-touch-icon" sizes="57x57"
	href="img/icons/apple-icon-57x57.png">
<link rel="apple-touch-icon" sizes="60x60"
	href="img/icons/apple-icon-60x60.png">
<link rel="apple-touch-icon" sizes="72x72"
	href="img/icons/apple-icon-72x72.png">
<link rel="apple-touch-icon" sizes="76x76"
	href="img/icons/apple-icon-76x76.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="img/icons/apple-icon-114x114.png">
<link rel="apple-touch-icon" sizes="120x120"
	href="img/icons/apple-icon-120x120.png">
<link rel="apple-touch-icon" sizes="144x144"
	href="img/icons/apple-icon-144x144.png">
<link rel="apple-touch-icon" sizes="152x152"
	href="img/icons/apple-icon-152x152.png">
<link rel="apple-touch-icon" sizes="180x180"
	href="img/icons/apple-icon-180x180.png">
<link rel="icon" type="image/png" sizes="192x192"
	href="img/icons/android-icon-192x192.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="img/icons/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="96x96"
	href="img/icons/favicon-96x96.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="img/icons/favicon-16x16.png">
<link rel="manifest" href="/manifest.json">
<meta name="msapplication-TileColor" content="#ffffff">
<meta name="msapplication-TileImage"
	content="img/icons/ms-icon-144x144.png">
<link href="css/frame.css" rel="stylesheet" type="text/css" />
<link href="css/estilo.css" rel="stylesheet" type="text/css" />

</head>
<body>
	<div id="header" class="col-dg-12">
		<div class="col-dg-2 vazio"></div>

		<div id="caixaLogo" class="col-dg-6 vazio">
			<img id="logo" src="img/logo.png">
		</div>
		<div class="col-dg-2">
			<c:choose>
				<c:when test="${logado}">
					<jsp:include page="formUsuario.jsp" />
				</c:when>

				<c:otherwise>
					<c:choose>
						<c:when test="${erroLogin}">
							<jsp:include page="formNaoLogado.jsp" />
							<jsp:include page="erro.jsp" />
						</c:when>

						<c:otherwise>
							<jsp:include page="formNaoLogado.jsp" />
						</c:otherwise>

					</c:choose>

				</c:otherwise>
			</c:choose>
		</div>
		<div class="col-dg-2 vazio"></div>
	</div>

	<div id="caixaMenu" class="col-dg-12">
		<div class="col-dg-2 vazio"></div>

		<div class="col-dg-8 ">
			<ul id="menu">
				<li class="col-dg-3"><a href="index.jsp">Inicio</a></li>
				<li class="col-dg-3"><a href="jogar.jsp">Jogar</a></li>
				<li class="col-dg-3"><a href="comoJogar.jsp">Como Jogar</a></li>
				<li class="col-dg-3"><a href="rankings.jsp">Rankings</a>
			</ul>
		</div>

		<div class="col-dg-2"></div>
	</div>

	<div id="caixaJogo" class="col-dg-12 ">
		<div class="col-dg-2 cor2"></div>

		<div class="col-dg-8 cor conteudo">
			<div>
				<h2 id="titJogar">COMO JOGAR</h2>
				
				<p>Para jogar, basta fazer o login em sua conta, caso não esteja
					login e senha, tera que fazer o cadastro.</p>
				<p>Após fazer o Login sera lhe apresentado um tabuleiro
					representado por uma matriz 3 x 3, neste tabuleiro você tem direito
					a escolher uma posição a se marcar a cada vez que se tornar a sua
					vez de jogar.</p>
				<p>A vitória ocorre quando um jogador consegue colocar três
					símbolos em sequência, seja em linha, coluna ou na diagonal
					principal do tabuleiro. Caso não ocorra esta possibilidade e todos
					os campos do tabuleiro já foram preenchido, chamado
					tradicionalmente de a Velha ou seja, ninguém venceu</p>

				

			</div>
		</div>

		<div class="col-dg-2 cor2"></div>

	</div>

	<div class="col-dg-12"></div>

	<div id="caixaRodape" class="col-dg-12">

		<div class="col-dg-12">
			<div class="col-dg-2 vazio"></div>

			<div class="col-dg-8 rodape">
				<jsp:include page="rodape.jsp" />
			</div>


			<div class="col-dg-2"></div>
		</div>
		<div class="col-dg-2 vazio"></div>
		<div class="col-dg-8" id="direitos">Jogo da Velha | Desenvolvido
			para o Projeto integrador do segundo periodo da materia Sistemas para
			internet do IFTM</div>
		<div class="col-dg-2"></div>
	</div>

</body>
</html>