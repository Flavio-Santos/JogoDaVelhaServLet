package br.com.projetoIntegrador.model.vo;

public class UsuarioVo {
	public Integer id;
	public String nome;
	public String login;
	public String senha;
	
	public UsuarioVo(Integer id, String nome, String login, String senha) {
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
		
	
	public UsuarioVo() {
		
	}
	@Override
	public String toString() {
		return id+" - "+nome;
	}
}
