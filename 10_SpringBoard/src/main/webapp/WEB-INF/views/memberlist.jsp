<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${member}" var="member">
<br/>
아이디:<a href="memberView?id=${member.id}">${member.id}</a><br/>
이름:${member.name}<br/>
주소:${member.addr}<br/>
메모:${member.memo}<br/>
작성일:${member.reg_date}<br/>
</c:forEach>
</body>
<form action="memberlist">
<select name="field">
	<option>선택하세요</option>
	<option value="name">이름</option>
	<option value="addr">주소</option>
</select>
<input type="text" name="word"> 
<input type="submit" name="검색">
</form>
</html>