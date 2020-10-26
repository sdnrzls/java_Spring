<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="personInsert">추가하기</a><br/>
<c:forEach items="${user}" var="user">
<br/>
이름:${user.name}<br/>
아이디:<a href="personView?id=${user.id}">${user.id}</a><br/>
성별:${user.gender}<br/>
직업:${user.job}<br/>
</c:forEach>
</body>
<form action="memberlist">
<select name="field">
	<option>선택하세요</option>
	<option value="name">이름</option>
	<option value="gender">성별</option>
</select>
<input type="text" name="word"> 
<input type="submit" name="검색">
</form>
</html>