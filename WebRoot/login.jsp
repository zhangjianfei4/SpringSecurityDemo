<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
  
  <body class="">
    <form action="j_spring_security_check" method="post">
    用户名：<input type="text" name="j_username"><br/>
    密码:<input type="password" name="j_password"/><br/>
    <input type="checkbox" name="_spring_security_remember_me" id="_spring_security_remember_me"/>两周之内不必登陆<br />
    <input type="submit" value="提交"/>
    </form>
    
    <a href="<%=path %>/test.do">加入权限控制-admin、dev权限</a>
    
    <a href="<%=path %>/other.do">加入权限控制-other权限</a>
    <a href="<%=path %>/anoymous.do">未加入权限控制</a>
    <form action="<%=path %>/j_spring_security_logout" method="post"><br/>
    <input type="submit" value="退出"/>
    </form>
  </body>
</html>
