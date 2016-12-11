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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		UsuarioVo usuario = new UsuarioVo(null, null, login, senha);

		// depois de consultar o banco e verificar usuario ok .. então grava na sessão uma variavel logica com valor true indicando que o usuario esta autenticado
		if (usuarioDAO.Logar(usuario)) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("login", usuario.login);
			sessao.setAttribute("senha", usuario.senha);
			request.getSession().setAttribute("logado", new Boolean(true));
			request.getSession().setAttribute("erroLogin", new Boolean(false));
			//Execura e retorna os dados do usuario(login, nome etc)
			UsuarioVo usuarioBanco = usuarioDAO.buscarUsuario(login, senha);
			//Seta na sessão os dados do usuario logado
			sessao.setAttribute("login", usuarioBanco.login);
			sessao.setAttribute("senha", usuarioBanco.senha);
			sessao.setAttribute("nome", usuarioBanco.nome);
			//Recarrega a pagina
			String referer = request.getHeader("Referer");
			response.sendRedirect(referer);
		} else {
			String referer = request.getHeader("Referer");
			response.sendRedirect(referer);
			request.getSession().setAttribute("erroLogin", new Boolean(true));
		}

		// HttpSession sessao = request.getSession();
		// sessao.setAttribute(logado, "");
	}

}
