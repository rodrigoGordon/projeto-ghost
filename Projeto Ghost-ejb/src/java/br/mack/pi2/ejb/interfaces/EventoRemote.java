/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.ejb.interfaces;

import br.mack.pi2.jpa.Evento;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author 41180283
 */
@Remote
public interface EventoRemote {
    public boolean insereEvento(Evento evento);
    public boolean modificaEvento(Evento evento);
    public boolean deletaEvento(Evento evento);
    public Evento getEvento(int id);
    public List<Evento> getAllEvento();
}
