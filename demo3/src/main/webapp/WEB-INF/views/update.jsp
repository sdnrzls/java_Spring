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
<h3>회원수정</h3>
<form>
번호 : <input type="text" name="id" id="id" value="${member.id}" readonly="readonly"><br/>
이름 : <input type="text" name="name" id="name" value="${member.id}"><br/>
주소 : <input type="text" name="addr" id="addr" value="${member.id}"><br/>
<button id="btnUpdate" type="button">수정</button>
</form>
<script src="/js/member.js"></script>
</body>
</html>