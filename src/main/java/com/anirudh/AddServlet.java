package com.anirudh;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/add")   // these are called annotation => no need of web.xml for mapping of servlets 
public class AddServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		Cookie cookie = new Cookie("k",k + "");
		res.addCookie(cookie);
		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		 		  
	    res.sendRedirect("sq?k="+k);
		
        //RequestDispatcher is used to call other servlet from a servlet 
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
	}

}


//sendRedirect can also be used 
// that concept is called session management