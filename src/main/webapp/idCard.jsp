<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2" height="100" width="400">
	                 <caption>卡信息</caption>
		<tr>
			<th>id</th>
			<th>用户名</th>
			<th>用户密码</th>
		</tr>
		<c:forEach var="card" items="${idcardList}">   
		<tr>
			<td>${card.idcard}</td>
			<td>${card.phone}</td>
			<td>${card.color}</td>
		</tr>
		</c:forEach>
		
	</table>
</body>
</html>