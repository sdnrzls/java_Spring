<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
  <h3>
  <a class="navbar-brand" href="/board/">R.U READY</a>
  </h3>

  
  <!-- Links -->
  <ul class="navbar-nav">
  <c:choose>
  <c:when test="${empty sessionScope.id}">
   <li class="nav-item">
      <a class="nav-link" href="/board/member/join">회원가입</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/board/member/login">로그인</a>
    </li>
 	</c:when>
 	<c:when test="${not empty sessionScope.id}">
 	<li class="nav-item" style="color:white">
       ${sessionScope.id}님 반갑습니다
    </li>
 	<li class="nav-item">
      <a class="nav-link" href="/board/member/logout">로그아웃</a>
    </li>
     <li class="nav-item">
      <a class="nav-link" href="/board/boardInsert">게시판 작성</a>
      </li>
    <li class="nav-item">
      <a class="nav-link" href="/board/boardlist">게시판보기</a>
    </li>
    </c:when>
     </c:choose>
</ul>
</nav>

