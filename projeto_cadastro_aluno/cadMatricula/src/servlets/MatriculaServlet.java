package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MatriculaServlet")
public class MatriculaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// RECEBENDO OS CAMPOS (vari�veis) VINDOS DO FORMUL�RIO HTML
		String id = request.getParameter("id");
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");	
		
		// INCLUINDO AS VARI�VEIS RECEBIDAS DO FORMUL�RIO NAS REQUISI��ES QUE SER�O ENCAMINHADAS AO ARQUIVO JSP
		request.setAttribute("id", id);
		request.setAttribute("nome", nome);
		request.setAttribute("idade", idade);
		
		// DESPACHANDO AS REQUISI��ES PARA O ARQUIVO JSP 'matricula.jsp'
		request.getRequestDispatcher("matricula.jsp").forward(request, response);
		
	}
}