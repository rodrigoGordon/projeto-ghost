
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Itens</title>
<link rel="stylesheet" type="text/css" href="css/view.css" media="all">
<script type="text/javascript" src="js/view.js"></script>

</head>
<body id="main_body" >
	
	<img id="top" src="images/topItem.png" alt="">
	<div id="form_container">
	
		<h1><a>Cadastro de Itens</a></h1>
		<form id="form_831745" class="appnitro"  method="post" action="cadastroItensLocalGhostServlet">
					<div class="form_description">
			<h2>Cadastro de Itens</h2>
			<p></p>
		</div>						
			<ul >
			
					<li id="li_1" >
		<label class="description" for="nomeItem">Nome </label>
		<div>
			<input id="element_1" name="nomeItem" class="element text medium" type="text" maxlength="255" value=""/> 
		</div> 
		</li>		<li id="li_2" >
		<label class="description" for="descricaoItem">Descrição </label>
		<div>
			<input id="element_2" name="descricaoItem" class="element text medium" type="text" maxlength="255" value=""/> 
		</div> 
		</li>		<li id="li_3" >
		<label class="description" for="quantidadeItem">Quantidade </label>
		<div>
			<input id="element_3" name="quantidadeItem" class="element text medium" type="text" maxlength="255" value=""/> 
		</div> 
		</li>
			
					<li class="buttons">
			    <input type="hidden" name="form_id" value="831745" />
			    
				<input id="saveForm" class="button_text" type="submit" name="submit" value="Salvar" />
                                <a href="pesquisaEventos.jsp"> Voltar </a>
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
