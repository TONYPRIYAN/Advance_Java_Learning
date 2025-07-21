<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >

<title>Insert title here</title>
</head>
<body>
<div class="container">

	<h1> Enter Todo Details</h1>
	<form:form method="post" modelAttribute="todo">
		<fieldset class ="mb-3">
			<form:label path="desc">Description</form:label>
			<form:input type="text" path="desc" required="required"/>
			<form:errors path="desc" cssClass="text-warning"/>
		</fieldset>
		
		<fieldset class ="mb-3">
			<form:label path="target">Target Date</form:label>
			<form:input type="text" path="target" required="required"/>
			<form:errors path="target" cssClass="text-warning"/>
		</fieldset>
		
		<form:input type="hidden" path="id"  required="required"/>
		<form:input type="hidden" path="done"  required="required"/>
		
		<input type="submit" class="btn btn-success"/>
	
	</form:form>
</div>

<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>