<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%!
   String name ="Ngọc Dũng";
   String address = "Devmaster Academy";
   public int sum (int a, int b){
	   return a +b;
   }
   public int multiply(int a, int b){
	   return a*b;
   }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Definr vatiable , method in jsp</title>
</head>
<body>
<h1>Truy cập biến, phương thức</h1>
<h2> Xin chào :<%=name %></h2>
<h3><%="địa chỉ:" +address %></h3>
<p> Tỏng 10+20 =<%=sum(10,20) %></p>
<p>Tích 10*39 =<%=multiply(10,25) %></p>
</body>
</html>