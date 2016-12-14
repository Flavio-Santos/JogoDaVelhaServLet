package br.com.projetoIntegrador.model.vo;

public class PartidaVo {
	public Integer idPartida;
	public Integer idJogador1;
	public Integer idJogador2;
	public Integer idVencedor;
	public Integer idPerdedor;
	
		public PartidaVo(Integer idPartida, Integer idJogador1,Integer idJogador2,Integer idVencedor,Integer idPerdedor){
			this.idPartida  = idPartida;
			this.idJogador1 = idJogador1;
			this.idJogador2 = idJogador2;
			this.idVencedor = idVencedor;
			this.idPerdedor = idPerdedor;
		}
	
}
