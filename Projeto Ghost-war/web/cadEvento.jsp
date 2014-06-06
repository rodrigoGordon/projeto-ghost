<%@page import="br.mack.pi2.jpa.Usuario"%>
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
                <link rel="stylesheet" href="css/eventCalendar_theme_responsive.css">
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
                                         <% String msgErro  = (String)request.getSession().getAttribute("erroConcorrencia") ; if(msgErro == null)msgErro = " "; %>
                                                <p><a><%= msgErro %></a></p>
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
                                                    <label for="horarioInicioH">Horário de início HH</label>
                                                    <select name="horarioInicioH">    

                                                        <option value="0">00</option>
                                                        <option value="01">1</option>  
                                                        <option value="02">2</option>  
                                                        <option value="03">3</option>  
                                                        <option value="04">4</option>  
                                                        <option value="05">5</option>  
                                                        <option value="06">6</option>  
                                                        <option value="07">7</option>  
                                                        <option value="08">8</option>  
                                                        <option value="09">9</option>  
                                                        <option value="10">10</option>  
                                                        <option value="11">11</option>  
                                                        <option value="12">12</option>  
                                                        <option value="13">13</option>  
                                                        <option value="14">14</option>  
                                                        <option value="15">15</option>  
                                                        <option value="16">16</option>  
                                                        <option value="17">17</option>  
                                                        <option value="18">18</option>  
                                                        <option value="19">19</option>  
                                                        <option value="20">20</option>  
                                                        <option value="21">21</option>  
                                                        <option value="22">22</option>  
                                                        <option value="23">23</option>  

                                                    </select>
                                                    <label for="horarioInicioM">Horário de início MM</label>
                                                    <select name="horarioInicioM">    

                                                        <option value="0">00</option>
                                                        <option value="01">1</option>  
                                                        <option value="02">2</option>  
                                                        <option value="03">3</option>  
                                                        <option value="04">4</option>  
                                                        <option value="05">5</option>  
                                                        <option value="06">6</option>  
                                                        <option value="07">7</option>  
                                                        <option value="08">8</option>  
                                                        <option value="09">9</option>  
                                                        <option value="10">10</option>  
                                                        <option value="11">11</option>  
                                                        <option value="12">12</option>  
                                                        <option value="13">13</option>  
                                                        <option value="14">14</option>  
                                                        <option value="15">15</option>  
                                                        <option value="16">16</option>  
                                                        <option value="17">17</option>  
                                                        <option value="18">18</option>  
                                                        <option value="19">19</option>  
                                                        <option value="20">20</option>  
                                                        <option value="21">21</option>  
                                                        <option value="22">22</option>  
                                                        <option value="23">23</option>
                                                        
                                                        <option value="24">24</option>
                                                        <option value="25">25</option>  
                                                        <option value="26">26</option>  
                                                        <option value="27">28</option>  
                                                        <option value="29">29</option>  
                                                        <option value="30">30</option>  
                                                        <option value="31">31</option>  
                                                        <option value="32">32</option>  
                                                        <option value="33">33</option>  
                                                        <option value="34">34</option>  
                                                        <option value="35">35</option>  
                                                        <option value="36">36</option>  
                                                        <option value="37">37</option>  
                                                        <option value="38">38</option>  
                                                        <option value="39">39</option>  
                                                        <option value="40">40</option>  
                                                        <option value="41">41</option>  
                                                        <option value="42">42</option>  
                                                        <option value="43">43</option>  
                                                        <option value="44">44</option>  
                                                        <option value="45">45</option>  
                                                        <option value="46">46</option>  
                                                        <option value="47">47</option>  
                                                        <option value="48">48</option>
                                                        <option value="49">49</option>  
                                                        <option value="50">50</option>  
                                                        <option value="51">51</option>  
                                                        <option value="52">52</option>  
                                                        <option value="53">53</option>  
                                                        <option value="54">54</option>  
                                                        <option value="55">55</option>  
                                                        <option value="56">56</option>  
                                                        <option value="57">57</option>  
                                                        <option value="58">58</option>
                                                        <option value="59">59</option>
                                                    </select> 
                                                    <label for="to">até</label>
                                                    <input type="text" id="to" name="to"/>
                                                       <label for="horarioFimH">Horário previsto de término HH</label>
                                                    <select name="horarioFimH">    

                                                        <option value="0">00</option>
                                                        <option value="01">1</option>  
                                                        <option value="02">2</option>  
                                                        <option value="03">3</option>  
                                                        <option value="04">4</option>  
                                                        <option value="05">5</option>  
                                                        <option value="06">6</option>  
                                                        <option value="07">7</option>  
                                                        <option value="08">8</option>  
                                                        <option value="09">9</option>  
                                                        <option value="10">10</option>  
                                                        <option value="11">11</option>  
                                                        <option value="12">12</option>  
                                                        <option value="13">13</option>  
                                                        <option value="14">14</option>  
                                                        <option value="15">15</option>  
                                                        <option value="16">16</option>  
                                                        <option value="17">17</option>  
                                                        <option value="18">18</option>  
                                                        <option value="19">19</option>  
                                                        <option value="20">20</option>  
                                                        <option value="21">21</option>  
                                                        <option value="22">22</option>  
                                                        <option value="23">23</option>  

                                                    </select>
                                                    <label for="horarioFimM">Horário previsto de témino MM</label>
                                                    <select name="horarioFimM">    

                                                        <option value="0">00</option>
                                                        <option value="01">1</option>  
                                                        <option value="02">2</option>  
                                                        <option value="03">3</option>  
                                                        <option value="04">4</option>  
                                                        <option value="05">5</option>  
                                                        <option value="06">6</option>  
                                                        <option value="07">7</option>  
                                                        <option value="08">8</option>  
                                                        <option value="09">9</option>  
                                                        <option value="10">10</option>  
                                                        <option value="11">11</option>  
                                                        <option value="12">12</option>  
                                                        <option value="13">13</option>  
                                                        <option value="14">14</option>  
                                                        <option value="15">15</option>  
                                                        <option value="16">16</option>  
                                                        <option value="17">17</option>  
                                                        <option value="18">18</option>  
                                                        <option value="19">19</option>  
                                                        <option value="20">20</option>  
                                                        <option value="21">21</option>  
                                                        <option value="22">22</option>  
                                                        <option value="23">23</option>
                                                        
                                                        <option value="24">24</option>
                                                        <option value="25">25</option>  
                                                        <option value="26">26</option>  
                                                        <option value="27">28</option>  
                                                        <option value="29">29</option>  
                                                        <option value="30">30</option>  
                                                        <option value="31">31</option>  
                                                        <option value="32">32</option>  
                                                        <option value="33">33</option>  
                                                        <option value="34">34</option>  
                                                        <option value="35">35</option>  
                                                        <option value="36">36</option>  
                                                        <option value="37">37</option>  
                                                        <option value="38">38</option>  
                                                        <option value="39">39</option>  
                                                        <option value="40">40</option>  
                                                        <option value="41">41</option>  
                                                        <option value="42">42</option>  
                                                        <option value="43">43</option>  
                                                        <option value="44">44</option>  
                                                        <option value="45">45</option>  
                                                        <option value="46">46</option>  
                                                        <option value="47">47</option>  
                                                        <option value="48">48</option>
                                                        <option value="49">49</option>  
                                                        <option value="50">50</option>  
                                                        <option value="51">51</option>  
                                                        <option value="52">52</option>  
                                                        <option value="53">53</option>  
                                                        <option value="54">54</option>  
                                                        <option value="55">55</option>  
                                                        <option value="56">56</option>  
                                                        <option value="57">57</option>  
                                                        <option value="58">58</option>
                                                        <option value="59">59</option>
                                                    </select> 
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
                                                    <br></br>
                                                    <br></br>
                                                    <!--
                                                    <select class="element select medium" id="element_102" name="cmbLocalEvento2">
                                                        <c:forEach var="local" items="${locais}"> 
                                                            <optgroup label=${local.nomeLocal}>
                                                                <option value="${local.idLocal}">Capacidade: ${local.capacidade}</option>
                                                            </c:forEach>
                                                    </select>
                                                    -->

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
                                                
                                                
                                                <%
                                                    List<Usuario> listUsuario = (List<Usuario>) request.getSession().getAttribute("usuario");
                                                    String nomeUsuario = null;
                                                    nomeUsuario = listUsuario == null ? null : listUsuario.get(0).getNomeUser();
                                                %>
    

                                                <label class="description" for="responsavelEvento">Responsável </label>
                                                <div>
                                                    <input id="element_8" name="responsavelEvento" class="element text small" type="text" maxlength="255" value=<%= nomeUsuario%>/> 
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

                                             <a class="more" href="CarregaEventosJson">&laquo; Voltar</a>
                                               <!-- <p><a class="more" href="cadastroEventoGhostServlet">Salvar &raquo;</a></p> -->
                                                <input id="saveForm" class="bt" type="submit" name="submit" value="Salvar &raquo;" />
                                               
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
