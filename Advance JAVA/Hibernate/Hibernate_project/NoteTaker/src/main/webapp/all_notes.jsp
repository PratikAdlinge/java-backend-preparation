<%@page import="java.util.List"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="com.helper.Factory_Provider"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.entities.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Notes: Note Taker</title>
<%@include file="all_js_css.jsp"%>

</head>
<body>
	<div class="container">

		<%@include file="navbar.jsp"%>
		<h1>All Notes</h1>

		<div class=row>
			<div class=col-12></div>
		</div>
		<%
		Session s = Factory_Provider.getFactory().openSession();
		Query q = s.createQuery("from Note");
		List<Note> list = q.list();

		for (Note note : list) {
		%>
		<div class="card mt-3">
			<img class="card-img-top" style="max-width:70px;"   src="images/note.png" alt="Card image cap">
			<div class="card-body">
				<h5 class="card-title"><%=note.getTitle() %></h5>
				<p class="card-text"><%=note.getContent() %></p>
				<a href="#" class="btn btn-danger">Delete</a>
			</div>
		</div>
		
		
		<%
		}
		s.close();
		%>

	</div>
</body>
</html>