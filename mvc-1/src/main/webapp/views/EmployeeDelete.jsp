<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
   
<html>
<head>
<title>Emp information</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-white text-center">
				<h3>EMPLOYEE DELETE PAGE</h3>
			</div>
			<div class="card-body">
			<form action="/employee/delete" method="post">
			<input type="hidden" name="empId" value="${emp.empId}">
			NAME: <input type="text" name="empName" value="${emp.empName}" class="form-control"><br>
			SALARY: <input type="text" name="empSal" value="${emp.empSal}" class="form-control"><br>
			<button type="submit"  class="btn btn-success">Delete</button>
			</form>
			</div>
			</div>
			</div>
</body>
</html>