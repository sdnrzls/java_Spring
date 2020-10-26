<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="boardInsert" method="post">
	<table>
		<tr>
			<td align="center">제목</td>
			<td><input type="text" id="title" name="title"></td>
		</tr>
		<tr>
			<td align="center">내용</td>
			<td><textarea rows="5" cols="30" id="content" name="content"></textarea></td>
		</tr>
		<tr>
			<td align="center">작성자</td>
			<td><input type="text" id="writer" name="writer"></td>
		</tr>
		<tr>
			<td align="center">작성일</td>
			<td><input type="text" id="regdate" name="regdate"></td>
		</tr>
		<tr>
			<td align="center">조회수</td>
			<td><input type="number" id="hitcount" name="hitcount" value="0" readonly="readonly"></td>
		</tr>
		<tr>
			<td align="center">비밀번호</td>
			<td><input type="password" id="password" name="password"></td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="submit전송"></td>
		</tr>
		
		
	</table>
</form>
</body>
</html>