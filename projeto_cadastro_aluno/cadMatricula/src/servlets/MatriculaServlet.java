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

		// RECEBENDO OS CAMPOS (variáveis) VINDOS DO FORMULÁRIO HTML
		String id = request.getParameter("id");
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");	
		
		// INCLUINDO AS VARIÁVEIS RECEBIDAS DO FORMULÁRIO NAS REQUISIÇÕES QUE SERÃO ENCAMINHADAS AO ARQUIVO JSP
		request.setAttribute("id", id);
		request.setAttribute("nome", nome);
		request.setAttribute("idade", idade);
		
		// DESPACHANDO AS REQUISIÇÕES PARA O ARQUIVO JSP 'matricula.jsp'
		request.getRequestDispatcher("matricula.jsp").forward(request, response);
		
	}
}