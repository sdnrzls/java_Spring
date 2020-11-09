<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</head>
<body>
<h3>상세보기</h3>
<form action="update">

번호 : <span id="id">${member.id}</span><br/>
이름 : ${member.name }<br/>
주소 : ${member.addr}<br/>
<a href="${member.id}/update">수정</a>
<button id="btnDelete" type="button">삭제</button>
</form>
<script src="/js/member.js"></script>
</body>
</html>