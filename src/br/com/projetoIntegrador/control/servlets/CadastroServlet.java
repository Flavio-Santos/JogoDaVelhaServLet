package br.com.projetoIntegrador.control.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Dispatch;

import br.com.projetoIntegrador.model.dao.UsuarioDAO;
import br.com.projetoIntegrador.model.vo.UsuarioVo;
import sun.rmi.server.Dispatcher;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Cadastro")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CadastroServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UsuarioDAO usuarioDAO = new UsuarioDAO();//só faz operações com o banco
		String login = request.getParameter("login");//pega os parametros 
		String senha = request.getParameter("senha");
		String nome = request.getParameter("nome");

		UsuarioVo usuario = new UsuarioVo(null, nome, login, senha);//tem os valores do meu usuario

		if (usuarioDAO.Cadastrar(usuario)){
			HttpSession sessao = request.getSession();
			sessao.setAttribute("login", usuario.login);
			sessao.setAttribute("senha", usuario.senha);
			request.getSession().setAttribute("logado", new Boolean(true));
			response.sendRedirect("index.jsp");
			
			return;
		}
		else {
			response.sendRedirect("cadastrar.jsp");
			return;
		}
		
		
		
	

 		// HttpSession sessao = request.getSession();
		// sessao.setAttribute(logado, "");
	}

}
