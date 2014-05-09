
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="view.css" media="all">
<script type="text/javascript" src="view.js"></script>

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
		</li>		<li id="li_3" >
		<label class="description" for="element_3"> </label>
		<span>
			<input id="element_3_1" name="element_3_1" class="element checkbox" type="checkbox" value="1" />
<label class="choice" for="element_3_1">Mantenha-me conectado</label>

		</span> 
		</li>
			
					<li class="buttons">
			    <input type="hidden" name="form_id" value="831351" />
			    
				<input id="saveForm" class="button_text" type="submit" name="actionB" value="Entrar" />
		                        <!--name="action" value="salvar" -->
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