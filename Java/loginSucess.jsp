<

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<meta name="google-signin-client_id" content="162116458121-ucb5qe69fj8105jv1d3es1vt330ardo8.apps.googleusercontent.com">
<script src="https://apis.google.com/js/platform.js" async defer></script>
 

<a href="login.jsp" onclick="signOut();">Sign out</a>

   <script type="text/javascript">
   
			  function signOut() {
			    var auth2 = gapi.auth2.getAuthInstance();
			    console.log("loggedout not working 1;")
			    auth2.signOut().then(
			    		function () {
			      console.log('User signed out.');
			   //  window.location.href=""
			    });
			  }
   </script>
			
</body>
</html>