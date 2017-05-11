<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    This is my JSP page. <br>
    <a href="test1">test1</a><br><br>
    <form action="test4/circle/3" method="post">
    		
			标题<input type="text" name="title"/><br>
			内容<input type="text" name="content" /><br>
			<li><label><font color="#ff0000">*</font>标签：<input type="radio" name="labelName"  value="艺术" />艺术 <input type="radio" name="labelName"  value="计算机"/>计算机</label></li>
			<input type="submit" value="发布"></input>
		</form>
		
		<a href="test">test testtest</a>
		
		<form action="manager" method="post">
			用户名<input type="text" name="superAdminName"/>
			密码<input type="password" name="password" />
			<input type="submit" value="登陆"></input>
		</form>
  </body>
</html>
