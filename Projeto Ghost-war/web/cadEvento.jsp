<%@page import="java.util.List"%>
<%@page import="br.mack.pi2.jpa.Locais"%>
<%@ page language="java" contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Criar Evento</title>
            <!-- <link rel="stylesheet" type="text/css" media="screen" href="css/coolblue.css" /> -->
            <link rel="stylesheet" type="text/css" href="css/view.css" media="all">
                <script type="text/javascript" src="js/view.js"></script>
                <script type="text/javascript" src="js/calendar.js"></script>



                <link rel="stylesheet" href="themes/base/jquery.ui.all.css">
                    <script src="js/jquery-1.10.2.js"></script>
                    <script src="ui/jquery.ui.core.js"></script>
                    <script src="ui/jquery.ui.widget.js"></script>
                    <script src="ui/jquery.ui.datepicker.js"></script>
                    <link rel="stylesheet" href="css/demos.css">
                        <script>
                            $(function() {
                                $("#from").datepicker({
                                    defaultDate: "+1w",
                                    changeMonth: true,
                                    numberOfMonths: 3,
                                    onClose: function(selectedDate) {
                                        $("#to").datepicker("option", "minDate", selectedDate);
                                    }
                                });
                                $("#to").datepicker({
                                    defaultDate: "+1w",
                                    changeMonth: true,
                                    numberOfMonths: 3,
                                    onClose: function(selectedDate) {
                                        $("#from").datepicker("option", "maxDate", selectedDate);
                                    }
                                });
                            });
                        </script>
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

                                    <h1><a>Criar Evento</a></h1>
                                    <form id="form_831351" class="appnitro"  method="post" action="cadastroEventoGhostServlet" >
                                        <div class="form_description">
                                            <h2>Criar Evento</h2>

                                        </div>						
                                        <ul >

                                            <li id="li_1" >
                                                <label class="description" for="nomeEvento">Título do Evento </label>
                                                <div>
                                                    <input id="element_1" name="nomeEvento" class="element text medium" type="text" maxlength="255" value=""/> 
                                                </div> 
                                            </li>		
                                            <li id="li_2" >
                                                <label class="description" for="descEvento">Descrição do Evento </label>
                                                <div>
                                                    <input id="element_1" name="descEvento" class="element text medium" type="text" maxlength="255" value=""/> 
                                                </div> 
                                            </li>   
                                            <li id="li_3" >
                                                <label class="description" for="dtInicio">Data de início </label>
                                                <div>
                                                    <label for="from">De</label>
                                                    <input type="text" id="from" name="from"/>
                                                    <label for="to">até</label>
                                                    <input type="text" id="to" name="to"/>

                                                </div> 
                                            </li>


                                            <li id="li_10" >
                                                <label class="description" for="cmbLocalEvento">Local</label>
                                                <div>


                                                    <select class="element select medium" id="element_10" name="cmbLocalEvento">      
                                                        <c:forEach var="local" items="${locais}">      
                                                            <option value="${local.idLocal}">${local.nomeLocal}</option>  

                                                        </c:forEach>      
                                                    </select>      


                                                </div> 
                                            </li>		<li id="li_11" >
                                                <label class="description" for="element_11">Itens adicionais </label>
                                                <span>
                                                    <input id="element_11_1" name="bItensAdicionais" class="element radio" type="radio" value="0" />
                                                    <label class="choice" for="bItensAdicionais">Sim</label>
                                                    <input id="element_11_2" name="bItensAdicionais" class="element radio" type="radio" value="1" />
                                                    <label class="choice" for="bItensAdicionais">Não</label>

                                                </span> 
                                            </li>		<li id="li_8" >
                                                <label class="description" for="responsavelEvento">Responsável </label>
                                                <div>
                                                    <input id="element_8" name="responsavelEvento" class="element text small" type="text" maxlength="255" value=""/> 
                                                </div> 
                                            </li>		<li id="li_12" >
                                                <label class="description" for="bInscricao">Inscrição </label>
                                                <span>
                                                    <input id="element_12_1" name="bInscricao" class="element radio" type="radio" value="0" />
                                                    <label class="choice" for="bInscricao">Sim</label>
                                                    <input id="element_12_2" name="bInscricao" class="element radio" type="radio" value="1" />
                                                    <label class="choice" for="bInscricao">Não</label>

                                                </span> 
                                            </li>		<li id="li_13" >
                                                <label class="description" for="bEventoExclusivo">Público Selecionado </label>
                                                <span>
                                                    <input id="element_13_1" name="bEventoExclusivo" class="element radio" type="radio" value="0" />
                                                    <label class="choice" for="bEventoExclusivo">Sim</label>
                                                    <input id="element_13_2" name="bEventoExclusivo" class="element radio" type="radio" value="1" />
                                                    <label class="choice" for="bEventoExclusivo">Não</label>

                                                </span> 
                                            </li>		<li id="li_14" >
                                                <label class="description" for="cmbGrupoSelecionado">Grupo Selecionado </label>
                                                <div>

                                                    <select class="element select medium" id="element_14" name="cmbGrupoSelecionado">      
                                                        <c:forEach var="ua" items="${unidadesAcademicas}">      
                                                            <option value="${ua.id_UA}">${ua.nome_UA}</option>  
                                                        </c:forEach>      
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

                                                <p><a class="more" href="pesquisaEventos.jsp">&laquo; Voltar</a></p>
                                                <p><a class="more" href="cadastroEventoGhostServlet">Salvar &raquo;</a></p>
                                                <input id="saveForm" class="button_text" type="submit" name="submit" value="Salvar &raquo;" />
                                                
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
