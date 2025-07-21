
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >

<title>Displaying Todos</title>
</head>
<body>
<nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
	<a class="navbar-brand m-1" href="">TONY</a>
	<div class="collapse navbar-collapse">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="/list-todos">Todos</a></li>
		</ul>
	</div>
	<ul class="navbar-nav">
		<li class="nav-item"><a class="nav-link" href="/logout">Logout</a></li>
	</ul>	
</nav>

<div class="container"> 
	<H3>Todos</H3>
	<table border=1 class="table">
		<thead>
			<tr>
				
				<th>Description</th>
				<th>Target Date</th>
				<th>Status</th>
			</tr>
		</thead>
	 
		<c:forEach items="${todolist}" var="todo">
			<tr>
				
				<td>${todo.desc}</td>
				<td>${todo.target}</td>
				<td>${todo.done}</td>
				<td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
				<td><a href="update-todo?id=${todo.id}" class="btn btn-info">Update</a></td>
				
			</tr>
			
		
		</c:forEach>
	</table>
	<a href="add-todos" class="btn btn-success">Add Todo</a>
</div>

<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>



</body>
</html>