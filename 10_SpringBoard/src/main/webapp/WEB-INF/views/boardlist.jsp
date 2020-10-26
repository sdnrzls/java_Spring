<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <%@include file="../include/include.jsp" %>
 <div class="container">
<body>
<h3>게시글(<span id="cntspan">${count }</span>)</h3><br>
	<table class="table table-white table-hover">
		<thead>
		<tr>
			<th>num</th>
			<th>title</th>
			<th>content</th>
			<th>writer</th>
			<th>regdate</th>
			<th>hitcount</th>
		</tr>
		</thead>
		<tbody>
	<c:forEach items="${board}" var="board" >
	<tr>
		<td>${board.num}</td>
		<td><a href="boarddetail?num=${board.num }">${board.title}</a></td>
		<td>${board.content}</td>
		<td>${board.writer}</td>
		<td>${board.regdate}</td>
		<td>${board.hitcount}</td>
		</tr>
		</c:forEach>
	</tbody>
	</table>