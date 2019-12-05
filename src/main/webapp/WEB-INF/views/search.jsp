<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.4.1/slate/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-G9YbB4o4U6WS4wCthMOpAeweY4gQJyyx0P3nZbEBHyz+AtNoeasfRChmek1C2iqV"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Search Event</h1>
		<form action="/search-event" method="post">
			<input type="hidden" name="u" value="${user}"> <input
				type="text" name="name" placeholder="Event Name"> <input
				type="text" name="city" placeholder="City"> <input
				type="submit" value="Find Event">
		</form>
		<br>
		<form action="/search-venue" method="post">
			<input type="hidden" name="u" value="${user}"><input
				type="text" name="venue" placeholder="Venue"> <input
				type="submit" value="Find Event">
		</form>



		<br> <a href="/go-to-bucketlist" class="btn btn-danger"
			style="float: right;">Go To Bucket List</a>
	</div>
</body>
</html>