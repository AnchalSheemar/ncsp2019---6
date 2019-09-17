<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<c:set var="a" value="100"/>
<c:out value="a"/><br>
<c:out value="${a}"/><br>
Value of a is: ${a}
<HR>
<c:if test="${a>4}">
Greater value<br>
</c:if>

<c:choose>
<c:when test="${a>0}">Positive Number</c:when>
<c:when test="${a<0}">Negative Number</c:when>
<c:otherwise>ZERO</c:otherwise>
</c:choose>
<br>
<c:forEach var="x" begin="1" end="10" step="1">
${2*x}<br>
</c:forEach>
<jsp:forward page="ELDemo.jsp">
<c:param name="" value=""/>
<c:param name="" value=""/>
</jsp:forward>
<%-- <jsp:include page="ELDemo.jsp"/> --%>
</body>
</html>