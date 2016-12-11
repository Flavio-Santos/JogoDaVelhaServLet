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
 * Servlet implementation class AtualizarUsuario
 */
@WebServlet("/AtualizarUsuario")
public class AtualizarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AtualizarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		HttpSession sessao=request.getSession();
		String login = (String) sessao.getAttribute("login");
		String senha = request.getParameter("senha");
		String nome = request.getParameter("nome");
		
		UsuarioVo usuario = new UsuarioVo(null, nome, login, senha);
		usuarioDAO.atualizarUsuario(usuario);
		
		//Execura e retorna os dados do usuario(login, nome etc)
		UsuarioVo usuarioBanco = usuarioDAO.buscarUsuario(login, senha);
		//Seta na sessão os dados do usuario logado
		sessao.setAttribute("login", usuarioBanco.login);
		sessao.setAttribute("senha", usuarioBanco.senha);
		sessao.setAttribute("nome", usuarioBanco.nome);
		
		//response.sendRedirect("index.jsp");
		response.sendRedirect("perfilUsuario.jsp");
	}

}
