package br.com.projetoIntegrador.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.projetoIntegrador.model.vo.UsuarioVo;

public class UsuarioDAO{
	public boolean Logar(UsuarioVo usuario) {
		//Query montada, selecionada todos usuaros com login e senha
		String sql = "SELECT * FROM usuario where login = '"+usuario.login+"' and senha = '"+usuario.senha+"';";
		
		//Seleciona o usuario passado pelo paramentro para procurar no banco
		Conexao conexao = new Conexao();
		Connection conexaoMySql = conexao.getConexao();//Adiquire conexão com banco de dados
		try {
			Statement statement = conexaoMySql.createStatement();//Faz a ponte entre a aplicação e o banco
			
			ResultSet resultSet = statement.executeQuery(sql);//Executa a instrução e devolve um resultado
			
			
			if (resultSet.next()){//verifica se retornou registro no banco de dados
				Integer id = resultSet.getInt("id");
				String login = resultSet.getString("login");
				String senha = resultSet.getString("senha");
				String nome = resultSet.getString("nome");
				usuario.nome = nome;//pega os dados e preenche o usuario e id
				usuario.id = id;
			}
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
		return usuario.id != null;//verifica e retorna se o cara tem um id, e se existe ou não
	}
	public UsuarioVo buscarUsuario(String login, String senha){
		//Query montada, selecionada todos usuaros com login e senha
				String sql = "SELECT * FROM usuario where login = '"+login+"' and senha = '"+senha+"';";
				UsuarioVo usuario=null;
				//Seleciona o usuario passado pelo paramentro para procurar no banco
				Conexao conexao = new Conexao();
				Connection conexaoMySql = conexao.getConexao();//Adiquire conexão com banco de dados
				try {
					Statement statement = conexaoMySql.createStatement();//Faz a ponte entre a aplicação e o banco
					
					ResultSet resultSet = statement.executeQuery(sql);//Executa a instrução e devolve um resultado
					
					
					if (resultSet.next()){//verifica se retornou registro no banco de dados
						usuario = new UsuarioVo();
						Integer idBanco = resultSet.getInt("id");
						String loginBanco = resultSet.getString("login");
						String senhaBanco = resultSet.getString("senha");
						String nomeBanco = resultSet.getString("nome");
						usuario.nome = nomeBanco;//pega os dados e preenche o usuario e id
						usuario.id = idBanco;
						usuario.login = loginBanco;
						usuario.senha = senhaBanco;
					}
					
				} catch (SQLException e) {
			
					e.printStackTrace();
				}
				
				return usuario;//retorna um usuario preenchido com os dados a alterar
			}
	public boolean Cadastrar(UsuarioVo usuario) {
		//Query montada, cria usuario usuaros com login e senha e nome e id auto incre
		String sqlConsulta = "SELECT * FROM usuario where login = '"+usuario.login+"';";
		Conexao conexaoConsulta = new Conexao();
		Connection conexaoConsultaMySql = conexaoConsulta.getConexao();//Adiquire conexão com banco de dados
		try {
			Statement statementConsulta = conexaoConsultaMySql.createStatement();//Faz a ponte entre a aplicação e o banco
			
			ResultSet resultSet = statementConsulta.executeQuery(sqlConsulta);//Executa a instrução e devolve um resultado
			
			if (resultSet.next()){//verifica se retornou registro no banco de dados
				return false;
			}
			else {
				String sql = "INSERT INTO usuario(nome,login,senha) values( '"+usuario.nome+"', '"+usuario.login+"', '"+usuario.senha+"');";
				//Seleciona o usuario passado pelo paramentro para procurar no banco
				Conexao conexao = new Conexao();
				Connection conexaoMySql = conexao.getConexao();//Adiquire conexão com banco de dados
				try {
					Statement statement = conexaoMySql.createStatement();//Faz a ponte entre a aplicação e o banco
					
					//Cria a conta
					statement.executeUpdate(sql);
					
				} catch (SQLException e) {
			
					e.printStackTrace();
				}
				
			}
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		return true;
		
	}
	public boolean atualizarUsuario(UsuarioVo usuario){
		String sql = "UPDATE usuario SET nome = '"+usuario.nome+"',senha = '"+usuario.senha+"' WHERE login = '"+usuario.login+"';";
		Conexao conexao = new Conexao();
		Connection conexaoMySql = conexao.getConexao();//Adiquire conexão com banco de dados
		Statement statement;
		try {
			statement = conexaoMySql.createStatement();
			int linhasAfetadas = statement.executeUpdate(sql);
			if (linhasAfetadas > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
	
	public boolean DeletarDados(UsuarioVo usuario){
		String sql = "DELETE FROM usuario where login = '"+usuario.login+"';";
		String sqlConsulta = "SELECT * FROM usuario where login = '"+usuario.login+"';";
		//Seleciona o usuario passado pelo paramentro para procurar no banco
		Conexao conexao = new Conexao();
		Connection conexaoMySql = conexao.getConexao();//Adiquire conexão com banco de dados
		try {
			Statement statement = conexaoMySql.createStatement();//Faz a ponte entre a aplicação e o banco
			
			ResultSet resultSet = statement.executeQuery(sqlConsulta);//Executa a instrução e devolve um resultado
			
			if (resultSet.next()){//verifica se retornou registro no banco de dados
				statement.executeUpdate(sql);
				return true;
			}
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
		return false;
	}
		
}