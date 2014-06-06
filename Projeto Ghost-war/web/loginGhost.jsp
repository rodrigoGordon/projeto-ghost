
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="css/view.css" media="all">
    <link rel="stylesheet" href="css/eventCalendar_theme_responsive.css">
<script type="text/javascript" src="js/view.js"></script>
<style >
                            /* Links */
                            a:link, a:visited {
                                text-decoration: none;
                                color: #CC3300;
                                /*old	#147DB6 */
                                outline: 0;
                            }
                            a:hover, a:focus, a:active {
                                /*old #CC3300   */
                                color: #147DB6;
                            }
                            a:link.more, a:visited.more {
                                font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', Verdana, Sans-serif;
                                float: left;
                                margin-top: 10px;
                                margin-right: 5px;
                                padding: 6px 10px;
                                border: 1px solid #45484d;
                                /*border: 1px solid #2177A5; old */

                                /*background-color: #227bad; old*/

                                background-color: #666666;
                                color: #fff;
                                font-size: 13px;

                                text-shadow: 0 -1px 0 rgba(0,0,0,0.5);

                                -moz-border-radius: 3px;
                                -webkit-border-radius: 3px;
                                border-radius: 3px;
                                /*old #3CA5D2*/
                                box-shadow: 0px 1px 2px rgba(0,0,0,0.3), inset 0 1px 0 #45484d;
                                -moz-box-shadow: 0px 1px 2px rgba(0,0,0,0.3), inset 0 1px 0 #45484d;
                                -webkit-box-shadow: 0px 1px 2px rgba(0,0,0,0.3), inset 0 1px 0 #45484d; 

                            }
                            a:hover.more {
                                border:  1px  solid #B32D00;
                                background-color: #CC3300;

                                box-shadow: 0px 1px 2px rgba(0,0,0,0.3), inset 0 1px 0 #FF7242;
                                -moz-box-shadow: 0px 1px 2px rgba(0,0,0,0.3), inset 0 1px 0 #FF7242;
                                -webkit-box-shadow: 0px 1px 2px rgba(0,0,0,0.3), inset 0 1px 0 #FF7242;
                            }
                            
                            form input.button {
   	height: 36px;
    font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', Verdana, Sans-serif;
   	margin-top: 10px;
	margin-right: 3px;
	padding: 6px 10px;
	border: 1px solid #45484d;
	background-color: #666666;
    color: #fff;
    cursor: pointer;

    text-shadow: 0 -1px 0 rgba(0,0,0,0.5);

    -moz-border-radius: 3px;
    -webkit-border-radius: 3px;
    border-radius: 3px;

    box-shadow: 0px 1px 2px rgba(0,0,0,0.3), inset 0 1px 0 #45484d;
    -moz-box-shadow: 0px 1px 2px rgba(0,0,0,0.3), inset 0 1px 0 #45484d;
    -webkit-box-shadow: 0px 1px 2px rgba(0,0,0,0.3), inset 0 1px 0 #45484d;

}

                        </style>
</head>
<body id="main_body" >
	
	<img id="top" src="images/top.png" alt="">
	<div id="form_container">
	
		<h1><a>Login</a></h1>
		<form id="form_831351" class="appnitro"  method="post" action="loginGhostServlet">
					<div class="form_description">
			<h2>Login Ghost</h2>
			
		</div>						
			<ul >
			
					<li id="li_1" >
		<label class="description" for="nomeUsuario">Nome de usuário </label>
		<div>
			<input id="element_1" name="nomeUsuario" class="element text small" type="text" maxlength="255" value=""/> 
		</div> 
		</li>		<li id="li_2" >
		<label class="description" for="senhaUsuario">Senha </label>
		<div>
			<input id="element_2" name="senhaUsuario" class="element text small" type="password" maxlength="255" value=""/> 
		</div> 
		</li>	<!--	<li id="li_3" >
		<label class="description" for="element_3"> </label>
		<span>
			<input id="element_3_1" name="element_3_1" class="element checkbox" type="checkbox" value="1" />
<label class="choice" for="element_3_1">Mantenha-me conectado</label>

		</span> 
		</li> -->
			
					<li class="buttons">
			    <input type="hidden" name="form_id" value="831351" />
			    
				<input id="saveForm" class="bt" type="submit" name="actionB" value="Entrar" />
		                        <!--name="action" value="salvar" -->
                                        <a class="more" href="homeGhost.jsp">&laquo; Voltar</a>
                                        </li>
			</ul>
		</form>	
		<div id="footer">
			Ghost
		</div>
	</div>
	<img id="bottom" src="images/bottom.png" alt="">
	</body>
</html>