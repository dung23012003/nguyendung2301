<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link href="<%=request.getContextPath()%>/css/bai8.index.css" rel="stylesheet" type="text/css" />

</head>
<body>
<header>
	<jsp:include page= "Bai8.Header.jsp"></jsp:include>
</header>
<nav>
	<jsp:include page= "Bai8.Nav.jsp"></jsp:include>
</nav>
<body>
	<jsp:include page= "Bai8.Body.jsp"></jsp:include>
</body>
<footer>
	<jsp:include page= "Bai8.Footer.jsp"></jsp:include>
</footer>
</body>
</html>