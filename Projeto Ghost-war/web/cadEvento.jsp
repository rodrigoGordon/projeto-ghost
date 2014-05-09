<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Criar Evento</title>
<link rel="stylesheet" type="text/css" href="css/view.css" media="all">
<script type="text/javascript" src="js/view.js"></script>
<script type="text/javascript" src="js/calendar.js"></script>
</head>
<body id="main_body" >
	
	<img id="top" src="images/top.png" alt="">
	<div id="form_container">
	
		<h1><a>Criar Evento</a></h1>
		<form id="form_831351" class="appnitro"  method="post" action="cadastroEventoGhostServlet">
					<div class="form_description">
			<h2>Criar Evento</h2>
			
		</div>						
			<ul >
			
					<li id="li_1" >
		<label class="description" for="tituloEvento">Título do Evento </label>
		<div>
			<input id="element_1" name="tituloEvento" class="element text medium" type="text" maxlength="255" value=""/> 
		</div> 
		</li>		<li id="li_2" >
		<label class="description" for="dataEventoMM">Date </label>
		<span>
			<input id="element_2_1" name="dataEventoMM" class="element text" size="2" maxlength="2" value="" type="text"> /
			<label for="dataEventoMM">MM</label>
		</span>
		<span>
			<input id="element_2_2" name="dataEventoDD" class="element text" size="2" maxlength="2" value="" type="text"> /
			<label for="dataEventoDD">DD</label>
		</span>
		<span>
	 		<input id="element_2_3" name="dataEventoYYYY" class="element text" size="4" maxlength="4" value="" type="text">
			<label for="dataEventoYYYY">YYYY</label>
		</span>
	
		<span id="calendar_2">
			<img id="cal_img_2" class="datepicker" src="images/calendar.gif" alt="Pick a date.">	
		</span>
		<script type="text/javascript">
			Calendar.setup({
			inputField	 : "element_2_3",
			baseField    : "element_2",
			displayArea  : "calendar_2",
			button		 : "cal_img_2",
			ifFormat	 : "%B %e, %Y",
			onSelect	 : selectDate
			});
		</script>
		 
		</li>		<li id="li_3" >
		<label class="description" for="iniHoraEventoHH">Início </label>
		<span>
			<input id="element_3_1" name="iniHoraEventoHH" class="element text " size="2" type="text" maxlength="2" value=""/> : 
			<label>HH</label>
		</span>
		<span>
			<input id="element_3_2" name="iniHoraEventoMM" class="element text " size="2" type="text" maxlength="2" value=""/> : 
			<label>MM</label>
		</span>
		
		<span>
			<select class="element select" style="width:4em" id="element_3_4" name="periodoEvento">
				<option value="AM" >AM</option>
				<option value="PM" >PM</option>
			</select>
			<label>AM/PM</label>
		</span> 
		</li>		<li class="section_break">
			<h3>Até</h3>
			<p></p>
		</li>		<li id="li_5" >
		<label class="description" for="fimHoraEventoHH">Previsão de término </label>
		<span>
			<input id="element_5_1" name="fimHoraEventoHH" class="element text " size="2" type="text" maxlength="2" value=""/> : 
			<label>HH</label>
		</span>
		<span>
			<input id="element_5_2" name="fimHoraEventoMM" class="element text " size="2" type="text" maxlength="2" value=""/> : 
			<label>MM</label>
		</span>
		
		<span>
			<select class="element select" style="width:4em" id="element_5_4" name="periodoFimEvento">
				<option value="AM" >AM</option>
				<option value="PM" >PM</option>
			</select>
			<label>AM/PM</label>
		</span> 
		</li>		<li id="li_10" >
		<label class="description" for="cmbLocalEvento">Local </label>
		<div>
		<select class="element select medium" id="element_10" name="cmbLocalEvento"> 
			<option value="" selected="selected"></option>
                        <option value="1" >Ruy Barbosa</option>
                        <option value="2" >FCI</option>

		</select>
		</div> 
		</li>		<li id="li_6" >
		<label class="description" for="descLocal">Descrição do Local </label>
		<div>
			<textarea id="element_6" name="descLocal" class="element textarea small"></textarea> 
		</div> 
		</li>		<li id="li_7" >
		<label class="description" for="descEvento">Descrição do evento </label>
		<div>
			<textarea id="element_7" name="descEvento" class="element textarea small"></textarea> 
		</div> 
		</li>		<li id="li_11" >
		<label class="description" for="element_11">Itens adicionais </label>
		<span>
			<input id="element_11_1" name="bItensAdicionais" class="element radio" type="radio" value="1" />
                            <label class="choice" for="bItensAdicionais">Sim</label>
                                <input id="element_11_2" name="bItensAdicionaisN" class="element radio" type="radio" value="2" />
                            <label class="choice" for="bItensAdicionaisN">Não</label>

		</span> 
		</li>		<li id="li_8" >
                                <label class="description" for="responsavelEvento">Responsável </label>
		<div>
			<input id="element_8" name="responsavelEvento" class="element text small" type="text" maxlength="255" value=""/> 
		</div> 
		</li>		<li id="li_12" >
		<label class="description" for="bInscricao">Inscrição </label>
		<span>
			<input id="element_12_1" name="bInscricao" class="element radio" type="radio" value="1" />
<label class="choice" for="bInscricao">Sim</label>
<input id="element_12_2" name="bInscricaoN" class="element radio" type="radio" value="2" />
<label class="choice" for="bInscricaoN">Não</label>

		</span> 
		</li>		<li id="li_13" >
		<label class="description" for="bEventoExclusivo">Público Selecionado </label>
		<span>
			<input id="element_13_1" name="bEventoExclusivo" class="element radio" type="radio" value="1" />
<label class="choice" for="bEventoExclusivo">Sim</label>
<input id="element_13_2" name="bEventoExclusivoN" class="element radio" type="radio" value="2" />
<label class="choice" for="bEventoExclusivoN">Não</label>

		</span> 
		</li>		<li id="li_14" >
		<label class="description" for="cmbGrupoSelecionado">Grupo Selecionado </label>
		<div>
		<select class="element select medium" id="element_14" name="cmbGrupoSelecionado"> 
			<option value="" selected="selected"></option>
                        <option value="1" >FCI</option>
                        <option value="2" >FAU</option>
                        <option value="3" >LEP</option>
                        <option value="4" >EE</option>
                        <option value="5" >Colégio Mackenzie</option>

		</select>
		</div> 
		</li>		<li id="li_9" >
		<label class="description" for="orcamentoEvento">Orçamento </label>
		<div>
			<input id="element_9" name="orcamentoEvento" class="element text medium" type="text" maxlength="255" value=""/> 
		</div> 
		</li>
			
					<li class="buttons">
			    <input type="hidden" name="form_id" value="831351" />
			    
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
