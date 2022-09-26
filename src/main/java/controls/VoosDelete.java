package controls;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import DAO.VoosDAO;

@WebServlet("/VoosDelete")
public class VoosDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public VoosDelete() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idVoos = Integer.parseInt(request.getParameter("idVoos"));
		VoosDAO.delete(idVoos);
		
		ClienteCreateAndeFind voos = new ClienteCreateAndeFind();
		
		voos.doGet(request, response);
	}

}
