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
<input type="hidden"  name="bno" id="bno" value=${board.num}>
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
				<input type="button" value="삭제" onclick=<a href='javascript:fdelete("+${dto.num}+")'</a>>
				<input type="reset" value="취소">
		</td> 
		</tr>
</table>
</form>
</body>

<div align="center">
		<textarea rows="5" cols="50" id="msg" name="msg"></textarea>
		<input type="button" value="write Comment" id="commentBtn">
	</div>
<div id="area"></div>	

<script>
var init =function(){
	$.ajax({
		type:"get",
		url:"/board/reply/commentList",
		data:{"bnum":$("#bno").val()}
		}).done(function(resp){
			 alert("성공:");
			 var htmlCont="";
			 $.each(resp,function(key,val){
				 htmlCont += val.content+"<br>";
				 htmlCont += val.regdate+"<br>";
				 htmlCont += "<a href='javascript:fdel("+val.cnum+")'>Delete</a><hr>";			
			 	})
				$("#area").html(htmlCont);
				
		}).fail(function(error){
			 alert("실패");
		})
}


$("#commentBtn").on("click",function(){
	var data={
	 "bnum":$("#bno").val(),
	 "content":$("#msg").val()
	}
	alert(data);
	$.ajax({
		type:"post",
		url:"/board/reply/commentInsert",
		contentType:'application/json;charset=utf-8',
		data:JSON.stringify(data)
		}).done(function(){
			alert("등록완료");
			init();
		}).fail(function(error){
			alert("등록 실패");
		})
	})

init();

/* function fdelete(num){
	if(confirm("("+cnum+")의 게시물을 삭제할까요?")){
	$.get("reply/delete",{"cnum":cnum},function(resp){
		if(resp=="success"){
			alert("삭제 성공");
			init();
		}
	});
	}
} */

function fdel(cnum){
	$.ajax({
		type:"DELETE",
		url:"/board/reply/del/"+cnum,
		contentType:'application/json;charset=utf-8'	
		})
		.done(function(resp){
			alert("글삭제"+resp);
		})
		.fail(function(){
			alert("글 삭제 실패");
		})
}

function fdelete(cnum){
	$.ajax({
		type:"DELETE",
		url:"/board/reply/boarddelete/"+cnum,
		contentType:'application/json;charset=utf-8'	
		})
		.done(function(resp){
			alert("글삭제"+resp);
		})
		.fail(function(){
			alert("글 삭제 실패");
		})
}
		
</script>
	
</html>

