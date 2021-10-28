<%@page import="java.util.List"%>
<%@page import="br.edu.infnet.model.domain.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

        <%
	    String nome = (String)request.getAttribute("nomeAluno");
        List<Aluno> alunos = (List<Aluno>) request.getAttribute("listaAlunos");
         %>

      <div class="container">
      <form action="aluno" method="get">
        <h3>Aluno <%=nome%> Cadastro com sucesso!!!"</h3>
        <button type="submit"class="btn btn-primary">Voltar</button>
        
	  </form>
	    
	    <hr>
	    <h4> Listagem de alunos (<%=alunos.size()%>):</h4>
	    <table class="table table-striped">
		    <thead>
		    <tr>
		    <th>Nomes</th>
		    <th>Email</th>
		    </thead>
		<tbody>
		    <%for(Aluno a : alunos) {%>
		     <tr>
		    <th><%=a.getNome()%></th>
		    <th><%=a.getEmail()%></th>
		    <% } %>
		</tbody>
        </table>
	 </div>
    
     
</body>
</html>