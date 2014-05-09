
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
 <html> 

<head>

    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="utf-8"/>
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Ghost Project</title>

    <link rel="stylesheet" type="text/css" media="screen" href="css/coolblue.css" />

    <!--[if lt IE 9]>
	    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

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
			<li><a href="pesquisaEventos.jsp">Eventos</a><span></span></li>
		</ul>
	</nav>

    <div class="subscribe">
        <span>USER:</span><a href="loginGhost.jsp"> Login </a> | <a href="registrarUsuarioGhost.jsp"> 	Registrar </a>
    </div>

<!--/header-->
</header>
</div>
	
	
<!-- content-wrap -->
<div id="content-wrap">

    <!-- content -->
    <div id="content" class="clearfix">

   	    <!-- main -->
        <div id="main">

            <!-- post -->
      	    <article class="post single">

                <!-- primary -->
         	    <div class="primary">

		    <h1>Registrar Usuário</h1>

            <div class="primary">

            	<form action="registrarUsuarioGhostServlet" method="post" id="commentform">

               	    <div>
					    <label for="usuario">Nome do usuário<span>*</span></label>
						<input id="usuario" name="nomeUsuario"  type="text" tabindex="1" />
					</div>
                    <div>
						<label for="email">Email:<span>*</span></label>
						<input id="email" name="emailUsuario"  type="text" tabindex="2" />
					</div>
                    <div>
						<label for="senha">Senha:<span>*</span></label>
						<input id="senha" name="senhaUsuario"  type="text" tabindex="3" />
					</div>
					<div>
						<label for="senha">Confirmar Senha:<span>*</span></label>
						<input id="senhaConf" name="senhaConfUsuario"  type="text" tabindex="4" />
					</div>
                    <div>
						<label for="bMackenzista">Aluno ou funcionário Mackenzista?<span>*</span></label> 
						<input type="radio" name="bMackenzista" value="Sim" tabindex="5">Sim</input>
                        <input type="radio" name="bMackenzista" value="Não" tabindex="6">Não
					</div>
					<div>
						<label for="rg">RG:<span>*</span></label>
						<input id="rg" name="rgUsuario"  type="text" tabindex="7" />
					</div>
					<div>
						<label for="identMackenzista">TIA/DRT:<span>*</span></label>
						<input id="identMackenzista" name="identMackenzista"  type="text" tabindex="8" />
					</div>
                    <div class="no-border">
                        <input class="button" type="submit" name="actionB" value="Registrar" tabindex="9" />
					</div>

               </form>

            </div>

        

                <!-- /primary -->
                </div>

        <!-- /post -->
        </article>

    <!-- content -->
	</div>

<!-- /content-out -->
</div>
		
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

		  

            <p>Stay up to date. Subscribe via
		    <a href="index">RSS</a>, <a href="index">Facebook</a>,
		    <a href="index">Twitter</a> or <a href="index">Email</a>
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
		<a href="pesquisaEventos.jsp">Eventos</a> |
        <a href="#top" class="back-to-top">Voltar ao topo</a>
    </p>

<!-- /footer -->
</footer>

</body>
</html>
