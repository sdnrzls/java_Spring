<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>회원리스트</h2>
  <a href="/signup/">회원추가</a>
  <table class="table table-hover">
    <thead>
      <tr>
        <th>아이디</th>
        <th>이름</th>
        <th>주소</th>
        <th>핸드폰</th>
        <th>Email</th>
      </tr>
    </thead>
    <c:forEach items="${list.content }" var="list">
    <tbody>
      <tr>
        <td><a href="/${list.id}">${list.id }</a></td>
        <td>${list.name }</td>
        <td>${list.address }</td>
        <td>${list.phone }</td>
        <td>${list.email }</td>
       	
      </tr>
    </tbody>
      </c:forEach>
  </table>
  <div class="container">
  <ul class="pagination">
    <li class="page-item"><a class="page-link" href="?page=${list.number-1 }">Previous</a></li>
    <li class="page-item"><a class="page-link" href="?page=${list.number+1 }">Next</a></li>
  </ul>
</div>
</div>

</body>
</html>