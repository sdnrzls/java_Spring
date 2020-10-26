<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<div align="center">갯수: ${count}</div>
	
	<form action="gList" align="center">
	<select name="field">
	<option>선택하세요</option>
	<option value="name">이름</option>
	<option value="content">내용</option>
	</select>
	<input type="text" name="word"> 
	<input type="submit" name="검색">
	</form>
	
 	<table border="1" align="center">
    <thead>
      <tr>
      	<th>Num</th>
        <th>name</th>
        <th>content</th>
        <th>Grade</th>
        <th>Created</th>
     	<th>ipaddr</th>
     	<th>delete</th>
      </tr>
    </thead>
    <tbody>
    
    <c:forEach items="${guest}" var="guest">
    <tr>
    	<td>${guest.num}</td>
    	<td><a href="javascript:fview(${guest.num})">${guest.name}</a></td>
    	<td>${guest.content}</td>
    	<td>${guest.grade}</td>
    	<td>${guest.created}</td>
    	<td>${guest.ipaddr}</td>
    	<td>	
    		<a href="javascript:fdelete(${guest.num},'${guest.name }')">delete</a>
    		</td>
    </tr>
    </c:forEach>
    </tbody>
    </table>
    
	<div align="center">
	${pageHtml}
	</div>
</html>