var g_habilitar = true;
var ganhador = '';
var cont = 0;
var check = 0;
var qtdVitoriaO = 0;
var qtdVitoriaX = 0;
var vetCorVitoria = new Array(3);
var g_valorSessao = "";
var g_turno = "";
var g_myTimer;


function primeiraJogada() {

	if (quantidadeDeCasasPreenchidas() == 0) {
		g_turno = "X";
		g_habilitar = true;
	}
}

function gravaJogadorLocal(){
	if(localStorage.getItem("StorageLocal") == null || localStorage.StorageLocal==undefined){
		if(g_turno == "O"){
			localStorage.setItem("StorageLocal", "O")
		}else{
			localStorage.setItem("StorageLocal", "X")
		}
	}	
}

function impedirCliqueDuplo() {
	if(quantidadeDeCasasPreenchidas() != 0){
		if(localStorage.getItem("StorageLocal") == g_turno){
			g_habilitar = true;
		}
		else{
			g_habilitar = false;
		}
	}	
}

function quantidadeDeCasasPreenchidas() {
	var qtd = 0;
	for (i = 0; i < 3; i++) {
		for (j = 0; j < 3; j++) {
			if (document.getElementById('txt' + i + j).innerHTML != '') {
				qtd++;
			}
		}
	}
	return qtd;
}

function inserirMarcacao(idTxt, p, q) {
	
	primeiraJogada();
	gravaJogadorLocal();
	impedirCliqueDuplo();
	
	if (document.getElementById(idTxt).innerHTML == '' && g_habilitar == true) {
		cont++;
		document.getElementById(idTxt).innerHTML = g_turno;
		
		(g_turno == "X") ? g_turno = "O" : g_turno = "X";
		g_myTimer = setInterval(verificarMatch, 1000);
	}
	onclick();
}

function novoJogo() {
	g_habilitar = true;
	for (i = 0; i < 3; i++) {
		for (j = 0; j < 3; j++) {
			document.getElementById('txt' + i + j).innerHTML = '';
			document.getElementById('txt' + i + j).style.backgroundColor = ''
			document.getElementById('txt' + i + j).style.color = '';
		}
	}

	
	localStorage.clear();
	g_turno = undefined;
	document.getElementById('msg').style.display = 'none';
	document.getElementById('menu').style.top = '-40px';
	
	limparSessao();
}

function fimDeJogo(xisOuBola) {
	g_habilitar = false;
	ganhardor = xisOuBola;
	nomeGanhador = "Jogador " + g_turno + " Ganhou";
	
	verificarMatch();

	if (ganhador == 'X')
		qtdVitoriaX++
	else if (ganhador == 'O')
		qtdVitoriaO++
	else
		ganhador == '';
}

function verificarMatch(){
	//instancia vetor
	var z = 0;
	var pos = new Array(9);
	var casasAMarcar = [];
	casasAMarcar.length = 0;
	for(var i=0;i<3;i++){
		for(var j=0;j<3;j++){
			pos[z] = document.getElementById('txt'+i+j).innerHTML;
			z++;
		}	
	}
	//verifica as posicoes e alimenta vetor para o preenchimento
	if(pos[0]===pos[1]&&pos[1]===pos[2]&&pos[0]!=""){
		//Valida vitoria na linha superior
		casasAMarcar.push('txt00','txt01','txt02');
	}
	if(pos[3]===pos[4]&&pos[4]===pos[5]&&pos[3]!=""){
		//Valida vitoria na linha do meio
		casasAMarcar.push('txt10','txt11','txt12');
	}
	if(pos[6]===pos[7]&&pos[7]===pos[8]&&pos[6]!=""){
		//Valida vitoria na linha inferior
		casasAMarcar.push('txt20','txt21','txt22');
	}
	if(pos[0]===pos[3]&&pos[6]===pos[3]&&pos[0]!=""){
		//Valida vitoria na linha da esquerda
		casasAMarcar.push('txt00','txt10','txt20');
	}
	if(pos[1]===pos[4]&&pos[7]===pos[1]&&pos[1]!=""){
		//Valida vitoria na linha da esquerda
		casasAMarcar.push('txt01','txt11','txt21');
	}
	if(pos[2]===pos[5]&&pos[8]===pos[2]&&pos[2]!=""){
		//Valida vitoria na linha da direita
		casasAMarcar.push('txt02','txt12','txt22');
	}
	if(pos[2]===pos[4]&&pos[6]===pos[4]&&pos[4]!=""){
		//Valida vitoria na ascendente direita
		casasAMarcar.push('txt02','txt11','txt20');
	}
	if(pos[0]===pos[4]&&pos[8]===pos[4]&&pos[4]!=""){
		//Valida vitoria na descendente direita
		casasAMarcar.push('txt00','txt11','txt22');
	}
	
	if(casasAMarcar.length>0){
		destacarCasas(casasAMarcar);
		console.log('G turno igual a '+g_turno);
		console.log(pos[0]);
		g_simboloVencedor = pos[0];
		verificaFimDeJogo(pos[0]);
		clearInterval(g_myTimer);
	}
	else{
		casasAMarcar.length = 0;
		
	}	
}

function destacarCasas(vet){
	for(var i=0;i<vet.length;i++){
		document.getElementById(vet[i]).style.backgroundColor = '#7B0829';
		document.getElementById(vet[i]).style.color = "#ffffff";
	}
}

function trocarMsg(texto, cor){
	document.getElementById('txtMsg').innerHTML = texto;
	document.getElementById('msg').style.color = cor;
	document.getElementById('msg').style.display = 'block';
	
}

function verificaFimDeJogo(simboloQueVenceu){
	clearInterval(g_myTimer);
	if(localStorage.getItem("StorageLocal")==simboloQueVenceu){
		trocarMsg('Parabens voce venceu!',"#ffffff");
		
	}else{
		trocarMsg('Voce perdeu',"#ffffff");
	}
	document.getElementById('menu').style.top = '-10px';
}