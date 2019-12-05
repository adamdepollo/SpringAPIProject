<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.4.1/slate/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-G9YbB4o4U6WS4wCthMOpAeweY4gQJyyx0P3nZbEBHyz+AtNoeasfRChmek1C2iqV"
	crossorigin="anonymous">
</head>
<body>
	<h1>Search Results</h1>





	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>Result #</th>
					<th>Event Name</th>
					<th>Price</th>
					<th>Add To Bucket List</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="e" items="${t}" varStatus="i">
					<!-- Input actual EL Tags for table when ready -->
					<tr>
						<th>${i.count}</th>
						<td>${e.name}</td>

						<c:choose>
							<c:when test="${empty e.getPriceRanges().get(0).getMin()}">
								<td>Unknown</td>
							</c:when>
							<c:otherwise>
								<td>$${String.format("%.2f",
									e.getPriceRanges().get(0).getMin())}- $${String.format("%.2f",
									e.getPriceRanges().get(0).getMax())}</td>
							</c:otherwise>
						</c:choose>


						<td><a href="save-event?id=${e.getId()}"
							class="btn btn-warning">Save Event to Bucketlist</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<a href="/search"><button type="button" class="btn btn-danger">Search</button></a>
	<a href="/go-to-bucketlist" class = "btn btn-danger" style = "float: right;">Go To Bucket List</a>
	<br>
	<br>
	<h2>Search For Another Event</h2>
	<form action="/search-event" method="post">
		<input type="text" name="name" placeholder="Event Name"> <input
			type="text" name="city" placeholder="City"> <input
			type="submit" value="Find Event">
	</form>
	<br>
	<form action="/search-venue" method="post">
		<input type="text" name="venue" placeholder="Venue"> <input
			type="submit" value="Find Event">
	</form>

	<br>
	<br>
	<br>
	<br>



</body>
</html>