/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.Services;

import br.mack.pi2.ejb.interfaces.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author MichelOh
 */
public class ServiceLocator {
    public static ServiceLocator me;
    private InitialContext ic;
    
    private ServiceLocator() {
        try {
            ic = new InitialContext();
        } catch (NamingException ne) {
            throw new RuntimeException(ne);
        }
    }
    
    public static ServiceLocator getinstance() {
        if (me == null) {
            me = new ServiceLocator();
        }
        return me;
    }
    
    private Object lookup(String jndiName) throws NamingException {
        return ic.lookup(jndiName);
    }
    
    public AlunoRemote getAluno() throws NamingException {
        return (AlunoRemote) lookup("alunoDAO");
    }
    public EventoRemote getEvento() throws NamingException {
        return (EventoRemote) lookup("eventoDAO");
    }
    public InfraestruturaRemote getInfra() throws NamingException {
        return (InfraestruturaRemote) lookup("infraDAO");
    }
    public ItensLocalRemote getItensLocal() throws NamingException {
        return (ItensLocalRemote) lookup("itenslocDAO");
    }
    public ItensDeInfraRemote getItensInfra() throws NamingException {
        return (ItensDeInfraRemote) lookup("itensinfDAO");
    }
    public LocaisRemote getLocal() throws NamingException {
        return (LocaisRemote) lookup("locaisDAO");
    }
    public NotificacaoRemote getNotificacao() throws NamingException {
        return (NotificacaoRemote) lookup("notifDAO");
    }
    public ParticipantesRemote getParticipantes() throws NamingException {
        return (ParticipantesRemote) lookup("particDAO");
    }
    public PermissaoRemote getPermissao() throws NamingException {
        return (PermissaoRemote) lookup("permissaoDAO");
    }
    public ProfessorRemote getProfessor() throws NamingException {
        return (ProfessorRemote) lookup("professorDAO");
    }
    public RestricaoEventoRemote getRestricao() throws NamingException {
        return (RestricaoEventoRemote) lookup("restricaoDAO");
    }
    public UnidadeAcademicaRemote getUA() throws NamingException {
        return (UnidadeAcademicaRemote) lookup("UADAO");
    }
}
