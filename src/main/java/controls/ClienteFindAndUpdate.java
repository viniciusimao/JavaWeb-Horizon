package controls;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;
import model.Voos;

import java.io.IOException;

import DAO.VoosDAO;

@WebServlet("/ClienteFindAndUpdate")
public class ClienteFindAndUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ClienteFindAndUpdate() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idVoos = Integer.parseInt(request.getParameter("idVoos"));
		Voos voos = VoosDAO.findByPk(idVoos);
		
		request.setAttribute("voos", voos);
		request.setAttribute("Voos", voos);
		RequestDispatcher rd = request.getRequestDispatcher("formUpdate.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Voos voos = new Voos();
		
		voos.setIdVoo(Integer.parseInt(request.getParameter("idVoos")));
		voos.setLocalVoos(request.getParameter("localVoos"));
		
		VoosDAO.update(voos);
		
		ClienteCreateAndeFind voo = new ClienteCreateAndeFind();
		
		voo.doGet(request, response);
		
	}

}
