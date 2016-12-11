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
 * Servlet implementation class BuscarUsuario
 */
@WebServlet("/BuscarUsuario")
public class BuscarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioDAO usuarioDAO = new UsuarioDAO();//instancia um usuarioDao
		HttpSession sessao=request.getSession();
		String login = (String) sessao.getAttribute("login");//
		String senha = (String) sessao.getAttribute("senha");
		
		
		UsuarioVo usuarioBanco = usuarioDAO.buscarUsuario(login, senha);
		sessao.setAttribute("login", usuarioBanco.login);
		sessao.setAttribute("senha", usuarioBanco.senha);
		sessao.setAttribute("nome", usuarioBanco.nome);
		
		response.sendRedirect("perfilUsuario.jsp");
	}

}
