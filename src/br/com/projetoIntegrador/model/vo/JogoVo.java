package br.com.projetoIntegrador.model.vo;

import java.util.Vector;

public class JogoVo {

	private Vector<String> tabuleiro = new Vector<String>(9);
	private String simboloJogador1 = "X";
	private String simboloJogador2 = "O";
	private int nJogadasJogador1 = 0;
	private int nJogadasJogador2 = 0;
	private int vez = 1;
	private int fimJogo = 0;
	private int vencedor = 0;
	private String msg = "Nenhuma Mensagem!";
	private String pos1;
	private String pos2;
	private String pos3;
	private String pos4;
	private String pos5;
	private String pos6;
	private String pos7;
	private String pos8;
	private String pos9;

	public JogoVo() {
		getTabuleiro().add(" ");
		getTabuleiro().add(" ");
		getTabuleiro().add(" ");
		getTabuleiro().add(" ");
		getTabuleiro().add(" ");
		getTabuleiro().add(" ");
		getTabuleiro().add(" ");
		getTabuleiro().add(" ");
		getTabuleiro().add(" ");
	}

	public Vector<String> getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Vector<String> tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public String getSimboloJogador1() {
		return simboloJogador1;
	}

	public void setSimboloJogador1(String simboloJogador1) {
		this.simboloJogador1 = simboloJogador1;
	}

	public String getSimboloJogador2() {
		return simboloJogador2;
	}

	public void setSimboloJogador2(String simboloJogador2) {
		this.simboloJogador2 = simboloJogador2;
	}

	public int getNJogadasJogador1() {
		return nJogadasJogador1;
	}

	public void setNJogadasJogador1(int jogadasJogador1) {
		nJogadasJogador1 = jogadasJogador1;
	}

	public int getNJogadasJogador2() {
		return nJogadasJogador2;
	}
	public void setNJogadasJogador2(int jogadasJogador2) {
		nJogadasJogador2 = jogadasJogador2;
	}

	public int getVez() {
		return vez;
	}

	public void setVez(int vez) {
		this.vez = vez;
	}

	public int getFimJogo() {
		return fimJogo;
	}

	public void setFimJogo(int fimJogo) {
		this.fimJogo = fimJogo;
	}

	public int getVencedor() {
		return vencedor;
	}

	public void setVencedor(int vencedor) {
		this.vencedor = vencedor;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getPos1() {
		return this.tabuleiro.get(0);
	}

	public void setPos1(String pos1) {
		this.pos1 = pos1;
	}

	public String getPos2() {
		return this.tabuleiro.get(1);
	}

	public void setPos2(String pos2) {
		this.pos2 = pos2;
	}

	public String getPos3() {
		return this.tabuleiro.get(2);
	}

	public void setPos3(String pos3) {
		this.pos3 = pos3;
	}

	public String getPos4() {
		return this.tabuleiro.get(3);
	}

	public void setPos4(String pos4) {
		this.pos4 = pos4;
	}

	public String getPos5() {
		return this.tabuleiro.get(4);
	}

	public void setPos5(String pos5) {
		this.pos5 = pos5;
	}

	public String getPos6() {
		return this.tabuleiro.get(5);
	}

	public void setPos6(String pos6) {
		this.pos6 = pos6;
	}

	public String getPos7() {
		return this.tabuleiro.get(6);
	}

	public void setPos7(String pos7) {
		this.pos7 = pos7;
	}

	public String getPos8() {
		return this.tabuleiro.get(7);
	}

	public void setPos8(String pos8) {
		this.pos8 = pos8;
	}

	public String getPos9() {
		return this.tabuleiro.get(8);
	}

	public void setPos9(String pos9) {
		this.pos9 = pos9;
	}

}