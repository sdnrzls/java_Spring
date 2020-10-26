<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="/myguest/resources/guest2.js"></script>
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
<br/><hr/>
<div id="resultCount"></div>
<div id="resultArea">
	<table>
	<thead></thead>
	<tbody></tbody>
	</table>
</div>
<div id="pageArea"></div>
<br/><hr/>
<div id="detailArea"></div>
</body>
</html>