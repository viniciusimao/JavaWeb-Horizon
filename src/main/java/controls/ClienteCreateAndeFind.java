package controls;

import jakarta.servlet.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.*;
import model.Cliente;
import model.Voos;

import java.io.IOException;

import DAO.ClienteDAO;
import DAO.VoosDAO;

@WebServlet("/CreateAndeFind")
public class ClienteCreateAndeFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ClienteCreateAndeFind() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pesquisar = request.getParameter("pesquisar");
		
		if(pesquisar == null) {
			pesquisar = "";
		}
		
		List<Voos> voos = VoosDAO.find(pesquisar);
		
		request.setAttribute("Voos", voos);
		RequestDispatcher rd = request.getRequestDispatcher("pesquisar.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cliente cliente = new Cliente();
		
		cliente.setNomeCli(request.getParameter("Nome"));
		cliente.setEmailCli(request.getParameter("Email"));
		cliente.setTelCli(request.getParameter("Telefone"));
		cliente.setSenhaCli(request.getParameter("Senha"));
		
		ClienteDAO.create(cliente);
		doGet(request, response);
	}

}
