<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>
<body style="background:url(images/kalen-emsley-Bkci_8qcdvQ-unsplash.jpg); background-size:cover; background-attachment:fixed ;">
  <div class="container">
    
    <div class="row">
      <div class="col m6 offset-m3">
      <div class="card"> 
      <div class="card-content">
       <h1>Register Here</h1>
       
       <div class="form center-align">
       <!-- creating form -->
       <form action="Register" method="post" id="myform">
       <input type="text" name="user_name" placeholder="Enter User Name"> 
       <input type="password" name="user_password" placeholder="Enter User password"> 
       <input type="email" name="user_email" placeholder="Enter User email"> 
       <button type="submit" class="btn" style:">Submit</button>
       
       </form>
       
       </div>
       <div class="loader center-align" style="margin-top:12px;display:none;">
       <div class="preloader-wrapper big active">
      <div class="spinner-layer spinner-blue">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-red">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-yellow">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-green">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>
    </div>
    <h5>please wait...</h5>
       </div>
       
      </div>
      </div>
      
      </div>
    
  </div>
  <script src="https://code.jquery.com/jquery-4.0.0.js" integrity="sha256-9fsHeVnKBvqh3FB2HYu7g2xseAZ5MlN6Kz/qnkASV8U=" crossorigin="anonymous"></script>
  <script>
  $(document).ready(function() {
	  console.log("page is ready...")
	  $("#myform").on('submit',function(event){
		  event.preventDefault();
	  })
	  var f=$(this).serialize();
	  console.log(f);
	  $.ajax({
		  
		  url:"Register",
		  data:f,
		  type:'post',
		  success: function(data,textStatus,jqXHR){
			  console.log(data);
			  console.log("Success.....")
		  },
		  error:function(jqXHR,textStatus,erroThrown){
			  console.log(data);
			  console.log("Error.....")
			  
		  }
	  })
	  
  })
  
  </script>
</body>
</html>