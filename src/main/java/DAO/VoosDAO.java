package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import bd.MyConnectionSql;
import model.Cliente;
import model.Voos;

public class VoosDAO implements CRUD{
	
	private static Connection connection = MyConnectionSql.createConnection();
	private static String sql;
	
	public static List<Voos> find(String pesquisar){
		
		sql = String.format("SELETIC * FROM voos WHERE localVoos like '%s%%' ", pesquisar);
		
		List<Voos> voos = new ArrayList<Voos>();
		
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				Voos voo = new Voos();
				voo.setIdVoo(rs.getInt("idVoos"));
				voo.setLocalVoos(rs.getString("localVoos"));
				
				voos.add(voo);
			}
			System.out.println("Voo Encontrado");
		}catch(SQLException e) {
			System.out.println("Voo Não Cadastrado/Não Existe  " + e.getMessage());
		}
		
		return null;
	
	}
	
	public static void delete(int idVoos) {
		sql = "DELETE FROM voos WHERE idCli= ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setInt(1, idVoos);
			ps.executeUpdate();
			
			System.out.println("Voo Deletado do Sistema");
			
		}catch(SQLException e){
			System.out.println("Erro na operção " + e.getMessage());
		}
	};
	
	public static Voos findByPk(int idVoos) {
		
		sql = String.format("SELETIC * FROM voos WHERE localVoos like '%d' ", idVoos);
		

		
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(sql);
			Voos voo = new Voos();
			
			while(rs.next()) {
				
				voo.setIdVoo(rs.getInt("idVoos"));
				voo.setLocalVoos(rs.getString("localVoos"));
				

			}
			System.out.println("Voo Encontrado");
			return voo;
		}catch(SQLException e) {
			System.out.println("Voo Não Cadastrado/Não Existe  " + e.getMessage());
		}
		
		return null;
	}
	
	public static void update(Voos voos) {
		
		sql = "UPDATE voos SET localVoos=?, WHERE idVoos=? ";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, voos.getLocalVoos());
			ps.setInt(2,voos.getIdVoo());
			
			ps.executeUpdate();
			
			System.out.println("Voo Atualizado");
			
		}catch(SQLException e){
			System.out.println("Algo de errado com a entrada de dados " + e.getMessage());
		}
	};
}
