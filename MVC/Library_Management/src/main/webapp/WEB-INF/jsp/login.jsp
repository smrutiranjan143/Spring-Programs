<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>Welcome 2 Login Page</h2>
		<form name="myform" action="home.htm" method="post" onsubmit="return validate()">
			<input type="text" name="username" placeholder="Enter your username"><br/>
			<input type="password" name="password" placeholder="Enter your password"><br/>
			<input type="submit" value="Submit">
		</form>
	</body>
	
	<script type="text/javascript">
		function validate(){
			var user=document.myform.username.value;
			var pass=document.myform.password.value;
			
			if(user==null||user==""){
				alert("Username should not be blank");
				return false;
			}else if(pass.length<6){
				alert("Password should be 6 character");
				return false;
			}
		}
	</script>
</html>














