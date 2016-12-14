package br.com.projetoIntegrador.control.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projetoIntegrador.model.dao.PartidasDAO;
import br.com.projetoIntegrador.model.vo.PartidaVo;

/**
 * Servlet implementation class InserirPartida
 */
@WebServlet("/InserirPartida")
public class InserirPartida extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserirPartida() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int jogador1 = 2;//Integer.parseInt(request.getParameter("vencedo"));
		int jogador2 = 3;//Integer.parseInt(request.getParameter("perdedor"));

		PartidaVo partidaVo = new PartidaVo(null,jogador1,jogador2,jogador1,jogador2);
		PartidasDAO partidasDAO = new PartidasDAO();
		partidasDAO.CadastrarPartidas(partidaVo);
		
	}

}
