<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
	<%@include file="meta.jsp" %>
	<title>Register</title>
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		  <a class="navbar-brand" href="/webapp/" id="logo">Webapp</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColorMenu" aria-controls="navbarColor02" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		
		  <div class="collapse navbar-collapse" id="navbarColorMenu">
		    <ul class="navbar-nav mr-auto">
		      <li class="nav-item">
		        <a class="nav-link" href="/webapp/">Home</a>
		      </li>
		      <li class="nav-item active">
		        <a class="nav-link" href="/webapp/register">Register</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="/webapp/login">Login</a>
		      </li>
		    </ul>
		  </div>
		</nav>
	</header>
	<section>
		<div class="container-fluid">
			<div class="row" style="padding-top:1rem;">
				<div class="offset-lg-4 col-lg-4">
					<form:form method="POST" action="/webapp/register/user" modelAttribute="user">
						<fieldset>
							<div class="form-group">
							  <label for="inputUsername">Name:</label>
							  <form:input class="form-control" id="inputUsername" placeholder="Name" path="name"/>
							</div>
							<div class="form-group">
							  <label for="inputUsername">Surname:</label>
							  <form:input class="form-control" id="inputUsername" placeholder="Surname" path="surname"/>
							</div>
							<div class="form-group">
							  <label for="inputUsername">Birthdate:</label>
							  <form:input class="form-control" id="inputUsername" placeholder="Birthdate" path="birthDate"/>
							</div>
							<div class="form-group">
							  <label for="inputUsername">Username:</label>
							  <form:input class="form-control" id="inputUsername" placeholder="Username" path="userName"/>
							</div>
							<div class="form-group">
						      <label for="inputPassword">Password:</label>
						      <form:input type="password" class="form-control" id="inputPassword" placeholder="Password" path="password"/>
						    </div>
						    <input type="submit" class="btn btn-secondary btn-lg" style="margin-left: 10rem;" value="Sign Up"/>
						</fieldset>
					</form:form>
				</div>
			</div>
		</div>
	</section>
</body>
</html>