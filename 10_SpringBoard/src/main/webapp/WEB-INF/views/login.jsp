<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/include.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
$(function(){
	$("#loginBtn").on("click",function(){
		
		if($("#id").val()==""){
			alert(" ID  입력");
			$("#id").focus();
		return false;
	}
		if($("#pass").val()==""){
			alert("PWD 입력");
			$("#pass").focus();
		return false;
	}
		$.ajax({
			  type:"post",
			  url:"login",
			  data :{"id" : $("#id").val(),"pass":$("#pass").val()}
				})//ajax
				.done(function(resp){
					if(resp=="no"){
						alert("회원이 아닙니다 회원가입 하세요")
					}else if(resp=="success"){
						alert("성공");
						location.href="/board/boardlist";
					}else{
						alert("비번 오류");
					}
					})
						
})//loginBtn
})
</script>

</head>
<body>
<form method="post" action="login">
<a href="memberlist">전체보기</a><br/>
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
				<td colspan="2" align="center">
				<input type="button" value="Login" name="loginBtn"
				id="loginBtn">
				<input type="reset" value="취소">
				</td>
			</tr>
			</table>
</form>
</body>
</html>