<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.naming.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>디비 연동 확인</h2>
<%
   Context init = new InitialContext();
   Context env = (Context)init.lookup("java:/comp/env");
   DataSource ds = (DataSource)env.lookup("jdbc/TestDB");
   
   Connection conn = ds.getConnection();
   out.print("DBCP 연동 성공");
%>

</body>
</html>