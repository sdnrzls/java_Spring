<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@include file="../include/include.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="boardupdate" method="post" name="frm">
<input type="hidden"  name="num" value=${board.num}>
<table>
		<tr>
				<td colspan="2">수정하기</td>
		</tr>
		<tr>
				<td>title</td>
				<td><input type="text" name="title" 
				    value="${board.title}"></td>
		</tr>
		<tr>
				<td>writer</td>
				<td><input type="text" name="writer" 
				    value="${board.writer}"></td>
		</tr>
		<tr>
				<td>content</td>
				<td><textarea rows="5" cols="30" id="content" name="content" value="${board.content}"></textarea></td>
		</tr>
		<tr>
				<td>regdate</td>
				<td><input type="text" name="regdate" value="${board.regdate}" readonly="readonly">
				</td>
		</tr>
		<tr>
				<td>hitcount</td>
				<td><input type="text" name="hitcount" value="${board.hitcount}" readonly="readonly"> 
				</td>
		</tr>
		<tr>
		<td colspan="2">
				<input type="submit" value="수정">
				<input type="button" value="삭제" onclick="location.href='boarddelete?num=${dto.num}'">
				<input type="reset" value="취소">
		</td>
		</tr>
</table>

</form>
</body>
</html>