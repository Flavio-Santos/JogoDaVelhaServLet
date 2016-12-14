package br.com.projetoIntegrador.control.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.projetoIntegrador.model.dao.PartidasDAO;
import br.com.projetoIntegrador.model.vo.ItemRanking;

/**
 * Servlet implementation class ImprimirRanking
 */
@WebServlet("/ImprimirRanking")
public class ImprimirRanking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ItemRanking> lista = new ArrayList<>();
		PartidasDAO partidaDao = new PartidasDAO();
		lista = partidaDao.MontaRanking();
		HttpSession sessao = request.getSession();
		sessao.setAttribute("partidas", lista);
		request.getRequestDispatcher("rankings.jsp").forward(request,response);;
		
	}

}
