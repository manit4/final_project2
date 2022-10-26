<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.*, com.cohart.to.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body>
<br>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <a class="navbar-brand" href="masterModule">Master</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="">Portfolio</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="">Contact Us</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="/">Logout</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
        
       
      </ul>
    </div>
  </div>
</nav><br>



<h3 style="margin-left: 200px; font-style: italic;">Welcome ${userData.getFirstName() } ${userData.getLastName() }</h3><br>

<table class="table table-success table-striped">
  <thead>
    <tr>
      <th scope="col">Username</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Email</th>
    </tr>
  </thead>
  
   <tbody>
    <tr>
      <th scope="row">${userData.getUsername() }</th>
      <td>${userData.getFirstName()}</td>
      <td>${userData.getLastName()}</td>
      <td>${userData.getEmail()}</td>
    </tr>
  </tbody>
 <%--  <tbody>
    <tr>
      <th scope="row">${userData.getUsername() }</th>
      <td>${userData.getFirstName() }</td>
      <td>${userData.getLastName() }</td>
      <td>${userData.getEmail() }</td>
    </tr>
  </tbody> --%>
</table>



<div style="margin-top: 400px; margin-left: 50px">


</div>
<div class="card-footer text-muted">
    10 downing street, London United Kingdom
    <h6 style="margin-left: 500px">Powered by Cohart20</h6>
  </div>
</body>
</html>