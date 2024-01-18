<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="https://www.thymeLeaf.org">
<head>
	<meta charset="utf-8">
	<title>Products</title>
</head>
<body>
<div>
	<form th:action="@{index}" method="get">
		<label>Keyword:</label>
		<input type="text" name="key"/>
		<button class="">Search</button>
	</form>
</div>
<h3>Test</h3>
<table border="1">
	<thead>
	<tr>
		<th>Id</th>
		<th>Designation</th>
		<th>Price</th>
		<th>Quantity</th>
		<th>Actions</th>
	</tr>
	</thead>
	<tbody>
	<tr th:each="p:${listProducts}">
		<td th:text="${p.id}"></td>
		<td th:text="${p.designation}"></td>
		<td th:text="${p.prix}"></td>
		<td th:text="${p.quantite}"></td>
		<td>
			<a onclick=" return confirm('Are you sure?')" th:href="@{delete(id=${p.id})}">Delete</a>
			<a th:href="@{edit(id=${p.id})}">Update</a>
		</td>
	</tr>
	</tbody>
</table>
</body>
</html>