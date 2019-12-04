<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<body>

	<h1>Search Event</h1>
	<form action="/search-event">
		<input type="text" name="name" placeholder="Event Name"> <input
			type="text" name="city" placeholder="City"> <input
			type="submit" value="Find Event">
	</form>
	<br>
	<form action="/search-venue">
		<input type="text" name="venue" placeholder="Venue"> 
		<input type="submit" value="Find Event">
	</form>

	<button type="button" class="btn btn-danger">Bucket List</button>
	<br>
	<br>
	<br>

	<a href="/"><button type="button" class="btn btn-warning">Home</button></a>

</body>
</html>