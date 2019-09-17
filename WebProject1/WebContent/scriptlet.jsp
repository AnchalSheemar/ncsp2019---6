<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%--Directive Tag --%>
<%@include file="header.html" %>
<%-- <%@page import="java.util.*"  errorPage="errorpage1.jsp"%> --%>
</head>
<body>
<%--Declaration Tag --%>
<%!
int a=100;
public int findSum(int a,int b)
{
	return a+b;
}
%>


<%--Scriptlet Tag --%>
<%
out.println(a+"<br>");
out.println("Result: "+findSum(10,30));
int a=10/0;
out.println(a);
request.getParameter("name");
%>
<br>
<%--Expression Tag --%>
Value of a is: <%=a%><br>
Sum of 2 numbers is: <%=findSum(200,400) %><br>
Hello
</body>
</html>