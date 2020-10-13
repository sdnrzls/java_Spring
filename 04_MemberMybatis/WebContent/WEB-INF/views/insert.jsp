<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="memberinsert.my">
<table>	
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" id="id" size="20" >*
			</tr>
			
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pass" id="pass" size="20">*</td>
			</tr>
			
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" id="name" size="20">*</td>
			</tr>
			
			<tr>
				<td>주소</td>
				<td><input type="text" name="addr" id="addr" size="20"></td>
			</tr>
			<tr>
				<td>메모</td>
				<td><textarea cols=50 rows="10" name="memo" id="memo"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="확인">
				<input type="reset" value="취소">
				</td>
			</tr>
			</table>
</form>
</body>
</html>