<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    SUccess Page <br>
    
  	session userName: ${sessionScope.user2.userName }
    	<br><br>
    	session superAdminName: ${sessionScope.sa2.superAdminName }
    	<br><br><!--
    <c:forEach var="item" items="${requestScope.circle}">
    <a href="test2/${item.id} "><c:out value="${item.circleName}"/></a>
</c:forEach>

<br><br><a href="test3/${sessionScope.user2.id }">test3</a>
-->
  </body>
</html>
