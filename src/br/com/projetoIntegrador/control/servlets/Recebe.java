package br.com.projetoIntegrador.control.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/rec")
public class Recebe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		
		
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		String d = request.getParameter("d");
		String e = request.getParameter("e");
		String f = request.getParameter("f");
		String g = request.getParameter("g");
		String h = request.getParameter("h");
		String i = request.getParameter("i");
		
		context.setAttribute("a",a);
		context.setAttribute("b",b);
		context.setAttribute("c",c);
		context.setAttribute("d",d);
		context.setAttribute("e",e);
		context.setAttribute("f",f);
		context.setAttribute("g",g);
		context.setAttribute("h",h);
		context.setAttribute("i",i);
		
		//context.setAttribute("valor", request.getParameter("valor"));
	}
}
