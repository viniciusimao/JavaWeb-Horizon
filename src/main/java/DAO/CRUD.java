package DAO;

import java.util.List;

import model.Cliente;

public interface CRUD {
	public static void create(Cliente cliente) {};
	public static void delete(int idCli) {};
	public static List<Cliente> find(String pesquisar){return null;}
	public static Cliente findByPk(int idCli) {return null;}
	public static void update(Cliente cliente) {};
	
}
