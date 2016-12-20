<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
    <head>
        <title>Jogo da velha</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/iniciarJogo.css" rel="stylesheet" type="text/css"/>
        <script src="js/iniciarJogo.js" type="text/javascript"></script>
        <script src="js/ajax.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="bordaMenu"></div>
        <div id="menu">
            <p id='novoJogo' onclick= "novoJogo()">NOVO JOGO</p>
        </div>
		
		<div id='container'>
	       <div id="vezJogador">
	            <p id="txtJogador"></p>
	        </div>
	
	        <div id='tabulheiro'>
	            <div class="caixa" id="cel00"
	                 onclick= "inserirMarcacao('txt00', '0', '0')">
	                <p id="txt00"></p>
	            </div>
	
	            <div class="caixa" id='cel01'
	                 onclick= "inserirMarcacao('txt01', '0', '1')">  
	                <p id="txt01"></p>
	            </div>
	
	            <div class="caixa" id="cel02"
	                 onclick= "inserirMarcacao('txt02', '0', '2')">  
	                <p id="txt02"></p>
	            </div>
	
	            <div class="caixa" id='cel10'
	                 onclick= "inserirMarcacao('txt10', '1', '0')">  
	                <p id="txt10"></p>
	            </div>
	
	            <div class="caixa" id="cel11"
	                 onclick= "inserirMarcacao('txt11', '1', '1')">
	                <p id="txt11"></p>
	            </div>
	
	            <div class="caixa" id='cel12'
	                 onclick= "inserirMarcacao('txt12', '1', '2')"> 
	                <p id="txt12"></p>
	            </div>
	
	            <div class="caixa" id="cel20"
	                 onclick= "inserirMarcacao('txt20', '2', '0')">  
	                <p id="txt20"></p>
	            </div>
	
	            <div class="caixa" id='cel21'
	                 onclick= "inserirMarcacao('txt21', '2', '1')"> 
	                <p id="txt21"></p>
	            </div>
	
	            <div class="caixa" id="cel22"
	                 onclick= "inserirMarcacao('txt22', '2', '2')"> 
	                <p id="txt22"></p>
	            </div>
	
	        </div> 
	        
	        
	        <div id="msg">
	            <p id="txtMsg">a</p>
	        </div>
    	</div>    
    </body>
</html>