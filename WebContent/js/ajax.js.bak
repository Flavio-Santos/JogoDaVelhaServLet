var g_elementEnvia;
var g_elementRecebe;
var g_stringMatriz;

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
		document.getElementById('txt00').innerHTML = ${a};
		document.getElementById('txt01').innerHTML = b.responseText;
		document.getElementById('txt02').innerHTML = responseText('c');
		document.getElementById('txt10').innerHTML = responseText('d');
		document.getElementById('txt11').innerHTML = responseText('e');
		document.getElementById('txt12').innerHTML = responseText('f');
		document.getElementById('txt20').innerHTML = responseText('g');
		document.getElementById('txt21').innerHTML = responseText('h');
		document.getElementById('txt22').innerHTML = responseText('i');
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

setInterval(loop, 3000);

function onclick(element){
	var a = document.getElementById('txt00').innerHTML;
	if(a=="")
		a="v";
	var b = document.getElementById('txt01').innerHTML;
	if(b=='')
		b="v";
	var c = document.getElementById('txt02').innerHTML;
	if(c=='')
		c="v";
	var d = document.getElementById('txt10').innerHTML;
	if(d=='')
		d="v";
	var e = document.getElementById('txt11').innerHTML;
	if(e=='')
		e="v";
	var f = document.getElementById('txt12').innerHTML;
	if(f=='')
		f="v";
	var g = document.getElementById('txt20').innerHTML;
	if(g=='')
		g="v";
	var h = document.getElementById('txt21').innerHTML;
	if(h=='')
		h="v";
	var i = document.getElementById('txt22').innerHTML;
		if(i=='')
			i="v";
	
	g_stringMatriz = "a="+a+"&b="+b+"&c="+c+"&d="+d+"&e="+e+"&f="+f+"&g="+g+"&h="+h+"&i="+i;
	g_elementEnvia = element;
	envia();
}