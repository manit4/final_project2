<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<h1 style="margin-left: 250px">Cohart20 Ecommerce Application</h1>
	<br>
	<br>

	<h3 style="margin-left: 400px; color: Blue">Check your Details for updation </h3>

	<form action="register" method="post">
		<div style="margin-left: 500px; margin-right: 500px"
			class="form-group">
			<div>
				<label for="exampleInputEmail1">Username</label> <input type="text"
					class="form-control" placeholder="Enter Username" name="username" value="${userData.getUsername()}">
			</div>
			
			<div>
				<label for="exampleInputEmail1">First Name</label> <input
					type="text" class="form-control" placeholder="Enter First Name" name="firstName" value="${userData.getFirstName() }">
			</div>
			<div>
				<label for="exampleInputEmail1">Last Name</label> <input type="text"
					class="form-control" placeholder="Enter Last Name" name="lastName" value="${userData.getLastName()}">
			</div>
			<div>
				<label for="exampleInputEmail1">Email</label> <input type="text"
					class="form-control" placeholder="Enter Email Address" name="email" value="${userData.getEmail()}">
			</div>
		</div><br>
		<button style="margin-left: 600px" type="submit"
			class="btn btn-primary">Update</button>
		<br>
		<br>
	</form>
</body>
</html>