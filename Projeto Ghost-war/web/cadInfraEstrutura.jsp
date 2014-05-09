
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Infraestrutura</title>
<link rel="stylesheet" type="text/css" href="css/view.css" media="all">
<script type="text/javascript" src="js/view.js"></script>

</head>
<body id="main_body" >
	
	<img id="top" src="images/top.png" alt="">
	<div id="form_container">
	
		<h1><a>Infraestrutura</a></h1>
		<form id="form_831745" class="appnitro"  method="post" action="">
					<div class="form_description">
			<h2>Infraestrutura</h2>
			<p></p>
		</div>						
			<ul >
			
					<li id="li_1" >
		<label class="description" for="nomeInfra">Nome </label>
		<div>
			<input id="element_1" name="nomeInfra" class="element text medium" type="text" maxlength="255" value=""/> 
		</div> 
		</li>		<li id="li_2" >
		<label class="description" for="descInfra">Descrição </label>
		<div>
			<input id="element_2" name="descInfra" class="element text medium" type="text" maxlength="255" value=""/> 
		</div> 
		</li>		<li id="li_3" >
		<label class="description" for="tipoInfra">Tipo </label>
		<div>
			<input id="element_3" name="tipoInfra" class="element text medium" type="text" maxlength="255" value=""/> 
		</div> 
		</li>		<li id="li_4" >
		<label class="description" for="valorInfra">Valor </label>
		<span class="symbol">$</span>
		<span>
			<input id="element_4_1" name="valorInfra" class="element text currency" size="10" value="" type="text" /> .		
			<label for="valorInfra">R$</label>
		</span>
		
		</li>
			
					<li class="buttons">
			    <input type="hidden" name="form_id" value="831745" />
			    
				<input id="saveForm" class="button_text" type="submit" name="submit" value="Salvar" />
                                <span><-</span><a href="pesquisaEventos.jsp"> Voltar </a>
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
