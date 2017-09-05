package com.nramiscal.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// get the value for every query parameter
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String language = request.getParameter("language");
		String hometown = request.getParameter("hometown");

		if (firstName == null) {
			firstName = "Unknown";
		}
		if (lastName == null) {
			lastName = "Unknown";
		}
		if (language == null) {
			language = "Unknown";
		}
		if (hometown == null) {
			hometown = "Unknown";
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>Hello World, from " + firstName + " " + lastName + "</h1>");
		out.write("<h2>Your favorite language is: " + language + "</h2>");
		out.write("<h2>Your hometown is: " + hometown + "</h2>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
