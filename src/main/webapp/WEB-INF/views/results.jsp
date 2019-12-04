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

<h1>Search For Another Event</h1>
		<form action="/search-event">
			<input type="text" name="name" placeholder="Event Name">
			<input type="text" name="venue" placeholder="Venue">
			<input type="number" name="priceRange" placeholder="Price Range">
			<input type="submit" value="Find Event">		
		</form>
		
		

			<button type="button" class="btn btn-danger">Bucket List</button>
			
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
				<c:forEach var="e" items="${Not set yet}" varStatus="i"> <!-- Input actual EL Tags for table when ready -->
					<tr>
						<th>${i.count}</th>
						<td>${e.name}</td> 
						<td>${e.venue}</td>
						<td>${e.price}</td>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>