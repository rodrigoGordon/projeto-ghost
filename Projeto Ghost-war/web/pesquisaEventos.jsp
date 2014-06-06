

<%@ page language="java" contentType="text/html" %>

<!DOCTYPE html>
 <html> 

<head>
 
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Ghost Project</title>

    <link rel="stylesheet" type="text/css" media="screen" href="css/coolblue.css" />
  
	<link rel="shortcut icon" href="images/favicon.ico" />

	<!-- Grid CSS File (only needed for demo page) -->
	<link rel="stylesheet" href="css/paragridma.css">

	<!-- Core CSS File. The CSS code needed to make eventCalendar works -->
	<link rel="stylesheet" href="css/eventCalendar.css">

	<!-- Theme CSS file: it makes eventCalendar nicer -->
	<link rel="stylesheet" href="css/eventCalendar_theme_responsive.css">

	<!--<script src="js/jquery.js" type="text/javascript"></script>-->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript"></script>

      <!--  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.6/jquery.min.js"></script> -->
        <script>window.jQuery || document.write('<script src="js/jquery-1.6.1.min.js"><\/script>')</script>
        <script src="js/jquery.eventCalendar.js" type="text/javascript"></script>
        
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

      	    <article class="post">

                <div class="container">
                    <div class="row">
                        <div class="g8">
                            <h2 class="h6">Eventos Mackenzie</h2>
                            <p class="demoDesc"></p>
                            <div id="eventCalendarLocale"></div>
                            <script>
                                    $(document).ready(function() {
                                            $("#eventCalendarLocale").eventCalendar({
                                                    eventsjson: 'json/eventosMack.json',
                                                    
                                                    monthNames: [ "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                                                            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" ],
                                                    dayNames: [ 'Domingo','Segunda','Terça','Quarta',
                                                            'Quinta','Sexta','Sábado' ],
                                                    dayNamesShort: [ 'Dom','Seg','Ter','Qua', 'Qui','Sex','Sab' ],
                                                    txt_noEvents: "Não existem eventos neste período",
                                                    txt_SpecificEvents_prev: "",
                                                    txt_SpecificEvents_after: "Eventos:",
                                                    txt_next: "Próximo",
                                                    txt_prev: "Anterior",
                                                    txt_NextEvents: "Próximos eventos:",
                                                    txt_GoToEventUrl: "Detalhes do evento",
                                                    openEventInNewWindow: false
                                                    
                                            });
                                    });
                            </script>

                        </div>

                    </div>	
                </div>

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
		<a href="CarregaEventosJson">Eventos</a> |
        <a href="#top" class="back-to-top">Voltar ao topo</a>
    </p>

<!-- /footer -->
</footer>

</body>

</html>

