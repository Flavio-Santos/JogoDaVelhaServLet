package br.com.projetoIntegrador.control;

import br.com.projetoIntegrador.model.vo.JogoVo;

public class JogoControl {

	public int verificaJogada(int jogada, JogoVo jogoVo) {
		if (jogada > 0 && jogada < 10) {
			if (jogoVo.getTabuleiro().get(jogada - 1).equals(" "))
				return 1;
			else
				return 0;
		} else
			return 0;
	}

	public JogoVo realizaJogada(int jogada, JogoVo jogoVo) {
		String simbolo = "";
		if (jogoVo.getVez() == 1)
			simbolo = jogoVo.getSimboloJogador1();
		else
			simbolo = jogoVo.getSimboloJogador2();
		jogoVo.getTabuleiro().set(jogada - 1, simbolo);

		// Iverte a Vez
		if (jogoVo.getVez() == 1) {
			jogoVo.setVez(2);
			jogoVo.setNJogadasJogador1(jogoVo.getNJogadasJogador1() + 1);
		} else {
			jogoVo.setVez(1);
			jogoVo.setNJogadasJogador2(jogoVo.getNJogadasJogador2() + 1);
		}
		return jogoVo;
	}

	public int verificaVencedor(JogoVo jogoVo) {
		if ((jogoVo.getTabuleiro().get(0).equals("X")) && (jogoVo.getTabuleiro().get(1).equals("X"))
				&& (jogoVo.getTabuleiro().get(2).equals("X")))
			return 1;
		else if ((jogoVo.getTabuleiro().get(3).equals("X")) && (jogoVo.getTabuleiro().get(4).equals("X"))
				&& (jogoVo.getTabuleiro().get(5).equals("X")))
			return 1;
		else if ((jogoVo.getTabuleiro().get(6).equals("X")) && (jogoVo.getTabuleiro().get(7).equals("X"))
				&& (jogoVo.getTabuleiro().get(8).equals("X")))
			return 1;
		else if ((jogoVo.getTabuleiro().get(0).equals("X")) && (jogoVo.getTabuleiro().get(3).equals("X"))
				&& (jogoVo.getTabuleiro().get(6).equals("X")))

			return 1;
		else if ((jogoVo.getTabuleiro().get(1).equals("X")) && (jogoVo.getTabuleiro().get(4).equals("X"))
				&& (jogoVo.getTabuleiro().get(7).equals("X")))
			return 1;
		else if ((jogoVo.getTabuleiro().get(2).equals("X")) && (jogoVo.getTabuleiro().get(5).equals("X"))
				&& (jogoVo.getTabuleiro().get(8).equals("X")))
			return 1;
		else if ((jogoVo.getTabuleiro().get(0).equals("X")) && (jogoVo.getTabuleiro().get(4).equals("X"))
				&& (jogoVo.getTabuleiro().get(8).equals("X")))
			return 1;
		else if ((jogoVo.getTabuleiro().get(2).equals("X")) && (jogoVo.getTabuleiro().get(4).equals("X"))
				&& (jogoVo.getTabuleiro().get(6).equals("X")))
			return 1;
		else

		if ((jogoVo.getTabuleiro().get(0).equals("O")) && (jogoVo.getTabuleiro().get(1).equals("O"))
				&& (jogoVo.getTabuleiro().get(2).equals("O")))
			return 2;
		else if ((jogoVo.getTabuleiro().get(3).equals("O")) && (jogoVo.getTabuleiro().get(4).equals("O"))
				&& (jogoVo.getTabuleiro().get(5).equals("O")))
			return 2;
		else if ((jogoVo.getTabuleiro().get(6).equals("O")) && (jogoVo.getTabuleiro().get(7).equals("O"))
				&& (jogoVo.getTabuleiro().get(8).equals("O")))
			return 2;
		else if ((jogoVo.getTabuleiro().get(0).equals("O")) && (jogoVo.getTabuleiro().get(3).equals("O"))
				&& (jogoVo.getTabuleiro().get(6).equals("O")))

			return 2;
		else if ((jogoVo.getTabuleiro().get(1).equals("O")) && (jogoVo.getTabuleiro().get(4).equals("O"))
				&& (jogoVo.getTabuleiro().get(7).equals("O")))
			return 2;
		else if ((jogoVo.getTabuleiro().get(2).equals("O")) && (jogoVo.getTabuleiro().get(5).equals("O"))
				&& (jogoVo.getTabuleiro().get(8).equals("O")))
			return 2;
		else if ((jogoVo.getTabuleiro().get(0).equals("O")) && (jogoVo.getTabuleiro().get(4).equals("O"))
				&& (jogoVo.getTabuleiro().get(8).equals("O")))
			return 2;
		else if ((jogoVo.getTabuleiro().get(2).equals("O")) && (jogoVo.getTabuleiro().get(4).equals("O"))
				&& (jogoVo.getTabuleiro().get(6).equals("O")))
			return 2;
		else
			return 0;
	}

	public int verificaFimDeJogo(JogoVo jogoVo) {
		if (jogoVo.getNJogadasJogador1() + jogoVo.getNJogadasJogador2() >= 9)
			return 1;
		else if (this.verificaVencedor(jogoVo) != 0)
			return 1;
		else
			return 0;
	}

}
