<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<%--    <%String mensagem = (String)request.getAttribute("msg"); %> --%>

   <form class="form-horizontal" action="acesso" method="post">

  <div class="jumbotron" style="background-color:gray clear">
	  <h4 class="alert-heading">Login</h4>
	  
<%-- 	 <%if(mensagem != null){%> --%>
<!-- 		  <div class="alert alert-secondary" role="alert"> -->
<%-- 	        <strong>Alerta</strong> <%=mensagem %> --%>
<!-- 	      </div> -->
<%-- 		 <%}%>  --%>
    <div class="form-group">
	  <label class="control-label col-sm-20">E-mail</label>
	  <input type="email" value= "jun@gmail.com" class="form-control" name="email"placeholder="Digite seu e-mail">
    </div> 
   
   <div class="form-group">
	  <label class="control-label col-sm-20">Senha</label>
	  <input type="password"name="senha" value="jun@gmail.com" class="form-control"placeholder="Digite sua senha">
    </div> 
    
   <p align="center"><button type="submit"class="btn btn-primary">acessar</button>
  
    </div>
    </form>

</body>
</html>
