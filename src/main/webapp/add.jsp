<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  <!-- import statements can be given here -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>adder</title>
</head>
<body>


<!-- four types of tags in jsp are:-
Declaration
Directive
Scriptlet
Expression
 -->
<!-- these are directives -->
<%@page import="java.util.Scanner" %> 



<%!  // these are Declaration
	int coeff = 3;
	Scanner sc = new Scanner(System.in);
%>

value of coefficient is : <%= coeff %>  <!-- these are expression tags --> 
<!--  it becomes part of out.print(); -->

<% // these are used as delimiter to seperate java with html
	    int i = Integer.parseInt(request.getParameter("num1"));  // request is implicit object.
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		
		/* response.getWriter().println(k + " this is square of k = i + j");*/
		out.println(k + " this is square of k = i + j"); //out is implicit object.
		
%>


</body>
</html>

<!-- you write jsp page which gets converted to servlets --> 