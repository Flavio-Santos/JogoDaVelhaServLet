/**
 * 
 */
 function chamarServletRanking(){
	 var xhttp;
		if (window.XMLHttpRequest) {
			// code for modern browsers
			xhttp = new XMLHttpRequest();
		} else {
			// code for IE6, IE5
			xhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
	xhttp.open("POST", "ImprimirRanking", true);
	xhttp.send();
}