<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/cyborg/bootstrap.min.css" rel="stylesheet" integrity="sha384-mtS696VnV9qeIoC8w/PrPoRzJ5gwydRVn0oQ9b+RJOPxE1Z1jXuuJcyeNxvNZhdx" crossorigin="anonymous">
</head>
<body>
<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>Result #</th>
					<th>Event Name</th>
					<th>Venue</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="e" items="${t}" varStatus="i">
					<tr>
						<th>${i.count}</th>
						<td>${e.name}</td>
						<td>${String.format("%.2f", e.priceRanges[0].getMin())} - $${String.format("%.2f", e.priceRanges[0].getMax())}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>