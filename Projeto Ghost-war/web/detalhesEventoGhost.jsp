
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
    <style type="text/css">
        .datagrid table { border-collapse: collapse; text-align: left; width: 100%; } 
    .datagrid {font: normal 12px/150% Arial, Helvetica, sans-serif; background: #fff; overflow: hidden; 
              border: 1px solid #991821; -webkit-border-radius: 3px; -moz-border-radius: 3px; border-radius: 3px; }
    .datagrid table td, .datagrid table th { padding: 3px 10px; }.datagrid table thead th 
    {background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #991821), color-stop(1, #80141C) )
         ;background:-moz-linear-gradient( center top, #991821 5%, #80141C 100% );
     filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#991821', endColorstr='#80141C');
     background-color:#991821; color:#FFFFFF; font-size: 15px; font-weight: bold; border-left: 1px solid #B01C26; } 
    
    .datagrid table thead th:first-child { border: none; }.datagrid table tbody td { color: #80141C; 
                              border-left: 1px solid #F7CDCD;font-size: 12px;font-weight: normal; }
    
    .datagrid table tbody .alt td { background: #F7CDCD; color: #80141C; }
    .datagrid table tbody td:first-child { border-left: none; }
    .datagrid table tbody tr:last-child td { border-bottom: none; }
    .datagrid table tfoot td div { border-top: 1px solid #991821;background: #F7CDCD;} 
    .datagrid table tfoot td { padding: 0; font-size: 12px } 
    .datagrid table tfoot td div{ padding: 2px; }
    .datagrid table tfoot td ul { margin: 0; padding:0; list-style: none; text-align: right; }
    .datagrid table tfoot  li { display: inline; }
    .datagrid table tfoot li a { text-decoration: none; display: inline-block;  padding: 2px 8px; margin: 1px;
     color: #FFFFFF;border: 1px solid #991821;-webkit-border-radius: 3px; -moz-border-radius: 3px; 
     border-radius: 3px; background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #991821), 
         color-stop(1, #80141C) );background:-moz-linear-gradient( center top, #991821 5%, #80141C 100% );
     filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#991821', endColorstr='#80141C');
     background-color:#991821; }
    .datagrid table tfoot ul.active, .datagrid table tfoot ul a:hover { text-decoration: none;
    border-color: #80141C; color: #FFFFFF; background: none; background-color:#991821;}
    div.dhtmlx_window_active, div.dhx_modal_cover_dv { position: fixed !important; }   
        
        
    </style>
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
       <c:forEach var="evento" items="${eventoDetalhe}">      
      

      <div><table><tr><th>Título</th></tr><tr><td>${evento.nomeEvento}</td></tr></table></div>
    <div>
<table >
  <tr>
    <th>Data&nbsp; - Hora&nbsp;</th>
    
    <th>Local&nbsp; &nbsp; &nbsp;</th>
    <th>Capacidade&nbsp; &nbsp; &nbsp;</th>
    <th>Inscritos até o Momento&nbsp; &nbsp; &nbsp;</th>
  </tr>
  <tr>
    <td>${evento.dtInicio}</td>
    
    <td>${evento.idLocal.nomeLocal}</td>
    <td>${evento.idLocal.capacidade}</td>
    <td>10</td>
    
  </tr>
  </table>
  </div>
  <div>
  <table>
  <tr>
    <th>Descrição</th>    
  </tr>
  <tr>
    <td>${evento.descEvento}
    </td>    
  </tr>
  </table>
  </div>
  <div>
  <table>
  <tr>
    <th>Necessita de inscrição?
</th>    
  </tr>
  <tr>
    <td>
       
    <c:choose>
      <c:when test="${not evento.privado}">Não.
      <br />
      </c:when>

      <c:otherwise>Sim.
      <br />
      </c:otherwise>
    </c:choose>
  
    </td>    
  </tr>
  </table>
  </div>
  <div>
  <table>
  <tr>
    <th>Públic Alvo</th>    
  </tr>
  <tr>
    <td>
        <c:choose>
      <c:when test="${not evento.privado}">Todos.
      <br />
      </c:when>

      <c:otherwise>VERIFICANDO...
      <br />
      </c:otherwise>
    </c:choose>
    </td>    
  </tr>
  <tr>
           <td>
          <a class="more" href="CarregaLocalInfraServlet">Notifique-me</a>&nbsp
          <a class="more" href="CarregaLocalInfraServlet">Inscreva-se</a>&nbsp
          <a class="more" href="editarEventoGhostServlet.jsp">Editar Evento</a><br>

          <a class="more" href="CarregaLocalInfraServlet">Cancelar Inscrição</a>&nbsp
          <a class="more" href="PaginaMensagemGhost.jsp">Cancelar Evento</a>
           </td>
       
  </tr>
</table>
</div>
   </c:forEach>
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
