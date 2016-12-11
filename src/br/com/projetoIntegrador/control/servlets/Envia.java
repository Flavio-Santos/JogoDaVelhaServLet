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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		
		String a = (String) context.getAttribute("a");
		response.getWriter().print(a);
		
		String b = (String) context.getAttribute("b");
		response.getWriter().print(b);
		
		String c = (String) context.getAttribute("c");
		response.getWriter().print(c);
		
		String d = (String) context.getAttribute("d");
		response.getWriter().print(d);
		
		String e = (String) context.getAttribute("e");
		response.getWriter().print(e);
		
		String f = (String) context.getAttribute("f");
		response.getWriter().print(f);
		
		String g = (String) context.getAttribute("g");
		response.getWriter().print(g);
		
		String h = (String) context.getAttribute("h");
		response.getWriter().print(h);
		
		String i = (String) context.getAttribute("i");
		response.getWriter().print(i);
	}
}
