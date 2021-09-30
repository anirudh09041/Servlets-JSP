package com.anirudh;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//@WebServlet("/sq")
public class SquareServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
//	   int k = Integer.parseInt(req.getParameter("k"));
//		HttpSession session = req.getSession();
//		session.removeAttribute("k"); can be used to remove k from session  or delete data from session
		
		
//		int k = (int)session.getAttribute("k");
		
		int k = 0;
		
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c: cookies) {
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		
		
		k = k*k;
		
//		res.getWriter().println("<html><body bgcolor='gray'>");
//		res.getWriter().print(k + " this is square of k = i + j");
//		res.getWriter().print("</body></html>");
		
	
	}

}
