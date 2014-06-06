


<%@page import="br.mack.pi2.jpa.Usuario"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html" %>
<!DOCTYPE html>
 <html> 

<head>

    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="utf-8"/>
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Ghost Project</title>

    <link rel="stylesheet" type="text/css" media="screen" href="css/coolblue.css" />

 
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.6/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/jquery-1.6.1.min.js"><\/script>')</script>

    <script src="js/scrollToTop.js"></script>

</head>

<body id="top">

<!--header -->
<div id="header-wrap">
<header>

 	<hgroup>
        <h1><a href="homeGhost.jsp">Ghost Project</a></h1>
        <h3>Mackenzie Eventos</h3>
    </hgroup>

    <nav>
		<ul>
			<li id="current"><a href="homeGhost.jsp">Home</a><span></span></li>
			<li><a href="CarregaEventosJson">Eventos</a><span></span></li>
		</ul>
	</nav>
  <% 
    List<Usuario> listUsuario = (List<Usuario>)request.getSession().getAttribute("usuario");
    String nomeUsuario = null;
    nomeUsuario = listUsuario == null ? null : listUsuario.get(0).getNomeUser();
  %>
    <% if(nomeUsuario == null){ %>
    <div class="subscribe">
        <span>USER:</span><a href="loginGhost.jsp"> Login </a> | <a href="registrarUsuarioGhost.jsp"> 	Registrar </a>
    </div>
   <% }else { %>
        
    <div class="subscribe">
        <span><%= nomeUsuario%></span>
    </div> 
    <form id="quick-search" method="post" action="CarregaLocalInfraServlet">
      <fieldset>
         <p><a class="more" href="CarregaLocalInfraServlet">Novo Evento &raquo;</a></p>
      </fieldset>
   </form>
   <% }%>
   

<!--/header-->
</header>
</div>
	
<!-- content-wrap -->
<div id="content-wrap">

    <!-- content -->
    <div id="content" class="clearfix">

   	    <!-- main -->
        <div id="main">

      	    <article class="post">

      		    <div class="primary">

                    <h2><a href="pesquisaEventos.jsp">TÍTULO EVENTO</a></h2>

                    

               	    <div class="image-section">
              		    <img src="images/img-post.jpg" alt="image post" height="206" width="498"/>
         	        </div>

                    <p>Detalhes do Evento
					Le Lorem Ipsum est simplement du faux texte employé dans la composition et la mise en page avant impression. 
					Le Lorem Ipsum est le faux texte standard de l'imprimerie depuis les années 1500, quand un peintre anonyme assembla 
					ensemble des morceaux de texte pour réaliser un livre spécimen de polices de texte.
					
                    </p>

                    <p><a class="more" href="CarregaDetalheEventoGhostServlet?id=10">Detalhes &raquo;</a></p>

                </div>

                <aside>

            	    <p class="dateinfo">JAN<span>31</span></p>

               	    <div class="post-meta">
                  	    <h4>EVENTO Info</h4>
                     	<ul>
                           <li class="comment"><a href="#">Titulo do evento</a></li>
                           <li class="time"><a href="#">12:30 PM</a></li>
                           <li class="user"><a href="#">FACULDADE</a></li>
                           <li class="permalink"><a href="#">LOCAL</a></li>
                        </ul>
					</div>

                </aside>

		    </article>

        <!-- /main -->
        </div>

        <!-- sidebar -->
		<div id="sidebar">

			<div class="sidemenu">

				<h3>Links Mackenzie</h3>
                <ul>
					<li><a href="http://ead.mackenzie.br/moodle/">Moodle</a></li>
					<li><a href="http://www3.mackenzie.com.br/tia/index.php">TIA</a></li>
					
					<li><a href="http://www.mackenzie.br/editora.html">Revista Mackenzie</a></li>
					<li><a href="#">Ouvidoria</a></li>
					<li><a href="http://colegio.mackenzie.br/">Colégio Mackenzie</a></li>
					<li><a href="http://www.mackenzie.br/upm.html">Universidade Mackenzie</a></li>
				</ul>

			</div>


            <div class="sidemenu popular">

				<h3>Proximos Eventos</h3>
				<ul>
			   	<li><a href="index.html">Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
						<span>Posted on December 22, 2010</span></a>
					</li>
                <li><a href="index.html">Cras fringilla magna. Phasellus suscipit.
						<span>Posted on December 20, 2010</span></a>
					</li>
                <li><a href="index.html">Morbi tincidunt, orci ac convallis aliquam.
						<span>Posted on December 15, 2010</span></a>
					</li>
                <li><a href="index.html">Ipsum dolor sit amet, consectetuer adipiscing elit.
						<span>Posted on December 14, 2010</span></a>
					</li>
                <li><a href="index.html">Morbi tincidunt, orci ac convallis aliquam, lectus turpis varius lorem
						<span>Posted on December 12, 2010</span></a>
					</li>
				</ul>

			</div>

        <!-- /sidebar -->
		</div>

    <!-- content -->
	</div>

<!-- /content-out -->
</div>
		
<!-- extra -->
<div id="extra-wrap"><div id="extra" class="clearfix">

	    

	    <div class="col first">

		    <h3>Contact Info</h3>

		    <p>
		    <strong>Phone: </strong>+1234567<br/>
		    <strong>Fax: </strong>+123456789
			<br/>
			<strong>Address: </strong>123 Put Your Address Here
			<strong>E-mail: </strong>me@coolblue.com <br/>
			Want more info - go to our <a href="#">contact page</a>
		    </p>

	    </div>

<!-- /extra -->
</div></div>

<!-- footer -->
<footer>

	<p class="footer-left">
		&copy; 2011 Copyright Info &nbsp; &nbsp; &nbsp;
		Design by <a href="http://www.styleshout.com/">styleshout</a>
	</p>

	<p class="footer-right">
	   	<a href="homeGhost.jsp">Home</a> |
		<a href="homeGhost.jsp">Eventos</a> |
        <a href="#top" class="back-to-top">Voltar ao topo</a>
    </p>

<!-- /footer -->
</footer>

</body>
</html>
