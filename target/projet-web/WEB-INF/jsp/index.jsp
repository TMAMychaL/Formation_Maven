<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/bootstrap.css" media="screen">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/bootswatch.min.css">
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="../bower_components/bootstrap/assets/js/html5shiv.js"></script>
      <script src="../bower_components/bootstrap/assets/js/respond.min.js"></script>
    <![endif]-->
<title>Create a Todo</title>
</head>
<body>

	<div class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<a href="../" class="navbar-brand" style="FONT-SIZE: xx-large;">CloudUnit</a>
			</div>
			<div class="navbar-collapse collapse" id="navbar-main">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="http://blog.treeptik.fr/" target="_blank">Documentation</a></li>
				</ul>
			</div>
		</div>
	</div>
	
		<h1> Create a Todo</h1>
		<br>
		<br>
		
			<form:form cssClass="form-group" action="index.do" commandName="toDo" method="POST">
			
				<table>
					<tr>
						<td>Name :</td>
						<td><form:input cssClass="form-control" path="name" /></td>
					</tr>
					<tr>
						<td>Date :</td>
						<td><form:input cssClass="form-control" path="date" placeholder="JJ/MM/AAAA"/></td>
					</tr>
				</table>
				<br />
				<div class="form-group">
					<div class="col-lg-10 col-lg-offset-2">
						<button type="submit" class="btn btn-primary" >Create</button>
						<a href="list.do"><button type="button" class="btn btn-primary">ToDo List</button></a>
					</div>
				</div>
			</form:form>

</body>
</html>