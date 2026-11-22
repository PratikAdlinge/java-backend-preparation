<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Notes</title>
<%@include file="all_js_css.jsp" %>

</head>
<body> 
  <div class="container">     <%@include file="navbar.jsp" %>
  <h3>Please fill your note detail</h3>
  
  <form  action="SaveNoteServlet"  method="post">
  <div class="mb-3">
    <label for="title" class="form-label">Note Title</label>
    <input name="title" required="required" type="text" class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter title">
  </div>
  <div class="mb-3">
    <label for="content" class="form-label">Note Content</label>
    <textarea name="content" required="required" id="content" placeholder="Enter your content here" class="form-control"	style="height: 250px;"  ></textarea>
  </div>
  <div class="container text-center">
    <button type="submit" class="btn btn-primary">Add</button>
  
  </div>
</form>
  </div>


</body>
</html>