

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

   <form id="quick-search" method="get" action="">
      <fieldset class="search">
         <label for="qsearch">Search:</label>
         <input class="tbox" id="qsearch" type="text" name="qsearch" value="Search..." title="Start typing and hit ENTER" />
         <button class="btn" title="Submit Search">Search</button>
      </fieldset>
   </form>

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

                    <p><a class="more" href="pesquisaEventos.jsp">Detalhes &raquo;</a></p>

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

				<h3>Manutenção Mackenzie</h3>
                <ul>
					<li><a href="cadItensLocal.jsp">Locais</a></li>
					<li><a href="cadInfraEstrutura.jsp">Infra</a></li>
					<li><a href="cadEvento.jsp">Evento</a></li>
					
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

