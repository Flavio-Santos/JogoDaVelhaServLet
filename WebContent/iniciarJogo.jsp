<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
    <head>
        <title>Jogo da velha</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
        <link href="css/iniciarJogo.css" rel="stylesheet" type="text/css"/>
        <script src="js/iniciarJogo.js" type="text/javascript"></script>
        <script src="js/ajax.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="bordaMenu"></div>
        <div id="menu">
            <p id='novoJogo' onclick= "novoJogo()">NOVO JOGO</p>
        </div>

        <div id="vezJogador">
            <p id="txtJogador">JOGADOR </p>
        </div>

        <div id='tabulheiro'>
            <div class="caixa" id="cel00"
                 onmouseout="mudarCor('cel00', 'white')"
                 onmouseover="mudarCor('cel00', 'lightblue')"
                 onclick= "inserirMarcacao('txt00', '0', '0')">
                <p id="txt00"></p>
            </div>

            <div class="caixa" id='cel01'
                 onmouseout="mudarCor('cel01', 'white')"
                 onmouseover="mudarCor('cel01', 'lightblue')"
                 onclick= "inserirMarcacao('txt01', '0', '1')">  
                <p id="txt01"></p>
            </div>

            <div class="caixa" id="cel02"
                 onmouseout="mudarCor('cel02', 'white')"
                 onmouseover="mudarCor('cel02', 'lightblue')"
                 onclick= "inserirMarcacao('txt02', '0', '2')">  
                <p id="txt02"></p>
            </div>

            <div class="caixa" id='cel10'
                 onmouseout="mudarCor('cel10', 'white')"
                 onmouseover="mudarCor('cel10', 'lightblue')"
                 onclick= "inserirMarcacao('txt10', '1', '0')">  
                <p id="txt10"></p>
            </div>

            <div class="caixa" id="cel11"
                 onmouseout="mudarCor('cel11', 'white')"
                 onmouseover="mudarCor('cel11', 'lightblue')"
                 onclick= "inserirMarcacao('txt11', '1', '1')">
                <p id="txt11"></p>
            </div>

            <div class="caixa" id='cel12'
                 onmouseout="mudarCor('cel12', 'white')"
                 onmouseover="mudarCor('cel12', 'lightblue')"
                 onclick= "inserirMarcacao('txt12', '1', '2')"> 
                <p id="txt12"></p>
            </div>

            <div class="caixa" id="cel20"
                 onmouseout="mudarCor('cel20', 'white')"
                 onmouseover="mudarCor('cel20', 'lightblue')"
                 onclick= "inserirMarcacao('txt20', '2', '0')">  
                <p id="txt20"></p>
            </div>

            <div class="caixa" id='cel21'
                 onmouseout="mudarCor('cel21', 'white')"
                 onmouseover="mudarCor('cel21', 'lightblue')"
                 onclick= "inserirMarcacao('txt21', '2', '1')"> 
                <p id="txt21"></p>
            </div>

            <div class="caixa" id="cel22"
                 onmouseout="mudarCor('cel22', 'white')"
                 onmouseover="mudarCor('cel22', 'lightblue')"
                 onclick= "inserirMarcacao('txt22', '2', '2')"> 
                <p id="txt22"></p>
            </div>

        </div> 
        <div id="resultado">
            <p id="txtResultado"></p>
        </div>
    </body>
</html>