<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>회원수정</h2>
  <form action="update" method="post">
    <div class="form-group">
      <label for="id">ID:</label>
      <input type="text" class="form-control" id="id" name="id" value="${list.id }" readonly="readonly">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="password" name="password">
    </div>  
    <div class="form-group">
      <label for="name">name:</label>
      <input type="text" class="form-control" id="name" name="name" value="${list.name }">
    </div>
     <div class="form-group">
      <label for="phone">핸드폰:</label>
      <input type="text" class="form-control" id="phone" name="phone" value="${list.phone }">
    </div>
     <div class="form-group">
      <label for="address">주소:</label>
      <input type="text" class="form-control" id="address" name="address" value="${list.address }">
    </div>
     <div class="form-group">
      <label for="email">이메일:</label>
      <input type="text" class="form-control" id="email" name="email" value="${list.email }">
    </div>
    <button type="button" id="btnUpdate"class="btn btn-primary">수정완료</button>
    
    <script src="/js/signup.js"></script>
  </form>
</div>
</body>
</html>