<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
       <c:when test="${age<12}">
              小学阶段
       </c:when>
       <c:when test="${age>=12&&age<18}">
              中学阶段
       </c:when>
       <c:otherwise>
             大学阶段
       </c:otherwise>
</c:choose>
</br>





</body>
</html>