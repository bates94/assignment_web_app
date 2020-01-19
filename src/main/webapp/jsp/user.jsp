<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>User Registration</title>
	<%@include file="meta.jsp" %>
	
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
			<div class="row">
				<div class="offset-lg-4 col-lg-4" style="padding-top: 2rem;">
					<p>Dear ${user.name} ${user.surname}</p>
					<br>
					<p>Your user registration has been done.</p>
				</div>
			</div>
		</div>
	</section>
</body>
</html>