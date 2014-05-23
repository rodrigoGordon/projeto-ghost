/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.ejb.interfaces;

import br.mack.pi2.jpa.Evento;

import javax.ejb.Remote;

/**
 *
 * @author 41180283
 */
@Remote
public interface EventoRemote {
    public void setUp();
    public void insereEvento(Evento evento) throws Exception;
    
}
