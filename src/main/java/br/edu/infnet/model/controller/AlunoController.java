package br.edu.infnet.model.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.domain.Aluno;
import br.edu.infnet.model.repository.AlunoRepository;

public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

    public AlunoController() {
    	
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("home.html").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Aluno aluno = new Aluno(request.getParameter("nome"), request.getParameter("email")); 
		
		aluno.setIdade(Integer.valueOf(request.getParameter("idade")));	
		aluno.setMensalidade(Float.valueOf(request.getParameter("mensalidade")));
	    aluno.setEscolaridade(request.getParameter("escolaridade"));
	    aluno.setDisciplinas(request.getParameterValues("disciplinas"));
	    aluno.setRegiao(request.getParameter("regiao"));
	   
	    AlunoRepository.incluir(aluno);
	    
	    request.setAttribute("nomeAluno", aluno.getNome());
        request.setAttribute("listaAlunos", AlunoRepository.obterlista());


		request.getRequestDispatcher("confirmacao.jsp").forward(request, response);
	}  
	
}
	    
		   // PrintWriter out = response.getWriter();
		    
		    //out.println(
		    	//	 "<!DOCTYPE html>"+
		    		// "<html>"+
		    		 //"<head>"+
		    		 //"<meta charset=\"ISO-8859-1\">"+
		    		// "<title>Confirmação</title>"+
		    		// "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"+
		    		 //"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">"+
		    	    // "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>"+
		    		// "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>"+
		    		// "</head>"+
		    		// "<body>"+
		    		// "<form class=\"form-horizontal\"action=\"aluno\" method=\"get\">"+
		    		// "<h3>Aluno "+ aluno.getNome()+" </h3>"+
		    		// "    <div class=\"container\">"+
		    	   //  "    <div class=\"jumbotron\" style=\"background-color:gray clear\">"+
		    	//	 "    <div class=\"form-group\">"+
		    //		 "	  <label class=\"control-label col-sm-20\">Aluno cadastrado com sucesso!</label>"+
		    	//	 "	</div>"+
		    	  //   "	<button type=\"submit\"class=\"btn btn-primary\">Voltar</button>"+
		    		// "    </div>"+
		    	//	 "</form>");
		    
		    
		 //  List<Aluno> alunos = AlunoRepository.obterlista();
		   // out.println("<hr>");
		  //  out.println("<h5> Listagem de alunos("+alunos.size()+"):</h5>");
	
		    
		   // for(Aluno a : alunos) {
		    	
			 //   out.println("<h4> "+ a.getNome()+ "-" + a.getEmail()+"</h4>");
			    
	//	    }
	
		//    out.println(
		    
		  //  "   </div>" +
		    //	    "</body>"+
		    	//    "</html>");
		    
		    
		    
		    
		    	//   }
		    
		    	  //  }
