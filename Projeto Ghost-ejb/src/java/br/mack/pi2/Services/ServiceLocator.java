/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.Services;

import br.mack.pi2.ejb.interfaces.AlunoRemote;
import br.mack.pi2.ejb.interfaces.EventoRemote;
import br.mack.pi2.ejb.interfaces.InfraRemote;
import br.mack.pi2.ejb.interfaces.LocalRemote;
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
    public InfraRemote getInfra() throws NamingException {
        return (InfraRemote) lookup("infraDAO");
    }
    public LocalRemote getLocal() throws NamingException {
        return (LocalRemote) lookup("locaisDAO");
    }
    public EventoRemote getEvento() throws NamingException {
        return (EventoRemote) lookup("eventoDAO");
    }
    
}
