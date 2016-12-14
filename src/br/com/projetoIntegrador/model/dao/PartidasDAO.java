package br.com.projetoIntegrador.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Array;

import br.com.projetoIntegrador.model.vo.ItemRanking;
import br.com.projetoIntegrador.model.vo.PartidaVo;

public class PartidasDAO {
	public void CadastrarPartidas(PartidaVo partida) {

		String sql = "INSERT INTO partidas (idjogador1,idjogador2,idvencedor,idperdedor,data) values( '"
				+ partida.idJogador1 + "', '" + partida.idJogador2 + "','" + partida.idJogador1 + "', '"
				+ partida.idJogador2 + "',CURRENT_TIMESTAM ;";

		Conexao conexao = new Conexao();
		Connection conexaoMySql = conexao.getConexao();//Faz a ponte entre a aplicação e o banco
		try {
			Statement statement = conexaoMySql.createStatement();//Adiquire conexão com banco de dados

			statement.executeUpdate(sql);

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public List<ItemRanking> MontaRanking(){
		List<ItemRanking> lista = new ArrayList<>();
		String sql = "select u.Nome as Nome_Usuario, count(idvencedor) as total_Vitoria "
				+ "from partidas p  "
				+ "inner join usuario u on p.idvencedor = u.id "
				+ "where p.idvencedor = u.id "
				+ "group by nome "
				+ "order by  total_Vitoria  desc;";
		Conexao conexao = new Conexao();
		Connection conexaoMySql = conexao.getConexao();
		Statement statement;
		try {
			statement = conexaoMySql.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()){
				ItemRanking item = new ItemRanking();
				item.usuario = resultSet.getString("Nome_Usuario");
				item.numeroVitorias = resultSet.getString("total_Vitoria");
				lista.add(item);
			}
			return lista;
		} catch (SQLException e) {
			return lista;
			
		}
	}
}
