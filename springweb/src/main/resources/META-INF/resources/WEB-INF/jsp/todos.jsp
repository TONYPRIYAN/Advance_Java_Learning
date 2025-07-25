
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >

<title>Displaying Todos</title>
</head>
<body>
<%@ include file="common/navigation.jspf" %>

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
				
				<td>${todo.description}</td>
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