<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<body>
<fieldset >
<a href ="./home"> Home</a>
<a href ="./logout" style="float: right"> Logout</a>
<h4><%=msg%></h4>
<form action="./changepassword" method="post" >
 <table align="center">
 <tr><td> <h1>Password:</h1></td>
 <td> <input type="password" name="password"><br></td></tr>
   <tr><td><h1>Confirm Password:</h1></td>
  <td><input type="password" name="confirmpassword"><br></td></tr>
  
  <tr>
  <td>
  <input type="reset" name="reset" value ="reset"></td>
  <td><input type="submit" name="submit" value ="Change"></td></tr>
  </table>
</form>
</fieldset>
</body>
</html>