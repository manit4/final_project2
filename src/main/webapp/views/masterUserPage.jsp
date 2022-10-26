<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, com.cohart.to.User"%>
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

	<%
	List<User> users = (List<User>) request.getAttribute("allUsers");
	%>

	<br>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Home</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<a class="navbar-brand" href="masterModule">Master</a>
					<button class="navbar-toggler" type="button"
						data-bs-toggle="collapse" data-bs-target="#navbarNav"
						aria-controls="navbarNav" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<a class="navbar-brand" href="">Portfolio</a>
					<button class="navbar-toggler" type="button"
						data-bs-toggle="collapse" data-bs-target="#navbarNav"
						aria-controls="navbarNav" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<a class="navbar-brand" href="">Contact Us</a>
					<button class="navbar-toggler" type="button"
						data-bs-toggle="collapse" data-bs-target="#navbarNav"
						aria-controls="navbarNav" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<a class="navbar-brand" href="/">Logout</a>
					<button class="navbar-toggler" type="button"
						data-bs-toggle="collapse" data-bs-target="#navbarNav"
						aria-controls="navbarNav" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>


				</ul>
			</div>
		</div>
	</nav>
	<br>

	<nav class="nav flex-column">
		<a class="nav-link" aria-current="page" href="masterUser">User</a> <a
			class="nav-link" href="#">Product</a>
	</nav>

	<h3>
		No of Users Present:
		<%=users.size()%></h3>

	<table class="table table-success table-striped">
		<thead>


			<tr>
				<th scope="col">Username</th>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th scope="col">Email</th>
				<th scope="col">Delete</th>
			</tr>

		</thead>
		<tbody>
			<%
			for (int i = 0; i < users.size(); i++) {
			%>
			<tr>
				<td><%=users.get(i).getUsername()%></td>
				<td><%=users.get(i).getFirstName()%></td>
				<td><%=users.get(i).getLastName()%></td>
				<td><%=users.get(i).getEmail()%></td>
				<td><a href="/delete/<%=users.get(i).getUsername()%>">delete</a></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>

	<div style="margin-top: 350px; margin-left: 50px"></div>
	<div class="card-footer text-muted">
		10 downing street, London United Kingdom
		<h6 style="margin-left: 500px">Powered by Cohart20</h6>
	</div>
</body>
</html>