<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>상세보기</h3>
<br/>
이름:${member.name}<br/>
아이디:${member.id}<br/>
주소:${member.addr}<br/>
메모:${member.memo}<br/>
작성일:${member.reg_date}<br/>
<input type="button" value="수정"
onclick="location.href='updateForm?id=${member.id}'">
<input type="button" value="삭제"
onclick="location.href='memberDelete?id=${member.id}'"> 
</body>

</html>