<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	
 	<table border="1">
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
    
    <c:forEach items="${view}" var="view">
    <tr>
    	<td>${view.num}</td>
    	<td>${view.name}</td>
    	<td>${view.content}</td>
    	<td>${view.grade}</td>
    	<td>${view.created}</td>
    	<td>${view.ipaddr}</td>
    	<td>	
    		<a href="javascript:fdelete(${view.num},'${view.name }')">delete</a>
    		</td>
    </tr>
    </c:forEach>
    </tbody>
    </table>
</html>