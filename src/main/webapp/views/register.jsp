<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup to Ziofy</title>
</head>
<body>
<h1>Register to Ziofy</h1>

<form id="signupform" action="homepage" method="post">
	username: <input type="text" name="username"/> <br> 
	firstname: <input type="text" name="fisrtname"/> <br> 
	lastname: <input type="text" name="lastname"/> <br> 
	password: <input type="password" name="password" /><br><br>  
	<input type="submit" value="signup" /> 
	
	 <button type="reset">Reset</button>
	
	<p> Already have an account </p>
	<button type="submit" formaction="login">Login</button><br> 
</form>
</body>
</html>