package DAO;

import java.util.List;

import model.Voos;

public interface CRUDVOOS {
	public static List<Voos> find(String pesquisar){return null;}
	public static void delete(int idVoos) {};
	public static Voos findByPk(int idVoos) {return null;}
	public static void update(Voos voos) {};
}
