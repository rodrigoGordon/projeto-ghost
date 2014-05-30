/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.ejb.interfaces;

import br.mack.pi2.jpa.Locais;
import java.util.List;

import javax.ejb.Remote;

/**
 *
 * @author 41180283
 */
@Remote
public interface LocaisRemote {
    public boolean insereLocal(Locais local);
    public boolean modificaLocal(Locais local);
    public boolean deletaLocal(Locais local);
    public Locais getLocal(int id);
    public List<Locais> getAllLocais();
}
