<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags"%>
<html ng-app="app">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Events report</title>
<script type="text/javascript" src="<t:url value='angular.min.js'/>"></script>
<script type="text/javascript"
	src="<t:url value='events_controller.js' />"></script>
<link rel="stylesheet" type="text/css"
	href="<t:url value='bootstrap.min.css'/>" />
</head>
<body>
	<div class="content container" ng-controller="EventsController">
		<p>I have {{events.length}} events, check them out:</p>
		<ul>
			<li ng-repeat="event in events">{{ event.name }}</li>
		</ul>
		<p> -__- </p>
	</div>
</body>
</html>