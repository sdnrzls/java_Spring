<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>리스트</h3>
<c:forEach items="${list.content}" var="list" >
번호 : ${list.id}<br/>
이름 : ${list.name }<br/>
주소 : ${list.addr}<br/>
<a href="${list.id}">상세보기</a><hr/>
</c:forEach>

<a class="page-link" href="?page=${list.number-1}">이전</a>
<a class="page-link" href="?page=${list.number+1}">다음</a>
</body>
</html>