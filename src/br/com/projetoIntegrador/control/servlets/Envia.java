package br.com.projetoIntegrador.control.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class envia
 */
@WebServlet("/envia")
public class Envia extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/plain");
		ServletContext context = getServletContext();
		String posicoes = (String) context.getAttribute("posicoes");
		if (posicoes == null) {
			response.getWriter().print("{}");
		} else
			response.getWriter().print(posicoes);

	}
}
