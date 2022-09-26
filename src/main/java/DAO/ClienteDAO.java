package DAO;

import java.sql.*;
import java.util.List;
import bd.MyConnectionSql;

import model.Cliente;

public class ClienteDAO implements CRUD {
	
	private static Connection connection = MyConnectionSql.createConnection();
	private static String sql;
	
	public static void create(Cliente cliente) {
		sql = "INSERT INTO cliente VALUES(null,? ,? ,? ,?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, cliente.getNomeCli());
			ps.setString(2, cliente.getEmailCli());
			ps.setString(3, cliente.getTelCli());
			ps.setString(4, cliente.getSenhaCli());
			
			ps.executeUpdate();
			
			System.out.println("Cliente Criado");
			
		}catch(SQLException e){
			System.out.println("Algo de errado com a entrada de dados " + e.getMessage());
		}
			
		};
	
	public static void delete(int idCli) {
		
	};
	public static List<Cliente> find(String pesquisar){return null;}
	public static Cliente findByPk(int idCli) {return null;}
	public static void update(Cliente cliente) {
		
		sql = "UPDATE cliente SET nomeCli=?, emailCl=?, telCli=?, senhaCli=? WHERE idCli=? ";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, cliente.getNomeCli());
			ps.setString(2, cliente.getEmailCli());
			ps.setString(3, cliente.getTelCli());
			ps.setString(4, cliente.getSenhaCli());
			ps.setInt(5, cliente.getIdCli());
			
			ps.executeUpdate();
			
			System.out.println("Cliente Atualizado");
			
		}catch(SQLException e){
			System.out.println("Algo de errado com a entrada de dados " + e.getMessage());
		}
			
	};
	
	
	
}
