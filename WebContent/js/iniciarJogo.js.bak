var trocar = "X";
var compare = "";
var fim1 = 0;
var fim2 = 0;
var fim3 = 0;
var fim4 = 0;
var habilitar = true;
var ganhador = '';
var cont = 0;
var check = 0;
var qtdVitoriaO = 0;
var qtdVitoriaX = 0;
var vetCorVitoria = new Array(3);

document.getElementById('txtJogador').innerHTML = ${jogador};

function mudarCor(idCaixa, cor) {
    if (habilitar == true) {
        document.getElementById(idCaixa).style.backgroundColor = cor;
    }

}

function inserirMarcacao(idTxt, p, q) {
    if (document.getElementById(idTxt).innerHTML == '' && habilitar == true) {
        cont++;
        document.getElementById(idTxt).innerHTML = trocar;

        for (z = 0; z < 3; z++) {
            if (document.getElementById('txt' + p + z).innerHTML == trocar) {
                fim1++;
            }
            if (document.getElementById('txt' + z + q).innerHTML == trocar) {
                fim2++;
            }
            if (document.getElementById('txt' + z + z).innerHTML == trocar) {
                fim3++;
            }
            if (document.getElementById('txt' + z + (2 - z)).innerHTML == trocar) {
                fim4++;
            }
        }

        if (fim1 < 3) {
            fim1 = 0;
        } else {
            fimDeJogo(trocar);
        }

        if (fim2 < 3) {
            fim2 = 0;
        } else {
            fimDeJogo(trocar);
        }

        if (fim3 < 3) {
            fim3 = 0;
        } else {
            fimDeJogo(trocar);
        }

        if (fim4 < 3) {
            fim4 = 0;
        } else {
            fimDeJogo(trocar);
        }

        (trocar == "X") ? trocar = "O" : trocar = "X";
        document.getElementById('txtJogador').innerHTML = "É a vez do jogador " + trocar;
    }

    onclick('txt' + p + q);
}

function novoJogo() {
    habilitar = true;
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            document.getElementById('txt' + i + j).innerHTML = '';
            document.getElementById('txt' + i + j).style.backgroundColor = ''
            document.getElementById('txt' + i + j).style.color = "blueviolet";
        }
    }
    fim1 = 0;
    fim2 = 0;
    fim3 = 0;
    fim4 = 0;
}

function fimDeJogo(xisOuBola) {
    habilitar = false;
    ganhardor = xisOuBola;
    nomeGanhador = "Jogador " + trocar + " Ganhou";
    if (document.getElementById('txt00').innerHTML == xisOuBola &&
            document.getElementById('txt01').innerHTML == xisOuBola &&
            document.getElementById('txt02').innerHTML == xisOuBola) {
        for (i = 0; i < 3; i++) {
            document.getElementById('txt0' + i).style.backgroundColor = 'blueviolet';
            document.getElementById('txt0' + i).style.color = "#ffffff";
        }
        document.getElementById('txtResultado').innerHTML = nomeGanhador;
    }

    if (document.getElementById('txt10').innerHTML == xisOuBola &&
            document.getElementById('txt11').innerHTML == xisOuBola &&
            document.getElementById('txt12').innerHTML == xisOuBola) {
        for (i = 0; i < 3; i++) {
            document.getElementById('txt1' + i).style.backgroundColor = 'blueviolet';
            document.getElementById('txt1' + i).style.color = '#ffffff';
        }
        document.getElementById('txtResultado').innerHTML = nomeGanhador;
    }

    if (document.getElementById('txt20').innerHTML == xisOuBola &&
            document.getElementById('txt21').innerHTML == xisOuBola &&
            document.getElementById('txt22').innerHTML == xisOuBola) {
        for (i = 0; i < 3; i++) {
            document.getElementById('txt2' + i).style.backgroundColor = 'blueviolet';
            document.getElementById('txt2' + i).style.color = '#ffffff';
        }
        document.getElementById('txtResultado').innerHTML = nomeGanhador;
    }

    if (document.getElementById('txt00').innerHTML == xisOuBola &&
            document.getElementById('txt10').innerHTML == xisOuBola &&
            document.getElementById('txt20').innerHTML == xisOuBola) {
        for (i = 0; i < 3; i++) {
            document.getElementById('txt' + i + '0').style.backgroundColor = 'blueviolet';
            document.getElementById('txt' + i + '0').style.color = '#ffffff';
        }
        document.getElementById('txtResultado').innerHTML = nomeGanhador;
    }

    if (document.getElementById('txt01').innerHTML == xisOuBola &&
            document.getElementById('txt11').innerHTML == xisOuBola &&
            document.getElementById('txt21').innerHTML == xisOuBola) {
        for (i = 0; i < 3; i++) {
            document.getElementById('txt' + i + '1').style.backgroundColor = 'blueviolet';
            document.getElementById('txt' + i + '1').style.color = '#ffffff';
        }
        document.getElementById('txtResultado').innerHTML = nomeGanhador;
    }

    if (document.getElementById('txt02').innerHTML == xisOuBola &&
            document.getElementById('txt12').innerHTML == xisOuBola &&
            document.getElementById('txt22').innerHTML == xisOuBola) {
        for (i = 0; i < 3; i++) {
            document.getElementById('txt' + i + '2').style.backgroundColor = 'blueviolet';
            document.getElementById('txt' + i + '2').style.color = '#ffffff';
        }
        document.getElementById('txtResultado').innerHTML = nomeGanhador;
    }

    if (document.getElementById('txt00').innerHTML == xisOuBola &&
            document.getElementById('txt11').innerHTML == xisOuBola &&
            document.getElementById('txt22').innerHTML == xisOuBola) {
        for (i = 0; i < 3; i++) {
            document.getElementById('txt' + i + i).style.backgroundColor = 'blueviolet';
            document.getElementById('txt' + i + i).style.color = '#ffffff';
        }
        document.getElementById('txtResultado').innerHTML = nomeGanhador;
    }

    if (document.getElementById('txt02').innerHTML == xisOuBola &&
            document.getElementById('txt11').innerHTML == xisOuBola &&
            document.getElementById('txt20').innerHTML == xisOuBola) {
        for (i = 0; i < 3; i++) {
            document.getElementById('txt' + i + (2 - i)).style.backgroundColor = 'blueviolet';
            document.getElementById('txt' + i + (2 - i)).style.color = '#ffffff';
        }
        document.getElementById('txtResultado').innerHTML = nomeGanhador;
    }

    if (ganhador == 'X')
        qtdVitoriaX++
    else if (ganhador == 'O')
        qtdVitoriaO++
    else
        ganhador == '';
}

