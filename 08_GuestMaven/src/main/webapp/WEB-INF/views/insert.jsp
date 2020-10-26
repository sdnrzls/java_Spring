<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(function(){
	//insert 실행할때 list load하기
	getData(1,"","");
	//insert
	$("#submit").on("click",function(){
		var name = $("#name").val();
		var content = $("#content").val();
		var grade = $("#input:radio[name=grade]:checked").val();
		var postString 
		= "name="+name+"&content="+content+"&grade="+grade;

		$.ajax({
		  type:"post",
		  url:"gInsert",
		  data: postString,
		  success:function(resp){
			  $("#listArea").html(resp);
			  },
			  error:function(e){
				alert("error : "+e)
			  }
			})//ajax
		})
})

function getData(pageNum,field,word){
	$.get("gList",{"pageNum":pageNum,"field":field,"word":word},
		function(resp){
			$("#listArea").html(resp);
		}
	)//callback function get
}//function

function fview(num){
	$.get("gView",{"num":num},function(resp){
		alert(resp);
		resp=JSON.parse(resp);
		var htmlStr="";

		htmlStr +=resp.name+"<br>";
		htmlStr +=resp.content+"<br>";
		htmlStr +=resp.grade+"<br>";
		htmlStr +=resp.created+"<br>";
		htmlStr +=resp.ipaddr+"<br>";
		$("#viewArea").html(htmlStr);
})
}

function fdelete(num){
	if(confirm("["+num+"]의 게시물을 삭제할까요?")){
	$.get("gDelete",{"num":num},function(resp){
		$("#listArea").html(resp);
		})
	}
}

</script>
</head>
<body>
<form method="post" action="gInsert">
<table align="center">
<tr>
		<td align="center">글쓴이</td> 
		<td>
		<input type="text" id="name" maxlength = 20 name="name" 
		          onKeyup="textCount(this,'nameCount')">
		          *20글자이내
		          (<span id="nameCount" style="color:red">0</span>)
	  </td>
</tr>
<tr>
<td align="center">내 용</td>
	<td>
	<input type="text" size="70" id="content" name="c0</span>)
	</td>ontent" 
	    onKeyup="textCount(this,'contentCount')">
	     *70글자이내
		   (<span id="contentCount" style="color:red">
</tr>
<tr>
	<td align="center">평가 </td>
	<td><input type="radio" name="grade" value="excellent"
	checked="checked">아주잘함(excellent)
	<input type="radio" name="grade" value="good"> 잘함(good)
	<input type="radio" name="grade" value="normal"> 보통(normal)
	<input type="radio" name="grade" value="fail"> 노력(fail)
	</td>
</tr>
<tr>
	<td colspan="2">
 	<input type="button" id="submit" value="입력" > 
</td>
</tr>
</table>
</form>
<br/><br/>
<div id="listArea"></div>
<hr>
<div id="viewArea"></div>
</body>
</html>