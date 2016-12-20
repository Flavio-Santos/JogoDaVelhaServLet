var g_elementRecebe;
var g_stringMatriz = "";

function loop() {
	var xhttp;
	if (window.XMLHttpRequest) {
		// code for modern browsers
		xhttp = new XMLHttpRequest();
	} else {
		// code for IE6, IE5
		xhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	xhttp.onreadystatechange = function() {

		if (this.readyState == 4 && this.status == 200) {
			var posicoesJson = JSON.parse(this.responseText);
			instanciaJson(posicoesJson);
			xhttp = null;
		}

	};
	xhttp.open("GET", "envia", true);
	xhttp.send();
}

function envia() {
	var xhttp;
	if (window.XMLHttpRequest) {
		// code for modern browsers
		xhttp = new XMLHttpRequest();
	} else {
		// code for IE6, IE5
		xhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	xhttp.open("GET", "rec?" + g_stringMatriz, true);
	xhttp.send();
}
envia();
setInterval(loop, 500);

function onclick() {
	var a = document.getElementById('txt00').innerHTML;
	if (a == "")
		a = "v";
	var b = document.getElementById('txt01').innerHTML;
	if (b == '')
		b = "v";
	var c = document.getElementById('txt02').innerHTML;
	if (c == '')
		c = "v";
	var d = document.getElementById('txt10').innerHTML;
	if (d == '')
		d = "v";
	var e = document.getElementById('txt11').innerHTML;
	if (e == '')
		e = "v";
	var f = document.getElementById('txt12').innerHTML;
	if (f == '')
		f = "v";
	var g = document.getElementById('txt20').innerHTML;
	if (g == '')
		g = "v";
	var h = document.getElementById('txt21').innerHTML;
	if (h == '')
		h = "v";
	var i = document.getElementById('txt22').innerHTML;
	if (i == '')
		i = "v";

	g_stringMatriz = "a=" + a + "&b=" + b + "&c=" + c + "&d=" + d + "&e=" + e
			+ "&f=" + f + "&g=" + g + "&h=" + h + "&i=" + i + "&turno="
			+ g_turno;

	envia();
}

function instanciaJson(posicoesJson) {
	if (posicoesJson.a == "v" || posicoesJson.a == null
			|| posicoesJson.a == undefined)
		document.getElementById('txt00').innerHTML = "";
	else
		document.getElementById('txt00').innerHTML = posicoesJson.a;

	if (posicoesJson.b == "v" || posicoesJson.b == null
			|| posicoesJson.b == undefined)
		document.getElementById('txt01').innerHTML = "";
	else
		document.getElementById('txt01').innerHTML = posicoesJson.b;

	if (posicoesJson.c == "v" || posicoesJson.c == null
			|| posicoesJson.c == undefined)
		document.getElementById('txt02').innerHTML = "";
	else
		document.getElementById('txt02').innerHTML = posicoesJson.c;

	if (posicoesJson.d == "v" || posicoesJson.d == null
			|| posicoesJson.d == undefined)
		document.getElementById('txt10').innerHTML = "";
	else
		document.getElementById('txt10').innerHTML = posicoesJson.d;

	if (posicoesJson.e == "v" || posicoesJson.e == null
			|| posicoesJson.e == undefined)
		document.getElementById('txt11').innerHTML = "";
	else
		document.getElementById('txt11').innerHTML = posicoesJson.e;

	if (posicoesJson.f == "v" || posicoesJson.f == null
			|| posicoesJson.f == undefined)
		document.getElementById('txt12').innerHTML = "";
	else
		document.getElementById('txt12').innerHTML = posicoesJson.f;

	if (posicoesJson.g == "v" || posicoesJson.g == null
			|| posicoesJson.g == undefined)
		document.getElementById('txt20').innerHTML = "";
	else
		document.getElementById('txt20').innerHTML = posicoesJson.g;

	if (posicoesJson.h == "v" || posicoesJson.h == null
			|| posicoesJson.h == undefined)
		document.getElementById('txt21').innerHTML = "";
	else
		document.getElementById('txt21').innerHTML = posicoesJson.h;

	if (posicoesJson.i == "v" || posicoesJson.i == null
			|| posicoesJson.i == undefined)
		document.getElementById('txt22').innerHTML = "";
	else
		document.getElementById('txt22').innerHTML = posicoesJson.i;
	g_turno = posicoesJson.turno;
}

function tratarTurno(posicoesJson) {
	// turno = posicoesJson.turno;
}

function limparSessao() {
	var xhttp2;
	if (window.XMLHttpRequest) {
		// code for modern browsers
		xhttp2 = new XMLHttpRequest();
	} else {
		// code for IE6, IE5
		xhttp2 = new ActiveXObject("Microsoft.XMLHTTP");
	}
	xhttp2.open("GET", "clear", true);
	xhttp2.send();
	loop();
}

