package bd;

import java.sql.*;

public class MyConnectionSql {
	private static final String USERNAME = "root";
    private static final String PASSWORD = "21032001v";
    private static final String URL_DATABASE = "jdbc:mysql://localhost:3306/crud";
    
    public static Connection createConnection() {
    	
    	try {
    		Class.forName("com.mysql.cj.jdbc.Drive");
    		System.out.println("Driver Encontrado");
    	}catch(ClassNotFoundException e){
    		System.out.println("Driver não Encontrado. " + e.getMessage());
    		
    	}
    	try {
    		 Connection connection = DriverManager.getConnection(URL_DATABASE, USERNAME, PASSWORD);
    		 System.out.println("Servidor Conectado!!");
    		 return connection;
    	}catch(SQLException e) {
    		System.out.println("Falha de conexão " + e.getMessage());
    		return null;
    	}
    }
  
	
}
