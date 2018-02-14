<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="t" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Attendees Page</title>
<link rel="stylesheet" type="text/css"
	href='<t:url value="bootstrap.min.css"/>' />
</head>
<body>
	<div class="container">
		<f:form commandName="attendee">
			<f:errors cssClass="alert alert-danger" path="*" element="div" />
			<table class="table">
				<tr>
					<td><label>Enter name</label></td>
					<td><f:input path="name" cssClass="form-control" /></td>
				</tr>
				<tr>
					<td><label>Enter email address</label></td>
					<td><f:input path="emailAddress" cssClass="form-control" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" class="btn btn-success"
						value="submit!" /></td>
				</tr>
			</table>
		</f:form>
		
	</div>
</body>
</html>