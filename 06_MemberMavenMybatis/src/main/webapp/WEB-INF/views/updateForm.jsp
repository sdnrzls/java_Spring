<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src=https://code.jquery.com/jquery-3.5.1.min.js></script>
</head>
<body>
<h2>개인 정보 입력</h2>
<form action="memberUpdate" method="post">
<input type="hidden" name="id" value="${member.id}">

아이디:${member.id}<br>
패스워드 : <input type="password" name="password" value=${member.pass}><br>
이름: <input type="text" name="name" value=${member.name} ><br>
주소: <input type="text" name="addr" id="addr" size="20" value=${member.name}><br>
메모:<textarea cols=50 rows="10" name="memo"></textarea>
<input type="submit" value="확인">
<input type="reset" value="취소">
</form>
</body>
</html>



