
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<title>Displaying Todos</title>
</head>
<body>

<div> 
	<H3>Hello ${name}!</H3>
	<table border=1>
		<thead>
			<tr>
				<th>Id</th>
				<th>Description</th>
				<th>Target Date</th>
				<th>Status</th>
			</tr>
		</thead>
	 
		<c:forEach items="${todolist}" var="todo">
			<tr>
				<td>${todo.id}</td>
				<td>${todo.desc}</td>
				<td>${todo.target}</td>
				<td>${todo.done}</td>
			</tr>
			
		
		</c:forEach>
	</table>
</div>



</body>
</html>