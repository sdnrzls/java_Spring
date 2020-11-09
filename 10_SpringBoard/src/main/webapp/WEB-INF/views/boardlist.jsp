<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <%@include file="../include/include.jsp" %>
 <div class="container">
<h3>게시글(<span id="cntspan">${count}</span>)</h3><br>
	<table class="table table-white table-hover">
		<thead>
		<tr>
			<th>num</th>
			<th>title</th>
			<th>replycnt</th>
			<th>content</th>
			<th>writer</th>
			<th>regdate</th>
			<th>hitcount</th>
		</tr>
		</thead>
		<tbody>
	<c:forEach items="${board}" var="board" >
	<tr>
		<%-- <td><c:out value="${rowNo-st.index}"/></td> --%>
		<td>${board.num}</td>
		<td><a href="boarddetail?num=${board.num}">${board.title}</a></td>
		<td>[<c:out value="${board.replyCnt}"/>]</td>
		<td>${board.content}</td>
		<td>${board.writer}</td>
		<td>${board.regdate}</td>
		<td>${board.hitcount}</td>
		</tr>
		</c:forEach>
	</tbody>
	</table>
	
	<form action="boardlist" align="center">
	<select name="field">
	<option>선택하세요</option>
	<option value="title">제목</option>
	<option value="writer">작성자</option>
	</select>
	<input type="text" name="word"> 
	<input type="submit" name="검색">
	</form>
	
	</div>