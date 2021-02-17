
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width-device-width"  initial-scale="1.0">
<meta lang="utf-8">
<meta name="google-signin-client_id" content="162116458121-ucb5qe69fj8105jv1d3es1vt330ardo8.apps.googleusercontent.com">
<script src="https://apis.google.com/js/platform.js" async defer></script>
<link rel="stylesheet" href="login.css">
</head>
<body>
<div align ="center">
<h1>User Login Form</h1>
<form action ="login" method="post">
<table>

<tr><td>User Name: </td><td><input type="text" name="username"></td></tr>
<tr><td>Password: </td><td><input type="password" name="password"></td></tr>

<tr><td></td><td><input type="submit" value="Submit"></td></tr>
</table>


</form>
      <div class="g-signin2" data-onsuccess="onSignIn"></div>

	<script type="text/javascript">
			function onSignIn(googleUser) {
				
				  var profile = googleUser.getBasicProfile();
				  console.log('ID: ' + profile.getId()); // Do not send to your backend! Use an ID token instead.
				  console.log('Name: ' + profile.getName());
				  console.log('Image URL: ' + profile.getImageUrl());
				  console.log('Email: ' + profile.getEmail()); 
				  // This is null if the 'email' scope is not present.
				 
				
					window.location.href = "loginSucess.jsp";
					 
					
					}
				
			</script>
			

</body>
</html>

 