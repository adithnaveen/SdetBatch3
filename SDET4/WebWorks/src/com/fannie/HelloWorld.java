package com.fannie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	public void init(ServletConfig config) throws ServletException {
		System.out.println("i'm in init>>>>>> ");
	}

	public void destroy() {
		System.out.println("i'm in destroy<<<<<< ");
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Welcome to Servlets </h1>");
		out.println("date is " + new Date().toString());
		out.println("</body>");
		out.print("</html>");
		
		out.close();
	}

}







