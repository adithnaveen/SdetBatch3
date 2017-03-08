package com.fannie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html");
		// writer will help to write to client 
		PrintWriter out = response.getWriter();
		
		// to write it is only client side language 
		// javascrpt, css , html 
		
		Date d = new Date();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>HELLO WORLD from Servlets </h1>");
		out.print("Today Date is " + d);
		out.print("</body>");
		out.print("</html>");
		
		
		
		
		
		
		
		
	}

}
