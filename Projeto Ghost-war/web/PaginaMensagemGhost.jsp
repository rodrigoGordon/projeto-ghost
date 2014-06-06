<%@ page language="java" contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

    <div class="subscribe">
        <span>USER:</span><a href="loginGhost.jsp"> Login </a> | <a href="registrarUsuarioGhost.jsp"> 	Registrar </a>
    </div>

<!--/header-->
</header>
</div>
<div id="content-wrap">

    <!-- content -->
    <div id="content" class="clearfix">
<div id="main">
    <p><% %></p> 
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


    </div>
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

