package br.com.projetoIntegrador.control.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.projetoIntegrador.model.dao.UsuarioDAO;
import br.com.projetoIntegrador.model.vo.UsuarioVo;

/**
 * Servlet implementation class DeletarConta
 */
@WebServlet("/Deletar")
public class DeletarConta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletarConta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		HttpSession sessao=request.getSession();
		String login = (String) sessao.getAttribute("login");
		UsuarioVo usuario = new UsuarioVo(null, null, login, null);
		if (usuarioDAO.DeletarDados(usuario)){
			request.getSession().invalidate();
			response.sendRedirect("index.jsp");
		}
		else {
			
		}

	}

}
