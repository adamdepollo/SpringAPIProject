<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bucket List Results</title>
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
				<c:forEach var="e" items="${events}" varStatus="i">
					<!-- Input actual EL Tags for table when ready -->
					<tr>
						<th>${i.count}</th>
						<td>${e.name}</td>

						<c:choose>
							<c:when test="${empty e.priceRanges[0].getMin()}">
								<td>Unknown</td>
							</c:when>
							<c:otherwise>
								<td>$${String.format("%.2f", e.priceRanges[0].getMin())}-
									$${String.format("%.2f", e.priceRanges[0].getMax())}</td>
							</c:otherwise>
						</c:choose>


						<td><a href="save-event?e=${e}"class="btn btn-warning">Save Event to Bucketlist</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<a href="/bucketlist"><button type="button" class="btn btn-danger"
			style="float: right;">Go To Bucket List</button></a>
	<br>
	<br>
	<h2>Search For Another Event</h2>
	<form action="/search-event">
		<input type="text" name="name" placeholder="Event Name"> <input
			type="text" name="city" placeholder="City"> <input
			type="submit" value="Find Event">
	</form>
	<br>
	<form action="/search-venue">
		<input type="text" name="venue" placeholder="Venue"> <input
			type="submit" value="Find Event">
	</form>

	<br>
	<br>
	<br>
	<br>




</body>
</html>