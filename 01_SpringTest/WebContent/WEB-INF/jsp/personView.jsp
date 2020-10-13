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
이름:${user.name}<br/>
아이디:${user.id}<br/>
성별:${user.gender}<br/>
직업:${user.job}<br/>
<input type="button" value="수정"
onclick="location.href='updateForm.sp?id=${user.id}'">
<input type="button" value="삭제"
onclick="location.href='personDelete.sp?id=${user.id}'"> 
</body>

</html>