<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="apple-touch-icon" sizes="57x57" href="img/icons/apple-icon-57x57.png">
<link rel="apple-touch-icon" sizes="60x60" href="img/icons/apple-icon-60x60.png">
<link rel="apple-touch-icon" sizes="72x72" href="img/icons/apple-icon-72x72.png">
<link rel="apple-touch-icon" sizes="76x76" href="img/icons/apple-icon-76x76.png">
<link rel="apple-touch-icon" sizes="114x114" href="img/icons/apple-icon-114x114.png">
<link rel="apple-touch-icon" sizes="120x120" href="img/icons/apple-icon-120x120.png">
<link rel="apple-touch-icon" sizes="144x144" href="img/icons/apple-icon-144x144.png">
<link rel="apple-touch-icon" sizes="152x152" href="img/icons/apple-icon-152x152.png">
<link rel="apple-touch-icon" sizes="180x180" href="img/icons/apple-icon-180x180.png">
<link rel="icon" type="image/png" sizes="192x192"  href="img/icons/android-icon-192x192.png">
<link rel="icon" type="image/png" sizes="32x32" href="img/icons/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="96x96" href="img/icons/favicon-96x96.png">
<link rel="icon" type="image/png" sizes="16x16" href="img/icons/favicon-16x16.png">
<link rel="manifest" href="/manifest.json">
<meta name="msapplication-TileColor" content="#ffffff">
<meta name="msapplication-TileImage" content="img/icons/ms-icon-144x144.png">
<script>
	function jogar(pos) {
		document.form1.txtjogada.value = pos;
		document.form1.submit();
	}
</script>
</head>
<body>
	<form name="form1" action="EscutaJogadaServlet" method="get">
		<input type="hidden" name="txtjogada" />
		<table border="1">
			<tr>
				<td><input type="button"
					value="<c:out value="${jogoVo.pos1}"/>" onclick="jogar(1)" /></td>
				<td><input type="button"
					value="<c:out value="${jogoVo.pos2}"/>" onclick="jogar(2)" /></td>
				<td><input type="button"
					value="<c:out value="${jogoVo.pos3}"/>" onclick="jogar(3)" /></td>
			</tr>
			<tr>
				<td><input type="button"
					value="<c:out value="${jogoVo.pos4}"/>" onclick="jogar(4)" /></td>
				<td><input type="button"
					value="<c:out value="${jogoVo.pos5}"/>" onclick="jogar(5)" /></td>
				<td><input type="button"
					value="<c:out value="${jogoVo.pos6}"/>" onclick="jogar(6)" /></td>
			</tr>
			<tr>
				<td><input type="button"
					value="<c:out value="${jogoVo.pos7}"/>" onclick="jogar(7)" /></td>
				<td><input type="button"
					value="<c:out value="${jogoVo.pos8}"/>" onclick="jogar(8)" /></td>
				<td><input type="button"
					value="<c:out value="${jogoVo.pos9}"/>" onclick="jogar(9)" /></td>
			</tr>
		</table>

	</form>
	<c:out value="${jogoVo.msg}" />

	<table>
		<tr>
			<td>Jogador 1: <c:out value="${jogoVo.simboloJogador1}" /></td>
			<td>Jogadas:</td>

		</tr>
		<tr>
			<td>Jogador 2: <c:out value="${jogoVo.simboloJogador2}" /></td>
			<td>Jogadas:</td>
		</tr>


	</table>
	Vez:
	<c:out value="${jogoVo.vez}" />
</body>
</html>