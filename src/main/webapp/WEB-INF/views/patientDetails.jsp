<html>
<head>
<title>Patient Details</title>
</head>
<body>

	<form action="/patientDetails" method="POST">
		<h1>Welcome ${msg}, Please enter patient details</h1>
		<br> First Name : <input name="firstName" type="text" />
		<p style="line-height: 1.4"></p>
		Last Name : <input name="lastName" type="text" />
     	<p style="line-height: 1.4"></p>
		Address : <input name="address" type="text" /> <br>
		<p style="line-height: 1.4"></p>
		Phone : <input name="phone" type="number" /> <br>
		<p style="line-height: 1.4"></p>
		<input type="submit" />
	</form>
</body>
</html>
