<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Venue Results</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.4.1/slate/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-G9YbB4o4U6WS4wCthMOpAeweY4gQJyyx0P3nZbEBHyz+AtNoeasfRChmek1C2iqV"
	crossorigin="anonymous">
</head>
<body>
	<h1>Venue Search Results</h1>
	<br>



	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>Result #</th>
					<th>Venue Name</th>
					<th>Location</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="e" items="${t}" varStatus="i">
					<!-- Input actual EL Tags for table when ready -->
					<tr>
						<th>${i.count}</th>
						<td><a href="search-event-at-venue?venueId=${e.venueId}"
							method="post">${e.name}</a></td>
						<td>${e.getCity().getName()},${e.getState().getStateCode()}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<h2>Search For Another Venue</h2>
	<form action="/search-venue" method="post">
		<input type="text" name="venue" placeholder="Venue"> <input
			type="submit" value="Find Venue">
	</form>
	<br>
	<br>
	<a href="/search"><button type="button" class="btn btn-danger">Search</button></a>
	<a href="/bucketlist"><button type="button" class="btn btn-danger">Bucket
			List</button></a>
	<br>
	<br>
</body>
</html>