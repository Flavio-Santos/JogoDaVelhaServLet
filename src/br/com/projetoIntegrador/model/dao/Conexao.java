package br.com.projetoIntegrador.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
	public Connection getConexao(){
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			return DriverManager.getConnection("jdbc:mysql://localhost/jogo_da_velha", "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
	