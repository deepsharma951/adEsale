<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>

<body>
<h3 align="center">ABDE Esale</h3>
<div style="margin-top: 5%">
	<springForm:form method="POST" commandName="user"
		action="save.do" >
		<table align="center">
		    <tr>
			 <td>UserName</td>
				<td><springForm:input path="username" /></td>
				<td><springForm:errors path="username" cssClass="error" /></td>
			</tr>
			
			<tr>
			 <td>Password</td>
				<td><springForm:input path="password" /></td>
				<td><springForm:errors path="password" cssClass="error" /></td>
			</tr>
			<tr>
				<td>First Name:</td>
				<td><springForm:input path="firstname" /></td>
				<td><springForm:errors path="firstname" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><springForm:input path="lastname" /></td>
				<td><springForm:errors path="lastname" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><springForm:input path="email" /></td>
				<td><springForm:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><springForm:input path="address" /></td>
				<td><springForm:errors path="address" cssClass="error" /></td>
			</tr>
			<%-- <tr>
				<td>Age:</td>
				<td><springForm:input path="age" /></td>
				<td><springForm:errors path="age" cssClass="error" /></td>
			</tr> --%>
			<tr>
				<td>Gender:</td>
				<td><springForm:select path="gender">
						<springForm:option value="" label="Select Gender" />
						<springForm:option value="MALE" label="Male" />
						<springForm:option value="FEMALE" label="Female" />
					</springForm:select></td>
				<td><springForm:errors path="gender" cssClass="error" /></td>
			</tr>
			 <tr>
				<td>Birthday:</td>
				<td><springForm:input  path="birthday" placeholder="MM/dd/yyyy"/></td>
				<td><springForm:errors path="birthday" cssClass="error" /></td>
			</tr> 
			<tr>
				<td>Phone:</td>
				<td><springForm:input path="phone" /></td>
				<td><springForm:errors path="phone" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Save Customer"></td>
			</tr>
		</table>
		

	</springForm:form>
	</div>

</body>
</html>